
public class BasicLinkedList {

	Node head;
	static class Node{
		Node next;
		int data;
		Node(int d){
			data=d;
			next=null;
		}
	}
	public void printList(){
		Node current=head;
		while(current!=null){
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	void push(int new_data){
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	public void inserAfter(Node prev_node, int new_data) {
		if(prev_node == null){
			throw new IllegalStateException(" Previous node cannot be empty") ;
		}
		Node new_node=new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	}
	public void append(int new_data){
		Node new_node=new Node(new_data);
		if(head==null){
			head= new Node(new_data);
			return;
		}
		new_node.next=null;
		Node last=head;
		while(last.next != null){
			last=last.next;
		}
		last.next=new_node;
		return;
	}
	
	public void deleteNode(int key){
		Node temp=head;
		Node prev = null;
		if(temp == null){
			return;
		}
		if(temp!=null && temp.data==key){
			head=temp.next;
			return;
		}
		while(temp!=null && temp.data!=key){
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
		
	}
	public void deletePosition(int position){
		if(head==null){
			return;
		}
		Node temp=head;
		if(position==0){
			head=temp.next;
		}
		for(int i=0;temp!=null && i<position-1;i++){
			temp=temp.next;
		}
		if(temp==null || temp.next==null){
			return;
		}
		temp.next=temp.next.next;
	}
	public void deleteList(){
		head=null;
		System.out.println(" List deleted");
	}
	public int getCount(){
		if(head==null){
			return 0;
		}
		Node temp=head;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	public boolean search(int key){
		if(head==null){
			return false;
		}
		while(head!=null){
			if(head.data==key){
				return true;
			}
			head=head.next;
		}
		return false;
	}
	public int getNth(int index){
		Node temp=head;
		int count=0;
		while(temp!=null){
			if(count==index){
				return temp.data;
			}
			count++;
			temp=temp.next;
		}
		assert(false);
		return -1;
	}
	public Node middleNode(){
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	
public static void main(String[] args) {
	BasicLinkedList bll=new BasicLinkedList();
	bll.head=new Node(1);
	Node second=new Node(2);
	Node third=new Node(3);
	
	bll.head.next=second;
	second.next=third;
	bll.printList();
	bll.push(77);
	bll.push(78);
	bll.printList();
	bll.inserAfter(third, 76);
	bll.printList();
	bll.append(60);
	bll.printList();
	bll.deleteNode(77);
	bll.printList();
	bll.deletePosition(4);
	bll.printList();
	System.out.println("Count = "+bll.getCount());
	System.out.println(" Search result: "+ bll.search(78));
	System.out.println(" N^th result: "+ bll.getNth(4));
	System.out.println("Middle node is: " + bll.middleNode());
	
	}
}
