package day18;

public class Task2 {
    static int counter = 0;

    public static void main(String[] args) {
        System.out.println(count7(-717771237));
    }

    public static int count7(int number) {
        //изначально передавал статическую переменную и 1 раз программа работала, верно, считая всё как нужно
        //но если как в тесте вызывать её несколько раз, то конечно же static переменная росла с каждым вызовом
        //не могу понять как мне вызывать и работать с локальной переменной в рекурсии, если там не хранится а каждый раз иниц переменная
        //в итоге допёр, что чтобы не потерять можно использовать доп переменную, в которую мы всю программу забрасываем static переменную
        //которая растёт если находится 7, а в самом конце обнуляем static переменную, чтобы в следующем вызове на новом числе уже считалось нормально

        int insideCounter = counter;
        //тут проверка на выход, если уже цифры кончились и зашел 0 от деления крайней цифры на 10
        if (number != 0) {
            //тут защита от цифры ноль в числе и проверка на деление на 7
            if ((number % 10) != 0 && (number % 10) % 7 == 0) {
                counter++;
            }
        } else {
            counter = 0;
            return insideCounter;
        }
        return count7(number / 10);
    }
}
