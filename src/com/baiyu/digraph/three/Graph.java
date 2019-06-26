package com.baiyu.digraph.three;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author baiyu
 * @description: Graph   营销云 -- 图转换成路径
 *                        算法描述如下:
        topNode:当前栈顶元素
        adjvexNode;当前top_node已经访问的邻接点
        nextNode:即将访问的元素（topNode的第adjvexNode个邻接点所对应的元素）
       找出所有路径采用的是遍历的方法，以“深度优先”算法为基础。从源点出发，先到源点的第一个邻接点N00，再到N00的第一个邻接点N10，再到N10的第一个邻接点N20...当遍历到目标点时表明找到一条路径。
 * @date: 2019/4/4
 */
public class Graph<T> {

    private Vertex<T>[] vertexList; //存放点的集合
    //点个数
    public int vertexNum;

    public Graph(Vertex<T>[] vertex) {
        this.vertexList = vertex;
        this.vertexNum = vertex.length;
    }

    //针对x节点添加边节点y
    public void addEdge(int x, int y) {
        Edge edge = new Edge();
        edge.setVertexId(y);
        //第一个边节点
        System.out.println(vertexList.length);
        if (null == vertexList[x].firstEdge) {
            vertexList[x].firstEdge = edge;
            edge.setNext(null);
        } else {
            //不是第一个边节点,则采用头插法
            edge.next = vertexList[x].firstEdge;
            vertexList[x].firstEdge = edge;
        }
    }

    //得到x的邻接点为y的后一个邻接点位置,为-1说明没有找到
    public int getNextNode(int x, int y) {
        int nexNode = -1;
        Edge edge = vertexList[x].firstEdge;
        if (null != edge && y == -1) {
            int n = edge.vertexId;
            //元素还不在stack中
            if (!states.get(n)) {
                return n;
            }
            return -1;
        }
        while (null != edge) {
            //节点未访问
            if (edge.vertexId == y) {
                if (null != edge.next) {
                    nexNode = edge.next.vertexId;
                    if (!states.get(nexNode)) {
                        return nexNode;
                    }
                } else {
                    return -1;
                }
            }
            edge = edge.next;
        }
        return -1;
    }

    //代表某节点是否在stack中,避免产生回路
    public Map<Integer, Boolean> states = new HashMap<>();
    //存放放入stack中的节点
    public Stack<Integer> stack = new Stack();

    //输出2个节点之间的输出路径
    public void visit(int x, int y) {
        //初始化所有节点在stack中的情况
        for (int i = 0; i < vertexNum; i++) {
            states.put(i, false);
        }
        //stack top元素
        int topNode;
        //存放当前top元素已经访问过的邻接点,若不存在则置-1,此时代表访问该top元素的第一个邻接点
        int adjvexNode = -1;
        int nextNode;
        stack.add(x);
        states.put(x, true);
        while (!stack.isEmpty()) {
            topNode = stack.peek();
            //找到需要访问的节点
            if (topNode == y) {
                //打印该路径
                printPath();
                adjvexNode = stack.pop();
                states.put(adjvexNode, false);
            } else {
                //访问top_node的第advex_node个邻接点
                nextNode = getNextNode(topNode, adjvexNode);
                if (nextNode != -1) {
                    stack.push(nextNode);
                    //置当前节点访问状态为已在stack中
                    states.put(nextNode, true);
                    //临接点重置
                    adjvexNode = -1;
                } else {
                    //不存在临接点，将stack top元素退出
                    //当前已经访问过了top_node的第adjvex_node邻接点
                    adjvexNode = stack.pop();
                    //不在stack中
                    states.put(adjvexNode, false);
                }
            }
        }
    }

    //打印stack中信息,即路径信息
    public void printPath() {
        StringBuilder sb = new StringBuilder();
        for (Integer i : stack) {
            sb.append(vertexList[i].data + ",");
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String[] vertis = {"a", "b", "c", "d", "e", "f", "g", "h", "i","j"};
        Vertex<String>[] vertices = new Vertex[vertis.length];
        Vertex vertex ;
        for (int i = 0 ;i < vertis.length; i++){
            vertex = new Vertex();
            vertex.setData(vertis[i]);
            vertex.setFirstEdge(null);
            vertices[i] = vertex;
        }
        Graph<String> theGraph = new Graph<String>(vertices);
        theGraph.addEdge(0, 6);     // a->g
        theGraph.addEdge(0, 2);     // a->c
        theGraph.addEdge(3, 5);     // d->f
        theGraph.addEdge(3, 8);     // d->i
        theGraph.addEdge(6, 3);     // c->d
        theGraph.addEdge(2, 7);     // g->h
        theGraph.addEdge(7, 8);     // h->i
        theGraph.addEdge(8, 9);     // i->j
        theGraph.addEdge(5, 9);     // f->j
        theGraph.visit(0, 9);
    }
}
