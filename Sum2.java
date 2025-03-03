import java.util.HashMap;
import java.util.Map;

public class Sum2 {
    public static void main(String[] args)
    {
        Map<Integer, Integer> mapp = new HashMap<>();
        int arr[] = {1,2,3,0,4,2,2};
        int tar = 4;
        for(int i = 0; i< arr.length -1; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i] + arr[j] == tar)
                {
                    mapp.put(arr[i], arr[j]);
                }
            }
        }

        System.out.println(mapp);
    }
}
