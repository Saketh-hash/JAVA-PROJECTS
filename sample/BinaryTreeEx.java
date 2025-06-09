// package Java Programs.CRT DAY 10;
// Binary tree
// Take a tree with 3 Names: "Mom", "Dad", "You"
// Print the root of the tree
// Print left and right child of a node
// Show how to go from top to bottom (root -> children).
// Count how many nodes are in your tree
// Count how many nodes don't have children (leaf nodes)
// Print all names from left to right (in-order)
// Make a tree and flip left and right children (mirror it)
// Print all paths from top to bottom
// Chick if the tree is empty.
public class BinaryTreeEx {
    static class Node{
        String data;
        Node left;
        Node right;
        Node(String data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void TopToBottomTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.println("Visiting Node: " + root.data);
        // System.out.println(root.data);
        TopToBottomTraversal(root.left);
        TopToBottomTraversal(root.right);
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    
    }

    // Count how many nodes don't have children (leaf nodes)
    public static int countLeafNodes(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return countLeafNodes(root.left) + countLeafNodes(root.right);

    }

    // Print all names from left to right (in-order)

    // In-order traversal - left, root, right
    public static void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }

    // Make a tree and flip left and right children (mirror it)
    public static void mirror(Node root){
        if(root == null){
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirror(root.left);
        mirror(root.right);
    }

    // Print all paths from top to bottom
    public static void printPaths(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        printPaths(root.left);
        printPaths(root.right);
    }

    // Check if the tree is empty.
    public static boolean isEmpty(Node root){
        return root == null;
    }

    public static void main(String[] args) {
        Node root = new Node("Mom");
        root.left = new Node("Dad");
        root.right = new Node("You");

        System.out.println("Root: " + root.data);
        System.out.println("Left child: " + root.left.data);
        System.out.println("Right child: " + root.right.data);

        // Show how to go from top to bottom (root -> children).
        TopToBottomTraversal(root);
        // Count how many nodes are in your tree
        System.out.println("Total Count of nodes in my tree is: " + countNodes(root));

        // Count how many nodes don't have children (leaf nodes)
        System.out.println("Total Count of leaf nodes in my tree is: " + countLeafNodes(root));

        // Print all names from left to right (in-order)
        System.out.println("In-order traversal: ");
        inOrderTraversal(root);

        // Make a tree and flip left and right children (mirror it)
        System.out.println("Mirrored tree: ");
        mirror(root);
        inOrderTraversal(root);

        // Print all paths from top to bottom
        System.out.println("Paths from top to bottom: ");
        printPaths(root);

        // Check if the tree is empty.
        System.out.println("Is the tree empty? " + isEmpty(root));
        
    }
}
