import java.util.ArrayList;
import java.util.List;
public class SkillAssignment {
    public static void findTeams(int[] skills, int target, int index, List<Integer> current) {
        if (target == 0) {
            System.out.println(current);
            return;
        }
        if (target < 0 || index == skills.length) return;
        current.add(skills[index]);
        findTeams(skills, target - skills[index], index + 1, current);
        current.remove(current.size() - 1);
        findTeams(skills, target, index + 1, current);
    }
    public static void main(String[] args) {
        int[] skills = {2, 3, 5, 7};
        findTeams(skills, 10, 0, new ArrayList<>());
    }
}