// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package DZ_3;

import java.util.ArrayList;
import java.util.Random;

public class Zadacha_2 {

    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        addNumsForList(list);
        System.out.println("Был массив: ");
        System.out.println(list);
        ArrayList<Integer> listEvenNums = deleteEvenNums(list);
        System.out.println("Стал массив: ");
        System.out.println(list);
        System.out.println("Удалённые числа: ");
        System.out.println(listEvenNums);
    }
    public static void addNumsForList(ArrayList<Integer> list) {
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(rnd.nextInt(0, 30));
        }
    }
    public static ArrayList<Integer> deleteEvenNums(ArrayList<Integer> list) {
        ArrayList<Integer> listEvenNums = new ArrayList<>();
        int el = 0;
        while (el < list.size()) {
            if(list.get(el) % 2 == 0){
                listEvenNums.add(list.get(el));
                list.remove(el);
            }
            else el++;
        }
        return listEvenNums;
    }
}