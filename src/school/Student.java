package school;

import javax.security.auth.Subject;
import java.util.ArrayList;

public class Student {
    private int StudentId;
    private String StudentName;
    private Subject majorSubject;

    private ArrayList<Score> scoreList = new ArrayList<Score>();

    public Student(int studentId, String studentName, Subject majorSubject) {
        this.StudentId = studentId;
        this.StudentName = studentName;
        this.majorSubject = majorSubject;
    }

    public void addSubject(Score score) {
        scoreList.add(score);
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        this.StudentId = studentId;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }
}
