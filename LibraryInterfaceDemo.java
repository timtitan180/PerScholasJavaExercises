package javalibraryexercisepackage;

public class LibraryInterfaceDemo {


    public static void main(String[] args) {
        KidUsers kidUser1 = new KidUsers();

        KidUsers kidUser2 = new KidUsers();

        System.out.print("____First Kid's Verification_____\n");

        System.out.println("\n");

        kidUser1.setAge(10);

        kidUser1.registerAccount();

        kidUser1.setbookType("Kids");

        kidUser1.requestBook();

        System.out.print("____Second Kid's Verification____");

        System.out.println("\n");

        kidUser2.setAge(18);

        kidUser2.registerAccount();

        kidUser2.setbookType("Fiction");

        kidUser2.requestBook();

        AdultUsers adultUser1 = new AdultUsers();

        AdultUsers adultUser2 = new AdultUsers();

        System.out.print("____First Adult's Verification____\n");

        System.out.println("\n");

        adultUser1.setAge(5);

        adultUser1.registerAccount();

        adultUser1.setbookType("Kids");

        adultUser1.requestBook();

        System.out.println("\n");

        System.out.print("____Second Adult's Verification____\n");

        adultUser1.setAge(23);

        adultUser1.registerAccount();

        adultUser1.setbookType("Kids");

        adultUser1.requestBook();









    }
}
