public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello Zubair";
        char charArr[] = str.toCharArray();
        int i = 0, j = charArr.length  -1;
        while(i <= j)
        {
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
            i++; j--;
        }
        
        String reversedStr = new String(charArr);
        System.out.println(reversedStr);
    }
}
