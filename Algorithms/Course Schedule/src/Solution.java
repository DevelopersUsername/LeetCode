import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private final Map<Integer, List<Integer>> preMap = new HashMap<>();
    private boolean[] visited;

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        visited = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) preMap.put(i, new ArrayList<>());
        for (int[] prereq : prerequisites) preMap.get(prereq[0]).add(prereq[1]);

        for (int course = 0; course < numCourses; course++)
            if (!isPossible(course)) return false;

        return true;
    }

    private boolean isPossible(int course) {

        if (visited[course]) return false;
        else if (!preMap.containsKey(course)) return true;

        visited[course] = true;
        for (int pre : preMap.get(course))
            if (!isPossible(pre)) return false;

        visited[course] = false;
        preMap.remove(course);

        return true;
    }
}