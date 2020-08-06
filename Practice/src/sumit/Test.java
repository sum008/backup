package sumit;

import java.util.Arrays;

class x{
	
	public static int fun(int n) {
		
		int res;
		if(n==1) {
			return 1;
	}else {
		
		res=fun(n-1);
		return res;
	}
	
}}

/*class aaaa{
	
	static int a=5;
	int b=8;
	
   // public static void sum() {
		
		System.out.println("parent");
	}
}


class b extends aaaa{
	
	public static void sum() {
		System.out.println("child");
	}
	
	public void my() {
		System.out.println("my own");
	}
	
	public void sum(int b) {
		System.out.println(a);
		//System.out.println(sumit.aaaa.a=b);
	}
}
*/
public class Test {
	
	public static void main(String[] args) {
		
		int[] b = {4,6,2,1,0};
		
		for(int i=b.length-2; i>=0; i--) {
			b[i+1]=b[i];
		}
		
		System.out.println(Arrays.toString(b));
	//	aaaa x =new b();
	 //   x.sum();
	  /*  b.sum();
		System.out.println(aaaa.a);
		b y = new b();
		y.sum(7);
		y.my();
		System.out.println(x.b);*/
		x a=new x();
		System.out.println(x.fun(5));
		System.out.println('x'>'a');
		
	}

}
