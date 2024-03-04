import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final StringBuilder builder = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        for (int i = 0; i < count; i++) {

            st = new StringTokenizer(br.readLine());
            String val = String.valueOf(st.nextToken());
            if (val.equals("number")) HashFunction.hash(Long.parseLong(st.nextToken()));
            else if (val.equals("character")) HashFunction.hash(st.nextToken().charAt(0));
            else HashFunction.hash(String.valueOf(st.nextToken()));
        }

        System.out.println(builder);
/*
5
character f
number 7720
number -1
character s
string amogus
*/
    }

    public static class HashFunction {
        private static final long M = 127;

        public static void hash(long num) {
            if (num > 0) builder.append(num).append('\n');
            else builder.append(Long.toUnsignedString(num)).append('\n');
        }

        private static long getHash(char c) {
            return c - 33;
        }

        public static void hash(char c) {
            builder.append(getHash(c)).append('\n');
        }

        public static void hash(String str) {

            long hashCode = 0L;
            for (int i = 0; i < str.length(); i++)
                hashCode = hashCode * M + getHash(str.charAt(i));

            builder.append(Long.toUnsignedString(hashCode)).append('\n');
        }
    }
}
