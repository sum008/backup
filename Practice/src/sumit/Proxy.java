package sumit;

import java.util.Scanner;

public class Proxy {
	
	

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		int t = a.nextInt();
		
		for(int k=1; k<=t; k++) {
		String s = a.next();
		
		double count1=0;
		for(int j=0; j<s.length(); j++) {
			
			if(s.charAt(j)=='P') {
				count1++;
			}
		}
		
		int count=0;
		for(int i=2; i<s.length()-2; i++) {
			//System.out.println(i);
			if(s.charAt(i)=='A') {
				if((s.charAt(i-1)=='P'|| s.charAt(i-2)=='P') && (s.charAt(i+1)=='P'|| s.charAt(i+2)=='P')) {
					
					count++;
				
				if(((count+count1)/s.length())*100 >=75) {
					System.out.println(count);
					break;
				}
			}
		}
	}
		if((count1)/s.length()*100 >=75){
			System.out.println(count);
		}else {
		System.out.println("-1");
		}

	}
		
	}

}
