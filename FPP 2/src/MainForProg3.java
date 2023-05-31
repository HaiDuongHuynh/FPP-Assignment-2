import java.util.Scanner;

public class MainForProg3 {
    public static void main(String[] args) {
        boolean getInput = true;

        String input = "";
        while (getInput) {
            System.out.println("Enter C for Circle\nEnter R for Rectangle\nEnter T for Triangle");
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();
            //input = scanner.next();
            //System.out.println(input);
            if (a.equals("C")) {
                //System.out.println("GO HERE!");
                getInput = false;
                input = "C";
            }
            else if(a.equals("R")){
                getInput = false;
                input = "R";
            }
            else if(a.equals("T")){
                getInput = false;
                input = "T";
            }
            else {
                System.out.println("Please try again!");
            }
        }

        switch (input) {
            case "C":
                System.out.println("Enter the radius of the Circle");
                Scanner scanner1 = new Scanner(System.in);
                String r = scanner1.nextLine();
                Circle c = new Circle(Integer.parseInt(r));
                System.out.println("The area of Circle is: " + c.computeArea());
                break;
            case "R":
                System.out.println("Enter the width of the Rectangle");
                Scanner scanner2 = new Scanner(System.in);
                String w = scanner2.nextLine();
                System.out.println("Enter the length of the Rectangle");
                Scanner scanner3 = new Scanner(System.in);
                String l = scanner3.nextLine();
                Rectangle rec = new Rectangle(Integer.parseInt(w),Integer.parseInt(l));
                System.out.println("The area of Rectangle is: " + rec.computeArea() );
                break;
            case "T":
                System.out.println("Enter the height of the Triangle");
                Scanner scanner4 = new Scanner(System.in);
                String h = scanner4.nextLine();
                System.out.println("Enter the base of the Triangle");
                Scanner scanner5 = new Scanner(System.in);
                String b= scanner5.nextLine();
                Triangle tri = new Triangle(Integer.parseInt(h),Integer.parseInt(b));
                System.out.println("The area of Triangle is: " + tri.computeArea());
                break;
        }
    }
}
