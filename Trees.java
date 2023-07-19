import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(){
        this.left = this.right = null;
        this.data = 0;
    }
}
class Trees {
    Node create(Node root)
    {
         
        Node newnode = new Node();

        System.out.println("Enter Data:");
        Scanner sc = new Scanner(System.in);

        newnode.data = sc.nextInt();

        while(newnode.data != -1){
            
            if(root == null){
                root = newnode;
            }
            else{
                insert(root,newnode);
                newnode = new Node();
                System.out.println("Enter Data:");
                newnode.data = sc.nextInt();
            }
        }
        
        return root;
    }
    void insert(Node root, Node newnode){
        if(newnode.data < root.data){
            if(root.left == null){
                root.left = newnode;
            }
            else{
                insert(root.left, newnode);
            }
        }
        
        else if(newnode.data > root.data){
            if(root.right == null){
                root.right = newnode;
            }
            else{
                insert(root.right, newnode);
            }
        }
    }
    void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.println("->"+root.data);
            inorder(root.right);
        }
    }
    void preorder(Node root){
        if(root != null){
            System.out.println("->"+root.data);
            preorder(root.left);
            preorder(root.right);
            
        }
    }
    void postorder(Node root){
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.println("->"+root.data);
        }
    }

     public static void main(String[] args) {
        Node root = null;
        Trees obj = new Trees();
        int ch = 0;
        root = obj.create(root);
        while(true){
            System.out.println(" ");
            System.out.println("----Menu----");
            System.out.println("1.InOrder\n2.PreOrder\n3.PostOrder\n4.Exit");
            System.out.println("Enter Your Choice:");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
        
            switch(ch)
            {
                case 1:
                        obj.inorder(root);
                        break;
                case 2:
                        obj.preorder(root);
                        break;
                case 3:
                        obj.inorder(root);
                        break;
                case 4: System.exit(0);
                break;
            }
        }
     }
}

