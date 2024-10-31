import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //створимо списки з числами
        List<Integer> list1 = List.of(5,6,7,8);
        List<Integer> list2 = List.of(51,6,75,8);

        // Створюємо новий список для збереження результатів порівняння
        List<Boolean> result = new ArrayList<>();

        // Створюємо ітератори для обох списків
        Iterator<Integer> iterator1 = list1.iterator();
        Iterator<Integer> iterator2 = list2.iterator();

        // Перебираємо елементи обох списків за допомогою ітераторів
         while (iterator1.hasNext() && iterator2.hasNext()) {
             result.add(iterator1.next().equals(iterator2.next()));// Додаємо до списку результат порівняння елементів
         }
        System.out.println(result);

    }
}