package pro.sky.java.course2.homework4;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Employee[] employeeList = new Employee[10];


    public Employee addEmployee(String firstName, String lastName) throws FullArrayException {
        Employee workaholic = new Employee(firstName, lastName);
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i] == null) {
                employeeList[i] = workaholic;
                return workaholic;
            }
        }
        throw new FullArrayException();
    }


    public Employee deleteEmployee(String firstName, String lastName) {
        Employee workaholic = new Employee(firstName, lastName);
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i] == null) {
                continue;
            }
            if (employeeList[i].equals(workaholic)) {
                employeeList[i] = null;
                return workaholic;
            }
        }
        throw new EmployeeNotFoundException();
    }


    public Employee findEmployee(String firstName, String lastName) throws EmployeeNotFoundException {
        Employee workaholic = new Employee(firstName, lastName);
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i] == null) {
                continue;
            }
            if (employeeList[i].equals(workaholic)) {
                return employeeList[i];
            }
        }
        throw new EmployeeNotFoundException();
    }
}
