public class RecursiveMethods {

    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sum(n-1);
        }
    }

    public static int sumEven(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return 2*n + sumEven(n-1);
        }
    }

    public static String reverseString(String str) {
        if (str.length() == 0) {
            return "";
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        } else if (str.charAt(0) != str.charAt(str.length()-1)) {
            return false;
        } else {
            return isPalindrome(str.substring(1, str.length()-1));
        }
    }

    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumDigits(n/10);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        // Tests for sum of first n integer numbers
        assert(sum(0) == 0);
        assert(sum(1) == 1);
        assert(sum(5) == 15);
        assert(sum(10) == 55);

        // Tests for sum of first n EVEN integers
        assert(sumEven(0) == 0);
        assert(sumEven(1) == 2);
        assert(sumEven(5) == 30);
        assert(sumEven(10) == 110);

        // Tests for recursive string reverse
        assert(reverseString("").equals(""));
        assert(reverseString("a").equals("a"));
        assert(reverseString("hello").equals("olleh"));
        assert(reverseString("racecar").equals("racecar"));

        // Tests for recursive check
