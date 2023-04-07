import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultList = new ArrayList<>();

        // Отфильтруйте положительные числа
        for (int i : intList) {
            if (i > 0) {
                // Найдите среди этих положительных чисел четные.
                if (i % 2 == 0) {
                    resultList.add(i);
                }
            }
        }
        
        // Отсортируйте отфильтрованные числа в порядке возрастания.
        Collections.sort(resultList);

        // Выведите результат на экран.
        System.out.println(resultList);
    }
}
