import java.util.InputMismatchException;
import java.util.Scanner;

public class Marks {

    private int marks1;
    private int marks2;
    private int marks3;
    private int marks4;
    private int marks5;

    Marks() {

        marks1 = 0;
        marks2 = 0;
        marks3 = 0;
        marks4 = 0;
        marks5 = 0;
    }

    static Scanner scan = new Scanner(System.in);



    public void in() {

        readMarks("Marks1");
        readMarks("Marks2");
        readMarks("Marks3");
        readMarks("Marks4");
        readMarks("Marks5");

    }

        private void readMarks(String subject) {

        while (true) {

            try {

                System.out.print("Enter " + subject + ": ");
                int marks = scan.nextInt();

                if (marks >= 0 && marks <= 100) {

                    if (subject.equals("Marks1"))
                        marks1 = marks;

                    else if (subject.equals("Marks2"))
                        marks2 = marks;

                    else if (subject.equals("Marks3"))
                        marks3 = marks;
                    else if (subject.equals("Marks4"))
                        marks4 = marks;

                    else if (subject.equals("Marks3"))
                        marks3 = marks;

                    break;
                }

                System.out.println("Enter marks between 0 to 100");

            } catch (InputMismatchException e) {

                System.out.println("Enter an integer number for marks");

                scan.next();

            }
        }

    }

    public int sum() {

        return marks1 + marks2 + marks3 + marks4 + marks5;

    }

    public String avg() {

        double average = (double) (sum()) / 5;

        return formatNumber(average);

    }

    public String calculateGrade() {
        String grade;

        double average = (double) sum() / 5;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        return grade;
    }

    private static String formatNumber(double number) {

        String str = String.valueOf(number);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '.') {

                for (int j = i + 1; j < str.length(); j++) {

                    char digit = str.charAt(j);

                    if (digit != '0') {
                        count++;
                        break;
                    }

                }
            }
        }

        if (count == 0) {

            return String.valueOf((int) number);

        } else {

            return String.valueOf(String.format("%.2f", number));

        }

    }
}
