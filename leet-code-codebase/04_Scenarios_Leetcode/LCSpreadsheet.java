// Topic: LeetCode - 3484 Design Spreadsheet (Conceptual Stub)
import java.util.HashMap;
import java.util.Map;

public class LCSpreadsheet {
    Map<String, String> cells;

    public LCSpreadsheet() {
        cells = new HashMap<>();
    }

    public void setCell(String cellId, String value) {
        cells.put(cellId, value);
    }

    public String getCell(String cellId) {
        return cells.getOrDefault(cellId, "");
    }
}