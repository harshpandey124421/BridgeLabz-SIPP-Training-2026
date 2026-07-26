import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeliveryRoutes {
    public void allRoutes(Map<Integer, List<Integer>> roads, int current, int target,
                          List<Integer> path, Set<Integer> visited, List<List<Integer>> allRoutesList) {
        path.add(current);
        visited.add(current);
        
        if (current == target) {
            allRoutesList.add(new ArrayList<>(path));
        } else {
            for (int next : roads.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(next)) {
                    allRoutes(roads, next, target, path, visited, allRoutesList);
                }
            }
        }
        
        path.remove(path.size() - 1);
        visited.remove(current);
    }
}