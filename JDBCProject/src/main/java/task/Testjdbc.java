package task;

public class Testjdbc {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.setEmployeeId(41);
        employees.setFirstName("Kate");
        employees.setLastName("Johnson");
        employees.setEmail("kate.jhons@sqltutorial.org");
        employees.setPhoneNumber("515.123.1212");
        employees.setHireDate("1998-08-11");
        employees.setJobId(19);
        employees.setSalary(8700);
        employees.setManagerId(101);
        employees.setDepartmentId(11);

        Methods.printStatements();

//        Methods.insertNewEmployee(employees);

//        Methods.insertNewDepartmentsBatch();

//        Methods.updateEmployeeId(employees.getFirstName(), employees.getEmployeeId());

//        Methods.deleteEmployeeWithId(41L);
    }
}
