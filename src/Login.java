import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener {
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){

        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        setFocusable(true);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("apple.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        getContentPane().setBackground(Color.WHITE);

        JLabel text = new JLabel("Welcome to ATM");
        text.setBounds(200,40,400,40);
        text.setFont(new Font("Onward",Font.BOLD,38));
        add(text);

        JLabel cardNumber = new JLabel("Card No.: ");
        cardNumber.setFont(new Font("Raleway", Font.BOLD,28));
        cardNumber.setBounds(120,150,150,30);
        add(cardNumber);
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);

        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setBounds(300,300,100,30);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.setBounds(430,300,100,30);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.setBounds(300,350,230,30);
        signup.addActionListener(this);
        add(signup);

        setSize(800,480);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(e.getSource()==signup){

        }else if(e.getSource()==login){

        }
    }
    public static void main(String[] args) {
        new Login();

    }
}
