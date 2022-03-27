package src;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        RunGUI runGUI = new RunGUI();
        runGUI.setVisible(true);


        while(true)
        {

            String a = runGUI.input.getText();

            if ( a.contains(".") && !a.endsWith("."))  //for double
            {
                try//for double
                {
                    Double inputDouble = Double.parseDouble(a);

                    if (inputDouble > 0 && inputDouble < 100)
                    {
                        RunCalc run = new RunCalc();
                        String b = run.RunCalc(inputDouble);
                        //System.out.println(b);
                        runGUI.outer.setText("Ваша скорость: " + b);
                    }
                    else
                    {
                        runGUI.outer.setText("Вы не черепашка и не ниндзя!");
                    }
                }//закрывает блок try
                catch(NumberFormatException e)
                {
                    if (a.isEmpty())
                    {
                        runGUI.outer.setText("Введите значение");
                    }
                    else
                    {
                        runGUI.outer.setText("Введите корректное значение");
                    }

                }//закрывает блок catch
            }//закрывает блок for double

            else//for Integer
            {
                try
                {
                    Integer inputInt = Integer.parseInt(a);

                    if (inputInt > 0 && inputInt < 100)
                    {
                        RunCalc run = new RunCalc();
                        String b = run.RunCalc(inputInt);
                        //System.out.println(b);
                        runGUI.outer.setText("Ваша скорость: " + b);
                    }
                    else
                    {
                        runGUI.outer.setText("Вы не черепашка и не ниндзя!");
                    }
                }
                catch(NumberFormatException e)
                {
                    if(a.isEmpty())
                    {
                        runGUI.outer.setText("Введите значение");
                    }
                    else
                    {
                        runGUI.outer.setText("Введите корректное значение");
                    }

                }
            }//закрывает блок for Integer


        }


    }
}
