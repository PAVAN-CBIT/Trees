/*package whatever //do not write package name here */

import java.io.*;

// Recursive Java program for level order traversal of Binary Tree 

/* Class containing left and right child of current 
node and key value*/

class Node
{
    int data;
    Node left,right;
    public Node(int x)
    {
       data = x;
       left = null;
       right = null;
       
    }
    
    
}
class BinaryTree
{
    Node root;
    public BinaryTree()
    {
        root = null;
    }
    void preorder(Node node)
    {
        if(node==null)
            return;
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
        
        
    }
    void printin()
    {
        preorder(root);
    }
    public static void main(String[]args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(3);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(7);
        tree.root.left.right.left.right = new Node(8);
        tree.root.left.right.left.right.left = new Node(9);
        tree.root.left.right.left.right.right = new Node(10);
        System.out.println("Inorder printing");
        tree.printin();
        
    }
    
}
