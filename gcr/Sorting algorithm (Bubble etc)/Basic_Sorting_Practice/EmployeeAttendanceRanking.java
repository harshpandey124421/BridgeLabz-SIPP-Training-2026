// Subtopic: Practice 4 - Employee Attendance Ranking
import java.util.Arrays;

public class EmployeeAttendanceRanking {
    public static int[] getTopKEmployees(int[] employeeIds, int[] attendance, int k) {
        int n = employeeIds.length;
        int[][] combined = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            combined[i][0] = employeeIds[i];
            combined[i][1] = attendance[i];
        }
        
        Arrays.sort(combined, (a, b) -> {
            if (a[1] != b[1]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = combined[i][0];
        }
        
        return result;
    }
}