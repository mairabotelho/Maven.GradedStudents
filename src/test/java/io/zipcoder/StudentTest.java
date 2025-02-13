package io.zipcoder;


import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getStudentName(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 98.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getFirstName();
        String output2 = student.getLastName();

        // Then
        System.out.println(String.format("Student's name: %s %s", output, output2));
    }

    @Test
    public void getNumberOfExamsTakenTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 98.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        int output = student.getNumberOfExamsTaken();

        // Then
        System.out.println("Student took: " + output);
    }

    @Test
    public void getExamsScoresTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }

    @Test()
        public void addExamScoreTest(){
            // : Given
            String firstName = "Leon";
            String lastName = "Hunter";
            Double[] examScores = { };
            Student student = new Student(firstName, lastName, examScores);

            // When
            student.addExamScore(100.0);
            String output = student.getExamScores();

            // Then
            System.out.println(output);
        }

        @Test
        public void testSetExamScore(){
            // : Given
            String firstName = "Leon";
            String lastName = "Hunter";
            Double[] examScores = { 100.0 };
            Student student = new Student(firstName, lastName, examScores);

            // When
            student.setExamScore(1, 150.0);
            String output = student.getExamScores();

            // Then
            System.out.println(output);
        }

        @Test
        public void testAverageExamScore(){
            // : Given
            String firstName = "Leon";
            String lastName = "Hunter";
            Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
            Student student = new Student(firstName, lastName, examScores);

            // When
            double output = student.getAverageExamScore();

            // Then
            System.out.println(output);
        }

        @Test

        public void testToString(){
            // : Given
            String firstName = "Leon";
            String lastName = "Hunter";
            Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
            Student student = new Student(firstName, lastName, examScores);

            // When
            String output = student.toString();

            // Then
            System.out.println(output);
        }

}

