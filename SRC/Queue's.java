public class BasicQueue {
	int[] array;
	int front,rear,size;
	public BasicQueue(int size) {
	
		front=rear=-1;
		array=new int[size];
	}
	public void enQueue(int num){
		if(front==0 && rear==size-1 || rear==(front-1)){
			throw new IllegalStateException(" Queue is full");
			
		}
		else if(front==-1){
			front=rear=0;
			array[rear]=num;
		}
		else if((rear == (array.length-1)) && (front!=0)){
			rear=0;
			array[rear]=num;
		}
		else{
			array[++rear]=num;
		}
	}
	int deQueue(){
		
		
		if(front==-1){
			 throw new IllegalStateException("queue is empty");
			
		}
		int data;
		if(front==rear){
			data=array[front];
			front=rear=-1;
			return data;
		}
		else if(front==size-1 && rear>0){
			data=array[front];
			front=0;
			return data;
		}
		else{
		data=array[front++];
		return data;
	}
	}
	void printQueue(){
		if(front==-1){
			System.out.println(" queue empty");
		return;
		}
		System.out.println(" Elements are");
		if(rear>front){
			for(int i=front;i<=rear;i++){
				System.out.print(array[i]+" ");
			}
		}
		else{
			for(int i=front;i<=array.length-1;i++){
				System.out.print(array[i]+" ");
			}
			for(int i=0;i<=rear;i++){
				System.out.print(array[i]+" ");
			}
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		BasicQueue bq=new BasicQueue(5);
		bq.enQueue(10);
		bq.enQueue(20);
		bq.printQueue();
		bq.enQueue(30);
		bq.enQueue(40);
		bq.enQueue(50);
		bq.printQueue();
		System.out.println(bq.front);
		System.out.println(bq.rear);
		System.out.println(bq.deQueue()+" Removed");
		System.out.println(bq.front);
		bq.printQueue();
		bq.enQueue(60);
		bq.printQueue();
		System.out.println(bq.deQueue()+"removed ");
		System.out.println(bq.front+" "+ bq.rear);
		bq.printQueue();
		System.out.println(bq.front + " and "+bq.rear);
		System.out.println("value at: "+ bq.front+" is "+bq.array[bq.front]);

	}

}
