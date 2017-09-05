import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class LogAnalyzer {

    public static List<Log> getLogs(List<String> filePaths) {
        List<String> logEntries = new ArrayList<>();

        filePaths.forEach(filePath -> {
            try {
                logEntries.addAll(Files.readAllLines(Paths.get(filePath)));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        });

        return logEntries
                .stream()
                .map(Log::fromString)
                .collect(Collectors.toList());
    }

    public static List<String> getFailedPlaybacks(List<Log> logs) {
        Map<String, List<LocalDateTime>> some = new HashMap<>();
        Set<String> failedCustomerIds = new HashSet<>();

        for (Log log : logs) {
            some.merge(log.customerId, new ArrayList<>(), (x, y) -> {
                return null;
            });
        }

        return null;
    }

    /*

     */
}
