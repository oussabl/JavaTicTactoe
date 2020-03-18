/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tiktaktoe extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int yCount = 0;
    
       
    public Tiktaktoe() {
        initComponents();
        setSize(1200, 600);
        setLocationRelativeTo(null);
       String Player1 = JOptionPane.showInputDialog("Enter Your name Player 1");
       String Player2 = JOptionPane.showInputDialog("Enter Your name Player 2");
       jLabelx.setText(Player1);
       jLabely.setText(Player2);
    }
    private void gameScore() {
        jLabelResultx.setText(String.valueOf(xCount));
        jLabelResulty.setText(String.valueOf(yCount));

    }
    private void choose_a_Player() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }

    private void finGrame(){
    
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();

        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();

        String b11 = jButton11.getText();
        String b12 = jButton12.getText();
        String b13 = jButton13.getText();
       
        if((
                !(b1 == ("X") && b2 == ("X") && b3 == ("X"))
                &&!(b1  == ("O") && b2  == ("O") && b3  == ("O"))
                
                &&!(b6  == ("X") && b7  == ("X") && b8  == ("X"))
                &&!(b6  == ("O") && b7  == ("O") && b8  == ("O"))
                &&!(b11 == ("X") && b12 == ("X") && b13 == ("X"))
                &&!(b11 == ("O") && b12 == ("O") && b13 == ("O"))
                &&!(b1  == ("X") && b7  == ("X") && b13 == ("X"))
                &&!(b1  == ("O") && b7  == ("O") && b13 == ("O"))
                &&!(b2  == ("X") && b7  == ("X") && b12 == ("X"))
                &&!(b2  == ("O") && b7  == ("O") && b12 == ("O"))
                &&!(b1  == ("X") && b6  == ("X") && b11 == ("X"))
                &&!(b3  == ("X") && b7  == ("X") && b11 == ("X"))
                &&!(b3  == ("O") && b7  == ("O") && b11 == ("O")) 
                &&!(b3  == ("X") && b8  == ("X") && b13 == ("X"))
                &&!(b3  == ("O") && b8  == ("O") && b13 == ("O"))
                ))
                {
        
        JOptionPane.showMessageDialog(frame, "The Game is Over ");
        xCount++;
        yCount++;
                    gameScore();
            jButton1.setBackground(Color.red);
            jButton2.setBackground(Color.red);
            jButton3.setBackground(Color.red);
            
            jButton6.setBackground(Color.red);
            jButton7.setBackground(Color.red);
            jButton8.setBackground(Color.red);
            
            jButton11.setBackground(Color.red);
            jButton12.setBackground(Color.red);
            jButton13.setBackground(Color.red);
         


        }}
   
    private void winningGame() {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();

        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();

        String b11 = jButton11.getText();
        String b12 = jButton12.getText();
        String b13 = jButton13.getText();
       
        
        
        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player " +jLabelx.getText()+" WINS", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.ORANGE);
            jButton2.setBackground(Color.ORANGE);
            jButton3.setBackground(Color.ORANGE);
        }

        if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player "+jLabely.getText()+" WINS", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            yCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton2.setBackground(Color.YELLOW);
            jButton3.setBackground(Color.YELLOW);
        }
        if (b6 == ("X") && b7 == ("X") && b8 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player x WINS", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);

            xCount++;
            gameScore();
            jButton6.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
        }
        if (b6 == ("O") && b7 == ("O") && b8 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player "+jLabely.getText()+" WINS", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);

            yCount++;
            gameScore();
            jButton6.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
        }

        if (b11 == ("X") && b12 == ("X") && b13 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player x WINS", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);

            xCount++;
            gameScore();
            jButton11.setBackground(Color.ORANGE);
            jButton12.setBackground(Color.ORANGE);
            jButton13.setBackground(Color.ORANGE);
        }

        if (b11 == ("O") && b12 == ("O") && b13 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player "+jLabely.getText()+" WINS", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);

            yCount++;
            gameScore();
            jButton11.setBackground(Color.YELLOW);
            jButton12.setBackground(Color.ORANGE);
            jButton13.setBackground(Color.ORANGE);
        }

        if (b1 == ("X") && b7 == ("X") && b13 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player "+jLabelx.getText()+"  Is WIN", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            jButton13.setBackground(Color.ORANGE);
        }
        
       if (b1 == ("O") && b7 == ("O") && b13 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player "+jLabely.getText()+" WIN", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            yCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
            jButton13.setBackground(Color.YELLOW);
        }
       if (b2 == ("X") && b7 == ("X") && b12 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player "+jLabelx.getText()+" WINS", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton2.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            jButton12.setBackground(Color.ORANGE);
        }
        if (b2 == ("O") && b7 == ("O") && b12 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player "+jLabely.getText()+" WINS", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            yCount++;
            gameScore();
            jButton2.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
            jButton12.setBackground(Color.YELLOW);
        }
       if (b1 == ("X") && b6 == ("X") && b11 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player "+jLabelx.getText()+" WINS", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.ORANGE);
            jButton6.setBackground(Color.ORANGE);
            jButton11.setBackground(Color.ORANGE);
        }
        if (b1 == ("O") && b6 == ("O") && b11 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player "+jLabely.getText()+" WINS", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            yCount++;
            gameScore();
            jButton1.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);
            jButton11.setBackground(Color.YELLOW);
        }

        if (b3 == ("X") && b7 == ("X") && b11 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player "+jLabelx.getText()+" WINS", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton3.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            jButton11.setBackground(Color.ORANGE);
        }

        if (b3 == ("O") && b7 == ("O") && b11 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player "+jLabely.getText()+" WINS", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            yCount++;
            gameScore();
            jButton3.setBackground(Color.YELLOW);
            jButton7.setBackground(Color.YELLOW);
            jButton11.setBackground(Color.YELLOW);
        }

        if (b3 == ("X") && b8 == ("X") && b13 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player "+jLabelx.getText()+" WINS", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton3.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
            jButton13.setBackground(Color.ORANGE);
        }
       
        if (b3 == ("O") && b8 == ("O") && b13 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player "+jLabely.getText()+" WINS", "tic tac toe", JOptionPane.INFORMATION_MESSAGE);
            yCount++;
            gameScore();
            jButton3.setBackground(Color.YELLOW);
            jButton8.setBackground(Color.YELLOW);
            jButton13.setBackground(Color.YELLOW);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabelx = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabelResultx = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabely = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabelResulty = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jbtnReste = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel1.setText("Tic Tac Toe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabel1)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(51, 0, 204));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 0, 204));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(51, 0, 204));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabelx.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 24)); // NOI18N
        jLabelx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelx.setText("Player X : ");
        jPanel6.add(jLabelx, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabelResultx.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 24)); // NOI18N
        jLabelResultx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultx.setText("jLabel3");
        jPanel7.add(jLabelResultx, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel10.setBackground(new java.awt.Color(51, 0, 204));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton6.setActionCommand("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel8.setBackground(new java.awt.Color(51, 0, 204));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton7.setActionCommand("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(51, 0, 204));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabely.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 24)); // NOI18N
        jLabely.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabely.setText("Player Y: ");
        jPanel11.add(jLabely, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabelResulty.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 24)); // NOI18N
        jLabelResulty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResulty.setText("jLabel5");
        jPanel12.add(jLabelResulty, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(51, 0, 204));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton11.setActionCommand("");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton11, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(51, 0, 204));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton12, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(51, 0, 204));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton13, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jbtnReste.setFont(new java.awt.Font("Segoe UI Emoji", 3, 24)); // NOI18N
        jbtnReste.setText("Reset");
        jbtnReste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResteActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnReste, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnExit.setFont(new java.awt.Font("Segoe UI Historic", 3, 24)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jButton1.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton1.setForeground(Color.BLACK);
        } else {
            jButton1.setForeground(Color.RED);
        }

        choose_a_Player();
        winningGame();


    }//GEN-LAST:event_jButton1ActionPerformed
    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed

        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame,
                "Click Yes if you want to exit ",
                " Tic Tac Toe",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_NO_OPTION);
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jButton2.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton2.setForeground(Color.BLACK);
        } else {
            jButton2.setForeground(Color.RED);
        }

        choose_a_Player();
        winningGame();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jButton3.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton3.setForeground(Color.BLACK);
        } else {
            jButton3.setForeground(Color.RED);
        }

        choose_a_Player();
        winningGame();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton6.setForeground(Color.BLACK);
        } else {
            jButton6.setForeground(Color.RED);
        }

        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jButton7.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton7.setForeground(Color.BLACK);
        } else {
            jButton7.setForeground(Color.RED);
        }

        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        jButton8.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton8.setForeground(Color.BLACK);
        } else {
            jButton8.setForeground(Color.RED);
        }

        choose_a_Player();
        winningGame();


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        jButton11.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton11.setForeground(Color.BLACK);
        } else {
            jButton11.setForeground(Color.RED);
        }

        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        jButton12.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) {
            jButton12.setForeground(Color.BLACK);
        } else {
            jButton12.setForeground(Color.RED);
        }

        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        jButton13.setText(startGame);
        if (startGame.equalsIgnoreCase("X")) {
            jButton13.setForeground(Color.BLACK);
        } else {
            jButton13.setForeground(Color.RED);
        }
        choose_a_Player();
        winningGame();

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jbtnResteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResteActionPerformed
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);

        jButton6.setText(null);
        jButton7.setText(null);
        jButton8.setText(null);

        jButton11.setText(null);
        jButton12.setText(null);
        jButton13.setText(null);

        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);

        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);

        jButton11.setBackground(Color.LIGHT_GRAY);
        jButton12.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_jbtnResteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tiktaktoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tiktaktoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tiktaktoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tiktaktoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tiktaktoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelResultx;
    private javax.swing.JLabel jLabelResulty;
    private javax.swing.JLabel jLabelx;
    private javax.swing.JLabel jLabely;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReste;
    // End of variables declaration//GEN-END:variables
}
