package day8;

public class Task1 {
    public static void main(String[] args) {
        String string = "";
        StringBuilder stringBuilder = new StringBuilder();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            string = string + i + " ";
        }
        long finish1 = System.currentTimeMillis();
        System.out.println(string);
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            stringBuilder.append(i).append(" ");
        }
        long finish2 = System.currentTimeMillis();
        System.out.println(stringBuilder);

        System.out.println(finish1 - start1);
        System.out.println(finish2 - start2);
    }
}
