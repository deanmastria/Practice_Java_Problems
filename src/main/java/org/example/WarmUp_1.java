package org.example;

import javax.swing.*;

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

    public int sumDouble(int a, int b) {
        if (a == b) { //check if int a = int b
            return (a + b) * 2; //if so, sum of a + b multiplied by two is returned
        } else {
            return a + b; //otherwise a + b is returned
        }
    }




//diff21

    //I did not include a check for if n == 21, but this passes the check provided
    public int diff21(int n) {
        if (n<21) { //if n is less than 21, return 21- n ( this is done to prevent a negative integer)
            return 21 - n;
        } else {
            return (n - 21) * 2;  // if n is greater than 21, return n - 21 and multiply by 2
        }
    }



//PARROTROUBLE

        public boolean parrotTrouble(boolean talking, int hour) {

            if ((hour < 7 || hour > 20) && talking) { // checks if the hour is less than 0700 greater than 2000 AND the parrot is talking
                return true; //if thats the case return true
            } else {
                return false; //otherwise return false
            }
        }


//MAKES10

        //returned true if a = 10 OR if b = 10 OR is the sum of a and b was 10
        public boolean makes10(int a, int b) {
            return (a == 10 || b == 10 || a + b == 10);
        }


//NEAR100

        //if n is greater than or equal to 90/190 & less than or equal to 110/210 return true
        public boolean nearHundred(int n) {
            return (n >= 90 && n <= 110 || n >= 190 && n <= 210);
        }



//POSNEG

        public boolean posNeg(int a, int b, boolean negative) {
            if (negative) { //using an if else statement, negative will be true if a < 0 and b < 0
                return a < 0 && b < 0;
            } else {
                return (a < 0 && b > 0) || (a > 0 && b < 0); //if negative is false, OR operator is used to return true if a or b is positive and the other is negative
            }
        }



//NOTSTRING

        public String notString(String str) {
            if (str.startsWith("not")) { //checks if the string starts with "not"
                return str; // if it does it just returns it
            } else {
                return "not " + str; //otherwise, it adds " not " to the front of the string
            }
        }



//MISSINGCHAR

        /* since the n parameter is used to specify the index I want to remove from the string, (0, n) takes everything before n,
        n + 1 extracts the part of the substring starting from the character after index n to the end of the string and I returned it to add those two parts together */
        public String missingChar(String str, int n) {
            return str.substring(0, n) + str.substring(n + 1);
        }




//FRONTBACK

             public String frontBack(String str) {
            int length = str.length(); // to get the length of the string

            if (length <= 1) { // if the string is emppty or has only one character, return it as is
                return str;
            }

            char firstChar = str.charAt(0); //extract the first character
            char lastChar = str.charAt(length - 1); //extract the last character
            String middlePart = str.substring(1, length -1); // extract the middle part of the string

            return lastChar + middlePart + firstChar; //combine in the order requested

        }



//FRONT3

    //
    public String front3(String str) {
        int length = str.length(); //used to find out and store the number of characters in the string "str"

        String front; //here i created a front variable to hold front part of the string

        if (length < 3) { //if the string length is less than 3
            front = str; //uses the entire string as front
        } else {
            front = str.substring(0,3); // otherwise just uses the first 3 characters
        }

        return front+ front + front; // returns a string with 3 copies of the front part

    }




//BACKAROUND

    //
    public String backAround(String str) {
        int length = str.length(); //finds out the stringlength and stores

        char lastChar = str.charAt (str.length() - 1); //extracts the last char in the string


        return lastChar + str + lastChar; //returns a string with the last char, the string and the last char

    }




//OR35

    //
    public boolean or35(int n) {

        return (n % 3 == 0) || (n % 5 == 0); //returns true is ne is divisible by 3 Or if n is divisible by 5




    }



//FRONT22

    public String front22(String str) {
        int length = str.length(); //get the length of the string

        String front; // declared a variable to hold the front part of the string
        if (length < 2) { //if the length is less than 2, the front part becomes whatever the string is
            front = str;
        } else {
            front = str.substring(0,2); //otherwise the front part is the first 2 char of the string
        }

        return front + str + front; //returns what was requested
    }




//STARTHI

    public boolean startHi(String str) {

        return str.startsWith("hi"); //the instructions wanted it to return true if the string started with hi so i just used startsWith
    }




//ICYHOT

    //
    public boolean icyHot(int temp1, int temp2) {
        // return true if parameter temp1 was less than 0 and temp 2 was greater than 100. i used the or operator to work vice versa
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);

    }




//IN1020

    //
    public boolean in1020(int a, int b) {
            //used the OR AND operators returning true if a is greater or equal to 10 and less or equal to 20 OR b a is greater or equal to 10 and less or equal to 20
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }




//HASTEEN

    //
    public boolean hasTeen(int a, int b, int c) {
            //same reasoning as above, used the AND OR operators to return true if a one of the conditions were true for the parameters
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }




//LONETEEN

    public boolean loneTeen(int a, int b) {

            // boolean variable aIsTeen and bIsTeen so I could return true if only One was a teen.
        // In the case below, (true, true)/(false, false) returns false (true, false)/(false, true) returns true
        boolean aIsTeen = (a >= 13 && a <= 19);
        boolean bIsTeen = (b >= 13 && b <= 19);

        return (aIsTeen && !bIsTeen) || (!aIsTeen && bIsTeen);
    }





//DELDEL

    //
    public String delDel(String str) {

        if (str.length() >= 4 && str.substring(1, 4).equals("del")) { //checks to see if the string is long enough to contain del at index 1

            return str.substring(0, 1) + str.substring(4); //if del is found, returns the strig with del removed

        } else {

            return str; //otherwise it just returns the original string
        }
    }




//MIXSTART

    public boolean mixStart(String str) {

        if (str.length() <3) { //the string must contain at least 3 cahracters, this disqulaifies anything with less
            return false;
        }
        String subStr = str.substring(1, 3); //gets the substring from indexes 1 and 2 as index 0 can be anything

        return subStr.equals("ix"); // returns true if those indexes contain "ix"
    }



//STARTOZ

    public String startOz(String str) {
        String result = ""; //result variable, initializes an empty string


        if (str.length() >= 1) {  //check if the string length is at least 1

            if (str.charAt(0) == 'o') { //includes the first character if it is 'o'
                result += 'o';
            }
        }


        if (str.length() >= 2) {    //check if the string length is at least 2

            if (str.charAt(1) == 'z') { //includes the second character if it is 'z'
                result += 'z';
            }
        }

        return result;
    }



//INTMAX

    public int intMax(int a, int b, int c) {
        int largest = a; //sets and assumes this parameter as the largest

        if (b > largest) { // checks to see if be is larger than largest (a)
            largest = b; //if so, b is updated to the largest
        }

        if (c > largest) { //check to see if c is larger than largest/new largest
            largest = c; //if so, c is updated to the largest
        }

        return largest;
    }


//CLOSE10

    public int close10(int a, int b) {


        int differenceA = Math.abs(a- 10);//gets the absolute difference between a and 10
        int differenceB = Math.abs(b- 10);// same as above for b

        if (differenceA < differenceB) { //if the difference of a-10 is smaller and b-10
            return a; //returns that a is nearest to the value of 10
        } else if (differenceA > differenceB) { //if the difference of a- 10 is larger tha b-10
            return b;// returns b is nearest tp the value of 10
        } else { // if there is no difference then return 0
            return 0;
        }
    }


}

