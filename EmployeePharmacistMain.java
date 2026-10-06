public class EmployeePharmacistMain {
    static class Employee {
        protected int employeeId; protected String name; protected double salary;
        Employee(int employeeId, String name, double salary) { this.employeeId = employeeId; this.name = name; this.salary = salary; }
        void displayEmployee() { System.out.println(employeeId + " | " + name + " | " + salary); }
    }
    static class Pharmacist extends Employee {
        private String licenseNo;
        Pharmacist(int employeeId, String name, double salary, String licenseNo) { super(employeeId, name, salary); this.licenseNo = licenseNo; }
        void displayPharmacist() { displayEmployee(); System.out.println("License: " + licenseNo); }
    }
    public static void main(String[] args) { new Pharmacist(101, "Riya", 35000, "PH1234").displayPharmacist(); }
}
