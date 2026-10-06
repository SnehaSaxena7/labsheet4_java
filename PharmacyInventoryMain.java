public class PharmacyInventoryMain {
    static class MedicineStock {
        String name; int quantity;
        MedicineStock(String name, int quantity) { this.name = name; this.quantity = quantity; }
        void display() { System.out.println(name + " | Quantity: " + quantity); }
    }
    static class Inventory {
        void displayInventory(MedicineStock[] stock) {
            for (int i = 0; i < stock.length; i++) stock[i].display();
        }
    }
    public static void main(String[] args) {
        MedicineStock[] stock = { new MedicineStock("Paracetamol", 50), new MedicineStock("Vitamin C", 30), new MedicineStock("Cough Syrup", 20) };
        new Inventory().displayInventory(stock);
    }
}
