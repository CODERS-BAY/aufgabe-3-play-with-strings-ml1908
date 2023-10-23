package application;

import java.util.Arrays;

public class PlayWithStrings {
    public static void main(String[] args) {
        System.out.println("Hello String World");



        String firstName = "Stefan";
        String lastName = "Koller";

        printIntitials(firstName, lastName);

/////////////////////////////////////////////////////////////////////

        String value1 = "Bier";
        String value2 = "Bre i";
        boolean areAnagramsResult = areAnagrams(value1, value2);

        if (areAnagramsResult) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

/////////////////////////////////////////////////////////////////////

        String testString = "Mike";
        boolean isPalindromic = isPalindrome(testString);

        if (isPalindromic) {
            System.out.println("Der String ist ein Palindrom.");
        } else {
            System.out.println("Der String ist kein Palindrom.");
        }

    }


    /**
     * TODO: print initials
     * <p>
     * This method should print out the initials of a name to standard out.
     *
     * @param firstname
     * @param lastname
     */

    public static void printIntitials(String firstName, String lastName) {

        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);
        System.out.println("Initial: " + firstInitial + lastInitial);
    }



    /**
     * TODO: check for anagrams
     * <p>
     * This method should determine if two strings are anagrams or not An anagram is
     * a word or a phrase made by transposing the letters of another word or phrase.
     * For example, "parliament" is an anagram of "partial men," and "software" is
     * an anagram of "swear oft." The program should ignore white space and
     * punctuation.
     *
     * @param value1
     * @param value2
     * @return true if the values are anagrams, false otherwise.
     */





        public static boolean areAnagrams(String value1, String value2) {

            String cleanValue1 = value1.replaceAll("[^a-zA-Z]", "").toLowerCase();
            String cleanValue2 = value2.replaceAll("[^a-zA-Z]", "").toLowerCase();


            if (cleanValue1.length() != cleanValue2.length()) {
                return false;
            }


            char[] charArray1 = cleanValue1.toCharArray();
            char[] charArray2 = cleanValue2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);


            return Arrays.equals(charArray1, charArray2);
        }



    /**
     * TODO: palindrone checker
     * <p>
     * This method should find out if a string value is a palindrome or not. A
     * palindrome is a sequence of characters (can also be a number) which reads the
     * same backwards as forwards. Some palindromes are: Anna; wow; Eva can I see
     * bees in a cave?
     * <p>
     * Upper or lower case should not matter, but keep the white spaces, tabs and
     * punctuation in mind.
     *
     * @param value
     * @return true if it is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String value) {
        value = value.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        String reversed = new StringBuilder(value).reverse().toString();


        return value.equals(reversed);
    }
    }
