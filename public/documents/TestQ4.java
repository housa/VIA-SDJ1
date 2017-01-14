public class TestQ4 {

    public static void main(String[] args) {
        Customer lukas = new Customer("Lukas", "Aarhus");
        SportsCar sc = new SportsCar("ks64537", 923.4);
        Van v = new Van("jd83548", 873.6, 10);
        FamilyCar fc = new FamilyCar("kr75638", 837.2, 8);
        CarRental cr = new CarRental("CR", "Aarhus");

        //testing the Customer class
        System.out.println("Test 1: " + lukas.getName().equals("Lukas"));
        System.out.println("Test 2: " + lukas.getAddress().equals("Aarhus"));

        //testing the Car class
        System.out.println("Test 3: " + sc.getLicenseNo().equals("ks64537"));
        System.out.println("Test 4: " + (v.getPrice()==873.6));
        v.setPrice(735.8);
        System.out.println("Test 5: " + (v.getPrice()==735.8));
        System.out.println("Test 6: " + (sc.getRentedTo()==null));
        System.out.println("Test 7: " + sc.isAvailable());
        sc.setRentedTo(lukas);
        System.out.println("Test 8: " + (sc.getRentedTo()==lukas));
        System.out.println("Test 9: " + !sc.isAvailable());

        //testing the SportsCar class
        System.out.println("Test 10: " + sc.getType().equals("SportsCar"));

        //testing the Van class
        System.out.println("Test 11: " + v.getType().equals("Van"));
        System.out.println("Test 12: " + (v.getCapacity()==10));

        //testing the FamilyCar class
        System.out.println("Test 13: " + fc.getType().equals("FamilyCar"));
        System.out.println("Test 14: " + (fc.getSeats()==8));

        //testing the CarRental class
        System.out.println("Test 15: " + cr.getCompanyName().equals("CR"));
        System.out.println("Test 16: " + cr.getAddress().equals("Aarhus"));
        System.out.println("Test 17: " + (cr.getNumberOfCars()==0));
        cr.addCar(sc);
        cr.addCar(v);
        cr.addCar(fc);
        System.out.println("Test 18: " + (cr.getNumberOfCars()==3));
        System.out.println("Test 19: " + (cr.getCar(0)==sc));
        System.out.println("Test 20: " + (cr.getCarByLicense("jd83548")==v));
        System.out.println("Test 21: " + (cr.getAvailableSportsCar()==null));
        sc.setRentedTo(null);
        System.out.println("Test 21: " + (cr.getAvailableSportsCar()==sc));
        System.out.println("Test 22: " + (cr.getAvailableVan(12)==null));
        System.out.println("Test 22: " + (cr.getAvailableVan(8)==v));
    }
}
