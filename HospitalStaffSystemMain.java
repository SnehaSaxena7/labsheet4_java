public class HospitalStaffSystemMain {
    static class Person {
        protected String name; protected int age;
        Person(String name, int age) { this.name = name; this.age = age; }
    }
    static class Employee extends Person {
        private int employeeId; private double salary; static int employeeCount;
        Employee(String name, int age, int employeeId, double salary) { super(name, age); this.employeeId = employeeId; this.salary = salary; employeeCount++; }
        int getEmployeeId() { return employeeId; }
        double getSalary() { return salary; }
        void displayEmployee() { System.out.println(employeeId + " | " + name + " | Age: " + age + " | Salary: " + salary); }
    }
    static class Doctor extends Employee {
        private String specialization;
        Doctor(String name, int age, int employeeId, double salary, String specialization) { super(name, age, employeeId, salary); this.specialization = specialization; }
        void displayDoctor() { displayEmployee(); System.out.println("Specialization: " + specialization); }
    }
    static class Pharmacist extends Employee {
        private String licenseNo;
        Pharmacist(String name, int age, int employeeId, double salary, String licenseNo) { super(name, age, employeeId, salary); this.licenseNo = licenseNo; }
        void displayPharmacist() { displayEmployee(); System.out.println("License: " + licenseNo); }
    }
    static class HospitalSystem {
        void displayStaff(Employee[] staff) {
            for (int i = 0; i < staff.length; i++) {
                if (staff[i] instanceof Doctor) ((Doctor) staff[i]).displayDoctor();
                else if (staff[i] instanceof Pharmacist) ((Pharmacist) staff[i]).displayPharmacist();
                System.out.println();
            }
            System.out.println("Total employees: " + Employee.employeeCount);
        }
    }
    public static void main(String[] args) {
        Employee[] staff = { new Doctor("Dr. Singh", 40, 501, 85000, "Cardiology"), new Pharmacist("Pooja", 28, 502, 42000, "PH9012") };
        new HospitalSystem().displayStaff(staff);
    }
}
