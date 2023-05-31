import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class HeartRates {
    private String firstName;
    private String lastName;
    //private String dateOfBirth;
    private int age;
    public double LB = 0.5;
    public double UB = 0.85;
    public double RHR = 70;
    private double MHR;
    private double AHR;

    public void setAge(int a){
        age = a;
    }

    HeartRates(String firstName, String lastName/*String dateOfBirth*/){
        this.firstName = firstName;
        this.lastName = lastName;
        //this.dateOfBirth = dateOfBirth;
    }
    public double calculateLBTHR(){
        MHR = 220 - age;
        AHR = MHR - RHR;
        return (AHR*LB) + RHR;
    }

    public double calculateUBTHR(){
        MHR = 220 - age;
        AHR = MHR - RHR;
        return (AHR*UB) + RHR;
    }

    public double getMHR(){
        return 220 - age;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
    public Period calculateAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today); // Return periods as Year, Month and Days
    }

    public LocalDate getBirthday() {
        Scanner scanner = new Scanner(System.in);
        LocalDate birthday;
        while (true) {
            System.out.println("Please enter your birthday "
                    + "in yyyy-MM-dd format (e.g. 1980-9-28): ");
            String input = scanner.nextLine();
            try {
                birthday = LocalDate.parse(input, formatter);

                return birthday;

            } catch(DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        }
    }

    public static void main(String[] args) {
        AgeCalculator ageCalculator = new AgeCalculator();
        LocalDate birthday = ageCalculator.getBirthday();
        Period age = ageCalculator.calculateAge(birthday);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String fn = scanner.nextLine();
        System.out.println("Please enter your last name: ");
        String ln = scanner.nextLine();
        HeartRates hr = new HeartRates(fn,ln);
        hr.setAge(age.getYears());
        System.out.println("The Target Heart Rate Range is between " + hr.calculateLBTHR() + " and " + hr.calculateUBTHR());
        System.out.println("First name: " + hr.firstName);
        System.out.println("Last name: " + hr.lastName);
        System.out.println("Age: " + age.getYears());
        System.out.println("Date of Birth: " + birthday);
        System.out.println("Maximum Heart Rate: " + hr.getMHR());
        //System.out.printf("Today you are %d years, %d months"
         //               + " and %d days old%n",
          //      age.getYears(), age.getMonths(), age.getDays());
    }

}
