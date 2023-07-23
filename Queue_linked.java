import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

class Node{
    int data;
    Node next;
}
public class Queue_linked {
    Node front = null;
    Node rear = null;
    void enqueue(){

        Node newnode = new Node();
        System.out.println("Enter Data:");
        Scanner sc = new Scanner(System.in);
        newnode.data = sc.nextInt();

        if(front == null){
            front = newnode;
            rear = newnode;
        }
        else{
            newnode.next = front;
            front = newnode;
        }
    }
    void dequeue(){
        // front = front.next;
        System.out.println("OKK!");
        if(rear == null){
            System.out.println("OK!");
            System.exit(-1);
        }
        else{
            
            Node newwNode = rear;
            rear = rear.next;
            System.out.println("Data ::"+newwNode.data);
            
        }
    }
    void display(){
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Queue_linked obj = new Queue_linked();

        int ch = 0;

        while(true){
            System.out.println(" ");
            System.out.println("----Menu----");
            System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\n");
            System.out.println("Enter Your Choice :");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();

            switch(ch){
                case 1: 
                        obj.enqueue();
                        break;
                case 2:
                        obj.dequeue();
                        break;
                case 3:
                        obj.display();
                        break;
                case 4: System.exit(0);
                        break;
                default:System.out.println("Enter Correct Number");
                        break;
            }
        }
    }
}
