package StructuralPatterns.Composite;

/**
 * Класс Manager представляет менеджера, который также является сотрудником,
 * но может управлять подчинёнными.
 */
public class Manager implements Employee {
    private String name;
    private long empId;

    public Manager(String name, long empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name);
    }
}

