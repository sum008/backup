package bt;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SudokuSolver {
	
	Deque<Integer> stacki = new ArrayDeque<Integer>(); 
	Deque<Integer> stackj = new ArrayDeque<Integer>();
	Deque<Integer> number = new ArrayDeque<Integer>();
	ArrayList<Integer> listi = new ArrayList<Integer>();
	ArrayList<Integer> listj = new ArrayList<Integer>();
	Deque<Integer> stackx = new ArrayDeque<Integer>();
	Deque<Integer> stacky = new ArrayDeque<Integer>();
	int i=0,j=0,x=0,y=0;
	public int[][] solve(int[][] g , int m) throws InterruptedException {
		int a=2;//Starting point 2,3,4,5....
		int b=0;
		int e=0;
		while(true) {
			if(a==m) {
				e++;
				break;
			}
			if(m%a==0) {
				b=m/a;
				break;
			}else {
				a++;
			}
		}
		if(e==0) {
			int c=0;
			for(int i=0; i<b; i++) {
				c=c+a;
				listi.add(c);
			}
			c=0;
			for(int i=0; i<a; i++) {
				c=c+b;
				listj.add(c);
			}
		}
		
		//0-->Denotes empty space
		//Other than 0 denoted filled space
		
		int temp=0, num=1;
		l3:
		while(!(i==m && j==m)) {
			  //Check if position is valid or not 
		      if(g[i][j]==0) {
		    	  
		    	//Check each number to be filled 
		    	l8:
				for(num=1;num<=m;num++) {
					
					if(temp==0) {
					//check up the matrix
					for(int u=i; u>=0; u--) {
						if(g[u][j]==num) {
							temp++;
							break;
						}
					}
				}
					//Down the matrix
					if(temp==0) {
						for(int d=i; d<m; d++) {
							if(g[d][j]==num) {
								temp++;
								break;
							}
						}
					}
					
					//left 
					if(temp==0) {
						for(int l=j; l>=0; l--) {
							if(g[i][l]==num) {
								temp++;
								break;
							}
						}
					}
					
					//Right
					if(temp==0) {
						for(int r=j; r<m; r++) {
							if(g[i][r]==num) {
								temp++;
								break;
							}
						}
					}
					
					if(temp==0 && e==0) {
						//System.out.println("xxxxxxxxxxxxxxx issssssss "+x+" "+i);
						//As i will always increment so we don't need loop to increment x 
						while(!(i<listi.get(x))) {
							x++;
							//System.out.println("ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt x is "+x+" "+i);
						}
						
							l5:
							for(int p=listi.get(x)-m/b; p<listi.get(x); p++) {
								
								//In case of y, j changes multiple times in a single row, so we need loop to define the current value of
								//y depending on the current position of j
								for(int r=0; r<listj.size(); r++) {
									if(listj.get(r)>j) {
										y=r;
										//System.out.println("y is "+y);
										break;
									}
								}
									for(int q=listj.get(y)-m/a; q<listj.get(y); q++) {
										if(g[p][q]==num) {
											temp ++;
											break l5;
										}
									}
								
							}
					}
					
					//Means valid number is obtained and can be filled
					if(temp==0) {
						
						stacki.push(i);stackj.push(j);stackx.push(x);stacky.push(y);number.push(num);
						
						g[i][j]=num;
						if(i==m-1 && j==m-1) {
							break l3;
						}
						if(j==m-1 && i<m) {
							//System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
							i++;
							j=0;
							
						}else {
							j++;
						}
					   if(i==m && j==m) {
						break l3;
					}
						
						continue l3;
					    
					//If valid number is not obtained and all possible number is checked then BACKTRACK (the real deal!!!)	 
					}else if(num==m) {
						while(num==m) {
						i=stacki.pop();j=stackj.pop();x=stackx.pop();y=stacky.pop();
						//System.out.println("pop x y"+ x+" "+y+" "+i);
						g[i][j]=0;
						num=number.pop();
						
						if(stacki.size()==0 && num==m) {
							temp=0;
							num=0;
							continue l8;
						}
						
						if(j==m-1) {
							y=0;
						}
						
						}
					}
					//Make temp 0 so that check valid number for new position
					temp=0;
					
				}//loop num
				
			}else{
				if(j==m-1) {
					i++;
					j=0;
				}else {
					j++;
				}
				if(j==m || i==m) {
					break l3;
				}
			}	
	}
		return g;
}

	public static void main(String[] args) throws InterruptedException {
		
		/*   {{3, 0, 6, 5, 0, 8, 4, 0, 0},  
	          {5, 2, 0, 0, 0, 0, 0, 0, 0},  
	          {0, 8, 7, 0, 0, 0, 0, 3, 1},  
	          {0, 0, 3, 0, 1, 0, 0, 8, 0},  
	          {9, 0, 0, 8, 6, 3, 0, 0, 5},  
	          {0, 5, 0, 0, 9, 0, 6, 0, 0},  
	          {1, 3, 0, 0, 0, 0, 2, 5, 0},  
	          {0, 0, 0, 0, 0, 0, 0, 7, 4},  
	          {0, 0, 5, 2, 0, 6, 3, 0, 0}};*/
		
  int[][] g ={{0, 2, 0, 0, 0, 0, 8, 0, 1},  
              {0, 0, 0, 0, 0, 6, 0, 0, 0},  
              {4, 7, 0, 9, 0, 0, 2, 0, 0},  
              {0, 0, 5, 0, 4, 0, 0, 3, 0},  
              {7, 0, 0, 6, 1, 0, 0, 0, 0},  
              {0, 1, 0, 0, 0, 8, 0, 0, 4},  
              {0, 0, 0, 5, 0, 0, 0, 0, 3},  
              {0, 0, 2, 0, 0, 0, 0, 0, 0},  
              {0, 6, 0, 1, 0, 0, 0, 0, 7}};
		
		SudokuSolver s = new SudokuSolver();
		int a=9;
		int[][] x = s.solve(g ,a);
	       
	       for(int i=0; i<a; i++) {
	    	   for(int j=0; j<a; j++) {
	    		   System.out.print(" "+x[i][j]);
	    	   }
	    	   System.out.println();
	       }

	}

}
