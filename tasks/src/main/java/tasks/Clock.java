package tasks;

public class Clock
{
  private int hour;
  private int minute;
  private int second;

  public int getHour()
  {
    return hour;
  }
  public int getMinute()
  {
    return minute;
  }
  public int getSecond()
  {
    return second;
  }

  public void setHour(int hour)
  {
    this.hour=(hour < 0 || hour >23)?0:hour;
  }
  public void setMinute(int minute)
  {
    this.minute=(minute < 0 || minute >59)?0:minute;
  }
  public void setSecond(int second)
  {
    this.second=(second < 0 || second >59)?0:second;
  }

  public void printAmericanTime()
  {
    if(hour<13)
    {
      System.out.printf("%02d:%02d:%02d AM\n", hour, minute, second);
    }else{
      System.out.printf("%02d:%02d:%02d PM\n", hour-12, minute, second);
    }
  }
  public void printStandartTime()
  {
    System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
  }
  public void tick()
  {
    second++;
    if(second>59){
      second=0;
      minute++;
    }if(minute>59){
      minute=0;
      hour++;
    }if(hour>23){
      hour=0;
    }
  }
}