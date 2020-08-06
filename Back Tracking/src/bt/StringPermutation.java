package bt;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class StringPermutation {
	
	Deque<Character> strchar = new ArrayDeque<Character>();
	Deque<String> str = new ArrayDeque<String>();
	ArrayList<Character> list1 = new ArrayList<Character>();//for storing popped character from strchar stack
	ArrayList<Character> list2 = new ArrayList<Character>();//for maintaining the list of string after popping from strchar which represent the 
	                                                        //current value of k i.e ABC --> after popping( C removed)--> list2[A,B]--> k=AB list1[C]
	                                                        //again pop-->B removed list1[C,B] list1[A] k=A after for loop at line 38
	                                                        // k will be ACB because list1 is C,B
	
	
	public static void main(String[] args) throws InterruptedException {
		
		StringPermutation s = new StringPermutation();
		s.premutation("12345", 120);
		

	}


	private void premutation(String string, int i) {
		
		int j=0;
		String k="";
		char c='0';
		
		for(int l=0; l<string.length(); l++) {
			list1.add(string.charAt(l));
		}
		
		while(j<i) {
			
			for(int l=0; l<list1.size();l++) {
				k=k+list1.get(l);
			}
			if(!str.contains(k) && k.length()==string.length()) {
				str.push(k); j++;
				for(int l=0; l<list1.size();l++) {
					strchar.push(list1.get(l));
					list2.add(list1.get(l));
				}
				list1.clear();
				k="";
				c=strchar.pop();
				list2.remove(list2.size()-1);
				list1.add(c);
				for(int l=0; l<list2.size();l++) {
					k=k+list2.get(l);
				}
				
			}else {
				c=strchar.pop();
				list1.add(c);
				list2.remove(list2.size()-1);
				k="";
				for(int l=0; l<list2.size();l++) {
					k=k+list2.get(l);
				}
			}
		}
		System.out.println(str.size());
		while(str.size()!=0) {
			System.out.println(str.pop());
		}
		
	}

}

