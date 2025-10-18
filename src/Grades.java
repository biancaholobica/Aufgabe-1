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


}
