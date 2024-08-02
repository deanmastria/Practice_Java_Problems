package org.example;

public class WarmUp_1 {


//SLEEPIN

    //To return true if two conditions are met, Not a weekday OR Vacation
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;

    }

// MONKEYTROUBLE

    //Returns true if both monkeys are smiling OR both are not.
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

//SUMDOUBLE

    /* if else statement to check if int a = int b, if so, sum of a + b multiplied by two is returned
    if else, then a + b is returned */
    public int sumDouble(int a, int b) {
        if (a ==b) {
            return (a + b) * 2;
        } else {
            return a+ b;
        }






    }

