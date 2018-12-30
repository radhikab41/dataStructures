import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/

	public static void levelOrder(Node root) {
      Queue<Node> queue = new  LinkedList<>();
        if(root!=null);
        queue.add(root);
        while(queue.size()>0){
            Node t = queue.remove();
            if(t.left!=null){
                queue.add(t.left);
            }
             if(t.right!=null){
                queue.add(t.right);
            }
            System.out.print(t.data+" ");
        }
    }

	public static Node insert(Node root, int data) {