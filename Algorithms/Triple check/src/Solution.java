/*
Условие задачи
Разбиение Ломуто, как и разбиение Хоара, имеет проблемы при большом количестве одинаковых элементов.
В этом задании нужно написать разбиение, которое решает эту проблему. Разбиение должно делить массив
на три части: на элементы меньше опорного, равные опорному и большие опорного элемента.
Верните индексы самого первого (левого) и самого последнего (правого) элементов среднего разбиения (где элементы равны опорному).
В качестве опорного элемента выбирайте последний элемент.

Входные данные
В первой строке на вход подается число n (1 ≤ 10000 ) - количество элементов.
Во второй строке передаются n элементов (1 ≤ elem ≤ 1000) через пробел.

Выходные данные
Выведите два числа. Индексы самого первого (левого) и самого последнего (правого)
элементов среднего разбиения (где элементы равны опорному). Индексы нумеруются с нуля.
Решение должно быть "in-place", без создания вспомогательных массивов.

Пример теста 1
Входные данные

5
5 5 1 6 5
Выходные данные

1 3
Пример теста 2
Входные данные

3
1 2 3
Выходные данные

2 2
Пример теста 3
Входные данные

1
5
Выходные данные

0 0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public void check() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] elems = new int[Integer.parseInt(st.nextToken())];

        int i = 0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens())
            elems[i++] = Integer.parseInt(st.nextToken());

        int l = 0, r = 0, m = elems[elems.length - 1];
        for (int elem : elems)
            if (elem < m) l++;
            else if (elem > m) r++;

        System.out.println(l + " " + (elems.length - ++r));
    }
}
