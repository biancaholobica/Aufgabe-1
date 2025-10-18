import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> inputGrades = new ArrayList<>();
        inputGrades.add(29);
        inputGrades.add(37);
        inputGrades.add(38);
        inputGrades.add(41);
        inputGrades.add(84);
        inputGrades.add(67);

        Grades grades = new Grades(inputGrades);

        // Note insuficiente
        List<Integer> failing = grades.getFailingGrades();
        System.out.println("Failing grades: " + failing);

        // Note rotunjite
        List<Integer> rounded = grades.getRoundedGrades();
        System.out.println("Rounded grades: " + rounded);

//        // Media notelor
//        double average = grades.getAverageGrade();
//        System.out.println("Average grade: " + average);
//
//        // Nota maximă
//        int maxGrade = grades.getMaxRoundedGrade();
//        System.out.println("Maximum rounded grade: " + maxGrade);
    }
}
