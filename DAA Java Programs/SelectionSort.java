package sumukha.java.programs;
import java.io.*;
import java.util.*;
public class SelectionSort {
	static int[] a;
	static int n;
	static void selectionSort (int a[]) {
		int len = a.length;
		for( int i=0; i<len-1; i++) {
			int minIndex=i;
			for(int j=i+1; j<len; j++) {
				if(a[j]<a[minIndex]) {
					
				}
			}
			int temp=a[minIndex];
			a[minIndex]=a[i];
			a[i]=temp;
		}
	}
	public static void main(String[]args) throws IOException {
		int i;
		long st, et, et1, et2;
		Scanner read=new Scanner(System.in);
		Random random=new Random();
		PrintWriter out= new PrintWriter(new File("Random.txt"));
		System.out.println("Enter the number of elements (>5000)");
		n=read.nextInt();
		a=new int[n];
		for(i=0; i<n; i++) {
			a[i]=random.nextInt(n)+1;
			out.print(a[i]+"\t");
		}
		System.out.println("The total numbers generated: " +i);
		out.close();
		
		st=System.nanoTime();
		selectionSort(a);
		et=System.nanoTime() -st;
		PrintWriter outA = new PrintWriter(new File("Ascending.txt"));
		outA.print(a[i]+"\t");
		outA.close();
		System.out.println("Time complexity for worst case is_______" +et+"ns");
		
		st=System.nanoTime();
		selectionSort(a);
		et1 =System.nanoTime();
		PrintWriter outB =new PrintWriter(new File("BestCase.txt"));
		for(i=0;i<n;i++)
			outB.print(a[i]+"\t");
		outB.close();
		System.out.println("Time complexity for best case is_____" +et1+"ns");
		
		for(i=0;i<n;i++) {
			a[i]=random.nextInt(n)+1;
		}
		st=System.nanoTime();
		selectionSort(a);
		et2=System.nanoTime() -st;
		PrintWriter outD =new PrintWriter(new File("Descending.txt"));
		for(i=0;i<n;i++)
			outD.print(a[i]+"\t");
		outD.close();
		System.out.println("Time complexity for average case is_____" +et2+"ns");
		
	}

}
