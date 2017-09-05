import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Log {
    private static final String DATE_REGEX = "(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{1,9})";
    private static final String CUSTOMER_ID_REGEX = "CustomerId: (\\d+) ";

    LocalDateTime dateTime;
    String customerId;

    public static Log fromString(String logEntry) {
        Log log = new Log();

        Matcher m = Pattern.compile(DATE_REGEX).matcher(logEntry);
        if (m.find()) {
            log.dateTime = LocalDateTime.parse(m.group(1).replace(" ", "T"));
        }

        m = Pattern.compile(CUSTOMER_ID_REGEX).matcher(logEntry);
        if (m.find()) {
            log.customerId = m.group(1);
        }

        System.out.println(log);

        return log;
    }

    @Override
    public String toString() {
        return "Log{" +
                "dateTime=" + dateTime +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
