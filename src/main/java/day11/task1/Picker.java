package day11.task1;

public class Picker implements Worker {
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
        return "Зарплата сборщика = " + salary;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {
        if (!isPayed()) {
            if (warehouse.getCountPickedOrders() >= 10000) {
                salary += 70000;
                isPayed = true;
            } else {
                System.out.println("Бонус пока недоступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
