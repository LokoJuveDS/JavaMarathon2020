package day1;

public class Task4 {
    public static void main(String[] args) {
        int year; //т.к. в задании объявление и явная инициализация написаны в разных предложениях, я сделал это в 2 действия
        year = 1980; // всё же насколько принципиальная разница при прочих равных, делать это в 1 действие или в 2?
        while (year <= 2020) {
            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }

        //при такой реализации year меняется к концу программы
        //System.out.println(year);
    }
}
