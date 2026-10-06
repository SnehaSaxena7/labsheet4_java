public class HierarchicalHospitalMain {
    static class Employee {
        protected String name; protected int employeeId;
        Employee(String name, int employeeId) { this.name = name; this.employeeId = employeeId; }
        void displayEmployee() { System.out.println("Employee: " + employeeId + " | " + name); }
    }
    static class Doctor extends Employee {
        private String specialization;
        Doctor(String name, int employeeId, String specialization) { super(name, employeeId); this.specialization = specialization; }
        void displayDoctor() { displayEmployee(); System.out.println("Specialization: " + specialization); }
    }
    static class Pharmacist extends Employee {
        private String licenseNo;
        Pharmacist(String name, int employeeId, String licenseNo) { super(name, employeeId); this.licenseNo = licenseNo; }
        void displayPharmacist() { displayEmployee(); System.out.println("License: " + licenseNo); }
    }
    public static void main(String[] args) { new Doctor("Dr. Mehta", 201, "Cardiology").displayDoctor(); new Pharmacist("Karan", 202, "PH5678").displayPharmacist(); }
}
