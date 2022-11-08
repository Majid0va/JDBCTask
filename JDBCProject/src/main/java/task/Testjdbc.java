package task;

public class Testjdbc {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.setEmployeeId(208L);
        employees.setFirstName("Kate");
        employees.setLastName("Johnson");
        employees.setEmail("kate.jhons@sqltutorial.org");
        employees.setPhoneNumber("515.123.1212");
        employees.setHireDate("1998-08-11");
        employees.setJobId(19);
        employees.setSalary(8700);
        employees.setManagerId(101);
        employees.setDepartmentId(11);

        Employees employees2 = new Employees();
        employees2.setEmployeeId(43L);
        employees.setFirstName("Jhon");
        employees.setLastName("Johnson");
        employees.setEmail("kate.jhons@sqltutorial.org");
        employees.setPhoneNumber("515.123.1212");
        employees.setHireDate("1998-08-11");
        employees.setJobId(19);
        employees.setSalary(8700);
        employees.setManagerId(101);
        employees.setDepartmentId(11);

        //Tasks
        Methods.printStatements();

//        Methods.insertNewEmployee(employees);

//        Methods.insertNewDepartmentsBatch();

//        Methods.updateEmployeeId(employees2.getFirstName(), employees2.getEmployeeId());

//        Methods.deleteEmployeeWithId(208L);
    }
}
