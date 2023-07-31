package Test1;
public class q5 {
public static void main(String[] args)
{
    int n=8;
    String arr[]
        = { "Manoj Kumar","Tom Hanks","Manoj Bajpayee","Tom Cruise","John Wick","Alice Smith","Alice wonderland","John Cena"};
    String swap;
    for (int i=0;i<n;i++)
    {
        for (int j=i+1;j<n;j++) 
        {
            if (arr[i].compareTo(arr[j])>0){
                swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
    }
    for (int i=0;i<n;i++) 
    {
        System.out.println(arr[i]);
    }
}
}