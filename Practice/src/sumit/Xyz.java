package sumit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Xyz {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int g=0;
		int previous=0;
		for(int i=1; i<=n; i++) {
			
			int x = s.nextInt();
		
			if(x==1) {
				
				/*if(list.size()!=0) {
					 g = list.get(list.size()-1);
				}*/
				
				int y=s.nextInt();
				
                if(y>g) {
                	previous=g;
					g=y;
				}
              //  System.out.println(previous);
              //  System.out.println(g);
				list.add(y);
			//	System.out.println(list);
			}else if(x==2) {
				list.remove(list.size()-1);
			//	System.out.println(list);
			}else if(x==3) {
				
				if(list.size()==1) {
					System.out.println(list.get(list.size()-1));
				}else if(list.size()==2) {
					if(list.get(0)>list.get(1)) {
						System.out.println(list.get(0));
					}else {
						System.out.println(list.get(1));
					}
				}else {
					
					if(list.contains(g)==true) {
						System.out.println(g);
					}else if(list.contains(previous)==true) {
						System.out.println(previous);
					}else {
						int large=list.get(0);
						for(int j=1; j<list.size(); j++) {
							if(list.get(j)>large) {
								large=list.get(j);
							}
						}
						
						System.out.println(large);
					}
					
					
					
				}
				
				Thread.sleep(500);
				
			}
		}

	}

}
