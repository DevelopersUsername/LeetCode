class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {

        boolean isBulky = length >= 10000 || width >= 10000 || height >= 10000 ||
                (long) length * width * height >= 1_000_000_000L;
        boolean isHeavy = mass >= 100;

        if (isBulky && isHeavy) return "Both";
        else if (isBulky) return "Bulky";
        else if (isHeavy) return "Heavy";
        else return "Neither";
    }
}