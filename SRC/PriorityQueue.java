public class PriorityQ {
	static class Node{
		Node next;
		 int data, priority;
		Node(int d,int p){
			data=d;
			priority=p;
		}
	};
	static Node head;
	
	
	static Node addToEmpty(Node head,int data,int priority){
		if(head==null){
			Node node=new Node(data,priority);
			node.next=head;
			head=node;
			return head;
		}
		return head;
	}
	static Node push(Node head, int data,int priority){
		if(head==null){
			return addToEmpty(head, data, priority);
		}
		Node temp=head;
		Node node=new Node(data,priority);
		if(temp.priority > priority){
			node.next=temp;
			
			head=node;
			return head;
		}
		else{
			while(temp.next!=null && temp.next.priority<priority){
				temp=temp.next;
			}
			node.next=temp.next;
			temp.next=node;
		}
		return head;
	}
	static Node pop(Node head){
		if(head==null){
			throw new IllegalStateException("Empty");
		}
		Node temp=head;
		temp=temp.next;
		head=temp;
		return head;
	}
	static void printQ(Node head){
		if(head==null){
			System.out.println("Empty");
		}
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(" ");
	}
	static void peek(Node head){
		if(head==null){
			throw new IllegalStateException("Empty");
		}
		System.out.println("Peek is :"+ head.data);
		head=head.next;
	}
	public static void main(String[] args) {
		head=null;
		head = push(head, 55, 5);
		//head = addToEmpty(head, 55, 5);
		printQ(head);
		head = push(head, 44, 3);
		printQ(head);
		head = push(head, 22, 1);
		printQ(head);
		head = push(head, 11, 6);
		printQ(head);
		head = push(head, 99, 2);
		printQ(head);
		head = push(head, 999, 0);
		printQ(head);
		peek(head);
		head =pop(head);
		printQ(head);
	}
}
