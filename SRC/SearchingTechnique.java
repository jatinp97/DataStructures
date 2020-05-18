import java.util.Arrays;
public class Searching {

	public boolean linerSearch(int[] array,int key){
		boolean found=false;
		for(int i=0;i<array.length;i++){
			if(array[i]==key){
				System.out.println("Data found at:"+i);
				found=true;
				return found;
			}
		}
		System.out.println("Data not present:");
		return found;
	}
	
	public int binarySearch(int[] arrays,int key){
		Arrays.sort(arrays);
		int low=0;
		int high=arrays.length-1;
		
		while(low<=high){
			int mid=low+(high-low)/2;
			if(arrays[mid] == key){
				return mid;
			}
			else if(arrays[mid]<key){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
	
		int[] array={1,2,3,4,5,6,7,8,9};
		Searching sc=new Searching();
		System.out.println(sc.linerSearch(array, 0));
		System.out.println(sc.linerSearch(array, 4));
		int[] arrays={9,7,6,5,8,1,4,3,2};
		System.out.println("result:"+sc.binarySearch(array, 5));
		System.out.println("Result:"+sc.binarySearch(arrays, 7));

	}

}
