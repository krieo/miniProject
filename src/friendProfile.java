
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
public class friendProfile extends javax.swing.JFrame {

    /**
     * Creates new form friendProfile
     */
    private static int userID = 0;

    /*
    public friendProfile(int id) {
        initComponents();
         
        CustomCusor();
        userID = id;
      
    }
     */
    public friendProfile() {
        initComponents();

        CustomCusor();
        // userID = 1;

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

    //for image
    public void scaleImage(String location) {
        //ImageIcon icon = new ImageIcon(location);
        ImageIcon icon = new ImageIcon(getClass().getResource(location));

//scaling image to fit in jlael
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(lblimage.getWidth(), lblimage.getHeight(), Image.SCALE_SMOOTH);
        //lblimage.setIcon(icon);
        ImageIcon scaledImage = new ImageIcon(imgScale);
        lblimage.setIcon(scaledImage);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtdislikes = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtgender = new javax.swing.JTextField();
        txtdescription = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblimage = new javax.swing.JLabel();
        txtbreed = new javax.swing.JTextField();
        txtlikes = new javax.swing.JTextField();
        lblprofile = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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

        txtdislikes.setEditable(false);
        txtdislikes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdislikesActionPerformed(evt);
            }
        });

        txtage.setEditable(false);

        jLabel5.setText("Type:");

        txttype.setEditable(false);
        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });

        jLabel11.setText("Description:");

        txtgender.setEditable(false);

        txtdescription.setEditable(false);

        jLabel6.setText("Gender:");

        jLabel7.setText("Breed:");

        txtbreed.setEditable(false);

        txtlikes.setEditable(false);

        lblprofile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblprofile.setText("Your Friends Profile");

        jLabel3.setText("Name:");

        jLabel8.setText("Likes:");

        txtname.setEditable(false);
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jLabel9.setText("Dislikes:");

        jLabel4.setText("Age:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdislikes)
                            .addComponent(txtlikes)
                            .addComponent(txtbreed)
                            .addComponent(txtdescription, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28)
                        .addComponent(txtgender))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname)
                            .addComponent(txttype)
                            .addComponent(txtage)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(495, 495, 495)))
                .addGap(202, 202, 202))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblprofile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtbreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtlikes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtdislikes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(181, 181, 181))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdislikesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdislikesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdislikesActionPerformed

    private void txttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

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

    public void display(int myID) {

        Graph<Animal> g = Filehandlers.GetFromFile();
        int size = myID;
        String str = "";

        //  Animal temp = g.getVertices().get(myID).getValue();
        Animal temp = g.getVertices().get(size).getValue();
        System.out.println("friendProfile.display(): myID:" + myID);
        System.out.println(".friendProfile.display():size:" + size);
        //   System.out.println(".run()"+ id);
        txtname.setText(temp.getName());
        txtage.setText(temp.getAge());
        txttype.setText(temp.getType());
        txtgender.setText(temp.getGender());
        txtbreed.setText(temp.getBreed());
        txtlikes.setText(temp.getLikes().get(0));
        txtdislikes.setText(temp.getDislikes().get(0));
        //      txtimage.setText(temp.getimagePath());
        txtdescription.setText(temp.getDescription());

        // ImageIcon icon = new ImageIcon(temp.getimagePath());
        ImageIcon icon = new ImageIcon(getClass().getResource(temp.getimagePath()));
        //scaling image to fit in jlael

        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(lblimage.getWidth(), lblimage.getHeight(), Image.SCALE_SMOOTH);
        //lblimage.setIcon(icon);
        ImageIcon scaledImage = new ImageIcon(imgScale);
        lblimage.setIcon(scaledImage);

    }

    public void runMain(int id) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new friendProfile().setVisible(true);
                display(id);
            }
        });
    }

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
            java.util.logging.Logger.getLogger(userProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new friendProfile().setVisible(true);
                //  display(userID);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private static javax.swing.JLabel lblimage;
    private javax.swing.JLabel lblprofile;
    private javax.swing.JMenu menuAnalytics;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuUpdate;
    private javax.swing.JMenuItem menuitem1SignOut;
    private javax.swing.JMenuItem menuitemUserprofile;
    private javax.swing.JMenuItem menuitemdelete;
    private javax.swing.JMenuItem menuitemfriend;
    private javax.swing.JMenuItem menuitemgender;
    private javax.swing.JMenuItem menuitemupdate;
    private static javax.swing.JTextField txtage;
    private static javax.swing.JTextField txtbreed;
    private static javax.swing.JTextField txtdescription;
    private static javax.swing.JTextField txtdislikes;
    private static javax.swing.JTextField txtgender;
    private static javax.swing.JTextField txtlikes;
    private static javax.swing.JTextField txtname;
    private static javax.swing.JTextField txttype;
    // End of variables declaration//GEN-END:variables
}
