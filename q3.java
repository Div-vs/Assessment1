package Test1;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int sum=0;
		System.out.println("treasures=");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			sum=sum+arr[i];
		}
			if(sum%2==0)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
			
	}

