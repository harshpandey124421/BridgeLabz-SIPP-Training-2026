import os

# Define the structure: Folders -> Files -> Code (SQL for DB tasks, Java for Recursion)
file_structure = {
    "ViewsProceduresFunctions": {
        "LatestCovidDataView.sql": """CREATE VIEW LatestCovidData AS
SELECT country, confirmed_cases, deaths, recoveries
FROM covid_cases
WHERE date = (SELECT MAX(date) FROM covid_cases);""",

        "CalculateMortalityRate.sql": """CREATE FUNCTION CalculateMortalityRate(p_country VARCHAR(100), p_date DATE)
RETURNS DECIMAL(5,2)
DETERMINISTIC
BEGIN
    DECLARE mortality_rate DECIMAL(5,2);
    SELECT (deaths / confirmed_cases) * 100 INTO mortality_rate
    FROM covid_cases
    WHERE country = p_country AND date = p_date;
    RETURN mortality_rate;
END;""",

        "UpdateCovidStats.sql": """CREATE PROCEDURE UpdateCovidStats(IN p_country VARCHAR(100), IN p_date DATE, IN p_new_cases INT)
BEGIN
    START TRANSACTION;
    UPDATE covid_cases
    SET confirmed_cases = confirmed_cases + p_new_cases
    WHERE country = p_country AND date = p_date;
    COMMIT;
END;""",

        "CalculateRecoveryRate.sql": """CREATE FUNCTION CalculateRecoveryRate(p_country VARCHAR(100))
RETURNS DECIMAL(5,2)
DETERMINISTIC
BEGIN
    DECLARE recovery_rate DECIMAL(5,2);
    SELECT (recoveries / confirmed_cases) * 100 INTO recovery_rate
    FROM covid_cases
    WHERE country = p_country
    ORDER BY date DESC LIMIT 1;
    RETURN recovery_rate;
END;""",

        "AuditTrigger.sql": """CREATE TRIGGER BeforeUpdateCovidCases
BEFORE UPDATE ON covid_cases
FOR EACH ROW
BEGIN
    INSERT INTO audit_table (country, old_cases, new_cases, change_timestamp)
    VALUES (OLD.country, OLD.confirmed_cases, NEW.confirmed_cases, NOW());
END;"""
    },
    
    "RecursionBacktracking": {
        "FeatureFlagCombinations.java": """import java.util.ArrayList;
import java.util.List;

public class FeatureFlagCombinations {
    public List<List<String>> generateFlagCombinations(String[] flags) {
        List<List<String>> result = new ArrayList<>();
        backtrack(flags, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String[] flags, int index, List<String> current, List<List<String>> result) {
        if (index == flags.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(flags[index]);
        backtrack(flags, index + 1, current, result);
        current.remove(current.size() - 1);
        backtrack(flags, index + 1, current, result);
    }
}""",

        "VendingMachineChange.java": """import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachineChange {
    public List<List<Integer>> makeChange(int[] coins, int target) {
        Arrays.sort(coins);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(coins, target, 0, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] coins, int target, int start, int sum, List<Integer> path, List<List<Integer>> result) {
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < coins.length; i++) {
            if (sum + coins[i] > target) break;
            path.add(coins[i]);
            backtrack(coins, target, i, sum + coins[i], path, result);
            path.remove(path.size() - 1);
        }
    }
}""",

        "OnCallRotation.java": """import java.util.ArrayList;
import java.util.List;

public class OnCallRotation {
    public List<List<String>> generateSchedules(String[] engineers) {
        List<List<String>> result = new ArrayList<>();
        boolean[] used = new boolean[engineers.length];
        backtrack(engineers, used, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String[] engineers, boolean[] used, List<String> path, List<List<String>> result) {
        if (path.size() == engineers.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < engineers.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            path.add(engineers[i]);
            backtrack(engineers, used, path, result);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}""",

        "SensorPlacement.java": """import java.util.ArrayList;
import java.util.List;

public class SensorPlacement {
    public List<List<String>> placeSensors(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] sensorCol = new int[n];
        backtrack(n, 0, sensorCol, result);
        return result;
    }

    private void backtrack(int n, int row, int[] sensorCol, List<List<String>> result) {
        if (row == n) {
            result.add(buildGrid(n, sensorCol));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, sensorCol)) {
                sensorCol[row] = col;
                backtrack(n, row + 1, sensorCol, result);
            }
        }
    }

    private boolean isSafe(int row, int col, int[] sensorCol) {
        for (int r = 0; r < row; r++) {
            if (sensorCol[r] == col) return false;
            if (Math.abs(sensorCol[r] - col) == Math.abs(r - row)) return false;
        }
        return true;
    }

    private List<String> buildGrid(int n, int[] sensorCol) {
        List<String> grid = new ArrayList<>();
        for (int r = 0; r < n; r++) {
            StringBuilder sb = new StringBuilder();
            for (int c = 0; c < n; c++) {
                sb.append(sensorCol[r] == c ? "S" : ".");
            }
            grid.add(sb.toString());
        }
        return grid;
    }
}""",

        "ErrorCodePath.java": """public class ErrorCodePath {
    public boolean exists(char[][] grid, String word) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (backtrack(grid, word, 0, r, c, visited)) return true;
            }
        }
        return false;
    }

    private boolean backtrack(char[][] grid, String word, int idx, int r, int c, boolean[][] visited) {
        if (idx == word.length()) return true;
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) return false;
        if (visited[r][c] || grid[r][c] != word.charAt(idx)) return false;
        
        visited[r][c] = true;
        boolean found = backtrack(grid, word, idx + 1, r + 1, c, visited)
                     || backtrack(grid, word, idx + 1, r - 1, c, visited)
                     || backtrack(grid, word, idx + 1, r, c + 1, visited)
                     || backtrack(grid, word, idx + 1, r, c - 1, visited);
        visited[r][c] = false;
        return found;
    }
}"""
    },
    
    "IndexingACID": {
        "CreateIndexes.sql": """CREATE INDEX idx_country_date ON covid_cases (country, date);
CREATE INDEX idx_date ON covid_cases (date);""",

        "OptimizeHighInfectionRate.sql": """CREATE INDEX idx_infection_rate_country ON covid_cases (infection_rate, country);""",

        "AnalyzeExecutionPlan.sql": """EXPLAIN SELECT country, confirmed_cases, date
FROM covid_cases
WHERE country = 'India' AND date > '2023-01-01';""",

        "VaccineDataTransaction.sql": """START TRANSACTION;
INSERT INTO vaccine_data (country, date, doses_administered) VALUES ('Brazil', '2023-10-01', 10000);
UPDATE vaccine_inventory SET doses_available = doses_available - 10000 WHERE country = 'Brazil';
COMMIT;""",

        "IsolationLevels.sql": """SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;
START TRANSACTION;
SELECT * FROM covid_cases WHERE country = 'Brazil';
COMMIT;"""
    }
}

# Get the current working directory
current_directory = os.getcwd()

# Create folders and files
for folder_name, files in file_structure.items():
    folder_path = os.path.join(current_directory, folder_name)
    os.makedirs(folder_path, exist_ok=True)
    
    for filename, content in files.items():
        file_path = os.path.join(folder_path, filename)
        with open(file_path, 'w') as f:
            f.write(content)

print(f"All files have been successfully created within their respective folders in: {current_directory}")