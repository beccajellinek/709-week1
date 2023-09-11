class Time {
  public static void main(String[] args) {
    // These values shouldn't change
    int secondsPerMinute = 60;
    int minutesPerHour = 60;
    int hoursPerDay = 24;
    int secondsPerHour = secondsPerMinute * minutesPerHour;
    
    // Local time
    int hour = 20;
    int minute = 50;
    int second = 30;
    
    double secondsSinceMidnight = getSecondsSinceMidnight(hour, minute, second);
    
    System.out.println("Number of seconds since midnight: " + secondsSinceMidnight);

    // Seconds remaining until midnight
    // Split up into hours/minutes/seconds
    int hoursTillEndOfDay = hoursPerDay - hour;
    int minutesTillEndOfHour = minutesPerHour - minute;
    int secondsTillEndOfMinute = secondsPerMinute - second; 
    // Convert each to seconds;
    int hoursRemainingInSeconds = hoursTillEndOfDay * secondsPerHour;
    int minutesRemainingInSeconds = minutesTillEndOfHour * secondsPerMinute;
    int secondsRemainingInSeconds = secondsTillEndOfMinute + minutesRemainingInSeconds + hoursRemainingInSeconds;

    System.out.println("Number of seconds until midnight: " + secondsRemainingInSeconds);

    // How much of the day has passed?
    double secondsInDay = secondsPerHour * hoursPerDay;
    // Alternatively you could figure out the percentage using secondsRemaining
    double percentage = (secondsSinceMidnight / secondsInDay) * 100;
    System.out.println("Percentage of day that has passed: " + percentage);

    // How much time has passed since I started working on this exercise?
    double secondsCompleteExercise = getSecondsSinceMidnight(21, 12, 20);
    double elapsedTime = secondsCompleteExercise - secondsSinceMidnight;

    System.out.println("Elapsed time (in seconds) to work on exercise: "+ elapsedTime);
  }

  private static double getSecondsSinceMidnight(int hour, int minute, int second) {
    // These values shouldn't change
    int secondsPerMinute = 60;
    int minutesPerHour = 60;
    int secondsPerHour = secondsPerMinute * minutesPerHour;
    return (hour * secondsPerHour) + (minute * secondsPerMinute) + second;
  }
}