import java.util.ArrayList;
import java.util.List;

public class Grades {
    private List<Integer> grades = new ArrayList<>();

    public Grades(List<Integer> inputGrades) {
        grades = inputGrades;
    }

    public List<Integer> getFailingGrades() {
        List<Integer> failingGrades =  new ArrayList<>();
        for (int grade : grades) {
            if (grade < 40){
                failingGrades.add(grade);
            }
        }
        return failingGrades;
    }

    public List<Integer> getRoundedGrades() {
        List<Integer> roundedGrades =  new ArrayList<>();
        for (int grade : grades) {
            if (grade >= 38) {
                int multiple = ((grade / 5) + 1) * 5; //urmatorul multiplu de 5
                if (multiple - grade < 3) {
                    grade = multiple;
                }
            }
            roundedGrades.add(grade);
        }
        return roundedGrades;
    }
}
