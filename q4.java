package Test1;

public class q4 {

		public static int min(int arr[],int l,int h)
	    {
	        if (h == l)
	            return 0;
	        if (arr[l] == 0)
	            return Integer.MAX_VALUE;	 
	        int min = Integer.MAX_VALUE;
	        for (int i=l+1;i<=h && i<=l+arr[l];i++) 
	        {
	            int jump= min(arr, i, h);
	            if (jump!= Integer.MAX_VALUE && jump+1<min)
	            {
	                min = jump+1;
	            }
	        }
	        return min;
	    }
	 
	    public static void main(String args[])
	    {
	        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
	        int n = arr.length;
	        System.out.print(min(arr, 0, n - 1));
	    }

	}

