package sumit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class sum{
	
   ArrayList<Integer> list=null;
   ArrayList<String> list1=null;
    
       sum(ArrayList<Integer> list, ArrayList<String> list1){
    	   this.list=new ArrayList<Integer>(list);
    	   this.list1=new ArrayList<String>(list1);
		
	}

    public ArrayList<Integer> getList() {
		return this.list;
    	
    }
    
    public ArrayList<String> getList1() {
		return this.list1;
    	
    }
}

public class Solution_pandey {
	
	
	public static void main(String[] args) {
		ArrayList<sum> list0 = new ArrayList<sum>();
		HashMap<String,List<Integer>> Card = new HashMap<String,List<Integer>>();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		
		ArrayList<String> list5 = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of cards");
		
		int N = s.nextInt();
		
		for(int i=1; i<=N; i++) {
			
			System.out.println("Enter card "+i+":");
			
			System.out.println("Enter key ");
			
			String a = s.next();
			list2.add(a);
			
			System.out.println("Enter value "+i+":");
			
			int b = s.nextInt();
			list3.add(b);
		}
		
		for(int i=0; i<list2.size(); i++) {
			for(int j=i+1; j<list2.size(); j++) {
				if(list2.get(i).charAt(0)>list2.get(j).charAt(0)) {
					String temp = list2.get(i);
					list2.set(i, list2.get(j));
					list2.set(j, temp);
					
					int p = list3.get(i);
					list3.set(i, list3.get(j));
					list3.set(j, p);
				}
			}
		}
		
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		
		for(int i=0; i<list2.size(); i++) {
			
			int j=i+1;
			
			if(j<=list2.size()) {
				
				if(j<list2.size() && list2.get(i).equals(list2.get(j))) {
					
					list4.add(list3.get(i));
					
				}else if(j<list2.size()) {
					
					list4.add(list3.get(i));
					
					list5.add(list2.get(i));
					
					sum p = new sum(list4,list5);
			
					list0.add(p);
					
					list4.clear();
					
					list5.clear();
					
				}else if(j==list2.size()) {
					
					list4.add(list3.get(j-1));
					
					list5.add(list2.get(j-1));
					
					sum p = new sum(list4,list5);
				
					list0.add(p);
				
					list4.clear();
					
					list5.clear();
				}
			}
		}
		
		for(int i=0; i<list0.size(); i++) {
			
			Card.put(list0.get(i).getList1().toString(), list0.get(i).getList());
		}
		
		ArrayList<String> list = new ArrayList<String>(Card.keySet());
		
		Collections.sort(list);
		
		System.out.println("Distinct symbols are: ");
		
		
		for(int i=0; i<list.size(); i++) {
			
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		int y=0;
		for(int i=0; i<list.size(); i++) {
			
			System.out.println("Cards in "+list.get(i).toString()+" Symbol");
			
			for(int j=0; j<Card.get(list.get(i)).size(); j++) {
				
				System.out.println(list.get(i).toString() +" "+Card.get(list.get(i)).get(j));
				
				y=y+Card.get(list.get(i)).get(j);
			}
			
			System.out.println("Number is "+y);
			y=0;
		}
		}

}

