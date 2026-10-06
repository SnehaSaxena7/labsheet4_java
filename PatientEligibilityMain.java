public class PatientEligibilityMain {
    static class Patient {
        String name; int age;
        Patient(String name, int age) { this.name = name; this.age = age; }
        void checkEligibility() {
            if (age >= 18) System.out.println(name + " is eligible.");
            else System.out.println(name + " is not eligible.");
        }
    }
    public static void main(String[] args) {
        Patient patient = new Patient("Aarav", 20);
        patient.checkEligibility();
    }
}
