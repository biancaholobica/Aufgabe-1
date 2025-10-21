import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] inputGrades = {29, 37, 38, 41, 84, 67};

        Grades grades = new Grades(inputGrades);

        int[] failing = grades.getFailingGrades();
        System.out.println("Failing grades: " + Arrays.toString(failing));

        int[] rounded = grades.getRoundedGrades();
        System.out.println("Rounded grades: " + Arrays.toString(rounded));

        double average = grades.getAverageGrade();
        System.out.println("Average grade: " + average);

        int maxGrade = grades.getMaxRoundedGrade();
        System.out.println("Maximum rounded grade: " + maxGrade);
    }
}
