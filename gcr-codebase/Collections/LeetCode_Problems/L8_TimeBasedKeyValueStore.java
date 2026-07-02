import java.util.*;

public class L8_TimeBasedKeyValueStore {
    static HashMap<String, List<String[]>> store = new HashMap<>();

    static void set(String key, String value, int timestamp) {
        store.putIfAbsent(key, new ArrayList<>());
        store.get(key).add(new String[]{String.valueOf(timestamp), value});
    }

    static String get(String key, int timestamp) {
        if (!store.containsKey(key)) {
            return "";
        }
        List<String[]> entries = store.get(key);
        String result = "";
        for (String[] entry : entries) {
            int t = Integer.parseInt(entry[0]);
            if (t <= timestamp) {
                result = entry[1];
            } else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        set("foo", "bar", 1);
        System.out.println(get("foo", 1));
        System.out.println(get("foo", 3));
        set("foo", "bar2", 4);
        System.out.println(get("foo", 4));
        System.out.println(get("foo", 5));
    }
}
