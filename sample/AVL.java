// public class AVLTrees {
//     class Node{
//         int key;
//         int height;
//         Node left, right;

//         public Node(int value){
//             this.key = value;
//             height = 1;
//         }
//     }
//     Node root;

//     int height(Node n){
//         if(n == null){
//             return 0;
//         }
//         return n.height;
//     }
//     int getBalance(Node n){
//         if(n == null){
//             return 0;
//         }
//         return height(n.left) - height(n.right);
//     }

//     Node rightRotate(Node y){
//         Node x = y.left;
//         Node T2 = x.right;

//         x.right = y;
//         y.left = T2;
//         y.height = Math.max(height(y.left), height(y.right)) + 1;
//         x.height = Math.max(height(x.left), height(x.right)) + 1;
//         return x;
//     }

//     Node leftRotate(Node x){
//         Node y = x.right;
//         Node T2 = y.left;

//         y.left = x;
//         y.right = T2;

//         x.height = Math.max(height(x.left), height(x.right)) + 1;
//         y.height = Math.max(height(y.left), height(y.right)) + 1;

//         return y;
//     }
//     Node insert(Node node, int key){
//         if(node == null){
//             return new Node(key);
//         }
//         if(key < node.key){
//             node.left = insert(node.left, key);

//         }else if(key > node.key){
//             node.right = insert(node.right, key);
//         }
//         // else{
//         //     return node;
//         // }
//         node.height = 1 + Math.max(height(node.left), height(node.right));

//         int balance = getBalance(node);
//         if(balance > 1 && key < node.left.key){
//             return rightRotate(node);
//         }
//         if(balance < -1 && key > node.right.key){
//             return leftRotate(node);
//         }
//         if(balance > 1 && key > node.left.key){
//             node.left = leftRotate(node.left);
//             return rightRotate(node);
//         }
//         if(balance < -1 && key < node.right.key){
//             node.right = rightRotate(node.right);
//             return leftRotate(node);
//         }
//         return node;
//     }

//     void insert(int key){
//         root = insert(root, key);

//     }
//     void printInOrder(Node node){
//         if(node == null){
//             return;
//         }
//         printInOrder(node.left);
//         System.out.println(node.key + " ");
//         printInOrder(node.right);
        
//     }
//     public static void main(String[] args) {
//         AVLTrees tree = new AVLTrees();

//         tree.insert(10);
//         tree.insert(20);
//         tree.insert(30);
//         tree.insert(40);
//         tree.insert(50);

//         System.out.println("Inorder print of AVL Tree : ");
//         tree.printInOrder(tree.root);
//     }
// }
// package praveen;

    //AVL Trees are self balancing binary search trees
    //AVL automatically balances the tree after every insertion and deletion
    //AVL tree is a binary search tree with the following properties:
    //1. The difference between the heights of the left and right subtree of every node is at most 1
    //2. The left and right subtree are also AVL trees
    //3. The left and right subtree are balanced
    //4. The left and right subtree are sorted     

public class AVL {
    public static void main(String[] args) {
        AVL tree=new AVL();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);
        System.out.println("Inorder print of AVL tree : ");
        tree.printInorder(tree.root);
    }
    class Node{
        int key;
        int height;
        Node left,right;
        Node(int key){
            this.key=key;
            height=1;
        }
    }
    public Node root;
    public int height(Node n){
        if(n==null)
            return 0;
        return n.height;    
    }
    int getBalance(Node n){
        if(n==null)
            return 0;
        return height(n.left)-height(n.right);
    }
    public Node rightRotate(Node y){
        Node x=y.left;
        Node T2=x.right;
        x.right=y;
        y.left=T2;
        y.height=Math.max(height(y.left),height(y.right))+1;    
        x.height=Math.max(height(x.left),height(x.right))+1;
        return x;
    }
    public Node leftRotate(Node x){
        Node y=x.right;
        Node T2=y.left;
        y.left=x;
        x.right=T2;
        x.height=Math.max(height(x.left),height(x.right))+1;
        y.height=Math.max(height(y.left),height(y.right))+1;
        return y;
    }
    Node insert(Node node,int key){
        if(node==null)
            return new Node(key);
        if(key<node.key)
            node.left=insert(node.left,key);
        else if(key>node.key)
            node.right=insert(node.right,key);
        node.height=Math.max(height(node.left),height(node.right))+1;
        int balance =getBalance(node); 
        if(balance>1&&key<node.left.key)
            return rightRotate(node);
        if(balance<-1&&key>node.right.key)
            return leftRotate(node);
        if(balance>1&&key>node.left.key){
            node.left=leftRotate(node.left);
            return rightRotate(node);
        }
        if(balance<-1&&key<node.right.key){
            node.right=rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
        //return the node after insertion and balancing
    }
    void insert(int key){
        root=insert(root,key);
    }
    void printInorder(Node node){
        if(node==null)
            return;
        printInorder(node.left);
        System.out.print(node.key+" ");
        printInorder(node.right);
    }
}