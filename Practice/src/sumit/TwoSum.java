package sumit;

import java.util.Arrays;

public class TwoSum {
	
	public int[] twosum(int[] num,int target) {
		int a=45;
		String b=String.valueOf(a);
		int c=Integer.parseInt(String.valueOf(b.charAt(0)));
		System.out.println(c);
		Arrays.sort(num);
		int mid=num[num.length/2];
		int[] t = new int[2];
		l1:
		for(int i=0; i<num.length; i++ ) {
			for(int j=i+1; j<num.length;j++) {
				if(num[i]+num[j]==target) {
					t[0]=i;
					t[1]=j;
					break l1;
				}
			}
		}
		return t;
	}

	public static void main(String[] args) {
		TwoSum t = new TwoSum();
		
		int[] num= {2,7,11,15};
		System.out.println(Arrays.toString(t.twosum(num, 9)));
		

	}

}
