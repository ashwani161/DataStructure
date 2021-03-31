package DataStructures;

public class SortedLinkedList {
	 class Node{  
	        int data;  
	        Node next;  
	          
	        public Node(int data) {  
	            this.data = data;  
	            this.next = null;  
	        }  
	    }  
	   
	    //Represent the head and tail of the singly linked list  
	    public Node head = null;  
	    public Node tail = null;  
	      
	    //addNode() will add a new node to the list  
	    public void add(int data) {  
	        //Create a new node  
	        Node newNode = new Node(data);  
	          
	        //Checks if the list is empty  
	        if(head == null) {  
	            //If list is empty, both head and tail will point to new node  
	            head = newNode;  
	            tail = newNode;  
	        }  
	        else {  
	            //newNode will be added after tail such that tail's next will point to newNode  
	            tail.next = newNode;  
	            //newNode will become new tail of the list  
	            tail = newNode;  
	        }  
	    }  
	      
	    //sortList() will sort nodes of the list in ascending order  
	    public void sortList() {  
	        //Node current will point to head  
	        Node currentNode = head, index = null;  
	        int temp;  
	          
	        if(head == null) {  
	            return;  
	        }  
	        else { 
				while(currentNode != null) {  
	                //Node index will point to node next to current  
	                index = currentNode.next;  
	                  
	                while(index != null) {  
	                    //If current node's data is greater than index's node data, swap the data between them  
	                    if(currentNode.data > index.data) {  
	                        temp = currentNode.data;  
	                        currentNode.data = index.data;  
	                        index.data = temp;  
	                    }  
	                    index = index.next;  
	                }  
	                currentNode = currentNode.next;  
	            }      
	        }  
	    }  
	      
	    //display() will display all the nodes present in the list  
	    public void display() {  
	        //Node current will point to head  
	        Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        while(current != null) {  
	            //Prints each node by incrementing pointer  
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        }  
	        System.out.println();  
	    }  
	      
	    public static void main(String[] args) {  
	          
	        SortedLinkedList sList = new SortedLinkedList();  
	            
	        sList.add(56);  
	        sList.add(70);  
	        sList.add(30);  
	        sList.add(40);    
	           
	        System.out.println("Original list: ");  
	        sList.display();    
	        sList.sortList();    
	        System.out.println("Sorted list: ");  
	        sList.display();  
	    }  
}