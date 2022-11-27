package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    Grader grader = new Grader();

    @Test
    void fiftyNineShouldReturnF() {
        assertEquals('F', this.grader.determineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD() {
        assertEquals('D', this.grader.determineLetterGrade(69));
    }

    @Test
    void seventyNineShouldReturnC() {
        assertEquals('C', this.grader.determineLetterGrade(79));
    }

    @Test
    void eightyNineShouldReturnB() {
        assertEquals('B', this.grader.determineLetterGrade(89));
    }

    @Test
    void ninetyNineShouldReturnA() {
        assertEquals('A', this.grader.determineLetterGrade(99));
    }

    @Test
    void ninetyShouldReturnA() {
        assertEquals('A', this.grader.determineLetterGrade(90));
    }
    @Test
    void eightyShouldReturnB() {
        assertEquals('B', this.grader.determineLetterGrade(80));
    }

    @Test
    void seventyShouldReturnC() {
        assertEquals('C', this.grader.determineLetterGrade(70));
    }

    @Test
    void sixtyShouldReturnD() {
        assertEquals('D', this.grader.determineLetterGrade(60));
    }

    @Test
    void zeroShouldReturnF() {
        assertEquals('F', this.grader.determineLetterGrade(0));
    }
}