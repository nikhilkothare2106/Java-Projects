package tic_tac_toe;

import javax.swing.*;
import java.awt.event.*;
public class userPanel implements ActionListener{
    JFrame jf;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b;
    userPanel(){
        jf = new JFrame();
        jf.setLayout(null);
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

        l1 = new JLabel("Tic-Tae-Toe Game");
        l1.setBounds(120,5,150,20);
        jf.add(l1);

        l2 = new JLabel("Enter Player1:");
        l2.setBounds(10,30,100,30);
        jf.add(l2);
        l3 = new JLabel("Enter Player2:");
        l3.setBounds(10,60,100,30);
        jf.add(l3);

        t1 = new JTextField();
        t1.setBounds(110, 30, 180, 25);
        jf.add(t1);

        t2 = new JTextField();
        t2.setBounds(110, 60, 180, 25);
        jf.add(t2);

        b = new JButton("Play");
        b.setBounds(150, 90, 80, 25);
        b.addActionListener(this);
        jf.add(b);


        jf.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b){
            String player1 = t1.getText().trim();
            String player2 = t2.getText().trim();
            if (player1.isEmpty() || player2.isEmpty()) {
                JOptionPane.showMessageDialog(jf, "Both players must enter a name!", "Error", JOptionPane.ERROR_MESSAGE);
                return; 
            }
            new gamePanel(t1.getText(),t2.getText());
            jf.setVisible(false);
        }
    }
}
