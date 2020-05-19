public class DoublyList {
	
 
	static class Node{
		Node next,prev;
		int data;
		Node(int d){
			data=d;
		}
	};
   static Node head;
  
	static Node addToEmpty(Node head,int data){
		if(head==null){
			Node node=new Node(data);
			node.next=head;
			node.prev=null;
			head=node;
			return head;
		}
		return head;
	}
	static Node push(Node head,int data){
		if(head==null){
			return addToEmpty(head, data);
		}
		Node node=new Node(data);
		node.next=head;
		node.prev=null;
		head.prev=node;
		head=node;
		return head;
	}
	
	static Node insertAfter(Node head, int data,int ref){
		if(head==null){
			return addToEmpty(head, data);
		}
		Node curr=head;
		while(curr.data!=ref){
			if(curr.next==null){
				System.out.println("" +
						"Cannot find the item in list.");
				return head;
			}
			curr=curr.next;
		}
		Node node=new Node(data);
		node.next=curr.next;
		curr.next=node;
		node.prev=curr;
		if(node.next!=null){
			node.next.prev=node;
	}
		return head;
	}
	static Node insertBefore(Node head, int data,int ref){
		
		if(head==null){
			return addToEmpty(head, data);
		}
		Node curr=head;
		while(curr.data!=ref){
			if(curr.next==null){
				System.out.println("Cannot find the item in list.");
				return head;
			}
			curr=curr.next;
		}
		Node node=new Node(data);
		node.prev=curr.prev;
		curr.prev=node;
		node.next=curr;
		if(node.prev!=null){
			node.prev.next=node;
		}
		else
			head=node;
		
		return head;
	}
	static void printList(Node head){
		if(head==null){
			System.out.println("List is empty");
		
		}
		else{
		Node temp=head;
		System.out.println("Forward direction traversing:");
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		}
		System.out.println(" ");
	}
	
	static Node append(Node head,int data){
		if(head==null){
			return addToEmpty(head, data);
		}
		Node node=new Node(data);
		node.next=null;
		Node curr=head;
		while(curr.next!=null){
			curr=curr.next;
		}
		curr.next=node;
		node.prev=curr;
		return head;
	}
	public static void main(String[] args) {
	head=null;
	head=addToEmpty(head, 1);
	head = push(head,10);
	head=push(head, 5);
	printList(head);
	head=insertAfter(head, 15, 10);
	printList(head);
	head=insertAfter(head, 75, 1);
	printList(head);
	head=insertAfter(head, 15, 66);
	printList(head);
	head=insertBefore(head, 77, 1);
	printList(head);
	head=insertBefore(head, 100, 75);
	printList(head);
	head=insertBefore(head, 77, 150);
	printList(head);
	head=append(head, 150);
	printList(head);
	}
}
