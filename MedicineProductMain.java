public class MedicineProductMain {
    static class MedicineProduct {
        private String medicineName; private double price;
        MedicineProduct(String medicineName, double price) { this.medicineName = medicineName; this.price = price; }
        void display() { System.out.println("Medicine: " + medicineName + ", Price: " + price); }
    }
    public static void main(String[] args) {
        MedicineProduct product = new MedicineProduct("Amoxicillin", 80.0);
        product.display();
    }
}
