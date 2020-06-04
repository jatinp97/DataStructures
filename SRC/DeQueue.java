
class DeQueue
{ 
	
	int arr[]; 
	int front; 
	int rear; 
	int size; 
	
	public DeQueue(int size) 
	{ 
		arr = new int[size]; 
		front = -1; 
		rear = 0; 
		this.size = size; 
	} 

	boolean isFull() 
	{ 
		return ((front == 0 && rear == size-1)||front == rear+1); 
	} 

	
	boolean isEmpty () 
	{ 
		return (front == -1); 
	} 
	
	
	void insertfront(int key) 
	{ 
		
		if (isFull()) 
		{ 
			System.out.println("Overflow"); 
			return; 
		} 
		
		if (front == -1) 
		{ 
			front = 0; 
			rear = 0; 
		} 
		else if (front == 0) 
			front = size - 1 ; 

		else  
			front = front-1; 

		arr[front] = key ; 
	} 

	void insertrear(int key) 
	{ 
		if (isFull()) 
		{ 
			System.out.println(" Overflow "); 
			return; 
		}	
		
		if (front == -1) 
		{ 
			front = 0; 
			rear = 0; 
		} 
		else if (rear == size-1) 
			rear = 0; 
		else
			rear = rear+1; 
		
		
		arr[rear] = key ; 
	} 

	void deletefront() 
	{ 
		
		if (isEmpty()) 
		{ 
			System.out.println("Queue Underflow\n"); 
			return ; 
		} 

		if (front == rear) 
		{ 
			front = -1; 
			rear = -1; 
		} 
		else
			
			if (front == size -1) 
				front = 0; 

			else 
				front = front+1; 
	} 

	void deleterear() 
	{ 
		if (isEmpty()) 
		{ 
			System.out.println(" Underflow"); 
			return ; 
		} 

		if (front == rear) 
		{ 
			front = -1; 
			rear = -1; 
		} 
		else if (rear == 0) 
			rear = size-1; 
		else
			rear = rear-1; 
	} 

	int getFront() 
	{ 
	
		if (isEmpty()) 
		{ 
			System.out.println(" Underflow"); 
			return -1 ; 
		} 
		return arr[front]; 
	} 

	
	int getRear() 
	{ 
		
		if(isEmpty() || rear < 0) 
		{ 
			System.out.println(" Underflow\n"); 
			return -1 ; 
		} 
		return arr[rear]; 
	} 

	
	public static void main(String[] args) 
	{ 
		
		DeQueue dq = new DeQueue(10); 
		
		dq.insertfront(100);
		dq.insertrear(10);
		dq.insertfront(90);
		dq.insertrear(20);
		dq.insertrear(30);
		System.out.println("front: "+ dq.getFront());
		System.out.println("rear: "+ dq.getRear());
		dq.deleterear();
		dq.deletefront();
		System.out.println("front: "+ dq.getFront());
		System.out.println("rear: "+ dq.getRear());
	} 
} 
