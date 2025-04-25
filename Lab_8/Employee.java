public class Employee {
    public int calculateBonus(int salary) {
        return salary * 10 / 100;
    }
    
    public int calculateTotalAmount(int salary, int hours) {
        return salary + (500 * hours);
    }
    
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Bonus: " + employee.calculateBonus(50000));
        int bonus = employee.calculateBonus(50000);
        System.out.println("Total Amount: " + employee.calculateTotalAmount(bonus, 3));
    }
}