// Subtopic: Additional - Merge Customer Records
import java.util.ArrayList;
import java.util.List;

public class MergeCustomerRecords {
    public static List<Integer> mergeRecords(int[] branchA, int[] branchB) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < branchA.length && j < branchB.length) {
            if (branchA[i] <= branchB[j]) {
                merged.add(branchA[i++]);
            } else {
                merged.add(branchB[j++]);
            }
        }
        while (i < branchA.length) merged.add(branchA[i++]);
        while (j < branchB.length) merged.add(branchB[j++]);
        
        return merged;
    }
}