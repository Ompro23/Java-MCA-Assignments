import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class a5_1 extends JFrame implements ActionListener {

    JTextField t1, t2;
    JLabel result;
    JButton add, sub, mul, div, clear;

    public a5_1() {

        setTitle("Arithmetic Calculator");
        setSize(350,200);
        setLayout(new FlowLayout());

        t1 = new JTextField(10);
        t2 = new JTextField(10);

        add = new JButton("Add");
        sub = new JButton("Subtract");
        mul = new JButton("Multiply");
        div = new JButton("Divide");
        clear = new JButton("Clear");

        result = new JLabel("Result: ");

        add(t1);
        add(t2);

        add(add);
        add(sub);
        add(mul);
        add(div);
        add(clear);

        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {

            if(e.getSource()==clear){
                t1.setText("");
                t2.setText("");
                result.setText("Result: ");
                getContentPane().setBackground(Color.WHITE);
                return;
            }

            double n1 = Double.parseDouble(t1.getText());
            double n2 = Double.parseDouble(t2.getText());
            double res = 0;

            if(e.getSource()==add){
                res = n1 + n2;
                getContentPane().setBackground(Color.CYAN);
            }

            else if(e.getSource()==sub){
                res = n1 - n2;
                getContentPane().setBackground(Color.GREEN);
            }

            else if(e.getSource()==mul){
                res = n1 * n2;
                getContentPane().setBackground(Color.YELLOW);
            }

            else if(e.getSource()==div){
                res = n1 / n2;
                getContentPane().setBackground(Color.ORANGE);
            }

            result.setText("Result: " + res);

        }

        catch(Exception ex){
            JOptionPane.showMessageDialog(this,
                    "Please enter valid numbers!",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new a5_1();
    }
}