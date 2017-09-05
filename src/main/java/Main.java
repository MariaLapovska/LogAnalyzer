import java.util.Collections;
import java.util.List;

public class Main {
    private static final String MAX_PLAYBACK_TIME = "5";

    public static void main(String[] args) throws Exception {
        List<String> customerIds = LogAnalyzer.getFailedPlaybacks(
                LogAnalyzer.getLogs(Collections.singletonList("./logs/log1.txt")));
    }
}
