package binarySearch;

import java.util.Arrays;

public class Search {

	public static void main(String[] args) {
		
		int arr[]={2,8,7,3,5,0,1,6};
		
		//Step 1: Sort the array in ascending order
		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted : "+Arrays.toString(arr));
		//Step 2: Take the middle element of array to compare it with search element
		
		int mid=arr.length/2;
		int searchElement=6;
		
		//Step 3: Algorithm
		
		if(searchElement==arr[mid]){ // IF element is in middle
			System.out.println(searchElement +" is present in middle at "+ mid);
		}else if(searchElement<arr[mid]){ //If element is in right side of middle
			for(int i=0; i<mid; i++){
				if(arr[i]==searchElement){
					System.out.println("element "+searchElement +" is present at index "+ i);
				}
			}
		}else if(searchElement>arr[mid]){// If element is in left side of middle
			for(int i=mid; i<arr.length; i++){
				if(arr[i]==searchElement){
					System.out.println("element "+searchElement +" is present at index "+ i);
				}
			}
		}else{
			System.out.println("element is not present");
		}

	}

}
