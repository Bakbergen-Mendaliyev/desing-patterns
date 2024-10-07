package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс CompanyDirectory реализует Employee и содержит список других сотрудников (как разработчиков, так и менеджеров).
 */
public class CompanyDirectory implements Employee {
    private List<Employee> employeeList = new ArrayList<>();

    /**
     * Метод для добавления сотрудника в список.
     */
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    /**
     * Метод для удаления сотрудника из списка.
     */
    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }

    /**
     * Метод для отображения информации обо всех сотрудниках, находящихся в этом разделе компании.
     */
    @Override
    public void showEmployeeDetails() {
        for (Employee emp : employeeList) {
            emp.showEmployeeDetails();
        }
    }
}

