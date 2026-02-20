class node{
    int data;
    node left,right;
    node(int data){
        this.data=data;
        left=right=null;
        }
}
public class Main{
    static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"-->");
        preorder(root.left);
        preorder(root.right);
        }
        
        static void inorder(node root){
        if(root==null){
            return;
        }
        preorder(root.left);
        System.out.print(root.data+"-->");
        preorder(root.right);
        }
        
       static void postorder(node root){
        if(root==null){
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data+"-->");
        }
        
        public static void main(String[] args){
            node root=new node(10);
            root.left=new node(20);
            root.right=new node(30);
            root.left.left=new node(40);
            root.right.left=new node(80);
            root.right.right=new node(90);
            root.left.right=new node(50);
            root.left.right.left=new node(60);
            root.left.right.right=new node(100);
            System.out.println("\nPreorder");
            preorder(root);
            System.out.println("\nInorder");
            inorder(root);
            System.out.println("\nPostorder");
            postorder(root);
            
        }
         }
