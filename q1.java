package Test1;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter a starting distance(between 5km to 8km):");
		int n=s.nextInt();
		if(n>=5 && n<=8)
		{
			for(int i=n;i>0;i--)
			{
				System.out.println("Distance to run:"+i);	
				if(i==n-1)
					System.out.println("Good start,keep it up");
				if(i<3)
					System.out.println("Almost there!");
				if(i==1)
					System.out.println("Done for the day!");
				
			}
			
		}
			
			

	}

}
