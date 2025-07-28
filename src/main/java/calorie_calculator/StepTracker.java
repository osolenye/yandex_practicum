package calorie_calculator;

import java.util.ArrayList;
import java.util.HashMap;

public class StepTracker {
    private HashMap<Integer, MonthData> monthToData = new  HashMap<>();

    public HashMap<Integer, MonthData> getMonthToData() {
        return monthToData;
    }

    public void setMonthToData(HashMap<Integer, MonthData> monthToData) {
        this.monthToData = monthToData;
    }
}
class MonthData {
    ArrayList<Day> days = new ArrayList<>();

    public ArrayList<Day> getDays() {
        return days;
    }

    public void setDays(ArrayList<Day> days) {
        this.days = days;
    }
}
class Day {
    private int stepCounter;
    private int stepGoal;

    public int getStepCounter() {
        return stepCounter;
    }

    public void setStepCounter(int stepCounter) {
        this.stepCounter = stepCounter;
    }

    public int getStepGoal() {
        return stepGoal;
    }

    public void setStepGoal(int stepGoal) {
        this.stepGoal = stepGoal;
    }
}