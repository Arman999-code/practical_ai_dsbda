import java.util.*;

public class LogAnalysis {
    public static void main(String[] args) {

        String[] logs = {
            "2026-04-19 INFO User logged in",
            "2026-04-19 ERROR File not found",
            "2026-04-19 INFO Request processed",
            "2026-04-19 WARNING Disk space low",
            "2026-04-19 ERROR Timeout occurred"
        };

        Map<String, Integer> countMap = new HashMap<>();

        for (String log : logs) {
            String[] parts = log.split(" ");

            if (parts.length > 2) {
                String level = parts[2];
                countMap.put(level, countMap.getOrDefault(level, 0) + 1);
            }
        }

        for (String key : countMap.keySet()) {
            System.out.println(key + " : " + countMap.get(key));
        }
    }
}
