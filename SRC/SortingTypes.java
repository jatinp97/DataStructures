
public class SortingTypes {

	public void bubbleSort(int[] array){
		System.out.println("Array before sorting:");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		int temp=0;
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	}
	public void selectionSort(int[] array){
		for(int i=0;i<array.length;i++){
			int min_index=i;
			for(int j=i+1;j<array.length;j++){
				if(array[j]<array[min_index]){
					min_index=j;
				}
			}
				 	int temp=array[min_index];
					array[min_index]=array[i];
					array[i]=temp;
		}
	}
		
	public void insertionSort(int[] array){
		int key,j;
		for(int i=1;i<array.length;i++){
			 key=array[i];
			 j=i-1;
			 while(j>=0 && array[j]>key){
				 array[j+1]=array[j];
				 j--;
			 }
			 array[j+1]=key;
			 
		}
	}
	private void mergeSort(int[] array,int low,int mid,int high){
		
		
		int s1=mid-low+1;     
		int s2=high-mid;
		
		int[] left=new int[s1];
		int[] right=new int[s2];
		
		for(int i=0;i<s1;i++){
			left[i]=array[low+1];
		}
		for(int j=0;j<s2;j++){
			right[j]=array[mid+1+j];
		}
		
		int i=0,j=0;
		int k=low;
		
		while(i<s1 && j<s2){
			if(left[i]<=right[j]){
				array[k]=left[i++];
			}
			else{
				array[k]=right[j++];
		}
			k++;
		}
		while(i<s1){
			array[k]=left[i++];                                                      
			k++;
			              
		}
		while(j<s2){
			array[k]=right[j++];
			k++;
		}
	}
	
	public void sortM(int[] array, int low,int high){
		if(low<high){
			int mid=(low+high)/2;
			sortM(array,low,mid);
			sortM(array,mid+1,high);
			mergeSort(array,low,mid,high);
		}
	}
	public static void main(String[] args) {
		
	}
}
