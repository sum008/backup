package sumit;

import java.util.Arrays;

public class MaxHeight {
	
	static long largestRectangle(int[] h) {
		
		Arrays.sort(h);
		System.out.println(Arrays.toString(h));
		int height=0;
		int count=2;
		height=h[h.length/2-1]*count;
		for(int i=h.length-2; i>=0; i--) {
			int temp=h[i]*count;
			if(temp>height) {
				height=temp;
			}
			count++;
		}
		return height; //26152
		


    }

	public static void main(String[] args) {
		
		int[] h= {8979 ,4570, 6436, 5083, 7780 ,3269 ,5400, 7579 ,2324 ,2116};
		System.out.println(largestRectangle(h));

	}

}
