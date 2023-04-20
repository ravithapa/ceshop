package project.project1.service;

import project.project1.model.ProgressData;

public class ProgressService {
    public ProgressData getProgressData(int studentId, int courseId){
        //retrieve data from the database here
        ProgressData progressData= new ProgressData();
        progressData.setProgressPercentage(calculateCourseCompletionPercentage(studentId, courseId));
        return progressData;
    }

    public void updateProgressData(Long studentId, Long courseId, Integer modulesCompleted, Integer lessonsCompleted){
        //update data to the database here
    }

    public float calculateCourseCompletionPercentage(int studentId, int courseId){
        int modulesCompleted = getModulesCompleted(studentId, courseId);
        int lessonsCompleted = getLessonsCompleted(studentId, courseId);

        int totalModules = getTotalModules(courseId);
        int totalLessons = getTotalLessons(courseId);

        float modulePercentage = (float) modulesCompleted/totalModules;
        float lessonPercentage = (float) lessonsCompleted/totalLessons;
        float coursePercentage = (modulePercentage + lessonPercentage) / 2 * 100;
        return  coursePercentage;

    }

    private int getTotalLessons(int courseId) {
        int totalLesson= 10;
        return totalLesson;
    }

    private int getTotalModules(int courseId) {
        int totalLModules= 2;
        return totalLModules;
    }

    private int getLessonsCompleted(int studentId, int courseId) {
        int totalLessonsCompleted= 5;
        return totalLessonsCompleted;
    }

    private int getModulesCompleted(int studentId, int courseId) {
        int modulesCompleted = 1;
        return modulesCompleted;
    }
}
