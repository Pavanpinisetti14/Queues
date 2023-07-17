import java.util.*;

class Node{
    Node next;
    int data;
}
public class StackUsingLinkedList {
    Node top = null;

    void push(){
        Node newnode = new Node();
        System.out.println("Enter Element :");
        Scanner sc = new Scanner(System.in);
        newnode.data = sc.nextInt();

        if(top == null){
           top = newnode;
        }
        else{
            newnode.next  = top;
            top = newnode;
        }
    }
    void pop(){
        int ele_pop;
        if(top == null){
            System.out.println("Stack Is Empty");
        }
        else{
            ele_pop = top.data;
            top = top.next;
            System.out.println("Delected Element Is:"+ele_pop);
        }
    }
    void peak(){
        System.out.println("Peak IS:"+top.data);
    }
    void display(){
        Node temp;
        temp = top;
        while(temp != null){
            System.out.print("<-|"+temp.data+"|");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        StackUsingLinkedList obj = new StackUsingLinkedList();
        int ch=0;

        while(true){
            System.out.println(" ");
            System.out.println("------Menu------");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.Display");
            System.out.println("4.Peak");
            System.out.println("5.exit");
            System.out.println("Enter Your Choice:");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
        
            switch(ch)
            {
                case 1:
                        obj.push();
                        break;
                case 2:
                        obj.pop();
                        break;
                case 3:
                        obj.display();
                        break;
                case 4: obj.peak();
                        break;
                case 5: System.exit(0);
                        break;
                default:System.out.println("Enter correct Number");
                        break;
                        
            }
        }
    }
}
