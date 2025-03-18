package bca;

public class Single_Linked {
	

	    Node head;



	   

	    class Node {

	        int data;

	        Node next;



	        Node(int val) {

	            data = val;

	            next = null;

	        }

	    }



	    

	    public Single_Linked () {

	        head = null;

	    }



	   

	    public void insertAtBegin(int val) {

	        Node newNode = new Node(val);

	        if (head == null) {

	            head = newNode;

	        } 
	        else {

	            newNode.next = head; 

	            head = newNode;      

	        }

	    }



	   

	    public void insertAtEnd(int val) {

	        Node newNode = new Node(val);

	        if (head == null) {

	            head = newNode;

	        } else {

	            Node temp = head;

	            while (temp.next != null) {

	                temp = temp.next; 

	            }

	            temp.next = newNode; 

	        }

	    }



	        public boolean deleteNode(int val) {

	        if (head == null) {

	            return false;

	        }

	        if (head.data == val) {

	            head = head.next; 

	            return true;

	        }

	        Node current = head;

	        while (current.next != null) {

	            if (current.next.data == val) {

	                current.next = current.next.next; 

	                return true;

	            }

	            current = current.next;

	        }

	        return false; 

	    }



	    

	    public boolean searchNode(int val) {

	        Node temp = head;

	        while (temp != null) {

	            if (temp.data == val) {

	                return true; 

	            }

	            temp = temp.next;

	        }

	        return false; 

	    }



	   

	    public int countNodes() {

	        int count = 0;

	        Node temp = head;

	        while (temp != null) {

	            count++;

	            temp = temp.next;

	        }

	        return count;

	    }



	   

	    public void display() {

	        Node temp = head;

	        while (temp != null) {

	            System.out.print(temp.data + " "); 

	            temp = temp.next;

	        }

	        System.out.println(); 

	    }



	    public static void main(String[] args) {

	        Single_Linked  list = new Single_Linked ();

	        

	      

	        list.insertAtBegin(10);

	        list.insertAtBegin(20);

	        list.insertAtBegin(30);

	        

	        System.out.println("Linked List after inserting at beginning:");

	        list.display();



	        

	        list.insertAtEnd(40);

	        list.insertAtEnd(50);

	        

	        System.out.println("Linked List after inserting at end:");

	        list.display(); 

	       

	        list.deleteNode(20);

	        System.out.println("Linked List after deleting 20:");

	        list.display(); 



	        

	        System.out.println("Is 40 in the list? " + list.searchNode(40));

	        System.out.println("Is 20 in the list? " + list.searchNode(20)); 



	        

	        System.out.println("Number of nodes in the list: " + list.countNodes()); 

	    }

	}




