
import Animals.Animal;
import com.jwetherell.algorithms.data_structures.Graph;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Krieolin
 */
public class allUsersForm extends javax.swing.JFrame {

    private static int intDisplay = 0;
    private static int maxUsers = 0;
    private static Graph<Animal> g;

    /**
     * Creates new form allUsersForm
     */
    public allUsersForm() {
        initComponents();
        g = Filehandlers.GetFromFile();
        int size = 0;
        for (Graph.Vertex v : g.getVertices()) {
            size += 1;

        }
        maxUsers = size;
        CustomCusor();
    }
    
    //cusor method
    public void CustomCusor() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        // Image img = toolkit.getImage("src\\images\\cusor.png");
        ImageIcon icon = new ImageIcon(getClass().getResource("cusor.png"));
        Image img = icon.getImage();
//part of curso pointer
        Point point = new Point(1, 1);
        Cursor cursor = toolkit.createCustomCursor(img, point, "Cursor");
        setCursor(cursor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JLayeredPane();
        lbl1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JLayeredPane();
        lbl2 = new javax.swing.JLabel();
        panel4 = new javax.swing.JLayeredPane();
        lbl4 = new javax.swing.JLabel();
        panel3 = new javax.swing.JLayeredPane();
        lbl3 = new javax.swing.JLabel();
        btnnext = new javax.swing.JButton();
        btnprevious = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuUpdate = new javax.swing.JMenu();
        menuitemupdate = new javax.swing.JMenuItem();
        menuitemdelete = new javax.swing.JMenuItem();
        menuitemUserprofile = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuitemfriend = new javax.swing.JMenuItem();
        menuAnalytics = new javax.swing.JMenu();
        menuitemgender = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenu();
        menuitem1SignOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setLayer(lbl1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel2.setLayer(lbl2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        panel4.setLayer(lbl4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel3.setLayer(lbl3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        btnnext.setText("next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnprevious.setText("previous");
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        jMenu1.setText("Home");

        jMenuItem1.setText("Home page");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        menuUpdate.setText("User information");
        menuUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUpdateActionPerformed(evt);
            }
        });

        menuitemupdate.setText("update profile ");
        menuitemupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemupdateActionPerformed(evt);
            }
        });
        menuUpdate.add(menuitemupdate);

        menuitemdelete.setText("delete profile");
        menuitemdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemdeleteActionPerformed(evt);
            }
        });
        menuUpdate.add(menuitemdelete);

        menuitemUserprofile.setText("user profile");
        menuitemUserprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemUserprofileActionPerformed(evt);
            }
        });
        menuUpdate.add(menuitemUserprofile);

        jMenuBar1.add(menuUpdate);

        jMenu2.setText("Friends ");

        menuitemfriend.setText("View friend list");
        menuitemfriend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemfriendActionPerformed(evt);
            }
        });
        jMenu2.add(menuitemfriend);

        jMenuBar1.add(jMenu2);

        menuAnalytics.setText("Analytics");

        menuitemgender.setText("Gender Statistics");
        menuitemgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemgenderActionPerformed(evt);
            }
        });
        menuAnalytics.add(menuitemgender);

        jMenuItem2.setText("Age Statistics");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuAnalytics.add(jMenuItem2);

        jMenuItem3.setText("Gender statistics");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuAnalytics.add(jMenuItem3);

        jMenuItem4.setText("User Statistics");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuAnalytics.add(jMenuItem4);

        jMenuBar1.add(menuAnalytics);

        menuLogout.setText("Log out");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });

        menuitem1SignOut.setText("sign out");
        menuitem1SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem1SignOutActionPerformed(evt);
            }
        });
        menuLogout.add(menuitem1SignOut);

        jMenuBar1.add(menuLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(btnprevious)
                .addGap(53, 53, 53)
                .addComponent(btnnext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panel2)
                        .addComponent(panel1)
                        .addComponent(panel4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnext)
                    .addComponent(btnprevious))
                .addContainerGap(395, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        if (intDisplay < (maxUsers)) {
            displayUsers(intDisplay);
            intDisplay += 4;
        }

    }//GEN-LAST:event_btnnextActionPerformed

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (intDisplay > 3) {
            intDisplay -= 4;
            displayUsers(intDisplay);

        }

    }//GEN-LAST:event_btnpreviousActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        mainDisplayForm mdf = new mainDisplayForm();
        mdf.runMain();
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuitemupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemupdateActionPerformed
        // TODO add your handling code here:
        updateForm uf = new updateForm();
        uf.runMain();
        this.setVisible(false);
    }//GEN-LAST:event_menuitemupdateActionPerformed

    private void menuitemdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemdeleteActionPerformed
        // TODO add your handling code here:
        deleteform df = new deleteform();
        df.runMain();
        this.setVisible(false);
    }//GEN-LAST:event_menuitemdeleteActionPerformed

    private void menuitemUserprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemUserprofileActionPerformed
        // TODO add your handling code here:

        userProfileForm upf = new userProfileForm();
        upf.runMain();
        this.setVisible(false);
    }//GEN-LAST:event_menuitemUserprofileActionPerformed

    private void menuUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUpdateActionPerformed

    }//GEN-LAST:event_menuUpdateActionPerformed

    private void menuitemfriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemfriendActionPerformed
        // TODO add your handling code here:
        friendform ff = new friendform();
        ff.runMain();
        this.setVisible(false);
    }//GEN-LAST:event_menuitemfriendActionPerformed

    private void menuitemgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemgenderActionPerformed

        PetStatisticsFriendForm psff = new PetStatisticsFriendForm();
        psff.runMain();
        this.setVisible(false);
    }//GEN-LAST:event_menuitemgenderActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        PetStaticticsAgeForm psff = new PetStaticticsAgeForm();
        psff.runMain();
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        PetStatisticsGenderForm psgf = new PetStatisticsGenderForm();
        psgf.runMain();
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        PetStatisticsUsers psu = new PetStatisticsUsers();
        psu.runMain();
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void menuitem1SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem1SignOutActionPerformed
        // TODO add your handling code here:
        loggedInInfo.setUsername("");
        loggedInInfo.setPassword("");
        welcomeForm wf = new welcomeForm();
        wf.runMain();
        this.setVisible(false);
    }//GEN-LAST:event_menuitem1SignOutActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(allUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new allUsersForm().setVisible(true);
            }
        });
    }

    //displays user based on units
    public void displayUsers(int unit) {
        /*      	Graph<Animal> g = Filehandlers.GetFromFile();
		int size = 0;
             Animal updateAnimal = null;
		String str = "";
                int displaySize = 1;
             for (Graph.Vertex v : g.getVertices()) {

                  str+= displaySize + "." + g.getVertices().get(size).getValue().getName() + "\n";
		displaySize+=1;	
                  size += 1;
		}
         */
        if (unit < (maxUsers - 4)) {
            ImageIcon icon = new ImageIcon(getClass().getResource(g.getVertices().get(unit).getValue().getimagePath()));
            //ImageIcon icon = new ImageIcon(g.getVertices().get(unit).getValue().getimagePath());
            //scaling image to fit in jlael
            System.out.println("allUsersForm.displayUsers():p1:" + g.getVertices().get(unit).getValue().getimagePath());
            Image img = icon.getImage();
            Image imgScale = img.getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH);
            //lblimage.setIcon(icon);
            ImageIcon scaledImage = new ImageIcon(imgScale);
            lbl1.setIcon(scaledImage);

            // ImageIcon icon2 = new ImageIcon(g.getVertices().get(unit + 1).getValue().getimagePath());
            ImageIcon icon2 = new ImageIcon(g.getVertices().get(unit + 1).getValue().getimagePath());
            //scaling image to fit in jlael
            System.out.println("allUsersForm.displayUsers():p2:" + g.getVertices().get(unit + 1).getValue().getimagePath());
            Image img2 = icon2.getImage();
            Image imgScale2 = img2.getScaledInstance(lbl2.getWidth(), lbl2.getHeight(), Image.SCALE_SMOOTH);
            //lblimage.setIcon(icon);
            ImageIcon scaledImage2 = new ImageIcon(imgScale2);
            lbl2.setIcon(scaledImage2);

            //  ImageIcon icon3 = new ImageIcon(g.getVertices().get(unit + 2).getValue().getimagePath());
            ImageIcon icon3 = new ImageIcon(g.getVertices().get(unit + 2).getValue().getimagePath());
            //scaling image to fit in jlael
            System.out.println("allUsersForm.displayUsers():p3:" + g.getVertices().get(unit + 2).getValue().getimagePath());
            Image img3 = icon3.getImage();
            Image imgScale3 = img3.getScaledInstance(lbl3.getWidth(), lbl3.getHeight(), Image.SCALE_SMOOTH);
            //lblimage.setIcon(icon);
            ImageIcon scaledImage3 = new ImageIcon(imgScale3);
            lbl3.setIcon(scaledImage3);

            // ImageIcon icon4 = new ImageIcon(g.getVertices().get(unit + 3).getValue().getimagePath());
            ImageIcon icon4 = new ImageIcon(g.getVertices().get(unit + 3).getValue().getimagePath());

//scaling image to fit in jlael
            System.out.println("allUsersForm.displayUsers():p4:" + g.getVertices().get(unit + 3).getValue().getimagePath());
            Image img4 = icon4.getImage();
            Image imgScale4 = img4.getScaledInstance(lbl4.getWidth(), lbl4.getHeight(), Image.SCALE_SMOOTH);
            //lblimage.setIcon(icon);
            ImageIcon scaledImage4 = new ImageIcon(imgScale4);
            lbl4.setIcon(scaledImage4);

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprevious;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JMenu menuAnalytics;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuUpdate;
    private javax.swing.JMenuItem menuitem1SignOut;
    private javax.swing.JMenuItem menuitemUserprofile;
    private javax.swing.JMenuItem menuitemdelete;
    private javax.swing.JMenuItem menuitemfriend;
    private javax.swing.JMenuItem menuitemgender;
    private javax.swing.JMenuItem menuitemupdate;
    private javax.swing.JLayeredPane panel1;
    private javax.swing.JLayeredPane panel2;
    private javax.swing.JLayeredPane panel3;
    private javax.swing.JLayeredPane panel4;
    // End of variables declaration//GEN-END:variables
}
