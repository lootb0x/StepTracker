public class StepTracker{

    private int requiredsteps= 0;
    private int daysactive = 0;
    private int days = 0;
    private int steps = 0;


    public StepTracker(int r)
    {
        requiredsteps = r;
    }

    public void addDailySteps(int step)
    {
        days++;
        if(step >=requiredsteps) daysactive++;
        steps += step;
    }

    public int activeDays()
    {
        return daysactive;
    }

    public double averageSteps()
    {
        if(days>0) return steps /days;
        return 0.0;
    }






}