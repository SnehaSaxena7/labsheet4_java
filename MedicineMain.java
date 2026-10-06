public class MedicineMain {
    static class Medicine {
        String medicineName; double price;
        Medicine(String medicineName, double price) { this.medicineName = medicineName; this.price = price; }
        void display() { System.out.println("Medicine: " + medicineName); System.out.println("Price: " + price); }
    }
    public static void main(String[] args) {
        Medicine medicine = new Medicine("Paracetamol", 25.50);
        medicine.display();
    }
}
