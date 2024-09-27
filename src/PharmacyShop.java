public class PharmacyShop {
    private Person person;
    private Address address;
    private Medicine[] medicine;
    private double totalProfit;

    public PharmacyShop(Person person, Address address, int medicineCount) {
        this.person = person;
        this.address = address;
        this.totalProfit = 0;
        this.medicine = new Medicine[medicineCount];

        this.medicine = new Medicine[] {
                new Medicine("001", "Paracetamol",50 , 100, "PharmaCorp",  "B123", new Date(15,12,2024)),
                new Medicine("002", "Ibuprofen", 75, 80, "HealthMed","B124", new Date(25,12,2024)),
                new Medicine("003", "Amoxicillin",120 , 50, "BioPharma", "B125", new Date(1,11,2024) ),
                new Medicine("004", "Ciprofloxacin", 150, 60, "MedLife", "B126", new Date(9,3,2024)),
                new Medicine("005", "Metformin",90 , 70, "GlucoCare", "B127", new Date(9,12,2024)),
        };
    }

    public void addMedicine(Medicine medicine) {
        System.out.println("Medicine are added successfully.");
    }

    public void updateMedicine(String id, int newQuantity, double newPrice) {
        for (Medicine medicine : medicine) {
            if (medicine.getMedicineId().equals(id)) {
                medicine.setPrice(newPrice);
                medicine.setQuantity(newQuantity);
                System.out.println("Medicine are  updated successfully.");
                return;
            }
        }
        System.out.println("Medicine are not found.");
    }

    public void removeMedicine(String id) {
        System.out.println("Medicine  are removed successfully.");
    }

    public void sellMedicine(String id, int quantitySold) {
        for (Medicine medicine : medicine) {
            if (medicine.getMedicineId().equals(id)) {

                totalProfit += medicine.getPrice() * quantitySold;
                System.out.println("Medicine are sold successfully.");

                return;
            }
        }
        System.out.println("Medicine are not found.");
    }

    public void displayAllMedicines() {
        for (Medicine medicine : medicine) {
            medicine.displayInformation();
        }
    }

    public void searchMedicine(String q) {
        for (Medicine medicine : medicine) {
            if (medicine.getMedicineId().equals(q)){
                medicine.displayInformation();
                return;
            }
        }
        System.out.println("Medicine are not found.");
    }

    public void printTotalProfit() {
        System.out.println("Total Revenue from the medicine is : " + totalProfit);
    }


}