package com.baiyu.linked;

/**
 * @author baiyu
 * @description: SingleLinked
 * @date: 2018/10/10
 */
public class SingleLinked {
    private Node head;

    public SingleLinked() {
        this.head = new Node(0,null);
    }

    public void addFirstNode(Node node){
        if (this.head.getNext() != null) {
            node.setNext(this.head.getNext());
        }
        this.head.setNext(node);
    }

    public void addNode(Node node,int index){
        Node nodeTemp = this.head;
        int i = 0;
        while (nodeTemp != null){
            if (index == i){
                if (nodeTemp.getNext() != null){
                    node.setNext(nodeTemp.getNext());
                }
                nodeTemp.setNext(node);
                break;
            }
            nodeTemp = nodeTemp.getNext();
            i++;
        }
    }

    public void addLastNode(Node node){
        Node nodeTemp = this.head;
        while (nodeTemp != null){
            if (nodeTemp.getNext() == null){
                nodeTemp.setNext(node);
                break;
            }
            nodeTemp = nodeTemp.getNext();
        }
    }

    public void printNode(){
        if (this.head.getNext()==null){
           return;
        }
        Node node = this.head.getNext();
        while (node != null){
            System.out.println(node.getData());
            node = node.getNext();
        }
    }


    public void recover(){
        if (this.head.getNext() == null){
            return;
        }
        Node node = this.head.getNext();
        Node prenode = null;
        Node nextnode = null;
        while (node.getNext() !=null){
            nextnode = node.getNext();
            node.setNext(prenode);
            prenode = node;
            node = nextnode;
        }
        node.setNext(prenode);
        head.setNext(node);
        printNode();
    }

    public static void main(String[] args) {
        SingleLinked singleLinked = new SingleLinked();
        singleLinked.addFirstNode(new Node(1,null));
        singleLinked.addFirstNode(new Node(2,null));
        singleLinked.addFirstNode(new Node(3,null));
        singleLinked.addLastNode(new Node(4,null));
        singleLinked.addLastNode(new Node(5,null));
        singleLinked.addLastNode(new Node(6,null));
        singleLinked.addNode(new Node(7,null),3);
        singleLinked.printNode();
        System.out.println("-----------------------------------");
        singleLinked.recover();
    }
}
