import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("John", "Doe", "W001", "Mr.", 1985, 25.00));
        workers.add(new Worker("Jane", "Smith", "W002", "Ms.", 1990, 30.00));
        workers.add(new Worker("James", "Brown", "W003", "Mr.", 1980, 20.00));
        workers.add(new SalaryWorker("Alice", "Johnson", "S001", "Mrs.", 1983, 60000));
        workers.add(new SalaryWorker("Bob", "Williams", "S002", "Mr.", 1975, 75000));
        workers.add(new SalaryWorker("Charlie", "Davis", "S003", "Mr.", 1992, 50000));

        int[] weeklyHours = {40, 50, 40};

        for (int week = 1; week <= 3; week++) {
            System.out.println("\nWeek " + week + " Payroll:");
            System.out.println("-------------------------------------------------");
            for (Worker worker : workers) {
                worker.displayWeeklyPay(weeklyHours[week - 1]);
            }
        }
    }
}