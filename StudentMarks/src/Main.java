public class Main {

    public static void main(String[] args) {

        Marks marks = new Marks();

        marks.in();

        int totalMarks = marks.sum();
        String averageMarks = marks.avg();
        String grade = marks.calculateGrade();

        System.out.println("\n\n\n<---- Result ---->");
        System.out.println("Total Marks = "+totalMarks+"\nAverage Percentage = "+averageMarks+"\nGrade = "+grade);

    }

}
