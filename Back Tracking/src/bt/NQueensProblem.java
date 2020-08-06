package bt;

import java.util.ArrayDeque;
import java.util.Deque;


public class NQueensProblem {
	
	int i=0,j=0,m,n,x,y,p,q;
	
	Deque<Integer> stacki = new ArrayDeque<Integer>(); 
	Deque<Integer> stackj = new ArrayDeque<Integer>();
	
	
	public void solve(int f) throws InterruptedException {
		String[][] a = new String[f][f];
		for(int l=0; l<f; l++) {
			for(int k=0; k<f; k++) {
				a[l][k]="o";
			}
			//System.out.println();
		}
		a[i][j]="@";
		int c=1;
		stacki.push(i);
		stackj.push(j);
		i=i+1;
		int count=0;
		
		l1:
		while(true) {
		
		while(!(stacki.size()==f)) {
				y=j;
				x=i;
				m=i;
				n=j;
				p=i;
				q=j;
				//for loop for left diagonal
				
				for(x=i-1; x>=0; x--) {
					y--;
					if(y<0) {
						break;
					}
						if(a[x][y].equals("@")) {
							count++;
							break;
						}
					
					
				}
				//for loop for linear up
				if(count==0) {
					for(m=i-1; m>=0; m--) {
						if(a[m][n].equals("@")) {
							count++;
						}
					}
				}
				
				
				
				if(count==0) {
					//for loop for right diagonal
					l2:
					for(p=i-1; p>=0; p--) {
						
						q++;
						if(q>f-1) {
							break;
						}
							if(a[p][q].equals("@")) {
									count++;
									break l2;
								}
					}
				}
				
				//Check for valid position
				if(count==0 && j<=f-1) {
					a[i][j]="@";
					stacki.push(i);
					stackj.push(j);
					i++;
					j=0;
				}else if(count>0 &&  j==f-1) {
					
				    while(j==f-1) {//we know that we can't go any further(because (count>0 || count1>0 || count2>0)  &&  j==f-1(last index)) 
				    	           //so we take previous element and check with that
				    	if(stacki.size()==0) {
							System.out.println("No further solution");
							break l1;
						}            
						i=stacki.pop();
						j=stackj.pop();
						a[i][j]="o";
					}
				    j=j+1;
				}else {
					j++;
				}
				count=0;
		
		}
		
		System.out.println(c++ +" Solution is....");
		for(int l=0; l<f; l++) {
			for(int k=0; k<f; k++) {
				System.out.print(" | "+a[l][k]);
				
			}
			System.out.println();
		}
		System.out.println();
		
		 i=stacki.pop();
         j=stackj.pop();
         a[i][j]="o";
		 while(j==f-1) {//we know that we can't go any further(because (count>0 || count1>0 || count2>0)  &&  j==f-1(last index)) 
            //so we take previous element and check with that
             i=stacki.pop();
             j=stackj.pop();
             a[i][j]="o";
              }
              j=j+1;
		
	}
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		
		NQueensProblem p = new NQueensProblem();
		
		p.solve(10);

	}

}
