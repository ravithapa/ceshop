package project.project1.model;

public class ProgressData {

    private int studentId;
    private int courseId;
    private int modulesCompleted;
    private int lessonsCompleted;
    private float progressPercentage;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getModulesCompleted() {
        return modulesCompleted;
    }

    public void setModulesCompleted(int modulesCompleted) {
        this.modulesCompleted = modulesCompleted;
    }

    public int getLessonsCompleted() {
        return lessonsCompleted;
    }

    public void setLessonsCompleted(int lessonsCompleted) {
        this.lessonsCompleted = lessonsCompleted;
    }

    public float getProgressPercentage() {
        return progressPercentage;
    }

    public void setProgressPercentage(float progressPercentage) {
        this.progressPercentage = progressPercentage;
    }
}
