package sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public static int[] sort(int[] a) {
		int current=0;
		l1:
		for(int i=0;i<a.length-1; i++) {

			current=a[i+1];
			
			for(int j=i; j>=0; j--) {
				
				if(a[j]>current) {
			
					a[j+1]=a[j];
					
					if(j==0) {
						
						a[j]=current;
					}
				}else if(a[j]<current) {
					
					a[j+1]=current;
					
					continue l1;
					
					}else if(j==0) {
						
						a[j]=current;
					
						continue l1;
					}
				}
			}
		return a;
		}
		
		


	public static void main(String[] args) {
		
        int[] a= {0,1,8,9,99,4,100,500,6,1000};
		
		System.out.println(Arrays.toString(sort(a)));

	}

}
