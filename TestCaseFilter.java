import java.util.*;
import java.util.stream.Collectors;

class TestCase {
    String name, status;
    int executionTime;

    public TestCase(String name, String status, int executionTime) {
        this.name = name;
        this.status = status;
        this.executionTime = executionTime;
    }

    @Override
    public String toString() {
        return name + " [" + status + "] - " + executionTime + "ms";
    }
}

public class TestCaseFilter {
    public static void main(String[] args) {
        List<TestCase> testCases = Arrays.asList(
            new TestCase("TC1", "Passed", 120),
            new TestCase("TC2", "Failed", 200),
            new TestCase("TC3", "Passed", 100),
            new TestCase("TC4", "Failed", 150)
        );

        List<TestCase> passedTests = testCases.stream().filter(tc -> tc.status.equals("Passed")).toList();
        List<TestCase> sortedTests = testCases.stream().sorted(Comparator.comparingInt(tc -> tc.executionTime)).toList();

        long passedCount = passedTests.size(), failedCount = testCases.size() - passedCount;

        System.out.println("Passed Test Cases: " + passedTests);
        System.out.println("Sorted Test Cases by Execution Time: " + sortedTests);
        System.out.println("Summary Report: Passed = " + passedCount + ", Failed = " + failedCount);
    }
}
