/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
 class Node
    {
        int i;
        Node left,right;
        public Node(int x)
        {
            i=x;
            left=null;
            right=null;
            
            
        }
        
    }
public class Tree
{ 
    Node root;
    
    Tree(){
        root = null;
        
    }
    
    Tree(int y)
    {
       root = new Node(y); 
    }

   
	public static void main(String[] args)
	{
		
		Tree tree = new Tree();
		
		tree.root = new Node(2);
		tree.root.left = new Node(3);
		tree.root.right = new Node(5);
	}
}
