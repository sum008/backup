package sumit;

import java.util.ArrayDeque;
import java.util.Deque;

public class WordSearch {
	
public static void search(String input, char[][] words,int len) {
		
		Deque<Integer> stacki = new ArrayDeque<Integer>();
		Deque<Integer> stackj = new ArrayDeque<Integer>();
		Deque<Integer> stackcurrent = new ArrayDeque<Integer>();
		Deque<String> stackij = new ArrayDeque<String>();
		String check="";
		int count=0,i=0,j=0;
		int current=0;
		
		l2:
		for( i=0; i<words.length; i++) {
			for( j=0; j<len; j++) {
				if(current<input.length()) {
				if(current==0 && input.charAt(current)==words[i][j] && !stackij.contains(""+i+j)) {
					check=check+input.charAt(current);
					stackcurrent.push(current);
					stacki.push(i);
					stackj.push(j);
					stackij.push(""+i+j);
					current++;
					System.out.println(i+" "+j);
					break l2;
				}
				}
			}
		}
		
		          while(stacki.size()!=input.length()) {
		        	  
		        	  if(stacki.isEmpty()==false) {
					//check diagonal up left
					if(i-1>=0 && j-1>=0 && words[i-1][j-1]==input.charAt(current) && !stackij.contains(""+(i-1)+(j-1))) {
						count++;
						i=i-1;j=j-1;
						stackcurrent.push(current);
						stacki.push(i);
						stackj.push(j);
						stackij.push(""+i+j);
						current++;
					//check diagonal up right	
					}else if(i-1>=0 && j+1<len && count==0 && words[i-1][j+1]==input.charAt(current) && !stackij.contains(""+(i-1)+(j+1))) {
						count++;
						i=i-1;j=j+1;
						stackcurrent.push(current);
						stacki.push(i);
						stackj.push(j);
						stackij.push(""+i+j);
						current++;
					//check diagonal down left
					}else if(i+1<len && j-1>=0 && count==0 && words[i+1][j-1]==input.charAt(current) && !stackij.contains(""+(i+1)+(j-1))) {
						count++;
						i=i+1;j=j-1;
						stackcurrent.push(current);
						stacki.push(i);
						stackj.push(j);
						stackij.push(""+i+j);
						current++;
					//check diagonal down right	
					}else if(i+1<len && j+1<len && count==0 && words[i+1][j+1]==input.charAt(current) && !stackij.contains(""+(i+1)+(j+1))) {
						count++;
						i=i+1;j=j+1;
						stackcurrent.push(current);
						stacki.push(i);
						stackj.push(j);
						stackij.push(""+i+j);
						current++;
				    //check diagonal up 	
					}else if(i-1>=0  && count==0 && words[i-1][j]==input.charAt(current) && !stackij.contains(""+(i-1)+j)) {
						count++;
						i=i-1;
						stackcurrent.push(current);
						stacki.push(i);
						stackj.push(j);
						stackij.push(""+i+j);
						current++;
					//check diagonal down	
					}else if(i+1<len && count==0 && words[i+1][j]==input.charAt(current) && !stackij.contains(""+(i+1)+j)) {
						count++;
						i=i+1;
						stackcurrent.push(current);
						stacki.push(i);
						stackj.push(j);
						stackij.push(""+i+j);
						current++;
					//check diagonal left	
					}else if(j-1>=0 && count==0 && words[i][j-1]==input.charAt(current) && !stackij.contains(""+i+(j-1))) {
						count++;
						j=j-1;
						stackcurrent.push(current);
						stacki.push(i);
						stackj.push(j);
						stackij.push(""+i+j);
						current++;
					//check diagonal right	
					}else if(j+1<len && count==0 && words[i][j+1]==input.charAt(current) && !stackij.contains(""+i+(j+1))) {
						count++;
						j=j+1;
						stackcurrent.push(current);
						stacki.push(i);
						stackj.push(j);
						stackij.push(""+i+j);
						current++;
						
					}
		        	  }
					//Backtrack
					if(count==0) {
						System.out.println("backtrack "+current);
						int cur=current;
						if(stacki.isEmpty()) {
							return;
						}
						i=stacki.pop();
						i=stackj.pop();
						if(stacki.isEmpty()==false) {
						i=stacki.pop();
						j=stackj.pop();
						}
						current=stackcurrent.pop();
						System.out.println(i+" ff "+j+" "+current);
						if(cur==current) {
							i=stacki.pop();
							j=stackj.pop();
							current=stackcurrent.pop();
							System.out.println(i+" ff "+j+" "+current);
						}
						
						if(stacki.isEmpty()) {
							//System.out.println("No path found");
							l2:
							for(i=0 ;i<words.length; i++) {
								for(j=0 ;j<len; j++) {
									if(current<input.length()) {
									if(current==0 && input.charAt(current)==words[i][j] && !stackij.contains(""+i+j)) {
										check=check+input.charAt(current);
										stackcurrent.push(current);
										stacki.push(i);
										stackj.push(j);
										stackij.push(""+i+j);
										current++;
										System.out.println(i+" "+j);
										break l2;
									}
									}
								}
							}
							if(i==words.length-1 && j==len-1) {
							return;}
						}
						
					}else {
						count=0;
					}
			 }
		while(!stacki.isEmpty()) {
				System.out.print(stacki.pop()+" ");
				System.out.print(stackj.pop());
				System.out.println();
			
		}
		
	}


	public static void main(String[] args) {
		
		char[][] words = { { 's', 'u', 'v', 'c', 'd' },
		                   { 'u', 'y', 'u', 'o', 'x' }, 
		                   { 'h', 'm', 'p', 't', 'g' },
		                   { 'i', 'r', 'l', 'r', 'n' }, 
		                   { 'a', 't', 'r', 'i', 'n' } };

        search("sumit",words,5);

	}

}
