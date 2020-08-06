package bt;

import java.util.ArrayDeque;
import java.util.Deque;

public class Findsum {
	
	
	Deque<Integer> stacki = new ArrayDeque<Integer>(); 
	Deque<Integer> stackcheck = new ArrayDeque<Integer>();
	Deque<Integer> stacksum = new ArrayDeque<Integer>();
	Deque<Integer> keep = new ArrayDeque<Integer>();
	
	int sum=0;
	int j=0;
	int i=1;
	int prev=0;
	public void checksum(int[] a,int num) {
		
		for(int i=0 ;i<a.length; i++) {
			if(a[i]<num) {
			j=i;
			System.out.println("hhhhhhddddddddddddddddddddddddddddddddddddddd "+a[i]);
			break;
			}
		}
		sum=a[j];
		stackcheck.push(a[j]);
		stacki.push(j);
		while(true) {
			
			if(i==j) {
				i++;
				continue;
			}else if(sum==num) {
				System.out.println("sum "+sum);
				break;
			}else if(sum+a[i]<=num && !keep.contains(sum+a[i]) && i<a.length-1) {
				stackcheck.push(a[i]);
				sum=sum+a[i];
				keep.push(sum);
				stacksum.push(sum);
				stacki.push(i);
				i++;
			}else if(i==a.length-1 && sum+a[i]!=num) {
				
				if(stacksum.size()==0 || stackcheck.size()==0) {
					for(int i=j+1 ;i<a.length; i++) {
						if(a[i]<num) {
						j=i;
						System.out.println("hhhhhhddddddddddddddddddddddddddddddddddddddd "+a[i]);
						break;
						}
					}
					stackcheck.pop();
					stacki.pop();
					
					stackcheck.push(a[j]);
					stacki.push(j);
					sum=a[j];
					i=0;
				}else {
					sum=stacksum.pop();
				    i=stacki.pop()+1;
					int x=stackcheck.pop();
					sum=sum-x;
					}
				
			}else if(i==a.length-1 && sum+a[i]==num) {
				stackcheck.push(a[i]);
				sum=sum+a[i];
				break;
			}else {
				i++;
				}
			
		}
		while(stackcheck.size()!=0) {
			System.out.println(stackcheck.pop());
		}
	}

	public static void main(String[] args) {
		
		Findsum f = new Findsum();
		int[] a= {5,10,12,13,15,18};
		f.checksum(a,27);

	}

}
