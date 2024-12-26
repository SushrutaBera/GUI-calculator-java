import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Calculator
{
    private JFrame frame= new JFrame("GUI Calculator -v.1.0");
    private JTextArea txtScreen = new JTextArea();
    private JTextArea outputScreen = new JTextArea();


    private JButton button1 = new JButton("0");
    private JButton button2 = new JButton("1");
    private JButton button3 = new JButton("2");
    private JButton button4 = new JButton("3");
    private JButton button5 = new JButton("4");
    private JButton button6 = new JButton("5");
    private JButton button7 = new JButton("6");
    private JButton button8 = new JButton("7");
    private JButton button9 = new JButton("8");
    private JButton button10 = new JButton("9");

    private JButton divideButton = new JButton("/");
    private JButton multiplyButton = new JButton("*");
    private JButton addButton = new JButton("+");
    private JButton subButton = new JButton("-");
    private JButton powerButton = new JButton("**");
    private JButton rootButton = new JButton("sqrt");
    private JButton clearButton = new JButton("clr");
    private JButton paranthesisButton_left = new JButton("(");
    private JButton paranthesisButton_right = new JButton(")");
    private JButton back = new JButton("<-");

    private JButton equals = new JButton("=");
    
    public Calculator()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 550);
        frame.setResizable(true);
        frame.setLayout(null);
        Color customBlue = new Color(133, 220, 186);
        Color customGrey = new Color(233, 232,232);
        frame.getContentPane().setBackground(customBlue);

        txtScreen.setSize(380, 50);
        txtScreen.setLocation(7, 5);
        outputScreen.setSize(380, 50);
        outputScreen.setLocation(7, 60);

        equals.setSize(100, 50);
        equals.setLocation(270, 450);
        equals.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try{
                    double x = Evaluation.eval(txtScreen.getText());
                    if(x == (1.0/0.0) || x == (-1.0/0.0) || x == (0.0/0.0))
                    {
                        System.out.println("Division by 0 not allowed");
                        outputScreen.setText("Division by 0 is not allowed");
                    }
                    else
                    {
                        outputScreen.setText(Double.toString(x));
                        System.out.println(x);
                    }
                }
                catch(Exception e1){
                    outputScreen.setText("Invalid Input....");
                    outputScreen.append("\n"+e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });

        createButtons();
        createActionListeners();
        addObjectsToScreen();

        frame.setVisible(true);

    }

    private void addObjectsToScreen()
    {
        frame.add(txtScreen);
        frame.add(outputScreen);
        frame.add(clearButton);
        frame.add(equals);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        frame.add(divideButton);
        frame.add(multiplyButton);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(powerButton);
        frame.add(rootButton);
        frame.add(paranthesisButton_left);
        frame.add(paranthesisButton_right);
        frame.add(back);
    }

    private void createButtons()
    {
        button1.setSize(100,50);
        button1.setLocation(169, 299);

        button2.setSize(100, 50);
        button2.setLocation(169, 450);

        button3.setSize(100, 50);
        button3.setLocation(69,450);

        button4.setSize(100, 50);
        button4.setLocation(270, 399);

        button5.setSize(100,50);
        button5.setLocation(169, 399);

        button6.setSize(100, 50);
        button6.setLocation(69, 399);

        button7.setSize(100, 50);
        button7.setLocation(270, 349);

        button8.setSize(100, 50);
        button8.setLocation(169, 349);

        button9.setSize(100, 50);
        button9.setLocation(69, 349);

        button10.setSize(100, 50);
        button10.setLocation(270, 299);
        
        clearButton.setSize(100, 50);
        clearButton.setLocation(69, 299);

        divideButton.setSize(100, 50);
        divideButton.setLocation(270, 220);

        multiplyButton.setSize(100, 50);
        multiplyButton.setLocation(169, 220);

        addButton.setSize(100, 50);
        addButton.setLocation(69, 220);

        subButton.setSize(100, 50);
        subButton.setLocation(270, 170);

        powerButton.setSize(100, 50);
        powerButton.setLocation(169, 170);

        rootButton.setSize(100, 50);
        rootButton.setLocation(69, 170);

        paranthesisButton_left.setSize(100, 50);
        paranthesisButton_left.setLocation(9, 170);

        paranthesisButton_right.setSize(100, 50);
        paranthesisButton_right.setLocation(9, 220);

        back.setSize(100, 50);
        back.setLocation(9, 300);

        equals.setSize(100, 50);
        equals.setLocation(270, 450);
    }
    private void createActionListeners()
    {
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("9");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("8");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("7");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("6");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("5");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("4");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("3");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("2");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("1");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("0");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("/");
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("*");
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("+");
            }
        });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("-");
            }
        });
        powerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("^");
            }
        });
        rootButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("sqrt(");
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String t = txtScreen.getText();
                t = t.substring(0, 0);
                txtScreen.setText(t);
            }
        });
        paranthesisButton_left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append("(clr)");
            }
        });
        paranthesisButton_right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                txtScreen.append(")");
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(txtScreen.getText().length() != 0)
                {
                    String text = txtScreen.getText().substring(0, txtScreen.getText().length() - 1);
                    txtScreen.setText(text);
                }
                else{
                    outputScreen.setText("Nothing to remove!! Bitch off!");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Calculator();
    }
}