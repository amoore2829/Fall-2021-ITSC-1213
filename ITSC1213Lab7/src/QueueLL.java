/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amoor
 */
import java.util.ArrayList;
import java.util.LinkedList;


public class QueueLL {
    private ArrayList<Node> data = new ArrayList<Node>();
    private Node head;
    private Node tail;

    public ArrayList<Node> getData() {
        return data;
    }

    public void setData(ArrayList<Node> data) {
        this.data = data;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public QueueLL(ArrayList<Node> data, Node head, Node tail) {
        this.data = data;
        this.head = head;
        this.tail = tail;
    }

    public QueueLL(Node n1) {
        this.head = head;
        this.tail = head;
    }
    
    public void push(Node n) {    
    data.add(n);
    }
    public Node pop() {
        return data.remove(data.size()-1); 
    }
    public Node peek()
    {
        return data.get(0);
    }
    
    public boolean isEmpty()
    {
        return data.isEmpty();
    }
}
