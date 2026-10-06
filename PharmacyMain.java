public class PharmacyMain {
    static class Pharmacy {
        String pharmacyName; String location; static String pharmacyType = "Retail Pharmacy";
        Pharmacy(String pharmacyName, String location) { this.pharmacyName = pharmacyName; this.location = location; }
        void display() { System.out.println(pharmacyName + " - " + location + " - " + pharmacyType); }
    }
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy("HealthCare Pharmacy", "Delhi");
        Pharmacy p2 = new Pharmacy("City Pharmacy", "Noida");
        p1.display(); p2.display();
        System.out.println("Shared static value: " + Pharmacy.pharmacyType);
    }
}
