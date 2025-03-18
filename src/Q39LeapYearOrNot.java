public class Q39LeapYearOrNot {
    public static boolean isLeapYear(int year){
        if (String.valueOf(year).length() != 4) throw new RuntimeException("Invalid Year value");

        boolean leapYear = false;

        if (year % 4 == 0){
            leapYear = true;

            if (year % 100 == 0){
                if (year % 400 == 0)
                    leapYear = true;
                else
                    leapYear = false;
            }

        }
        return leapYear;
    }
}
