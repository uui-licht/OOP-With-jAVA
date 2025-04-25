class Employee {
    private String name;
    private String employeeId;
    private int salary;

    public Employee(String name, String employeeId, int salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void increaseSalary(int amount) {
        salary += amount;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Monthly Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Haider Khan", "ARI200", 50000);
        employee.increaseSalary(10000);
        employee.displayDetails();
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
    }
}