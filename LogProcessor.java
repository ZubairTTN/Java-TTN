import java.util.*;

class LogEntry {
    String severity;
    int errorCode;

    public LogEntry(String severity, int errorCode) {
        this.severity = severity;
        this.errorCode = errorCode;
    }
}

public class LogProcessor {
    public static void main(String[] args) {
        List<LogEntry> logs = Arrays.asList(
            new LogEntry("ERROR", 500),
            new LogEntry("ERROR", 404),
            new LogEntry("WARNING", 301),
            new LogEntry("ERROR", 403)
        );

        List<Integer> errorCodes = logs.stream()
            .filter(log -> log.severity.equals("ERROR"))
            .map(log -> log.errorCode)
            .toList();

        System.out.println("Error Codes: " + errorCodes);
    }
}
