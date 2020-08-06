package bt;

import java.util.ArrayDeque;
import java.util.Deque;

public class MazeSolver {
	
	Deque<Integer> stacki = new ArrayDeque<Integer>(); 
	Deque<Integer> stackj = new ArrayDeque<Integer>();
	Deque<String> visitedpath = new ArrayDeque<String>();
	
	int i=0,j=0,count=0,count1=0;
	
	public int[][] maze(int[][] g,int m, int n) {
		
		//Find 1st position in matrix to initiate the maze
		//will implement later if requirement arises
		//Assume maze starting position is 00
		
		
		//0-->unvisited path(can be visited)
		//1-->solid blocks(can't take this path)
		//2-->visited path
		//3-->Denotes end position
		l1:
		while(true) {
		while(true) {
			 //Check down
			if(!(i+1>=m) && (g[i+1][j]!=1) &&  !(g[i+1][j]==2) && !visitedpath.contains(""+(i+1)+j)) {
		
				count++;
				stacki.push(i);
				stackj.push(j);
				
				g[i][j]=2;
				i++;
				visitedpath.push(""+i+j);
				
				//check right
			}else if(!(j+1>=n) && (g[i][j+1]!=1) &&  (g[i][j+1]!=2) && !visitedpath.contains(""+i+(j+1))) {
				
				count++;
				stacki.push(i);
				stackj.push(j);
				
				g[i][j]=2;
				j++;
				visitedpath.push(""+i+j);
			   
				//check left
			}else if(!(j-1<0) && (g[i][j-1]!=2) && (g[i][j-1]!=1) && !visitedpath.contains(""+i+(j-1))) {
				
				count++;
				stacki.push(i);
				stackj.push(j);
				
				g[i][j]=2;
				j--;
				visitedpath.push(""+i+j);
			
				//check up
			}else if(!(i-1<0) && (g[i-1][j]!=1) &&  !(g[i-1][j]==2) && !visitedpath.contains(""+(i-1)+j)) {
		
				count++;
				stacki.push(i);
				stackj.push(j);
				
				g[i][j]=2;
				i--;
				visitedpath.push(""+i+j);
				
				//Backtrack
			}else {
				if(stacki.size()==0) {
					break l1;
				}
				i=stacki.pop();
				j=stackj.pop();
//				System.out.println(i+" bfgfg "+j);
//				g[i][j]=0;
			}
			
			if(g[i][j]==3) {
//				g[i][j]=2;
				break;
			}
		}
		if(count>count1) {
			count1=count;
		}
		System.out.println();
		for(int i=0; i<m; i++) {
	    	   for(int j=0; j<n; j++) {
	    		   System.out.print(" "+g[i][j]);
	    	   }
	    	   System.out.println();
	       }
		
		/*if(stacki.size()==0) {
			break;
		}*/
		i=stacki.pop();
		j=stackj.pop();
		System.out.println(i+" "+j);
		g[i][j]=0;
		
	}
		System.out.println(count1);
		return g;
		
	}

	public static void main(String[] args) {
		
		MazeSolver m = new MazeSolver();
		int a=5;
		int b=5;
		int[][] maze = {{0,1,0,1,1},
                		{0,0,0,1,3},
                		{1,0,0,0,0},
                		{1,0,1,0,0},
                		{1,0,0,0,0}};
		    
		
		
       int[][] x=m.maze(maze ,a, b);
       
       for(int i=0; i<a; i++) {
    	   for(int j=0; j<b; j++) {
    		   System.out.print(" "+x[i][j]);
    	   }
    	   System.out.println();
       }
	}

}
