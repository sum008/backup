package sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] sort(int[] a) {
		
		int smallest;
		int pos=0;
		for(int i=0; i<a.length; i++) {
			smallest=a[i];
			pos=i;
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<smallest) {
					smallest=a[j];
					pos=j;
				}
			}
			if(a[i]!=smallest) {
				int temp=a[i];
				a[i]=a[pos];
				a[pos]=temp;
			}
			
			
		}
		return a;
		
		
	}

	public static void main(String[] args) {
		
		int[] a= {4,1,8,9,99,0,100,500,6,1000};
		
		System.out.println(Arrays.toString(sort(a)));

	}

}
