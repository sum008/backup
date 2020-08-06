package sumit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		ArrayList<Integer> list  =new ArrayList<Integer>();
		list.add(1);
		list.add(11);
		list.add(21);
		list.add(31);
		list.set(1, 42);
		System.out.println(list);
		
		Scanner s = new Scanner(System.in);
		char a[] = new char[5];
		
		char temp;
		int i=0;
		a=s.next().toCharArray();
		int j=a.length-1;
		//System.out.println(Arrays.toString(a));
		while(i<j) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			System.out.println(i+" "+j);
		}
       System.out.println(Arrays.toString(a));
	}

}
