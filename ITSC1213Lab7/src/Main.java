/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amoor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node n1 = new Node(100);
        Node n2 = new Node(200);
        Node n3 = new Node(300);
        Node n4 = new Node(400);
        QueueLL qLL = new QueueLL(n1);
        qLL.push(n1);
        qLL.push(n2);
        qLL.push(n3);
        qLL.push(n4);
        
        System.out.println(qLL.peek().getValue());
        while (qLL.isEmpty() == false){
            System.out.println(qLL.pop().getValue());
        }

       
    }
    
}

