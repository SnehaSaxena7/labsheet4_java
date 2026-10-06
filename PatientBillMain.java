public class PatientBillMain {
    static class PatientBill {
        private double consultationFee, medicineFee, roomFee;
        void setConsultationFee(double fee) { consultationFee = fee; }
        void setMedicineFee(double fee) { medicineFee = fee; }
        void setRoomFee(double fee) { roomFee = fee; }
        double calculateTotal() { return consultationFee + medicineFee + roomFee; }
        void displayBill() { System.out.println("Consultation: " + consultationFee); System.out.println("Medicine: " + medicineFee); System.out.println("Room: " + roomFee); System.out.println("Total: " + calculateTotal()); }
    }
    public static void main(String[] args) {
        PatientBill bill = new PatientBill();
        bill.setConsultationFee(500); bill.setMedicineFee(750); bill.setRoomFee(1200);
        bill.displayBill();
    }
}
