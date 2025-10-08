// Employee.java
public class Employee {
    private int employeeNumber;
    private double payRate;
    public static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate) {
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    public double getRegularPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }

    public double getOvertimePay(double hoursWorked) {
        if (hoursWorked > 40)
            return (hoursWorked - 40) * payRate * OVERTIME_MULTIPLIER;
        else
            return 0.0;
    }
}
