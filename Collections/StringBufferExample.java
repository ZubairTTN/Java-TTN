public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World"); // Adding text
        sb.insert(5, ",");   // Inserting text
        sb.replace(6, 11, "Java"); // Replacing text
        sb.delete(6, 10);    // Deleting part of text
        sb.reverse();        // Reversing text

        System.out.println(sb); // Output: dlroW olleH
    }
}
