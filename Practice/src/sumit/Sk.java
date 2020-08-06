package sumit;

import java.util.ArrayList;
import java.util.Scanner;

class sum1{
	
	   ArrayList<Integer> list=null;
	    
	       sum1(ArrayList<Integer> list){
	    	  this.list=new ArrayList<Integer>(list);//This creates a new list with list0(we r still passing reference but now we r creating a copy of reference list)
			//this.list=list; //but this uses the same list(list0) so if we clear list which is done below. it will clear the list from here too
			                  //this this is happening bcos you r passing the reference of the list(i.e list0) then you are clearing the original list 
	    	                  //so, after clearing the reference of list is pointing to empty list, so at class level, reference is also pointing to empty list
		}

	    public ArrayList<Integer> getList() {
			return this.list;
	    	
	    }
	}

public class Sk {
	

    static sum1[] x = new sum1[5];
	public static void main(String[] args) {
		Scanner o = new Scanner("66666.00");
		ArrayList<Integer> list0 = new ArrayList<Integer>();
		list0.add(5);
		list0.add(6);
		Double.parseDouble("55555555555555");
		String a = "66666.00";
		Scanner t = o.useDelimiter(".");
	//	System.out.println(t.);
		sum1 s=new sum1(list0);
		x[0]=s;
		//list0.clear();
		list0.add(0, 7);
		list0.add(8);
		list0.add(9);
	
		sum1 d=new sum1(list0);
		x[1]=d;
		list0.clear();
	System.out.println(s.list);
	System.out.println(x[1].list);
		
	}

}
