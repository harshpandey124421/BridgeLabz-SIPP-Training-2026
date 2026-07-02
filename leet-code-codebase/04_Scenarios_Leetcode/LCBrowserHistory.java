// Topic: LeetCode - 1472 Design Browser History (Basic Implementation)
import java.util.ArrayList;
import java.util.List;

public class LCBrowserHistory {
    List<String> history;
    int current;

    public LCBrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        current = 0;
    }
    
    public void visit(String url) {
        history.subList(current + 1, history.size()).clear();
        history.add(url);
        current++;
    }
    
    public String back(int steps) {
        current = Math.max(0, current - steps);
        return history.get(current);
    }
    
    public String forward(int steps) {
        current = Math.min(history.size() - 1, current + steps);
        return history.get(current);
    }
}