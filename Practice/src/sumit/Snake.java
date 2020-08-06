package sumit;

import java.util.ArrayList;

public class Snake {
	
	public static void snk(int[][] s) throws InterruptedException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int pos=3;
		int len=s.length;
		int size=4;
		while(true) {
			
			for(int i=pos; i<s.length;i++) {
				
				int count=0;
				int count1=0;
				while(count<size) {
					
					if(i-count1<0) {
						int x=i-count1;
						s[len+x][2]=1;
						list.add(len+x);
					}else {
						s[i-count1][2]=1;
						list.add(i-count1);
					}
					count++;
					count1++;
				}
				for(int m=0; m<len; m++) {
					if(!list.contains(m)) {
						s[m][2]=0;
					}
				}
				list.clear();
				System.out.println("--------------------------------");
				for(int k=0; k<s.length; k++) {
					System.out.print("-----------");
					for(int l=0; l<5; l++) {
						
						System.out.print(s[k][l]+" ");
					}
					System.out.print("-----------");
					System.out.println();
				}
				System.out.println("--------------------------------");
				Thread.sleep(300);
				
				
			}
			pos=0;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		int s[][] = {{0,0,1,0,0},
				     {0,0,1,0,0},
				     {0,0,1,0,0},
				     {0,0,1,0,0},
				     {0,0,0,0,0},
				     {0,0,0,0,0},
				     {0,0,0,0,0},
				     {0,0,0,0,0}};
		
		snk(s);
		
		System.out.println(5%2);

	}

}
