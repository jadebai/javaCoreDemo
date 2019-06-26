package com.baiyu.digraph.three;

/**
 * @author baiyu
 * @description: Vertex  点表
 * @date: 2019/4/4
 */
public class Vertex<T> {
    //存放点信息
    public T data;
    //与该点邻接的第一个边节点
    public Edge firstEdge;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Edge getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(Edge firstEdge) {
        this.firstEdge = firstEdge;
    }
}
