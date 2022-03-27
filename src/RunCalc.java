package src;

import java.text.DecimalFormat;

public class RunCalc
{
    DecimalFormat df = new DecimalFormat("##.###");

    public String RunCalc(double speed)
    {
        double result = (60/speed);
        String resultForm = df.format(result);
        String resultVisibl = resultForm + " км/ч";

        return resultVisibl;


    }

    public String RunCalc(int speed)
    {
        double sp = speed;

        double result = (60/sp);
        String resultForm = df.format(result);
        String resultVisibl = resultForm + " мин/км";

        return resultVisibl;
    }
}
