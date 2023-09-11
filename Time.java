class Time {
  public static void main(String[] args) {
    // These values shouldn't change
    final int SEC_PER_MIN = 60;
    final int MIN_PER_HOUR = 60;
    final int HOUR_PER_DAY = 24;
    final int SEC_PER_HOUR = SEC_PER_MIN * MIN_PER_HOUR;
    final double SEC_PER_DAY = SEC_PER_HOUR * HOUR_PER_DAY;

    // Declare variables, may change throughout the program execution
    int hour = 20;
    int minute = 50;
    int second = 30;
    
    double secondsSinceMidnight = 
        (hour * SEC_PER_HOUR) + 
        (minute * SEC_PER_MIN) + 
        second;
    
    System.out.println("Number of seconds since midnight: " + secondsSinceMidnight);

    // Seconds remaining until midnight
    // Split up into hours/minutes/seconds
    int hoursTillEndOfDay = HOUR_PER_DAY - hour;
    int minutesTillEndOfHour = MIN_PER_HOUR - minute;
    int secondsTillEndOfMinute = SEC_PER_MIN - second; 
    // Convert each to seconds;
    int hoursRemainingInSeconds = hoursTillEndOfDay * SEC_PER_HOUR;
    int minutesRemainingInSeconds = minutesTillEndOfHour * SEC_PER_MIN;
    int secondsRemainingInSeconds = secondsTillEndOfMinute + minutesRemainingInSeconds + hoursRemainingInSeconds;

    System.out.println("Number of seconds until midnight: " + secondsRemainingInSeconds);

    // How much of the day has passed?
    // Alternatively you could figure out the percentage using secondsRemaining
    double percentage = (secondsSinceMidnight / SEC_PER_DAY) * 100;
    System.out.printf("Percentage of day that has passed: %.2f", percentage);
    System.out.println("%");

    // How much time has passed since I started working on this exercise?
    hour = 21;
    minute = 12;
    second = 20;
    
    double secondsCompleteExercise =
      (hour * SEC_PER_HOUR) + 
      (minute * SEC_PER_MIN) + 
      second;
    
    double elapsedTime = secondsCompleteExercise - secondsSinceMidnight;

    System.out.println("Elapsed time (in seconds) to work on exercise: "+ elapsedTime);
  }
}