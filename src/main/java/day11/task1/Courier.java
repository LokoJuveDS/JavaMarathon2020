package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private final Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Зарплата курьера = " + salary;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {
        if (!isPayed()) {
            if (warehouse.getCountDeliveredOrders() >= 10000) {
                salary += 50000;
                isPayed = true;
            } else {
                System.out.println("Бонус пока недоступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
