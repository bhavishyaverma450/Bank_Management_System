import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignUpone extends JFrame {
    SignUpone(){

        setLayout(null);

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

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,400,30);
        add(name);
        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,20));
        nameTextField.setBounds(250,140,450,30);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,400,30);
        add(fname);
        JTextField fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,20));
        fnameTextField.setBounds(250,190,140,30);
        add(fnameTextField);

        JLabel mname = new JLabel("Mother's Name: ");
        mname.setFont(new Font("Raleway",Font.BOLD,20));
        mname.setBounds(400,190,400,30);
        add(mname);
        JTextField mnameTextField = new JTextField();
        mnameTextField.setFont(new Font("Raleway",Font.BOLD,20));
        mnameTextField.setBounds(555,190,145,30);
        add(mnameTextField);

        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,400,30);
        add(dob);

        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(400,240,400,30);
        add(gender);
        

        JLabel email = new JLabel("Email: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,290,400,30);
        add(email);

        JLabel maritalStats = new JLabel("Marital Status: ");
        maritalStats.setFont(new Font("Raleway",Font.BOLD,20));
        maritalStats.setBounds(100,340,400,30);
        add(maritalStats);

        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,390,400,30);
        add(address);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,440,400,30);
        add(city);

        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,490,400,30);
        add(state);

        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,540,400,30);
        add(pincode);


        setSize(850,800);
        setLocationRelativeTo(null);
        setVisible(true);


    }

    public static void main(String[] args) {
        new SignUpone();
    }
}
