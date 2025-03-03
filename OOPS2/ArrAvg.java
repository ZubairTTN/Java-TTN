// public class ArrAvg {
//     public static void main(String[] args) {
//         int arr[] = {23,34,67,41,56};
//         int n = arr.length;
            // double sum = 0;
//         for(int i: arr)
//         {
//             sum += i;
//         }
//         System.out.println("The average is: " + sum/n);
//     }
// }



import java.util.Arrays;

public class ArrAvg {
    public static void main(String[] args) {
        int[] arr = {23, 34, 67, 41, 56, 2};
        double average = Arrays.stream(arr).average().orElse(0.0);
        System.out.println("The average is: " + average);
        boolean a = Arrays.stream(arr).anyMatch(ar -> ar == 2);
        System.out.println(a);
        
    }
}



