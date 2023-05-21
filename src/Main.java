import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(8, 8, 2, 3, 4, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> str = new ArrayList<>(List.of("работа", "дом", "дом", "рыбалка", "работа", "телефон", "телефон", "ручка", "дом"));

        workOne(nums);
        System.out.println();
        workTwo(nums);
        System.out.println();
        workThree(str);
        System.out.println();
        workFour(str);
    }

    public static void workOne(List<Integer> number) {
        for (int num : number) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void workTwo(List<Integer> number) {
        Collections.sort(number);
        int numberResult = Integer.MIN_VALUE;
        for (Integer numb : number) {
            if (numb % 2 == 0 && numb != numberResult) {
                System.out.print(numb + " ");
                numberResult = numb;
            }
        }
    }

    public static void workThree(List<String> str) {
        Set<String> stringHashSet = new HashSet<>(str);
        System.out.print(stringHashSet);
    }

    public static void workFour(List<String> str) {
        Set<String> stringHashSet = new HashSet<>(str);
        System.out.println(str.size() - stringHashSet.size());
    }
}