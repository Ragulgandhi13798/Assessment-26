package com.test;

public class Smallele {
	
	  public static class Node{  
	        int data;  
	        Node left;  
	        Node right;  
	  
	        public Node(int data){  
	            
	            this.data = data;  
	            this.left = null;  
	            this.right = null;  
	        }  
	      }  
	  
	       
	      public Node root;  
	  
	      public void SmallestNode(){  
	          root = null;  
	      }  
	  
	    
	      public int smallestElement(Node temp){  
	        
	          if(root == null) {  
	              System.out.println("Tree is empty");  
	              return 0;  
	          }  
	          else {  
	                int leftMin, rightMin;  
	                
	                int min = temp.data;  
	  
	               
	                if(temp.left != null){  
	                  leftMin = smallestElement(temp.left);  
	               
	                  min = Math.min(min, leftMin);  
	                }  
	  
	               
	                if(temp.right != null){  
	                  rightMin = smallestElement(temp.right);  
	                
	                  min = Math.min(min, rightMin); 
	                }  
	                return min;  
	          }  
	      }  
	  
	      public static void main(String[] args) {  
	  
	        Smallele bt = new Smallele();  
	        
	        bt.root = new Node(7);  
	        bt.root.left = new Node(2);  
	        bt.root.right = new Node(3);  
	        bt.root.left.left = new Node(5);  
	        bt.root.right.left = new Node(9);  
	        bt.root.right.right = new Node(6);  
	  
	      
	        System.out.println( bt.smallestElement(bt.root));  
	      }  
	
}
