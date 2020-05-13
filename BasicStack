
public class BasicStack {
	int[] array;
	int top;
	int MAX;
	public BasicStack(int size) {
		array=new int[size];
		MAX=size;
		top=-1;
	}
	public boolean push(int data){
		if(top>MAX-1){
			throw new IllegalStateException(" Stack Overflow");
		
		}
		else{
			array[++top]=data;
			System.out.println(data+" pushed into stack");
			return true;
		}
	}
	public int pop(){

		if(top<0){
			throw new ArrayIndexOutOfBoundsException("Stack underflow");
		}
		else{
			int data=array[top--];
		return data;
		}
	}
	public void displayStack() {
		if(top<0){
			throw new IllegalStateException(" Underflow");
		}
		else{
			System.out.println("elements are: ");
			for(int i=top;i>=0;i--){
				System.out.print(array[i]+" ");
			}
		}
		System.out.println();
	}
	public int getTop() {
		if(top>-1){
		return array[top];
	}
		else{
			throw new IllegalStateException(" Empty Stack");
		}
	}
	public int totalSize(){
		if(top<0){
			throw new IllegalStateException(" Empty Stack");
		}
		return (top+1);
	}
	public boolean contains(int key){
		boolean found=false;
		if(top<0){
			throw new IllegalStateException(" Empty Stack");
		}
		else{
			for(int i=top;i>=0;i--){
				if(array[i]==key){
					found=true;
					break;
				}
			}
		}
		return found;
	}
	public static void main(String[] args)  {
		BasicStack bs=new BasicStack(100);
		//bs.pop();
		bs.push(1);
		bs.push(2);
		bs.push(3);
		bs.push(4);
		bs.displayStack();
		System.out.println("Top of stack is:"+bs.getTop());
		System.out.println(bs.pop()+" popped");
		bs.displayStack();
		System.out.println("Top of stack is:"+bs.getTop());
		System.out.println(bs.contains(0));
		System.out.println("Total size of stack:" + bs.totalSize());
		bs.push(100);
		bs.push(200);
		bs.push(30);
		bs.push(40);
		bs.displayStack();
		System.out.println("Top of stack is:"+bs.getTop());
		System.out.println(bs.contains(0));
		System.out.println(bs.pop()+" popped");
		System.out.println(bs.pop()+" popped");
		System.out.println(bs.pop()+" popped");
		System.out.println("Total size of stack:" + bs.totalSize());
		System.out.println(bs.pop()+" popped");
		System.out.println(bs.pop()+" popped");
		System.out.println(bs.pop()+" popped");
		System.out.println(bs.pop()+" popped");
		bs.push(15);
		System.out.println("Top of stack is:"+bs.getTop());
		System.out.println("Total size of stack:" + bs.totalSize());
	}
	}
