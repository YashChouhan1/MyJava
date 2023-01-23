package GUI_design;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberAdditionUI extends JFrame {

    private JButton exitButton;
    private JButton addButton;
    private JButton clearButton;
    private JTextField result;
    private JTextField secondNo;
    private JTextField firstNo;
    private JPanel panel;

    public NumberAdditionUI() {

        exitButton.addActionListener(e -> System.exit(0));   // exit button code


        addButton.addActionListener(new ActionListener() {
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


        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNo.setText("");
                secondNo.setText("");
                result.setText("");
            }
        });
    }

//    private void createUIComponents() {
//        private void jButtonexitButtonActionPerformed(java.awt.event.ActionEvent evt) {
//            //TODO add your handling code here:
//        }
//        private void exitButtonActionPerformed(ActionListener) {
//            System.exit(0);
//        }// TODO: place custom component creation code here
 //   }


    public static void main(String[] args) {
        NumberAdditionUI obj = new NumberAdditionUI();
        obj.setContentPane(obj.panel);
        obj.setSize(450,300);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
