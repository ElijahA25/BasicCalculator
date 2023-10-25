import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcGUI extends Calculator implements ActionListener {
    private double a;
    private double b;
    private int operation;
    private boolean isPositive = true;
    private JPanel numbers;
    private JPanel operations;
    private JFrame frame;
    private JLabel numScreen;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton zero;
    private JButton plus;
    private JButton minus;
    private JButton multiply;
    private JButton divide;
    private JButton exponent;
    private JButton equals;
    private JButton clear;
    private JButton point;
    private JButton posneg;
    private String numString = " ";

    public CalcGUI(){

        numScreen = new JLabel(numString);
        numScreen.setPreferredSize(new Dimension(300,20));
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");
        plus = new JButton("+");
        minus = new JButton("-");
        multiply = new JButton("x");
        divide = new JButton("÷");
        exponent = new JButton("^");
        equals = new JButton("=");
        clear = new JButton("CE");
        point = new JButton(".");
        numbers = new JPanel();
        operations = new JPanel();
        posneg = new JButton("(+/-)");
        frame = new JFrame("Calculator");



        numbers.setLayout(new GridLayout(4,3));
        operations.setLayout(new GridLayout(7,1));

        numbers.add(one);
        numbers.add(two);
        numbers.add(three);
        numbers.add(four);
        numbers.add(five);
        numbers.add(six);
        numbers.add(seven);
        numbers.add(eight);
        numbers.add(nine);
        numbers.add(point);
        numbers.add(zero);
        numbers.add(posneg);

        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        exponent.addActionListener(this);
        equals.addActionListener(this);
        clear.addActionListener(this);
        point.addActionListener(this);
        posneg.addActionListener(this);

        operations.add(clear);
        operations.add(plus);
        operations.add(minus);
        operations.add(multiply);
        operations.add(divide);
        operations.add(exponent);
        operations.add(equals);


        frame.add(numbers, (BorderLayout.CENTER));
        frame.add(operations, BorderLayout.EAST);
        frame.add(numScreen, BorderLayout.NORTH);
        frame.setVisible(true);
        frame.setSize(300,350);







    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object buttonClicked = e.getSource();
        if (buttonClicked == one){
            numString += "1";
            numScreen.setText(numString);

        }
        if (buttonClicked == two){
            numString += "2";
            numScreen.setText(numString);

        }
        if (buttonClicked == three){
            numString += "3";
            numScreen.setText(numString);

        }
        if (buttonClicked == four){
            numString += "4";
            numScreen.setText(numString);

        }
        if (buttonClicked == five){
            numString += "5";
            numScreen.setText(numString);

        }
        if (buttonClicked == six){
            numString += "6";
            numScreen.setText(numString);

        }
        if (buttonClicked == seven){
            numString += "7";
            numScreen.setText(numString);

        }
        if (buttonClicked == eight){
            numString += "8";
            numScreen.setText(numString);

        }
        if (buttonClicked == nine){
            numString += "9";
            numScreen.setText(numString);

        }
        if (buttonClicked == zero){
            numString += "0";
            numScreen.setText(numString);

        }
        if(buttonClicked == point){
            numString += ".";
            numScreen.setText(numString);
        }
        if(buttonClicked == plus){
            operation = 1;
            a = Double.parseDouble(numString);
            numString = "";
            numScreen.setText(numString);


        }
        if(buttonClicked == minus){
            operation = 2;
            a = Double.parseDouble(numString);
            numString = "";
            numScreen.setText(numString);


        }
        if(buttonClicked == multiply){
            operation = 3;
            a = Double.parseDouble(numString);
            numString = "";
            numScreen.setText(numString);


        }
        if(buttonClicked == divide){
            operation = 4;
            a = Double.parseDouble(numString);
            numString = "";
            numScreen.setText(numString);


        }
        if(buttonClicked == exponent){
            a = Double.parseDouble(numString);
            numString = "";
            numScreen.setText(numString);
            operation = 5;

        }
        if (buttonClicked == equals){
            if (operation == 1){
                numScreen.setText(Double.toString(add(a,Double.parseDouble(numString))));
                numString = numScreen.getText();


            }
            if(operation == 2){
               numScreen.setText(Double.toString(subtract(a, Double.parseDouble(numString))));
                numString = numScreen.getText();

            }
            if(operation == 3){
                numScreen.setText(Double.toString(multiply(a, Double.parseDouble(numString))));
                numString = numScreen.getText();


            }
            if(operation == 4){
                numScreen.setText( Double.toString(divide(a, Double.parseDouble(numString))));
                numString = numScreen.getText();



            }
            if(operation == 5){
                numScreen.setText(Double.toString(exponent(a, Integer.parseInt(numString))));
                numString = numScreen.getText();


            }

        }
        if(buttonClicked == posneg){
            if(isPositive){
                System.out.println("Positive");
                numString = "-"+numString;
                numScreen.setText(numString);
                isPositive = false;


            }

            else if(!isPositive) {
                System.out.println("Negative");
                numString = numString.substring(1);
                numScreen.setText(numString);
                isPositive = true;
                System.out.println(isPositive);
            }

        }
        if(buttonClicked == clear){
            numString= "";
            numScreen.setText(numString);

        }



    }
}
