package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	public int indexOf(int ascii, int from)
	The indexOf(int ascii, int from) method receives an ascii character value and a value in the String where the search will start.
	 then it returns the index value at which the character is found in the string. the method only returns the first index value at which the
	 character is present in the specified section of the String. The  second parameter specifies index the value where the search will begin,
	  and the search always moves from right to left in the string, or in other words the index value that the search checks will always increase.
	  If the search is unsuccessful, the method returns a value of -1.
	 */
        String java="Welcome student of PVSD";
        // the ascii value of 'e' is 101
        int s=0;
        while(s>=0) {
            int j = java.indexOf(101, s+1);
            s = j;
            if (j > -1)
                System.out.println(j);
        }
    }
}
