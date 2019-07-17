public class Time {
    public static void main(String[] args) {
        double hour = 21;
        double minute = 46;
        double second = 52;
        double secondsSinceMidnight = 21 * 3600 + 46 * 60 + 52;
        double secondsToMidnight = 2 * 3600 + 13 * 60 + 8;
        double percentDayPassed = secondsSinceMidnight / (24 * 3600) * 100;

        System.out.print("Seconds since midnight: " + secondsSinceMidnight + "\nSeconds until midnight: " + secondsToMidnight +
                        "\nPercent of day passed: " + percentDayPassed + "%\n");
        }
}
