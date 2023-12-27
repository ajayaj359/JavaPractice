package com.datastructures;

public class LinkedListExmple {
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}

	Node head=null;
	Node tail=null;
	
	public void addNode(int data) {
		Node new_node=new Node(data);
		if(head==null) {
			head=new_node;
			tail=new_node;
		}else {
			tail.next=new_node;
			tail=tail.next;
		}
	}
	public void printMe() {
		Node temp=head;
		
		while(temp != null) {
			System.out.println(temp.data +"-->");
			temp=temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		LinkedListExmple lle=new LinkedListExmple();
		lle.addNode(12);
		lle.addNode(23);
		lle.addNode(45);
		lle.addNode(34);
		
		lle.printMe();

	}
}
