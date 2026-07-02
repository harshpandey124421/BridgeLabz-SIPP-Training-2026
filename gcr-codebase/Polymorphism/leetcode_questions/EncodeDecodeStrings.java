import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int delimiter = s.indexOf('#', i);
            int length = Integer.parseInt(s.substring(i, delimiter));
            i = delimiter + 1 + length;
            result.add(s.substring(delimiter + 1, i));
        }
        return result;
    }
}