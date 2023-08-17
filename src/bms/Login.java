package bms;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JButton login, clear, signUp;
    JTextField cardInput;
    JPasswordField pinInput;
    Login(){
        setTitle("ATM"); // title of frame
        setSize(800, 480); // size of initial frame
        setVisible(true); // set visibilty to true
        setLocation(550, 300); // set location where the window will open
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(60, 10, 100, 100);
        setLayout(null);
        add(label);

        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardNo = new JLabel("Card No.");
        cardNo.setFont(new Font("Railway", Font.BOLD, 28));
        cardNo.setBounds(100, 150, 400, 30);
        add(cardNo);

        cardInput = new JTextField();
        cardInput.setBounds(300, 150, 230, 30);
        cardInput.setFont(new Font("Arial",Font.BOLD,14));
        add(cardInput);

        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Railway", Font.BOLD, 28));
        pin.setBounds(100, 220, 400, 30);
        add(pin);

        pinInput = new JPasswordField();
        pinInput.setBounds(300, 220, 230, 30);
        pinInput.setFont(new Font("Arial",Font.BOLD,14));
        add(pinInput);

        login = new JButton("Sign In");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("Clear");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signUp = new JButton("Sign Up");
        signUp.setBounds(300, 350, 230, 30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);
        add(signUp);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardInput.setText("");
            pinInput.setText("");
        }
        else if(ae.getSource()==login){

        }
        else if(ae.getSource()==signUp){

        }
    }
    public static void main(String[] args) throws Exception {
        new Login();
    }
}
