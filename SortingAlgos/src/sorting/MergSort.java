package sorting;

import java.util.Arrays;

public class MergSort {
	
	public static void merg(int[] a,int[] b, int u, int mid, int l) {
		
		int i=u;
		int j=mid+1;
		int k=l;
		
		while(i<=mid && j<=u) {
			if(a[i]<=a[j]) {
				a[k]=a[i];
				i++;
			}else {
				a[k]=a[j];
				j++;
			}
			
			k++;
		}
		if(i>mid) {
			while(j<=u) {
				b[k]=a[j];
				j++;
				k++;
			}
		}else if(j>u) {
			while(i<=mid) {
				System.out.println(i+" "+j+" "+mid);
				b[k]=a[i];
				k++;
				i++;
			}
		}
		
		
	}
	
	
	public static void sort(int[] a,int[] b, int u, int l) {
		if(u<l) {
			int mid=(u+l)/2;
			sort(a,b,u,mid);
			sort(a,b,mid+1,l);
			merg(a,b,u,mid,l);
		}
		
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		 int[] a= {0,1,8,9,99,4,100,500,6,1000};
		int b[] =new int[a.length];	
		
		sort(a,b,0,a.length);

	}

}
