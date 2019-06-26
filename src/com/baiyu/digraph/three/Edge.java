package com.baiyu.digraph.three;

/**
 * @author baiyu
 * @description: Edge  边节点
 * @date: 2019/4/4
 */
public class Edge {
    //对应的点下表
    public int vertexId;
    //下一个边节点
    public Edge next;

    public int getVertexId() {
        return vertexId;
    }

    public void setVertexId(int vertexId) {
        this.vertexId = vertexId;
    }

    public Edge getNext() {
        return next;
    }

    public void setNext(Edge next) {
        this.next = next;
    }
}
