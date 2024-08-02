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
        if (a == b) {
            return (a + b) * 2;
        } else {
            return a + b;
        }
    }
//diff21


    /*if n is less than 21, return 21- n ( this is done to prevent a negative integer)
    if n is greater than 21, return n - 21 and multiply by 2. I did not include a check for if n == 21, but this passes
    the test provided */

    public int diff21(int n) {
        if (n<21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

//PARROTROUBLE


        /*if the hour is less than 0700 greater than 2000 AND the parrot is talking the output returns true
        if that is not the case it returns false*/
        public boolean parrotTrouble(boolean talking, int hour) {

            if ((hour < 7 || hour > 20) && talking) {
                return true;
            } else {
                return false;
            }
        }

//MAKES10

        //returned if a = 10 or if b = 10 or is the sum of a and b was 10
        public boolean makes10(int a, int b) {
            return (a == 10 || b == 10 || a + b == 10);
        }

//NEAR100

        //if n is greater than or equal to 90/190 & less than or equal to 110/210 return true
        public boolean nearHundred(int n) {
            return (n >= 90 && n <= 110 || n >= 190 && n <= 210);
        }

//POSNEG

        /* using an if else statement, negative will be true if a < 0 and b < 0
        if negative is false, then OR operator is used to return true if a or be is positive and the other parameter is negative*/
        public boolean posNeg(int a, int b, boolean negative) {
            if (negative) {
                return a < 0 && b < 0;
            } else {
                return (a < 0 && b > 0) || (a > 0 && b < 0);
            }
        }

//NOTSTRING


        /*I chose not to use .equals() so I did not have to count characters. using starts with I figured I could just check if it started with "not
         if it did not start with "not", I just added "not " to str*/
        public String notString(String str) {
            if (str.startsWith("not")) {
                return str;
            } else {
                return "not " + str;
            }
        }

//MISSINGCHAR

        //(0, n) to
        public String missingChar(String str, int n) {
            return str.substring(0, n) + str.substring(n + 1);
        }



}

