public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, 0); // Hourly rate is not needed for salary workers
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        System.out.printf("%s %s | Weekly Salary: $%.2f%n", title, lastName, weeklyPay);
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + annualSalary;
    }

    @Override
    public String toXML() {
        return super.toXML().replace("</Person>", "<AnnualSalary>" + annualSalary + "</AnnualSalary></Person>");
    }

    @Override
    public String toJSON() {
        return super.toJSON().replace("}", ", \"AnnualSalary\": " + annualSalary + "}");
    }
}