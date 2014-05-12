
public class Time{
public static void main(String[] args){

    int hour, minute, second;
  hour = 19;
  minute = 60;
  second = 30;
  System.out.print("Number of seconds since midnight: ");
  System.out.println((hour*60*60) + (minute*60) + second);
  System.out.print("Percentage of the day that has passed: ");
  System.out.println((hour*60*60 + minute*60 +second)*100/(24*60*60));
}
}
