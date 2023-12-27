package CollectionsExmples;

public class SingleLinkedListDemo {
	
	Node head;
	Node tail;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.next=null;
			this.data=data;
		}
	}
	
	public void addNode(int data) {
		
		Node new_Node=new Node(data);
		if(head==null) {
			head=new_Node;
			tail=new_Node;
		}else {
			tail.next=new_Node;
			tail=tail.next;
		}
	}
	
	public void print() {
		Node temp=head;
		
		while (temp!= null) {
			System.out.println(temp.data + "--->");
			temp=temp.next;
		}
		
		System.out.println("null");
	}

	public static void main(String[] args) {
		
		SingleLinkedListDemo slld=new SingleLinkedListDemo();
		slld.addNode(12);
		slld.addNode(24);
		slld.addNode(67);
		slld.addNode(45);
		
		slld.print();
	}
}
