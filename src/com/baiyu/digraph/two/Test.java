package com.baiyu.digraph.two;

import jdk.nashorn.internal.runtime.JSONFunctions;

import java.util.List;

/**
 * @author baiyu
 * @description: Test
 * @date: 2019/4/3
 */
public class Test {

    public static void main(String[] args) {
        Graph theGraph = new Graph();
        Vertex v1=new Vertex("c0");
        Vertex v2=new Vertex("c1");
        Vertex v3=new Vertex("c2");
        Vertex v4=new Vertex("c3");
        Vertex v5=new Vertex("c4");
        Vertex v6=new Vertex("c5");
        Vertex v7=new Vertex("c6");
        Vertex v8=new Vertex("c7");
        Vertex v9=new Vertex("c8");

        theGraph.addVertex(v1);    // 0
        theGraph.addVertex(v2);    // 1
        theGraph.addVertex(v3);    // 2
        theGraph.addVertex(v4);    // 3
        theGraph.addVertex(v5);    // 4
        theGraph.addVertex(v6);    // 5
        theGraph.addVertex(v7);    // 6
        theGraph.addVertex(v8);    // 7
        theGraph.addVertex(v9);    // 8

        theGraph.addEdge(0, 6);     // c0->c6
        theGraph.addEdge(0, 2);     // c0->c2
        theGraph.addEdge(3, 5);     // c3->c5
        theGraph.addEdge(3, 8);     // c3->c8
        theGraph.addEdge(1, 2);     // c1->c2
        theGraph.addEdge(1, 4);     // c1->c4
        theGraph.addEdge(2, 3);     // c2->c3
        theGraph.addEdge(6, 7);     // c6->c7
        theGraph.addEdge(7, 8);     // c7->c8
        theGraph.addEdge(4, 3);     // c4->c3
        theGraph.addEdge(4, 5);     // c4->c5

        System.out.print("Visits: ");
        List<Vertex> vl=theGraph.topo();
        List<Vertex> v=theGraph.dfs(v1,false);
        System.out.println(vl);
        System.out.println(v);
    }
}
