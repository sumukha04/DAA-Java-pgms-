package quickSort;
import java.util.*;
import java.io.*;
public class P2 {
	static int []a;
	static int n;
	static boolean flag=true;
	
	public static void quickSort(int[]a, int low, int high) {
		int i=low, j=high;
		int temp;
		int pivot=a[(low+high)/2];
		
		if(flag) {
			while(i<=j) {
				while(a[i]<pivot)
					i++;
				
				while(a[i]>pivot)
					j--;
				
				if(i<=j) {
					temp=a[j];
					a[i]=a[j];
					a[j]=temp;
					i++;
					j--;
				}
				
			}
			if(low<j)
				quickSort(a, low, j);
			if(i<high)
				quickSort(a, i, high);
		}
		else {
			while(i<=j) {
				while(a[i]>pivot)
					i++;
				
				while(a[j]<pivot)
					j--;
				
				if(i<=j) {
					temp=a[i];
					a[j]=a[i];
					a[i]=temp;
					i++;
					j--;
							
				}
			}
			if(low<j)
				quickSort(a, low, j);
			
			if(i<high)
				quickSort(a, i, high);
		}
	}
	public static void main(String[]args)throws IOException {
		int i;
		long et, st;
		Scanner read=new Scanner (System.in);
		Random random=new Random();
		PrintWriter out=new PrintWriter(new File("Random.txt"));
		
		System.out.println("Enter the number of elements greater than 5000");
		n=read.nextInt();
		a=new int[n];
		
		for(i=0;i<n;i++) {
			a[i]=random.nextInt(n)+1;
			out.print(a[i]+"\t");
		}
		System.out.println("The total numbers generated: "+i);
		out.close();
		
		st=System.nanoTime();
		quickSort(a, 0, n-1);
		et=System.nanoTime() -st;
		PrintWriter outA=new PrintWriter(new File("Ascending.txt"));
		
		for(i=0;i<n;i++)
			outA.print(a[i]+"\t");
		outA.close();
		
		System.out.println("The time complexity for worstcase is..."+(et/1000000000.0)+"seconds");
		st=System.nanoTime();
		quickSort(a, 0, n-1);
		et=System.nanoTime() -st;
		
		System.out.println("The time complexity for best case is..."+(et/1000000000.0)+"seconds");
		flag=false;
		
		st=System.nanoTime();
		quickSort(a, 0, n-1);
		et=System.nanoTime() -st;
		
		PrintWriter outD=new PrintWriter(new File("Descending.txt"));
		for(i=0;i<n;i++)
			outD.print(a[i]+"\t");
		
		outD.close();
		
		System.out.println("The tim complexity for average case is..."+(et/1000000000.0)+"seconds");
	}

}
