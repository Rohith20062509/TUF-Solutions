
import java.util.*;

class LogSystem {

    List<String[]> logs;

    public LogSystem() {
        logs = new ArrayList<>();
    }

    public void put(int id, String timestamp) {
        logs.add(new String[]{String.valueOf(id), timestamp});
    }

    public List<Integer> retrieve(String start, String end, String granularity) {

        List<Integer> result = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        map.put("Year", 4);
        map.put("Month", 7);
        map.put("Day", 10);
        map.put("Hour", 13);
        map.put("Minute", 16);
        map.put("Second", 19);

        int len = map.get(granularity);

        String s = start.substring(0, len);
        String e = end.substring(0, len);

        for (String[] log : logs) {

            String timestamp = log[1].substring(0, len);

            if (timestamp.compareTo(s) >= 0 &&
                timestamp.compareTo(e) <= 0) {

                result.add(Integer.parseInt(log[0]));
            }
        }

        return result;
    }
}
