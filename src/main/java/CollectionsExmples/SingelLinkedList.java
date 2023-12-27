package CollectionsExmples;



public class SingelLinkedList {

	Node head;

	static class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void print() {
		Node current = head;
		while (current !=null) {
			System.out.print(current.data +"----->");
			current=current.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {

		SingelLinkedList sll = new SingelLinkedList();
		sll.head = new Node(8);
		Node frist=new Node(12);
		Node second=new Node(34);
		Node thard = new Node(43);
		
		sll.head.next=frist;
		frist.next=second;
		second.next=thard;
		
		
		sll.print();
	}

}
