import java.util.Scanner;

public class PrintGrades {
    public static void main(String[] args) {
        //Making keyboard source of user input
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            //Prompting user to enter score
            System.out.println("Please enter an number exam score");
            //Declaring input as String variable
            String input;
            //Initializing input as next String entered
            input = keyboard.next();
            //Convert String input to int
            int score = Integer.parseInt(input);
            if (96 < score && score < 101) {
                System.out.println("A+");
            } else if (93 < score && score < 97) {
                System.out.println("A");
            } else if (89 < score && score < 94) {
                System.out.println("A-");
            }
            else if (86 < score && score < 90) {
                System.out.println("B+");
            }
            else if (83 < score && score < 87) {
                System.out.println("B");
            }
            else if (79 < score && score < 84) {
                System.out.println("B-");
            }
            else if (76 < score && score < 80) {
                System.out.println("c+");
            }
            else if (73 < score && score < 77) {
                System.out.println("c");
            }
            else if (69 < score && score < 74) {
                System.out.println("c-");
            }
            else if (59 < score && score < 70) {
                System.out.println("D");
            }
            else if (score < 60) {
                System.out.println("Go back to school");
            }
            System.out.println("Want to enter another score? Y/N");
            String answer = keyboard.next();
            if (answer.equalsIgnoreCase("Y")){
                continue;
            }
            else {
                break;
            }
        }
    }
}

