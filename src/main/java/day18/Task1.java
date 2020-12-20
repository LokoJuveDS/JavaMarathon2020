package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        //сначала сделал отсчёт от конца массива к началу, но под тесты не подошло, исправил, что начинает с 0 и идёт к концу
        System.out.println(recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] numbers, int n) {
        if (n == numbers.length)
            return 0;
        return numbers[n] + recursionSum(numbers, n + 1);
    }
}
