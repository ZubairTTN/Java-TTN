@FunctionalInterface
interface TestExecutor {
    void execute(String testName, int priority);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        TestExecutor executor = (testName, priority) ->
            System.out.println("Executing " + testName + " with priority " + priority);

        executor.execute("TC1", 1);
        executor.execute("TC2", 2);
    }
}
