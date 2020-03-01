package lesson04.dz_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
1. Создать программу, в которой:
    1.1. Формируется коллекция из строк типа ArrayList (5-6 строк)
    1.2. Из коллекции удаляется одно из значений
    1.3. Выполняется проверка, что коллекция больше не содержит удаленный объект (результат проверки выводится в консоль)
    1.4. Выполняется сортировка объектов коллекции (Collections class в помощь)
    1.5. Выполняется поочередный вывод строк в консоль до сортировки и после (Iterator class в помощь)
2. Закоммитить изменения и добавить их в репозиторий на GitHub.
3. Прислать ссылку на репозиторий.
*/
public class DZCollections {

    public static void main(String[] args) {
        ArrayList <String> listBeforeSort = new ArrayList<>();

        listBeforeSort.add("Каждый");
        listBeforeSort.add("охотник");
        listBeforeSort.add("желает");
        listBeforeSort.add("знать");
        listBeforeSort.add("где");
        listBeforeSort.add("сидит");
        listBeforeSort.add("фазан!");



        //removing element
        listBeforeSort.remove("охотник");
        System.out.println("Удаление элемента");


        System.out.print("Проверка удаления элемента: ");
        //checking removing element
        for (String s:listBeforeSort) {
            if (s=="охотник") {
                System.out.println("Элемент не удален из массива!");
                break;
            }
        }
        System.out.println("Элемента нет в массиве!");


        //sorting element
        ArrayList <String> listAfterSort = new ArrayList<>();
        for (String s:listBeforeSort) listAfterSort.add(s);
        Collections.sort(listAfterSort);

        //print elements before sorting
        System.out.println("Неотсортированный массив: ");
        Iterator<String> iter1 = listBeforeSort.iterator();
        while(iter1.hasNext()){
            System.out.println(iter1.next());
        }

        //print elements after sorting
        System.out.println("Отсортированный массив: ");
        Iterator<String> iter2 = listAfterSort.iterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }
    }
}
