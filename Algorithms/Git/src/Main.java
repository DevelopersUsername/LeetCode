import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] file1 = initFile(br);
        String[] file2 = initFile(br);

        if (file1.length == 0) {
            System.out.println(file2.length);
            return;
        } else if (file2.length == 0) {
            System.out.println(file1.length);
            return;
        }

        int[][] matrix = initMatrix(file1, file2);
        for (int i = 1; i < matrix.length; i++)
            for (int j = 1; j < matrix[i].length; j++)

                if (file1[i - 1].equals(file2[j - 1]))
                    matrix[i][j] = matrix[i - 1][j - 1];
                else
                    matrix[i][j] = Math.min(matrix[i - 1][j - 1],
                            Math.min(matrix[i - 1][j],
                                    matrix[i][j - 1])) + 1;

        System.out.println(matrix[file1.length][file2.length]);
    }

    private static int[][] initMatrix(String[] file1, String[] file2) {

        int[][] matrix = new int[file1.length + 1][file2.length + 1];
        for (int i = 0; i < matrix.length; i++) matrix[i][0] = i;
        for (int i = 0; i < matrix[0].length; i++) matrix[0][i] = i;

        return matrix;
    }

    private static String[] initFile(BufferedReader br) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        String[] file = new String[N];
        for (int i = 0; i < N; i++)
            file[i] = String.valueOf(br.readLine());

        return file;
    }
}