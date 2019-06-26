package com.baiyu.digraph.two;

/**
 * @author baiyu
 * @description: Vertex
 * @date: 2019/4/3
 */
public class Vertex {
    private String label;
    private VertexState state;//顶点状态

    public Vertex(String lab)
    {
        label = lab;
        state = VertexState.UNVISITED;
    }


    public VertexState getState(){
        return state;
    }

    public void setState(VertexState state){
        this.state=state;
    }

    @Override
    public String toString(){
        return label;
    }
}
