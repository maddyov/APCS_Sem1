import java.util.*;

public class StepTracker {

 private int stepmin;
 boolean isactive;
 private int DayC;
 private int TotalSteps;
 private int activeDays;
 private  int totaldays;
 public StepTracker(int hi){
    stepmin = hi;
    isactive = false;
    Dayc = 0;
    TotalSteps = 0;
    activeDays = 0;
 }
 //Methods 
 public void addDailySteps(int s){
  totalsteps += s;
  Dayc++;
 if (s >= stepmin){
  activeDays++
 }
  
 }
 public int activeDays(){
  return activeDays;
 }
 public int average(){
  TotalSteps/totaldays = avg
  return avg;
 }
 
}