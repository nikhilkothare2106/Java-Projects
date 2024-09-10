package tic_tac_toe;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class gamePanel implements ActionListener{
    JFrame  jf;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int count = 0;
    String str = "";
    boolean win;
    Color color;
    String player1,player2;
    String winner,losser;
    gamePanel(String player1,String player2){
        this.player1 = player1;
        this.player2 = player2;

        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch(Exception e){

        }
        jf = new JFrame();
        jf.setTitle(player1+" turn(X)");
        jf.setLayout(new GridLayout(3,3));
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(b6);
        jf.add(b7);
        jf.add(b8);
        jf.add(b9);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        jf.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count += 1;
        if(count % 2 == 0){
            str = "O";
            color = Color.RED;
            jf.setTitle(player1 + " turn(X)");
            winner = player2;
            losser = player1;
        }else{
            str = "X";
            color = Color.YELLOW;
            jf.setTitle(player2 + " turn(O)");
            winner = player1;
            losser = player2;
        }
        if(e.getSource() == b1){
            b1.setBackground(color);
            b1.setText(str);
            b1.setFont(new Font("Arial", 1, 35));
            b1.setEnabled(false);
        }
        if(e.getSource() == b2){
            b2.setBackground(color);
            b2.setText(str);
            b2.setFont(new Font("Arial", 1, 35));
            b2.setEnabled(false);
        }
        if(e.getSource() == b3){
            b3.setBackground(color);
            b3.setText(str);
            b3.setFont(new Font("Arial", 1, 35));
            b3.setEnabled(false);
        }
        if(e.getSource() == b4){
            b4.setBackground(color);
            b4.setText(str);
            b4.setFont(new Font("Arial", 1, 35));
            b4.setEnabled(false);
        }
        if(e.getSource() == b5){
            b5.setBackground(color);
            b5.setText(str);
            b5.setFont(new Font("Arial", 1, 35));
            b5.setEnabled(false);
        }
        if(e.getSource() == b6){
            b6.setBackground(color);
            b6.setText(str);
            b6.setFont(new Font("Arial", 1, 35));
            b6.setEnabled(false);
        }
        if(e.getSource() == b7){
            b7.setBackground(color);
            b7.setText(str);
            b7.setFont(new Font("Arial", 1, 35));
            b7.setEnabled(false);
        }
        if(e.getSource() == b8){
            b8.setBackground(color);
            b8.setText(str);
            b8.setFont(new Font("Arial",1, 35));
            b8.setEnabled(false);
        }
        if(e.getSource() == b9){
            b9.setBackground(color);
            b9.setText(str);
            b9.setFont(new Font("Arial", 1, 35));
            b9.setEnabled(false);
        }
        isWin();
        whoWins();
    }
    void isWin(){
        if(b1.getText() == b2.getText() && b2.getText() == b3.getText() && b1.getText() != ""){
            win = true;
        }
        else if(b1.getText() == b4.getText() && b4.getText() == b7.getText() && b1.getText() != ""){
            win = true;
        }
        else if(b4.getText() == b5.getText() && b5.getText() == b6.getText() && b4.getText() != ""){
            win = true;
        }
        else if(b2.getText() == b5.getText() && b5.getText() == b8.getText() && b2.getText() != ""){
            win = true;
        }
        else if(b7.getText() == b8.getText() && b8.getText() == b9.getText() && b7.getText() != ""){
            win = true;
        }
        else if(b3.getText() == b6.getText() && b6.getText() == b9.getText() && b3.getText() != ""){
            win = true;
        }
        else if(b1.getText() == b5.getText() && b5.getText() == b9.getText() && b1.getText() != ""){
            win = true;
        }
        else if(b3.getText() == b5.getText() && b5.getText() == b7.getText() && b3.getText() != ""){
            win = true;
        }
        else{
            win = false;
        }
    }
    void whoWins(){
        if(win){
            jf.setTitle(winner +" win");
            JOptionPane.showMessageDialog(jf,winner + " win");
            btnSetEnabling(false);
            restart();
        }
        else if(!win && count == 9){
            JOptionPane.showMessageDialog(jf, "Match Draw!");
            restart();
        }
    }
    void restart(){
        int i = JOptionPane.showConfirmDialog(jf,"Do you want to restart?");
        if(i == 0){
            count = 0;
            btnSetEnabling(true);
            str = "";
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

            b1.setBackground(null);
            b2.setBackground(null);
            b3.setBackground(null);
            b4.setBackground(null);
            b5.setBackground(null);
            b6.setBackground(null);
            b7.setBackground(null);
            b8.setBackground(null);
            b9.setBackground(null);

            player1 = winner;
            player2 = losser;
            jf.setTitle(player1+" turn(X)");

        }else if(i == 1){
            System.exit(0);
        }else{
            btnSetEnabling(false);
        }
    }
    void btnSetEnabling(boolean b){
        b1.setEnabled(b);
        b2.setEnabled(b);
        b3.setEnabled(b);
        b5.setEnabled(b);
        b4.setEnabled(b);
        b7.setEnabled(b);
        b6.setEnabled(b);
        b9.setEnabled(b);
        b8.setEnabled(b);
    }
}
