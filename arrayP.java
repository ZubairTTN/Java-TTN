// int arr[] = {1,2,3,4,5};
// int i = 0, j = arr.size() -1;
// while(i<=j)
// {
//     swap(arr[i], arr[j]);
//     i++, j--;
// }

public class arrayP{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,9,1};
    
        int i = 0, j = arr.length-1;
        while(i<=j)
        {
            int c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++; j--;
        }

        for(int k = 0; k<=arr.length-1; k++)
        {
            System.out.print(arr[k]);
        }
        for(int num : arr)
        {
            System.out.println(num);
        }
        // System.out.print(arr.length);
        
    }
}