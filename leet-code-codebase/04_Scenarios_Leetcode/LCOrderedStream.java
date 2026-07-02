// Topic: LeetCode - 1656 Design an Ordered Stream (Basic Implementation)
import java.util.ArrayList;
import java.util.List;

public class LCOrderedStream {
    String[] stream;
    int ptr = 0;

    public LCOrderedStream(int n) {
        stream = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        stream[idKey - 1] = value;
        List<String> result = new ArrayList<>();
        while (ptr < stream.length && stream[ptr] != null) {
            result.add(stream[ptr]);
            ptr++;
        }
        return result;
    }
}