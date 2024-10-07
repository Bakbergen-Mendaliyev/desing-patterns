package StructuralPatterns.Composite;

/**
 * Класс Developer представляет обычного сотрудника компании (разработчика).
 */
public class Developer implements Employee {
    private String name;
    private long empId;

    public Developer(String name, long empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name);
    }
}
