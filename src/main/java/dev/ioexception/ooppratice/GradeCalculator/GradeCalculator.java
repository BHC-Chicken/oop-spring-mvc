package dev.ioexception.ooppratice.GradeCalculator;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    public double calculateGrade() {
        double totalCompletedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return totalCompletedCreditAndCourseGrade / totalCompletedCredit;
    }
}
