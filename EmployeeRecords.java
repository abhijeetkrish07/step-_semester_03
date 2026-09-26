public class EmployeeRecords {

    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public EmployeeRecords(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {

        EmployeeRecords emp1 = new EmployeeRecords("Arun", 30000);
        EmployeeRecords emp2 = new EmployeeRecords("Rahul", 35000);
        EmployeeRecords emp3 = new EmployeeRecords("Priya", 40000);

        EmployeeRecords.printCompanyInfo();
    }
}
