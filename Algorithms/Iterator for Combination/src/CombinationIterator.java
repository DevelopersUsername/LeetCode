import java.util.ArrayList;
import java.util.List;

class CombinationIterator {

    private final int totalCharacters;
    private final int combinationLength;
    private final String characters;
    private StringBuilder currentCombination = new StringBuilder();
    private List<String> allCombinations = new ArrayList<>();
    private int currentIndex = 0;

    public CombinationIterator(String characters, int combinationLength) {
        this.totalCharacters = characters.length();
        this.combinationLength = combinationLength;
        this.characters = characters;
        initCombinations(0);
    }

    public String next() {
        return allCombinations.get(currentIndex++);
    }

    public boolean hasNext() {
        return currentIndex < allCombinations.size();
    }

    private void initCombinations(int startIndex) {
        if (currentCombination.length() == combinationLength) {
            allCombinations.add(currentCombination.toString());
            return;
        } else if (startIndex == totalCharacters) return;

        currentCombination.append(characters.charAt(startIndex));
        initCombinations(startIndex + 1);

        currentCombination.deleteCharAt(currentCombination.length() - 1);
        initCombinations(startIndex + 1);
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */