package bms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SignUpTwo extends JFrame implements ActionListener{
    JTextField religionTextField,panTextField,aadharTextField;
    JButton next;
    JRadioButton syesButton,snoButton,eyesButton,enoButton;
    JComboBox<String> religionBox,categoryBox,occuBox,eduBox,incomeBox;
    String formNo;
    SignUpTwo(String formNo){ 
        this.formNo = formNo;
        setLayout(null);
        setTitle("New Account Application Form - Page: 2");
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

        JLabel additionalDet = new JLabel("Page 2: Additional Details");
        additionalDet.setFont(new Font("Railway",Font.BOLD,22));
        additionalDet.setBounds(290,80,400,30);
        add(additionalDet);

        JLabel religionJLabel = new JLabel("Religion*:");
        religionJLabel.setFont(new Font("Railway",Font.BOLD,20));
        religionJLabel.setBounds(100,140,100,30);
        add(religionJLabel);

        String[] valReligion = {"","Hindu","Muslim","Christian","Sikkh","Others"};
        religionBox = new JComboBox<>(valReligion);
        religionBox.setBounds(300,140,400,30);
        religionBox.setBackground(Color.white);
        add(religionBox);

        JLabel category = new JLabel("Category*: ");
        category.setFont(new Font("Railway",Font.BOLD,20));
        category.setBounds(100,190,200,30);
        add(category);

        String[] valCategory = {"","General","SC","ST","OBC","Others"};
        categoryBox = new JComboBox<>(valCategory);
        categoryBox.setBounds(300,190,400,30);
        categoryBox.setBackground(Color.white);
        add(categoryBox);


        JLabel income = new JLabel("Income*: ");
        income.setFont(new Font("Railway",Font.BOLD,20));
        income.setBounds(100,240,200,30);
        add(income);

        String[] incomeCategory = {"","Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000", "Above 10,00,000"};
        incomeBox = new JComboBox<>(incomeCategory);
        incomeBox.setBackground(Color.white);
        incomeBox.setBounds(300,240,400,30);
        add(incomeBox);

        JLabel eduJLabel = new JLabel("Educational");
        eduJLabel.setFont(new Font("Railway",Font.BOLD,20));
        eduJLabel.setBounds(100,290,200,30);
        add(eduJLabel);

        JLabel quaLabel = new JLabel("Qualification*: ");
        quaLabel.setFont(new Font("Railway",Font.BOLD,20));
        quaLabel.setBounds(100,315,200,30);
        add(quaLabel); 

        String[] eduCategory = {"","Non-Graduate","Graduate","Post-Graduate","Doctorate","Others"};
        eduBox = new JComboBox<>(eduCategory);
        eduBox.setBackground(Color.white);
        eduBox.setBounds(300,315,400,30);
        add(eduBox);

        JLabel occu = new JLabel("Occupation*: ");
        occu.setFont(new Font("Railway",Font.BOLD,20));
        occu.setBounds(100,390,200,30);
        add(occu);

        String[] occuCategory = {"","Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
        occuBox = new JComboBox<>(occuCategory);
        occuBox.setBackground(Color.white);
        occuBox.setBounds(300,390,400,30);
        add(occuBox);
        
        JLabel pan = new JLabel("PAN Number*: ");
        pan.setFont(new Font("Railway",Font.BOLD,20));
        pan.setBounds(100,440,200,30);
        add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Railway", Font.BOLD,18));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);

        JLabel aadhar = new JLabel("Aadhar Number*: ");
        aadhar.setFont(new Font("Railway",Font.BOLD,20));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Railway", Font.BOLD,18));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);

        JLabel senior = new JLabel("Senior Citizen*: ");
        senior.setFont(new Font("Railway",Font.BOLD,20));
        senior.setBounds(100,540,200,30);
        add(senior);

        syesButton = new JRadioButton("Yes");
        syesButton.setBounds(300,540,120,30);
        syesButton.setBackground(Color.white);
        add(syesButton);

        snoButton = new JRadioButton("No");
        snoButton.setBounds(450,540,120,30);
        snoButton.setBackground(Color.white);
        add(snoButton);

        ButtonGroup seniorButtonGroup = new ButtonGroup();
        seniorButtonGroup.add(syesButton);
        seniorButtonGroup.add(snoButton);

        JLabel existing = new JLabel("Existing Account*: ");
        existing.setFont(new Font("Railway",Font.BOLD,20));
        existing.setBounds(100,590,200,30);
        add(existing);

        eyesButton = new JRadioButton("Yes");
        eyesButton.setBounds(300,590,120,30);
        eyesButton.setBackground(Color.white);
        add(eyesButton);

        snoButton = new JRadioButton("No");
        snoButton.setBounds(450,590,120,30);
        snoButton.setBackground(Color.white);
        add(snoButton);

        ButtonGroup existingButtonGroup = new ButtonGroup();
        existingButtonGroup.add(eyesButton);
        existingButtonGroup.add(enoButton);

        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Railway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
    }

    public void actionPerformed(ActionEvent ae){
        String religion = (String)religionBox.getSelectedItem();
        String category = (String)categoryBox.getSelectedItem();
        String income = (String)incomeBox.getSelectedItem();
        String education = (String)eduBox.getSelectedItem();
        String occupation = (String)occuBox.getSelectedItem();
        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        String senior = "";
        if(syesButton.isSelected()){
            senior = "Yes";
        }
        else if(snoButton.isSelected()){
            senior = "No";
        }

        String existing = "";
        if(eyesButton.isSelected()){
            existing = "Yes";
        }
        else if(enoButton.isSelected()){
            existing = "No";
        }

        try{ // Input Validation to be implemented
            if(religion.equals("")){
                JOptionPane.showMessageDialog(null, "Religion is Required");
            }
            else if(category.equals("")){
                JOptionPane.showMessageDialog(null, "Category is Required");
            }
            else if(income.equals("")){
                JOptionPane.showMessageDialog(null, "Income is Required");
            }
            else if(education.equals("")){
                JOptionPane.showMessageDialog(null, "Educational Qualification is Required");
            }
            else if(occupation.equals("")){
                JOptionPane.showMessageDialog(null, "Occupation is Required");
            }
            else if(pan.equals("")){
                JOptionPane.showMessageDialog(null, "PAN Number is Required");
            }
            else if(aadhar.equals("")){
                JOptionPane.showMessageDialog(null, "Aadhar Number is Required");
            }
            else if(senior.equals("")){
                JOptionPane.showMessageDialog(null, "Senior Declaration is Required");
            }
            else if(existing.equals("")){
                JOptionPane.showMessageDialog(null, "Existing Account info is Required");
            }
            else{
                // SQL injection vulnerable!!!!!!!!!!!!!!!
                conn c = new conn();
                String query = "insert into signuptwo values('"+formNo+"','" +religion+"','" +category+"','" +income+"','" +education+"','" +occupation+"','"  +pan+"','"  +aadhar+"','" +senior+"','" +existing+"');";
                c.s.executeUpdate(query);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        new SignUpTwo("");
    }
}
