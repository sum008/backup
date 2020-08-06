package sumit;

public class ExitPoint {
	
	public static void exit(int[][] a,int h) {
		int i=0,j=0,previ=0,prevj=0,k=0;
		int horizontal=h;
		int vertical=a.length;
		while(true) {
			
			if(a[i][j]==1) {
				a[i][j]=0;
				
				if(prevj<j) {
					k=1; 
					previ=i; prevj=j;
					i++;
				}else if(prevj>j) {
					k=2; 
					previ=i; prevj=j;
					i--;
				}else if(previ<i) {
					k=3;
					previ=i; prevj=j;
					j--;
				}else if(previ>i) {
					k=4;
					previ=i; prevj=j;
					j++;
				}
			}else {
				previ=i; prevj=j;
				if(k==0) {
					j++;
				}else if(k==1) {
					i++;
				}else if(k==2) {
					i--;
				}else if(k==3) {
					j--;
				}else if(k==4) {
					j++;
				}
			}
			
			if(i>=vertical || j>=horizontal || i<0 || j<0) {
				System.out.println(previ+"   "+prevj);
				break;
			}
			System.out.println(i+"   "+j);
		}
	}

	public static void main(String[] args) {
		
		int[][] a = {{0, 0, 1},
				     {0 ,0 ,1},
				     {1,0,1}};
		exit(a,3);

	}

}
