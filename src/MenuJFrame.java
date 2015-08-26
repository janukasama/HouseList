
import javax.swing.ImageIcon;
import java.awt.*; 
 import java.awt.event.*;
 import javax.swing.*;
import java.awt.Toolkit;

import java.awt.event.KeyEvent;

public class MenuJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuJFrame
     */
    private static SortedList list = new SortedList();

    public MenuJFrame() {
        initComponents();
        getStarted();

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
        jLabel2 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jTextFieldNoBedRooms = new javax.swing.JTextField();
        jTextFieldSFeet = new javax.swing.JTextField();
        jTextFieldLPrice = new javax.swing.JTextField();
        jTextFieldLName = new javax.swing.JTextField();
        jTextFieldFName = new javax.swing.JTextField();
        jTextFieldLotNum = new javax.swing.JTextField();
        jButtonNext = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jLabelFooter = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RealEstate Program");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button_minimize.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(758, 12, 15, 20);

        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button_close.png"))); // NOI18N
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelClose);
        jLabelClose.setBounds(780, 10, 15, 14);

        jTextFieldNoBedRooms.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldNoBedRooms.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNoBedRooms.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextFieldNoBedRooms.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextFieldNoBedRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNoBedRoomsActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNoBedRooms);
        jTextFieldNoBedRooms.setBounds(490, 383, 280, 34);

        jTextFieldSFeet.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldSFeet.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSFeet.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextFieldSFeet.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextFieldSFeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSFeetActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldSFeet);
        jTextFieldSFeet.setBounds(490, 333, 280, 34);

        jTextFieldLPrice.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldLPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldLPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextFieldLPrice.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextFieldLPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLPriceActionPerformed(evt);
            }
        });
        jTextFieldLPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLPriceKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldLPrice);
        jTextFieldLPrice.setBounds(490, 282, 280, 34);

        jTextFieldLName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldLName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldLName.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextFieldLName.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextFieldLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldLName);
        jTextFieldLName.setBounds(490, 231, 280, 34);

        jTextFieldFName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldFName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFName.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextFieldFName.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextFieldFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldFName);
        jTextFieldFName.setBounds(490, 180, 280, 34);

        jTextFieldLotNum.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldLotNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldLotNum.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(11, 108, 153), null));
        jTextFieldLotNum.setCaretColor(new java.awt.Color(11, 108, 153));
        jTextFieldLotNum.setMinimumSize(new java.awt.Dimension(7, 28));
        jTextFieldLotNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldLotNumFocusLost(evt);
            }
        });
        jTextFieldLotNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLotNumActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldLotNum);
        jTextFieldLotNum.setBounds(490, 129, 280, 34);

        jButtonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Next.png"))); // NOI18N
        jButtonNext.setAlignmentY(0.0F);
        jButtonNext.setBorder(null);
        jButtonNext.setOpaque(false);
        jButtonNext.setPreferredSize(new java.awt.Dimension(175, 70));
        jButtonNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNextMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonNextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonNextMouseReleased(evt);
            }
        });
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNext);
        jButtonNext.setBounds(576, 502, 175, 70);

        jButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Clear.png"))); // NOI18N
        jButtonClear.setAlignmentY(0.0F);
        jButtonClear.setBorder(null);
        jButtonClear.setOpaque(false);
        jButtonClear.setPreferredSize(new java.awt.Dimension(175, 70));
        jButtonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClearMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonClearMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonClearMouseReleased(evt);
            }
        });
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonClear);
        jButtonClear.setBounds(0, 380, 175, 70);

        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search.png"))); // NOI18N
        jButtonSearch.setAlignmentY(0.0F);
        jButtonSearch.setBorder(null);
        jButtonSearch.setOpaque(false);
        jButtonSearch.setPreferredSize(new java.awt.Dimension(175, 70));
        jButtonSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSearchMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonSearchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonSearchMouseReleased(evt);
            }
        });
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSearch);
        jButtonSearch.setBounds(0, 310, 175, 70);

        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete.png"))); // NOI18N
        jButtonDelete.setAlignmentY(0.0F);
        jButtonDelete.setBorder(null);
        jButtonDelete.setOpaque(false);
        jButtonDelete.setPreferredSize(new java.awt.Dimension(175, 70));
        jButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonDeleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonDeleteMouseReleased(evt);
            }
        });
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDelete);
        jButtonDelete.setBounds(0, 240, 175, 70);

        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        jButtonAdd.setAlignmentY(0.0F);
        jButtonAdd.setBorder(null);
        jButtonAdd.setOpaque(false);
        jButtonAdd.setPreferredSize(new java.awt.Dimension(175, 70));
        jButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonAddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonAddMouseReleased(evt);
            }
        });
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdd);
        jButtonAdd.setBounds(0, 170, 175, 70);

        jButtonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Reset.png"))); // NOI18N
        jButtonReset.setAlignmentY(0.0F);
        jButtonReset.setBorder(null);
        jButtonReset.setOpaque(false);
        jButtonReset.setPreferredSize(new java.awt.Dimension(175, 70));
        jButtonReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonResetMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonResetMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonResetMouseReleased(evt);
            }
        });
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonReset);
        jButtonReset.setBounds(0, 100, 175, 70);

        jLabelFooter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFooter.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabelFooter);
        jLabelFooter.setBounds(200, 420, 570, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DSA UI_02.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearData() {
        jTextFieldLotNum.setText("");
        jTextFieldFName.setText("");
        jTextFieldLName.setText("");
        jTextFieldLPrice.setText("");
        jTextFieldSFeet.setText("");
        jTextFieldNoBedRooms.setText("");
    }

    private void dataViewer(ListHouse house) {
        jTextFieldLotNum.setText(Integer.toString(house.lotNumber()));
        jTextFieldFName.setText(house.firstName());
        jTextFieldLName.setText(house.lastName());
        jTextFieldLPrice.setText(Integer.toString(house.listedPrice()));
        jTextFieldSFeet.setText(Integer.toString(house.squareFeet()));
        jTextFieldNoBedRooms.setText(Integer.toString(house.noOfBedRooms()));
    }

    private ListHouse dataRetriver() {
        int lotNumber;
        String firstName;
        String lastName;
        int listedPrice;
        int squareFeet;
        int noOfBedRooms;

        lotNumber = Integer.parseInt(jTextFieldLotNum.getText());
        firstName = jTextFieldFName.getText();
        lastName = jTextFieldLName.getText();
        listedPrice = Integer.parseInt(jTextFieldLPrice.getText());
        squareFeet = Integer.parseInt(jTextFieldSFeet.getText());
        noOfBedRooms = Integer.parseInt(jTextFieldNoBedRooms.getText());

        ListHouse house = new ListHouse(lotNumber, firstName, lastName, listedPrice,
                squareFeet, noOfBedRooms);
        return house;
    }

    public void getStarted() {

        try {
            ListHouse house;
            HouseFile.checkAvailability();
            HouseFile.reset();

            while (HouseFile.moreHouses()) {
                house = HouseFile.getNextHouse();
                list.insert(house); //start eke num of items gets ++

            }
            list.reset();
            if (list.lengthIs() != 0) {
                house = (ListHouse) list.getNextItem();
                dataViewer(house);
            }
        } catch (Exception e) {

        }
    }


    private void jButtonResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResetMouseClicked

    }//GEN-LAST:event_jButtonResetMouseClicked

    private void jButtonResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResetMousePressed
        ImageIcon Reset = new ImageIcon(getClass().getResource("/Images/Reset_Clicked.png"));
        jButtonReset.setIcon(Reset);
    }//GEN-LAST:event_jButtonResetMousePressed

    private void jButtonResetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResetMouseReleased
        ImageIcon Reset = new ImageIcon(getClass().getResource("/Images/Reset.png"));
        jButtonReset.setIcon(Reset);
    }//GEN-LAST:event_jButtonResetMouseReleased

    private void jButtonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddMouseClicked

    private void jButtonAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMousePressed
        ImageIcon Add = new ImageIcon(getClass().getResource("/Images/Add_Clicked.png"));
        jButtonAdd.setIcon(Add);
    }//GEN-LAST:event_jButtonAddMousePressed

    private void jButtonAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseReleased
        ImageIcon Add = new ImageIcon(getClass().getResource("/Images/Add.png"));
        jButtonAdd.setIcon(Add);
    }//GEN-LAST:event_jButtonAddMouseReleased

    private void jButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteMouseClicked

    private void jButtonDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteMousePressed
        ImageIcon Delete = new ImageIcon(getClass().getResource("/Images/Delete_Clicked.png"));
        jButtonDelete.setIcon(Delete);
    }//GEN-LAST:event_jButtonDeleteMousePressed

    private void jButtonDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteMouseReleased
        ImageIcon Delete = new ImageIcon(getClass().getResource("/Images/Delete.png"));
        jButtonDelete.setIcon(Delete);
    }//GEN-LAST:event_jButtonDeleteMouseReleased

    private void jButtonSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSearchMouseClicked

    private void jButtonSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSearchMousePressed
        ImageIcon Search = new ImageIcon(getClass().getResource("/Images/Search_Clicked.png"));
        jButtonSearch.setIcon(Search);
    }//GEN-LAST:event_jButtonSearchMousePressed

    private void jButtonSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSearchMouseReleased
        ImageIcon Search = new ImageIcon(getClass().getResource("/Images/Search.png"));
        jButtonSearch.setIcon(Search);
    }//GEN-LAST:event_jButtonSearchMouseReleased

    private void jButtonClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClearMouseClicked

    private void jButtonClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearMousePressed
        ImageIcon Clear = new ImageIcon(getClass().getResource("/Images/Clear_Clicked.png"));
        jButtonClear.setIcon(Clear);
    }//GEN-LAST:event_jButtonClearMousePressed

    private void jButtonClearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearMouseReleased
        ImageIcon Clear = new ImageIcon(getClass().getResource("/Images/Clear.png"));
        jButtonClear.setIcon(Clear);
    }//GEN-LAST:event_jButtonClearMouseReleased

    private void jButtonNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNextMouseClicked

    private void jButtonNextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNextMousePressed
        ImageIcon Next = new ImageIcon(getClass().getResource("/Images/Next_Clicked.png"));
        jButtonNext.setIcon(Next);
    }//GEN-LAST:event_jButtonNextMousePressed

    private void jButtonNextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNextMouseReleased
        ImageIcon Next = new ImageIcon(getClass().getResource("/Images/Next.png"));
        jButtonNext.setIcon(Next);
    }//GEN-LAST:event_jButtonNextMouseReleased

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        ListHouse house;
        list.reset();
        if (list.lengthIs() == 0) {
            clearData();
        } else {
            house = (ListHouse) list.getNextItem();
            dataViewer(house);
        }
        jLabelFooter.setText("List has been reset successfully");
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jTextFieldLotNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLotNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLotNumActionPerformed

    private void jTextFieldFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFNameActionPerformed

    private void jTextFieldLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLNameActionPerformed

    private void jTextFieldLPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLPriceActionPerformed
        
        
        
    }//GEN-LAST:event_jTextFieldLPriceActionPerformed

    private void jTextFieldSFeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSFeetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSFeetActionPerformed

    private void jTextFieldNoBedRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNoBedRoomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNoBedRoomsActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed

        ListHouse house;
        if (jTextFieldLotNum.getText().isEmpty()) {
            jLabelFooter.setText("Enter the Lot Number");
        } else if (jTextFieldFName.getText().isEmpty()) {
            jLabelFooter.setText("Enter First Name ");
        } else if (jTextFieldLName.getText().isEmpty()) {
            jLabelFooter.setText("Enter Last Name");
        } else if (jTextFieldLPrice.getText().isEmpty()) {
            jLabelFooter.setText("Enter the Listed Price");
        } else if (jTextFieldSFeet.getText().isEmpty()) {
            jLabelFooter.setText("Enter the no. of Square Feet");
        } else if (jTextFieldNoBedRooms.getText().isEmpty()) {
            jLabelFooter.setText("Enter the no. of Bedrooms");
        } else {
            try
			        {
			          house = dataRetriver();
			          if (list.availability(house))
			        	  jLabelFooter.setText("Lot number is not available"); 
			          else
			          { 
			            list.insert(house);
			            jLabelFooter.setText("House added successfully"); 
			          }
							 if((list.getCurrent() == null)&&(list.lengthIs()==1))
						 {					
					          list.reset();    
				              house = (ListHouse)list.getNextItem();

						 }					 
			         
			        } catch (NumberFormatException d) {

                jLabelFooter.setText("Invalid data format");
            }
        }

        
        

    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed

        clearData();
	jLabelFooter.setText(list.lengthIs() + " houses are available");

    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed

        if ((list.lengthIs() == 1) && list.getCurrent() == null) {
        } else {
            ListHouse house;
            if (list.lengthIs() == 0) {
                jLabelFooter.setText("No houses are listed");
            } else {
                house = (ListHouse) list.getNextItem();
                dataViewer(house);
            }
        }

    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed

          ListHouse house;
				 int lotNumber;
			        try
			        {
			          lotNumber = Integer.parseInt(jTextFieldLotNum.getText());
			          house = new ListHouse(lotNumber, "", "", 0, 0, 0);
			          if (list.availability(house))
			          {
			            house = (ListHouse)list.Fetcher(house);
			            dataViewer(house);
			            jLabelFooter.setText("Request completed"); 
			          }
			          else
			        	  jLabelFooter.setText("Incomplete request");
			        }
			        catch (NumberFormatException badHouseData)
			        {
			          // text field info incorrectly formated
			        	jLabelFooter.setText("Enter a lot number" + badHouseData.getMessage());
			        } 

    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed

        ListHouse house;

        try {
            house = dataRetriver();
            if (list.availability(house)) {
                list.delete(house);
                jLabelFooter.setText("House is deleted from the list");
            } else {
                jLabelFooter.setText("Incomplete request");
            }
        } catch (NumberFormatException badHouseData) {

            jLabelFooter.setText("Invalid data format" + badHouseData.getMessage());
        }
        clearData();

    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        //dispose();
        
        
         ListHouse house;
			        try 
			        {
			          HouseFile.rewrite();
			          list.reset();
			          int length = list.lengthIs();
			          for (int counter = 1; counter <= length; counter++)
			          {
			            house = (ListHouse)list.getNextItem();
			            HouseFile.putToFile(house);
			          }
			          HouseFile.close();
			        }
			        catch (Exception e)
			        {
			          System.out.println("Issue in "+e); 
			                            
			        }
			        System.exit(0); 
        

    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        setState(MenuJFrame.ICONIFIED);

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextFieldLotNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLotNumFocusLost
        
        
        
    }//GEN-LAST:event_jTextFieldLotNumFocusLost

    private void jTextFieldLPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLPriceKeyTyped
        
        
        
    }//GEN-LAST:event_jTextFieldLPriceKeyTyped

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
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelFooter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldFName;
    private javax.swing.JTextField jTextFieldLName;
    private javax.swing.JTextField jTextFieldLPrice;
    private javax.swing.JTextField jTextFieldLotNum;
    private javax.swing.JTextField jTextFieldNoBedRooms;
    private javax.swing.JTextField jTextFieldSFeet;
    // End of variables declaration//GEN-END:variables
}