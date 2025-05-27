import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignUpone extends JFrame {
    SignUpone(){
        Int c=10;
        setLayout(null);
        setFocusable(true);

        Random rn = new Random();
        long random = Math.abs((rn.nextLong() %9000L)+1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO.: "+random);

        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        getContentPane().setBackground(Color.WHITE);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);

        JLabel name = new JLabel("Full Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,400,30);
        add(name);
        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.PLAIN,20));
        nameTextField.setBounds(250,140,450,30);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,400,30);
        add(fname);
        JTextField fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.PLAIN,20));
        fnameTextField.setBounds(250,190,140,30);
        add(fnameTextField);

        JLabel mname = new JLabel("Mother's Name: ");
        mname.setFont(new Font("Raleway",Font.BOLD,20));
        mname.setBounds(400,190,400,30);
        add(mname);
        JTextField mnameTextField = new JTextField();
        mnameTextField.setFont(new Font("Raleway",Font.PLAIN,20));
        mnameTextField.setBounds(555,190,145,30);
        add(mnameTextField);

        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,400,30);
        add(dob);

        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(400,240,90,30);
        add(gender);
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(490,240,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(560,240,100,30);
        female.setBackground(Color.WHITE);
        add(female);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,290,400,30);
        add(email);
        JTextField emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.PLAIN,20));
        emailTextField.setBounds(250,290,450,30);
        add(emailTextField);

        JLabel maritalStats = new JLabel("Marital Status: ");
        maritalStats.setFont(new Font("Raleway",Font.BOLD,20));
        maritalStats.setBounds(100,340,200,30);
        add(maritalStats);
        JRadioButton single = new JRadioButton("Single");
        single.setBounds(250,340,70,30);
        single.setBackground(Color.WHITE);
        add(single);
        JRadioButton married = new JRadioButton("Married");
        married.setBounds(335,340,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        ButtonGroup maritalStatsGroup = new ButtonGroup();
        maritalStatsGroup.add(single);
        maritalStatsGroup.add(married);

        JLabel address = new JLabel("Res. Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,390,400,30);
        add(address);
        JTextField addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.PLAIN,20));
        addressTextField.setBounds(250,390,450,30);
        add(addressTextField);


        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,440,400,30);
        add(city);
        JTextField cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.PLAIN,20));
        cityTextField.setBounds(250,440,450,30);
        add(cityTextField);

        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,490,400,30);
        add(state);
        JTextField stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.PLAIN,20));
        stateTextField.setBounds(250,490,450,30);
        add(stateTextField);

        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,540,400,30);
        add(pincode);
        JTextField pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.PLAIN,20));
        pincodeTextField.setBounds(250,540,450,30);
        add(pincodeTextField);

        JButton clear = new JButton("Clear");
        clear.setBounds(320,600,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.setFont(new Font("Raleway",Font.BOLD,14));
        add(clear);

        JButton next = new JButton("Next");
        next.setBounds(430,600,100,30);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        add(next);


        setSize(850,800);
        setLocationRelativeTo(null);
        setVisible(true);


    }

    public static void main(String[] args) {
        new SignUpone();
    }
}
