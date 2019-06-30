package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.print(secondChallenge.probablyIWillThrowException(1,1.5));
        } catch (Exception e) {
            System.out.println(e + " - method arguments outside of allowable range");
        } finally {
            System.out.println("exception handling test performed");
        }

    }

}
