package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        //неплохо было бы в условие добавить ещё id склада и id работника, это бы помогло для понимая в toString()
        //создаём первый склад и работников в нём
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        //вызываем 10000 действий, чтобы выплатить бонус
        businessProcess(picker1);
        businessProcess(courier1);
        //по количеству заказов, доставок, итоговой ЗП сборщика и курьера видим, что бонус получили
        System.out.println(warehouse1);
        System.out.println(picker1);
        System.out.println(courier1);
        System.out.println();
        // создаём второй склад и работников в нём
        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        //на втором складе делаем по 1 действию, чтобы проверить отсутствие влияния на первый склад
        picker2.doWork();
        courier2.doWork();
        //значения у первого склада не должны поменяться
        System.out.println(warehouse1);
        System.out.println();
        //делаем по 1 действию на работниках первого склада, чтобы проверить увеличение ЗП на 80 и 100 соответственно
        picker1.doWork();
        courier1.doWork();
        System.out.println("ЗП сборщика 1 = " + picker1.getSalary());
        System.out.println("ЗП доставщика 1 = " + courier1.getSalary());
        System.out.println();
        //проверяем статус бонуса
        picker1.bonus();
        courier1.bonus();
        System.out.println();
        //проверяем, что на втором складе только по 1 действию выполнилось
        System.out.println(warehouse2);
        System.out.println("ЗП сборщика 2 = " + picker2.getSalary());
        System.out.println("ЗП доставщика 2 = " + courier2.getSalary());
        System.out.println();
        //пытаемся выдать бонус работникам, которые не выполнили для этого план
        picker2.bonus();
        courier2.bonus();
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
