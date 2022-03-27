package src;

import javax.swing.*;
import java.awt.*;

public class RunGUI extends JFrame
{

    private JLabel enter1 = new JLabel("Введите скорость в км/ч");
    private JLabel enter2 = new JLabel(" с точностью до целых,");
    private JLabel enter3 = new JLabel("в мин/км с точностью до десятых");

    public JTextField input = new JTextField("", 1);

    public JLabel outer = new JLabel();


    public RunGUI()
    {
        super("RunCalculator");
        this.setBounds(0, 0 , 260,140);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5,2,10,1));

        container.add(enter1);
        container.add(enter2);
        container.add(enter3);

        container.add(input);

        container.add(outer);

    }
}
