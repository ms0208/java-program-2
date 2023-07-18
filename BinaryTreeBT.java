import java.util.*;
public class BinaryTreeBT { 
    static class Node {
         int data;
         Node left;
         Node right; 

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null; 

        }

    }

    static class BinaryTree{
        static int  idx = -1;
        public static Node buildtree(int nodes[]){ 
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;
        }
    }
        public static void preorder(Node root) {
            if(root == null){
                System.out.print(-1+" ");
                return ; 
            }
           System.out.print(root.data +" ");
           preorder(root.left);
           preorder(root.right);
        }
        public static void inorder(Node root) {
            if(root == null){
                System.out.print(-1+" ");
                return ;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);

        } 
        public static void postorder(Node root) {
            if(root == null){
                System.out.print(-1+" ");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+ " ");
        } 
        public static void levelorder(Node root) { 
            if(root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>(); 
            q.add(root);
            q.add(null); 
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){  
                    System.out.println(); 
                    if(q.isEmpty()) {
                        break;
                    }
                else { 
                    q.add(null);
                
                }
            }
                else {
                    System.out.print(currNode.data+" ");
                
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }

            }
        } 
        public static int countNode(Node root) {
            if(root == null){
                return 0;
            }

            int leftnodes = countNode(root.left); 
            int rightnodes = countNode(root.right);
            return leftnodes + rightnodes + 1;
             
        } 
        public static int sumNode(Node root) {
            if(root == null){
                return 0;
            }
            int leftsum = sumNode(root.left);
            int rightsum = sumNode(root.right);
            return  leftsum + rightsum + root.data;
        } 
        public static int heightnode(Node root){
            if(root == null){
                return 0;
            }
            int leftheight = heightnode(root.left);
            int rightheight = heightnode(root.right); 
            int Height = Math.max(leftheight , rightheight) + 1;

            return Height;
        } 
        public static int Daimeternode(Node root){
            if(root == null){
                return 0;
            }
            int daimeter1 = Daimeternode(root.left);
            int daimeter2 = Daimeternode(root.right); 
            int daimeter3 = heightnode(root.left) + heightnode(root.right) + 1;
            return Math.max(daimeter3 , Math.max(daimeter1 , daimeter2)) ;

            
        }


    
   
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; 
        BinaryTree tree1 = new BinaryTree();
        Node root = tree1.buildtree(nodes); 
        System.out.println(root.data);

        preorder(root); 
        System.out.println();
        inorder(root);  
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
        System.out.println(countNode(root)); 
        System.out.println(sumNode(root));
        System.out.println(heightnode(root)); 
        System.out.println(Daimeternode (root));
    } 
} 