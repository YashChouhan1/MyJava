package GUI_design;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame {
    JPanel panel1;
    private JTextField result;
    private JTextField secondNo;
    private JTextField firstNo;
    private JButton clearButton;
    private JButton exitButton;
    private JButton add;
    private JButton divide;
    private JButton multiply;
    private JButton subtract;

    public gui() {
        exitButton.addActionListener(e -> System.exit(0));


        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, res;
                // We have to parse the text to a type float.
                num1 = Float.parseFloat(firstNo.getText());
                num2 = Float.parseFloat(secondNo.getText());
                // Now we can perform the addition.
                res = num1+num2;
                // We will now pass the value of result to jTextField3.
                // At the same time, we are going to
                // change the value of result from a float to a string.
                result.setText(String.valueOf(res));
            }
        });

        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, res;
                // We have to parse the text to a type float.
                num1 = Float.parseFloat(firstNo.getText());
                num2 = Float.parseFloat(secondNo.getText());
                // Now we can perform the addition.
                res = num1-num2;
                // We will now pass the value of result to jTextField3.
                // At the same time, we are going to
                // change the value of result from a float to a string.
                result.setText(String.valueOf(res));
            }
        });

        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, res;
                // We have to parse the text to a type float.
                num1 = Float.parseFloat(firstNo.getText());
                num2 = Float.parseFloat(secondNo.getText());
                // Now we can perform the addition.
                res = num1*num2;
                // We will now pass the value of result to jTextField3.
                // At the same time, we are going to
                // change the value of result from a float to a string.
                result.setText(String.valueOf(res));
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1, num2, res;
                // We have to parse the text to a type float.
                num1 = Float.parseFloat(firstNo.getText());
                num2 = Float.parseFloat(secondNo.getText());
                // Now we can perform the addition.
                res = num1/num2;
                // We will now pass the value of result to jTextField3.
                // At the same time, we are going to
                // change the value of result from a float to a string.
                result.setText(String.valueOf(res));
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNo.setText("");
                secondNo.setText("");
                result.setText("");
            }
        });
    }

    public static void main(String[] args) {
//        JFrame frame = new JFrame("createUIComponents");
//        frame.getContentPane();
//        frame.setDefaultCloseOperation();
        gui obj = new gui();
        obj.setContentPane(obj.panel1);
        obj.setSize(500,360);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }

