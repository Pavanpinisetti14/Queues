import java.text.NumberFormat.Style;
import java.util.Scanner;

public class Queue {
    int max = 6;
    int front = -1;
    int rear = 0;
    int[] arr = new int[max-1];

    void enqueue(int ele){
        if(front == max-1 ){
            System.out.println("Queue Is Full");
        }
        else{
            front++;
            arr[front] = ele;
            System.out.println(ele+"  Element Is Inserted");
        }
    }
    void dequeue(){
        int ele;
        if(rear == max-1){
            System.out.println("Queue Is Empty");
        }
        else{
            ele = arr[rear];
            rear++;
            System.out.println("The Dequeue Element Is "+ele);
        }
    }
    void display(){
        System.out.println("Entered");
        if(rear == max-1){
            System.out.println("Queue Is Empty");
        }
        else{
            for( int i = rear;i<=front;i++){
                System.out.print("|"+arr[i]+"|->");
            }
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();

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
                        int ele_enqueue;
                        System.out.println("Enter Element To Enqueue");
                        ele_enqueue = sc.nextInt();
                        q.enqueue(ele_enqueue);
                        break;
                case 2:
                        q.dequeue();
                        break;
                case 3:
                        q.display();
                        break;
                case 4: System.exit(0);
                        break;
                default:System.out.println("Enter Correct Number");
                        break;
            }
        }
    }
}
