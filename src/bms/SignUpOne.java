package bms;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

public class SignUpOne extends JFrame implements ActionListener{

    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }


    long random;
    JTextField nameTextField,fnameTextField,eMailTextField,addressTextField,cityTextField,stateTextField,pinCodeTextField;
    JButton next;
    JDateChooser dateChooser;
    JRadioButton maleButton,femaleButton,otherButton,marriedButton,unmarriedButton;
    SignUpOne(){ 
        setTitle("New Account Application Form - Page: 1");
        Random rn = new Random();
        long random = Math.abs((rn.nextLong()%9000L) + 1000L);
        JLabel formNo = new JLabel("Application Form No. "+ random);
        formNo.setFont(new Font("Railway",Font.BOLD,38));
        formNo.setBounds(140,20,600,40);
        add(formNo);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

        JLabel PersonalDet = new JLabel("Page 1: Personal Details");
        PersonalDet.setFont(new Font("Railway",Font.BOLD,22));
        PersonalDet.setBounds(290,80,400,30);
        add(PersonalDet);

        JLabel name = new JLabel("Name*:");
        name.setFont(new Font("Railway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Railway", Font.BOLD,20));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);

        JLabel fName = new JLabel("Father's Name*:");
        fName.setFont(new Font("Railway",Font.BOLD,20));
        fName.setBounds(100,190,200,30);
        add(fName);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Railway", Font.BOLD,20));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);

        JLabel DOB = new JLabel("Date of Birth*: ");
        DOB.setFont(new Font("Railway",Font.BOLD,20));
        DOB.setBounds(100,240,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        add(dateChooser);

        JLabel Gender = new JLabel("Gender*");
        Gender.setFont(new Font("Railway",Font.BOLD,20));
        Gender.setBounds(100,290,200,30);
        add(Gender);

        maleButton = new JRadioButton("Male");
        maleButton.setBounds(300,290,60,30);
        maleButton.setBackground(Color.white);
        add(maleButton);

        femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(450,290,120,30);
        femaleButton.setBackground(Color.white);
        add(femaleButton);

        otherButton = new JRadioButton("Others");
        otherButton.setBounds(600,290,120,30);
        otherButton.setBackground(Color.white);
        add(otherButton);

        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleButton);
        genderButtonGroup.add(femaleButton);

        JLabel eMail = new JLabel("E-Mail Address*: ");
        eMail.setFont(new Font("Railway",Font.BOLD,20));
        eMail.setBounds(100,340,200,30);
        add(eMail);

        eMailTextField = new JTextField();
        eMailTextField.setFont(new Font("Railway", Font.BOLD,18));
        eMailTextField.setBounds(300,340,400,30);
        add(eMailTextField);

        JLabel marital = new JLabel("Marital Status*: ");
        marital.setFont(new Font("Railway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        marriedButton = new JRadioButton("Married");
        marriedButton.setBounds(300,390,120,30);
        marriedButton.setBackground(Color.white);
        add(marriedButton);

        unmarriedButton = new JRadioButton("Unmarried");
        unmarriedButton.setBounds(450,390,120,30);
        unmarriedButton.setBackground(Color.white);
        add(unmarriedButton);

        ButtonGroup maritalButtonGroup = new ButtonGroup();
        maritalButtonGroup.add(marriedButton);
        maritalButtonGroup.add(unmarriedButton);

        JLabel address = new JLabel("Address*: ");
        address.setFont(new Font("Railway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Railway", Font.BOLD,18));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);

        JLabel city = new JLabel("City*: ");
        city.setFont(new Font("Railway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Railway", Font.BOLD,18));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);

        JLabel state = new JLabel("State*: ");
        state.setFont(new Font("Railway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Railway", Font.BOLD,18));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);

        JLabel pinCode = new JLabel("PIN Code*: ");
        pinCode.setFont(new Font("Railway",Font.BOLD,20));
        pinCode.setBounds(100,590,200,30);
        add(pinCode);

        pinCodeTextField = new JTextField();
        pinCodeTextField.setFont(new Font("Railway", Font.BOLD,18));
        pinCodeTextField.setBounds(300,590,400,30);
        add(pinCodeTextField);

        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Railway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
    }

    public void actionPerformed(ActionEvent ae){
        String formno = ""+random;
        String name = nameTextField.getText();
        String fName = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = "";
        if(maleButton.isSelected()){
            gender = "Male";
        }
        else if(femaleButton.isSelected()){
            gender = "Female";
        }
        else if(otherButton.isSelected()){
            gender = "Others";
        }
        String email = eMailTextField.getText();
        String marital = "";
        if(marriedButton.isSelected()){
            marital = "Married";
        }
        else if(unmarriedButton.isSelected()){
            marital = "Unmarried";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinCodeTextField.getText();

        try{ // Input Validation to be implemented
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else if(fName.equals("")){
                JOptionPane.showMessageDialog(null, "Father's Name is Required");
            }
            else if(dob.equals("")){
                JOptionPane.showMessageDialog(null, "Date of Birth is Required");
            }
            else if(gender.equals("")){
                JOptionPane.showMessageDialog(null, "Gender is Required");
            }
            else if(email.equals("")){
                JOptionPane.showMessageDialog(null, "E-Mail Address is Required");
            }
            else if(marital.equals("")){
                JOptionPane.showMessageDialog(null, "Marital Status is Required");
            }
            else if(address.equals("")){
                JOptionPane.showMessageDialog(null, "Address is Required");
            }
            else if(city.equals("")){
                JOptionPane.showMessageDialog(null, "City is Required");
            }
            else if(state.equals("")){
                JOptionPane.showMessageDialog(null, "State is Required");
            }
            else if(pin.equals("")){
                JOptionPane.showMessageDialog(null, "PIN Code is Required");
            }
            else{
                if(!isValidEmail(email)){
                    JOptionPane.showMessageDialog(null, "Enter valid E-Mail");
                }
                else if(!pin.matches("\\d+")){
                    JOptionPane.showMessageDialog(null, "Enter valid PIN Code");
                }
                // SQL injection vulnerable!!!!!!!!!!!!!!!
                else if (isValidEmail(email) && pin.matches("\\d+")){
                    conn c = new conn();
                    String query = "insert into signup values('"+formno+"','" +name+"','" +fName+"','" +dob+"','" +gender+"','" +email+"','"  +marital+"','"  +address+"','" +city+"','" +pin+"','" +state+"')";
                    c.s.executeUpdate(query);
                    setVisible(false);
                    new SignUpTwo(formno);
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        new SignUpOne();
    }
}
