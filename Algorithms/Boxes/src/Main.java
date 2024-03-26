import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        if (N == 0) {
            System.out.println(0);
            return;
        }

        int[] box = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            box[i] = Integer.parseInt(st.nextToken());

        if (box.length == 1) {
            System.out.println(box[0]);
            return;
        } else if (box.length == 2) {
            System.out.println(Math.max(box[0], box[1]));
            return;
        }

        int[] t = new int[N];
        t[0] = box[0];
        t[1] = Math.max(box[0], box[1]);
        for (int i = 2; i < N; i++)
            t[i] = Math.max(t[i - 1], t[i - 2] + box[i]);

        System.out.println(t[N - 1]);
    }
}