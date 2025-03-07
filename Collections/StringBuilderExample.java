public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 11, "Java");
        sb.delete(6, 10);
        sb.reverse();

        System.out.println(sb); // Output: dlroW olleH
    }
}
