public class Worker extends Person {
    protected double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        } else {
            double overtimeHours = hoursWorked - 40;
            return (40 * hourlyPayRate) + (overtimeHours * hourlyPayRate * 1.5);
        }
    }

    public void displayWeeklyPay(double hoursWorked) {
        double regularPay = Math.min(40, hoursWorked) * hourlyPayRate;
        double overtimePay = Math.max(0, hoursWorked - 40) * hourlyPayRate * 1.5;
        double totalPay = regularPay + overtimePay;

        System.out.printf("%s %s | Regular: $%.2f | Overtime: $%.2f | Total: $%.2f%n",
                title, lastName, regularPay, overtimePay, totalPay);
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + hourlyPayRate;
    }

    @Override
    public String toXML() {
        return super.toXML().replace("</Person>", "<HourlyPayRate>" + hourlyPayRate + "</HourlyPayRate></Person>");
    }

    @Override
    public String toJSON() {
        return super.toJSON().replace("}", ", \"HourlyPayRate\": " + hourlyPayRate + "}");
    }
}