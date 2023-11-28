import java.util.ArrayList;

public class LeapYear {

    private static Integer year;

    public static void main(String[] args) {
        int startYear = 2000;
        int endYear = 2025;
        ArrayList<Integer> leapYears = findLeapYearsInRange(startYear, endYear);
        System.out.println("Leap years between " + startYear + " and " + endYear + ": ");
        for (int leapYear : leapYears) {
            System.out.print(leapYear + " ");
        }
        System.out.println();
    }

    private static ArrayList<Integer> findLeapYearsInRange(int startYear, int endYear) {
        ArrayList<Integer> leapYears = new ArrayList<>();

        for (int year = startYear; year <= endYear; year++) {
            if (isLeapYear(year)) {
                leapYears.add(year);
            }
        }

        return leapYears;
    }


    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 != 00) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 4 != 0) {
            return false;

        }
        return false;

    }


}
