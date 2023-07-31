package Test1;

import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int result=0;
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=2;i<n-1;i++)
		{
			sum=sum+arr[i];	
		}

		System.out.println(sum);

	}

}