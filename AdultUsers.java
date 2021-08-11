package javalibraryexercisepackage;

public class AdultUsers implements LibraryUser{
    int age;
    String bookType;
    AdultUsers(){};


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
    public void setbookType(String bookType) {
        this.bookType = bookType;
    }

    public String getbookType() {
        return this.bookType;
    }

    public void registerAccount() {
        if(age > 12) {
            System.out.print("You have successfully registered under an Adult Account\n");
        }
        else {
            System.out.println("Sorry,Age must be greater than 12 to register as an adult\n");
        }

    }

    public void requestBook() {
        if(bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }

        else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }

}
