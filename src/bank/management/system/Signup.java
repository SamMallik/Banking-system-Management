package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup  extends JFrame implements ActionListener {

        JRadioButton r1,r2 ,m1,m2,m3;
    JTextField textname,textFname, textEmail , textAdd, textcity , textState ,textpin;
    JButton next;
    JDateChooser dateChooser;
    Random ran = new Random();
    Long first4 = (ran.nextLong()%9000L)+ 1000L;
    String first = " " + Math.abs(first4);
    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);


        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,32));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330,70,660,30);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelname = new JLabel("Name:");
        labelname.setFont(new Font("Raleway",Font.BOLD,20));
        labelname.setBounds(100,190,200,30);
        add(labelname);

        textname= new JTextField();
        textname.setBounds(300,190,400,30);
        textname.setFont(new Font("Raleway",Font.BOLD,14));
        add(textname);

        JLabel labelfName = new JLabel("Father's Name:");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add( labelfName);

        textFname= new JTextField();
        textFname.setBounds(300,240,400,30);
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add( DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color( 105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelg = new JLabel("Gender");
        labelg.setFont(new Font("Raleway",Font.BOLD,20));
        labelg.setBounds(100,290,200,30);
        add( labelg);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,90,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Address");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add( labelEmail);

        textEmail= new JTextField();
        textEmail.setBounds(300,390,400,30);
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        add(textEmail);


        JLabel labelMS = new JLabel("Martial Status");
        labelMS.setFont(new Font("Raleway",Font.BOLD,20));
        labelMS.setBounds(100,440,200,30);
        add( labelMS);

       m1 = new JRadioButton("Married");
       m1.setBounds(300,440,100,30);
       m1.setBackground(new Color(222,255,228));
       m1.setFont(new Font("Raleway",   Font.BOLD,14));
       add(m1);

        m2 = new JRadioButton("UnMarried");
        m2.setBounds(450,440,100,30);
        m2.setBackground(new Color(222,255,228));
        m2.setFont(new Font("Raleway",   Font.BOLD,14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBounds(600,440,100,30);
        m3.setBackground(new Color(222,255,228));
        m3.setFont(new Font("Raleway",   Font.BOLD,14));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);


        JLabel labeladd = new JLabel("Address:");
        labeladd.setFont(new Font("Raleway",Font.BOLD,20));
        labeladd.setBounds(100,490,200,30);
        add( labeladd);

        textAdd= new JTextField();
        textAdd.setBounds(300,490,400,30);
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        add(textAdd);

        JLabel labelcity = new JLabel("City");
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity.setBounds(100,540,200,30);
        add( labelcity);

        textcity = new JTextField();
        textcity.setBounds(300,540,400,30);
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        add(textcity);

        JLabel labelpin = new JLabel("PIN CODE:");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        labelpin.setBounds(100,590,200,30);
        add( labelpin);

        textpin = new JTextField();
        textpin.setBounds(300,590,400,30);
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        add(textpin);


        JLabel labelstate = new JLabel("State:");
        labelstate.setFont(new Font("Raleway",Font.BOLD,20));
        labelstate.setBounds(100,640,200,30);
        add( labelstate );

        textState = new JTextField();
        textState.setBounds(300,640,400,30);
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        add(textState);


        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textname.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected())
        {
            gender = "Male";
        }
        else if (r2.isSelected())
        {
            gender = "Female";
        }
        String email = textEmail.getText();
        String martial = null;
        if(m1.isSelected())
        {
            martial = "Married";
        }
        else if(m2.isSelected())
        {
            martial = "Unmarried";
        }
        else if (m3.isSelected())
        {
            martial = "Other";
        }

        String address = textAdd.getText();
        String city = textcity.getText();
        String pincode = textpin.getText();
        String state = textState.getText();

        try{

            if(textname.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else{
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args)
    {
            new Signup();
    }

}
