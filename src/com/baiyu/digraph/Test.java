package com.baiyu.digraph;

/**
 * @author baiyu
 * @description: Test
 * @date: 2019/4/3
 */
public class Test {
    public static void main(String[] args) {
//        String[] vertex = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" };
//        int[][] matrix = {
//                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
//                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0 },
//                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
//                { 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
//                { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
//                { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
//                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
//                { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
//                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
//                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
//                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
//
//        Graph<String> graph = new Graph<>(matrix, vertex);
//        System.out.println(graph.startSearch());
//
//
//        String[] vertex1 = { "a", "b", "c", "d", "e", "f","g","h","i"};
//        int[][] matrix1 = {
//                { 0, 0, 1, 0, 0, 0, 1, 0, 0 },
//                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
//                { 0, 0, 0, 1, 0, 0, 0, 0, 0 },
//                { 0, 0, 0, 0, 0, 1, 0, 0, 1 },
//                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
//                { 0, 0, 0, 0, 0, 0, 0, 1, 0 },
//                { 0, 0, 0, 0, 1, 0, 0, 0, 0 },
//                { 0, 0, 0, 0, 0, 0, 0, 0, 1 },
//                { 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
//        Graph<String> theGraph1 = new Graph<>(matrix1,vertex1);
//        System.out.println(theGraph1.startSearch());

        String[] vertex2 = { "a", "b", "c", "d", "e", "f","g","h","i"};
        Graph<String> theGraph = new Graph<>(vertex2);
        theGraph.addEdge(0, 6);     // a->g
        theGraph.addEdge(0, 2);     // a->c
        theGraph.addEdge(3, 5);     // d->f
        theGraph.addEdge(3, 8);     // d->i
//        theGraph.addEdge(1, 2);     // b->c
//        theGraph.addEdge(1, 4);     // b->e
        theGraph.addEdge(6, 3);     // c->d
        theGraph.addEdge(2, 7);     // g->h
        theGraph.addEdge(7, 8);     // h->i
        System.out.println(theGraph.startSearch());
    }
}
