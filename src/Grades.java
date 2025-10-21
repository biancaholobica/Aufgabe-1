public class Grades {
    private int[] grades;

    public Grades(int[] inputGrades) {
        this.grades = inputGrades;
    }

    public int[] getFailingGrades() {
        int count = 0;
        for (int grade : grades) {
            if (grade < 40) {
                count++;
            }
        }

        // cream un array de dimensiune count
        int[] failingGrades = new int[count];
        int index = 0;
        for (int grade : grades) {
            if (grade < 40) {
                failingGrades[index++] = grade;
            }
        }

        return failingGrades;
    }

    public int[] getRoundedGrades() {
        int[] roundedGrades = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];

            if (grade >= 38) {
                int multiple = ((grade / 5) + 1) * 5; // urmatorul multiplu de 5
                if (multiple - grade < 3) {
                    grade = multiple;
                }
            }

            roundedGrades[i] = grade;
        }

        return roundedGrades;
    }

    public double getAverageGrade() {
        int[] roundedGrades = getRoundedGrades();
        int sum = 0;
        for (int grade : roundedGrades) {
            sum += grade;
        }
        return (double) sum / roundedGrades.length;
    }

    public int getMaxRoundedGrade() {
        int[] roundedGrades = getRoundedGrades();
        int max = roundedGrades[0];
        for (int grade : roundedGrades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }
}
