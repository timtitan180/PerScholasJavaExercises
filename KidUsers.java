package javalibraryexercisepackage;

public class KidUsers implements LibraryUser {
    int age;
    String bookType;
    KidUsers(){}


    //getter and setter methods for age and bookType

    public int getAge() {
        return this.age;
    }


    public void setAge(int age) {
        this.age = age;
    }
    public void setbookType(String bookType) {
        this.bookType = bookType;
    }

    public String getbookType() {
        return this.bookType;
    }

        public void registerAccount() {
            if(age > 12) {
                System.out.print("Sorry,Age must be less than 12 to register as a kid\n");
            }
            else if(age < 12) {
                System.out.println("You have successfully registered under an Kids Account\n");
            }
        }

        public void requestBook() {
            if(bookType.equals("Kids")) {
                System.out.println("Book Issued successfully, please return the book within 10 days");
            }

            else {
                System.out.println("Oops, you are allowed to take only kids books");
            }
        }

}
