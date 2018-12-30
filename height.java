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
public static int max(int a,int b){
    if(a>b){
        return a;
    }
    else{
        return b;
    }
}
	public static int height(Node root) {
      if(root!=null){
          if(root.left==null && root.right==null){
              return 0;
          }
          else{
              return max(height(root.left),height(root.right))+1;
          }
      }
          return 0;
      }
    

	public static Node insert(Node root, int data) {