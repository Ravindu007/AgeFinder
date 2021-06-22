import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        //make sure user enter a integer value next
        boolean hasNextInt = sc.hasNextInt(); // validating next user input
        if(hasNextInt){
            int yearOfBirth = sc.nextInt(); //after getting number <<int, float, double>> get a Line input for ENTER Key
            sc.nextLine();  //<<<<<< for hitting the enter key
            int age = 2021 - yearOfBirth;

            System.out.println("Enter your name: ");
            String name = sc.nextLine();

            //age should be >0 and <=100
            if(age>0 && age<=100){
                System.out.println("Your name is " + name);
                System.out.println("Your age is " + age);
            }else {
                System.out.println("Ivalid year of birth");
            }

        }else{
            System.out.println("Invalid output");
        }

        System.out.println("Hello from Ravindu004");
        sc.close();

    }
}
