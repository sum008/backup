package sumit;

import java.util.ArrayList;

public class BreakTheString {
	
	public static void breakString(String input) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		String output="";
		String check="";
		String valid="";
		
		list.add("I");list.add("have");list.add("Jain");list.add("Sumit");list.add("am");list.add("this");list.add("dog");
		
		for(int i=0; i<input.length(); i++) {
			
			check=check+input.charAt(i);
			
			if(list.contains(check)) {
				output=output+check+" ";
				valid=valid+check;
				check="";
			}
		}
		
		if(input.equals(valid)) {
			System.out.println(output);
		}else {
			System.out.println("Can't break");
		}
		
		
		
	}

	public static void main(String[] args) {
		
		breakString("thisJain");

	}

}
