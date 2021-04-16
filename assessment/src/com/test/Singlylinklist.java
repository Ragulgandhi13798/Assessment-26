package com.test;

public class Singlylinklist {
	 class Node{  
	        int data;  
	        Node next;  
	  
	        public Node(int data) {  
	            this.data = data;  
	            this.next = null;  
	        }  
	    }  
	    public Node head = null;  
	    public Node tail = null;  
	    public void addNode(int data) {  
	        
	        Node newNode = new Node(data);  
	 
	        if(head == null) {  
	            
	            head = newNode;  
	            tail = newNode;  
	        }  
	        else {  
	           
	            tail.next = newNode;  
	         
	            tail = newNode;  
	        }  
	    }  
	  
	   
	    public void reverse(Node current) {  
	        
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        else {  
	            
	            if(current.next == null) {  
	                System.out.print(current.data + " ");  
	                return;  
	            }  
	            
	            reverse(current.next);  
	            System.out.print(current.data + " ");  
	        }  
	    }  
	  
	    
	    public void display() {  
	        
	        Node current = head;  
	  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	  
	        while(current != null) {  
	           
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        }  
	        System.out.println();  
	    }  
	  
	    public static void main(String[] args) {  
	  
	    	Singlylinklist sList = new Singlylinklist();  
	  
	   
	        sList.addNode(4);  
	        sList.addNode(5);  
	        sList.addNode(6);  
	        sList.addNode(7);  
	  
	        System.out.println("Original List: ");  
	        sList.display();  
	  
	        System.out.println("Reversed List: ");  
	      
	        sList.reverse(sList.head);  
	    }  
	}  

