package sjb.dsa;

public class SinglyLinkedList {
	
	Node  head;
	
	public void insert(int data) {
		Node newNode = new Node(data);
		
		if (head == null) {
			head = newNode;
			
		}
		else
		{
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
				
			}
			
			temp.next = newNode;
		}
	}
	
	public void addfirst(int data) {
		Node newNode = new Node(data);
		head.next=newNode;
		head = newNode;
		
	}
	
	public void addposition(int data,int pos) {
		Node newNode = new Node(data);
		Node team = head;
		for(int i=0;i<pos-1 && team.next!=null;i++) {
			team = team.next;
		}
		newNode.next = team.next;
		team.next = newNode;
	}
	
	//Display list
	public void display() {
		Node current = head;
		
		while (current != null) {
			System.out.println("elements in singleLinkedList : "+current.data);
			current = current.next;
		}
		
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();

		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
//
		list.addfirst(50);
//
		list.addposition(60, 2);
		list.display();

	}

}
