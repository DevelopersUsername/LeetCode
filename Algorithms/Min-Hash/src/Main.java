import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Main {

    private static final int[] hashCoefficients = initHashCoefficients();

    private static int[] initHashCoefficients() {

        return new int[]{
                2, 3, 5, 7, 13, 17, 19, 31, 61, 89, 107, 127, 521, 607, 1279, 2203, 2281, 3217, 4253, 4423, 9689,
                9941, 11213, 19937, 21701, 23209, 44497, 86243, 110503, 132049, 216091, 756839, 859433, 1257787,
                1398269, 2976221, 3021377, 6972593, 13466917, 20996011, 24036583, 25964951, 30402457, 32582657,
                37156667, 42643801, 43112609, 57885161, 74207281, 77232917, 82589933};
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set[] set1 = initSet(br);
        Set[] set2 = initSet(br);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < set2.length; i++) {
            for (int j = 0; j < set1.length; j++) {
                builder.append(String.format("%.3f", check(set1[j], set2[i])));

                if (j < set1.length -1) builder.append(" ");
            }
            if (i < set2.length - 1)
                builder.append("\n");
        }

        System.out.println(builder);
    }

    private static float check(Set<int[]> set1, Set<int[]> set2) {

        DecimalFormat df = new DecimalFormat("#.###");
        float matchCount = 0;
        for (int i = 0; i < 51; i++)
            if (getMinHash(set1, i) == getMinHash(set2, i)) matchCount++;

        return Float.valueOf(df.format(matchCount / 51));
    }

    private static int getMinHash(Set<int[]> set, int index) {

        int minHash = Integer.MAX_VALUE;
        for (int[] ints : set)
            minHash = Math.min(minHash, ints[index]);

        return minHash;
    }

    private static int hash(String str, int coefficient) {

        int hashCode = 0;
        for (int i = 0; i < str.length(); i++)
            hashCode = (hashCode + (str.charAt(i) - 33)) * coefficient;

        return hashCode;
    }

    private static int[] minHash(String str) {

        int[] minHash = new int[51];
        for (int i = 0; i < hashCoefficients.length; i++)
            minHash[i] = hash(str, hashCoefficients[i]);

        return minHash;
    }

    private static Set<int[]>[] initSet(BufferedReader br) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Set[] set = new Set[N];

        for (int i = 0; i < N; i++) {
            String srt = String.valueOf(br.readLine());
            String[] t = srt.split(" ");
            Set<int[]> s = new HashSet<>();
            for (int j = 0; j < t.length; j++)
                s.add(minHash(t[j].trim()));

            set[i] = s;
        }

        return set;
    }
}