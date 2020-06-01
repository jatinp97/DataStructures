
public class QuickSort {

	int partition(int arr[],int low,int high){
		
		int pivot=arr[high];
		int i=(low-1);
		for(int j=low;j<arr.length;j++){
			if(arr[j]<pivot){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return (i+1);
	}
	void sort(int arr[],int low,int high){
		if(low<high){
			int pi=partition(arr,low,high);
		
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
		
		} 
	}
	void printArray(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		int[] arr={10,7,8,9,1,5};
		QuickSort qs=new QuickSort();
		qs.sort(arr,0,arr.length-1);
		System.out.println("Sorted array");
		qs.printArray(arr);
	}
}
