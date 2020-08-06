package bt;

import java.util.ArrayDeque;
import java.util.Deque;


public class KnightsTourProblem {
	
	//i and j contains moves of knight(i and j combined)
	int[] arri={2, 1, -1, -2, -2, -1, 1, 2}; 
	int[] arrj={1, 2,  2,  1, -1, -2,-2, -1}; 
	
	
	Deque<Integer> stacki = new ArrayDeque<Integer>(); 
	Deque<Integer> stackj = new ArrayDeque<Integer>();
	Deque<Integer> stackcount = new ArrayDeque<Integer>();
	Deque<String> position = new ArrayDeque<String>();
	int lol=0;
	int count=0,x=0,y=0,i=0,j=0;
	int count2=0;
	int h=1;
	public int[][] check(int a,int b) throws Throwable {
		int[][] p = new int[a][b];
		for(int l=0; l<a; l++) {
			for(int k=0; k<b; k++) {
				
				p[l][k]=0;
			}
		}
		
		int f=0;
		int q=0;
		String pos = ""+i+j;
		
		l1:
		while(stacki.size()<=a*b) {
			
			x=i+arri[count];
			y=j+arrj[count];
		
			//System.out.println("count "+count);
			if(x<0 || y<0 || x>=a || y>=b) {
				count++;
			}else if(position.contains(""+x+y)) {
				count++;
			}else {	
			
				stackcount.push(count);
			    count=0;
				p[f][q]=h;
				pos = ""+f+q;
				position.push(pos);
				stacki.push(f);
				stackj.push(q);
				f=x;
				q=y;
				h++;
				i=x;
				j=y;
				if(h==a*b) {
					p[f][q]=h;
					break;
				}
			}
			
			//check if all positions is checked
			if(count==8) {
			while(count==8) {
				if(stacki.size()==0) {
					System.out.println("Tour is not possible");
					break l1;
				}
				h--;
				i=stacki.pop();
				j=stackj.pop();
				f=i;
				q=j;
				p[f][q]=0;
				position.pop();
				count=stackcount.pop()+1;
			
			}
		}
		}
		return p;
	}

	public static void main(String[] args) throws Throwable {
		KnightsTourProblem k = new KnightsTourProblem();
		int a=8;
		int b=6;
		int[][] g=k.check(a,b);
		
		for(int l=0; l<a; l++) {
			for(int m=0; m<b; m++) {
				System.out.print(" | "+g[l][m]);
			}
			System.out.println();
		}

	}

}
