package sumit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=1; i<=n; i++) {
			String[] x = new String[2];
			//System.out.println("Enter your choice ");
			BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
			x = (k.readLine()).split(" ");
		
			if(x[0].equals("1")) {
				int y=Integer.parseInt(x[1]);
				list.add(y);
			//	System.out.println(list);
			}else if(x[0].equals("2")) {
				list.remove(list.size()-1);
			//	System.out.println(list);
			}else if(x[0].equals("3")) {
				
				if(list.size()==1) {
					System.out.println(list.get(list.size()-1));
				}else if(list.size()==2) {
					if(list.get(0)>list.get(1)) {
						System.out.println(list.get(0));
					}else {
						System.out.println(list.get(1));
					}
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
		}

	}

}
