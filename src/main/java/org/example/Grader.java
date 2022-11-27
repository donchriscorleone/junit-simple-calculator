package org.example;

public class Grader {

    public char determineLetterGrade(int grade) {
        if (grade < 0)
            throw new IllegalArgumentException("Grade must be greater than 0");
        else if (grade < 60)
            return 'F';
        else if (grade < 70)
            return 'D';
        else if (grade < 80)
            return 'C';
        else if (grade < 90)
            return 'B';
        else
            return 'A';
    }
}
