import java.util.*;

class Solution {
    private final Map<Integer, List<Integer>> preMap = new HashMap<>();
    private final Set<Integer> visiting = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        for (int i = 0; i < numCourses; i++) preMap.put(i, new ArrayList<>());
        for (int[] prereq : prerequisites) preMap.get(prereq[0]).add(prereq[1]);

        for (int course = 0; course < numCourses; course++)
            if (!isPossible(course)) return false;

        return true;
    }

    private boolean isPossible(int course) {

        if (visiting.contains(course)) return false;
        else if (!preMap.containsKey(course)) return true;

        visiting.add(course);
        for (int pre : preMap.get(course))
            if (!isPossible(pre)) return false;

        visiting.remove(course);
        preMap.remove(course);

        return true;
    }
}