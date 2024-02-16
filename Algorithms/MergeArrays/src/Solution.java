/*
Условие задачи
Вам даны две целочисленных последовательности, отсортированных в порядке неубывания, и два целых числа
m и n, представляющие количество элементов в первой и второй последовательности соответственно.
Объедините последовательности в единый массив, отсортированный в порядке неубывания.

Входные данные
Первая строка содержит два натуральных числа n
(1 ≤ n ≤ 10000) и m (1 ≤ m ≤ 10000).
Количество элементов в первой и второй последовательности соответственно.

Выходные данные
Выведите в одну строку через пробел последовательность, получившуюся после слияния.
Нужно реализовать без использования сортировки.

Пример теста 1
Входные данные

3 4
5 7 9
6 8 10 12


 Рекомендуется использовать быстрый (буферизованный) ввод и вывод
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

StringTokenizer st = new StringTokenizer(br.readLine());
int a = Integer.parseInt(st.nextToken());
int b = Integer.parseInt(st.nextToken());
bw.write(String.valueOf(a + b));
bw.flush();
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public void merge() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), i = 0, j = 0;
        StringBuilder builder = new StringBuilder(a + b);
        int[] arr1 = new int[a], arr2 = new int[b];

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens())
            arr1[i++] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens())
            arr2[j++] = Integer.parseInt(st.nextToken());

        i = 0;
        j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) builder.append(arr1[i++]);
            else builder.append(arr2[j++]);
            builder.append(" ");
        }

        if (i < arr1.length)
            for (int k = i; k < arr1.length; k++)
                builder.append(arr1[k]).append(" ");

        if (j < arr2.length)
            for (int k = j; k < arr2.length; k++)
                builder.append(arr2[k]).append(" ");

        System.out.println(builder);
    }
}
