public class DoublyList {

	static Node head;
	
	 class Node{
		Node next,prev;
		int data;
		Node(int d){
			data=d;
		}
	};
	 Node addToEmpty(Node head,int data){
		if(head==null){
			Node node=new Node(data);
			node.next=head;
			node.prev=null;
			head=node;
			return head;
		}
		return head;
	}
	 Node push(Node head,int data){
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
	
	 Node insertAfter(Node head, int data,int ref){
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
	 Node insertBefore(Node head, int data,int ref){
		
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
	 void printList(Node head){
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
	
	 Node append(Node head,int data){
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
	
	 void deleteNode(int key){
		 Node temp=head;
		 Node prev=null;
		 if(temp==null){
			 return;
		 }
		 if(temp!=null && temp.data==key){
			 head=temp.next;
			 head.prev=null;
			 temp=null;
			 return;
		 }
		 while(temp!=null && temp.data!=key){
			 prev=temp;
			 temp=temp.next;
		 }
		 if(temp==null){
			 System.out.println("Item not present;");
			 return;
		 }
		 if(temp.next==null){
		 prev.next=temp.next;
		 temp=null;
		 }
		 else{
			 prev.next=temp.next;
			 prev.next.prev=temp.prev;
			 temp=null;
		 }
	 }
	
	public static void main(String[] args) {
		DoublyList dll=new DoublyList();
	head=null;
	head=dll.addToEmpty(head, 1);
	head = dll.push(head,10);
	head=dll.push(head, 5);
	dll.printList(head);
	head=dll.insertAfter(head, 15, 10);
	dll.printList(head);
	head=dll.insertAfter(head, 75, 1);
	dll.printList(head);
	head=dll.insertAfter(head, 15, 66);
	dll.printList(head);
	head=dll.insertBefore(head, 77, 1);
	dll.printList(head);
	head=dll.insertBefore(head, 100, 75);
	dll.printList(head);
	head=dll.insertBefore(head, 77, 150);
	dll.printList(head);
	head=dll.append(head, 150);
	dll.printList(head);
	dll.deleteNode(150);
	dll.deleteNode(15);
	dll.printList(head);
	}
}
