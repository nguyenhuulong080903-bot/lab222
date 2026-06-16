package utils;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Utility class for input validation.
 */
public class Validation {
    private static final Scanner in = new Scanner(System.in);
    private static final String PHONE_VALID = "^\\d{10,}$";
    private static final String EMAIL_VALID = "^[A-Za-z0-9.+-_%]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";

    /**
     * Get and validate integer input within a range.
     * @param msg Prompt message
     * @param min Minimum valid value
     * @param max Maximum valid value
     * @return Valid integer
     */
    public static int checkInputIntLimit(String msg, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range [" + min + ", " + max + "]");
            }
        }
    }

    /**
     * Get and validate non-empty string input.
     * @param msg Prompt message
     * @return Valid non-empty string
     */
    public static String checkInputString(String msg) {
        while (true) {
            System.out.print(msg);
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    /**
     * Get and validate Yes/No input.
     * @param msg Prompt message
     * @return true if Yes, false if No
     */
    public static boolean checkInputYN(String msg) {
        while (true) {
            String result = checkInputString(msg);
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
        }
    }

    /**
     * Get and validate phone number.
     * @param msg Prompt message
     * @return Valid phone number string
     */
    public static String checkInputPhone(String msg) {
        while (true) {
            String result = checkInputString(msg);
            if (result.matches(PHONE_VALID)) {
                return result;
            } else {
                System.err.println("Phone must be number with minimum 10 characters.");
            }
        }
    }

    /**
     * Get and validate email.
     * @param msg Prompt message
     * @return Valid email string
     */
    public static String checkInputEmail(String msg) {
        while (true) {
            String result = checkInputString(msg);
            if (result.matches(EMAIL_VALID)) {
                return result;
            } else {
                System.err.println("Email must be in format <account name>@<domain>");
            }
        }
    }

    /**
     * Get and validate year of experience.
     * @param msg Prompt message
     * @return Valid years of experience
     */
    public static int checkInputExp(String msg) {
        return checkInputIntLimit(msg, 0, 100);
    }

    /**
     * Get and validate date of birth.
     * @param msg Prompt message
     * @return Valid year of birth
     */
    public static int checkInputBirthDate(String msg) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return checkInputIntLimit(msg, 1900, currentYear);
    }

    /**
     * Get and validate graduation rank.
     * @param msg Prompt message
     * @return Valid rank string
     */
    public static String checkInputGraduationRank(String msg) {
        while (true) {
            String result = checkInputString(msg);
            if (result.equalsIgnoreCase("Excellence")
                    || result.equalsIgnoreCase("Good")
                    || result.equalsIgnoreCase("Fair")
                    || result.equalsIgnoreCase("Poor")) {
                return result;
            } else {
                System.err.println("Please input string: Excellence, Good, Fair, Poor");
            }
        }
    }
}
