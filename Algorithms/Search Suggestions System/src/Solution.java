import java.util.*;

class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        List<List<String>> ans = new ArrayList<>();
        if (searchWord.isEmpty()) return ans;

        Set<String> productsSet = new TreeSet<>(Arrays.asList(products));
        for (int i = 0; i < searchWord.length(); i++) {

            removeProducts(productsSet, searchWord.substring(0, i + 1));
            int j = 0;
            List<String> subList = new ArrayList<>();
            for (String p : productsSet) {
                subList.add(p);
                if (++j == 3) break;
            }

            ans.add(subList);
        }

        return ans;
    }

    private void removeProducts(Set<String> productsSet, String key) {
        productsSet.removeIf(p -> !p.startsWith(key));
    }
}