import Animals.Animal;
import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.RefineryUtilities; 
/**
 *
 * @author Krieolin
 */
public class PetStatisticsGenderForm extends javax.swing.JFrame {

    /**
     * Creates new form PetStatisticsGenderForm
     */
    public PetStatisticsGenderForm() {
        initComponents();
 
      JFreeChart barChart = ChartFactory.createPieChart("Male versus Female", createDataset());         
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
      setContentPane( chartPanel ); 
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
  private static PieDataset createDataset( ) {
      Graph<Animal> graph = Filehandlers.GetFromFile();
      int maleFriends = 0;
      int femaleFriends = 0;
      int totalFriends = 0;
      for(Edge<Animal> g: graph.getEdges())
      {
      
          if(g.getFromVertex().getValue().getGender().equals("Male"))
          {
          maleFriends += 1;
          }
          else
          {
          femaleFriends+=1;
          }
          
          totalFriends+=1;
      }
    
      
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue("Male: " + maleFriends , maleFriends );  
      dataset.setValue( "Female: " + femaleFriends , femaleFriends );   
      dataset.setValue( "Total users " + totalFriends , 0 );   
     
      return dataset;         
   }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        setTitle("Gender Pet Statistics");

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
            .addGap(0, 876, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
   public static void runMain()
    {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetStatisticsGenderForm().setVisible(true);
                   PetStatisticsGenderForm chart = new PetStatisticsGenderForm();
      chart.pack( );        
      RefineryUtilities.centerFrameOnScreen( chart );        
      chart.setVisible( false ); 
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
            java.util.logging.Logger.getLogger(PetStatisticsFriendForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetStatisticsFriendForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetStatisticsFriendForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetStatisticsFriendForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetStatisticsGenderForm().setVisible(true);
                   PetStatisticsGenderForm chart = new PetStatisticsGenderForm();
      chart.pack( );        
      RefineryUtilities.centerFrameOnScreen( chart );        
      chart.setVisible( false ); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu menuAnalytics;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuUpdate;
    private javax.swing.JMenuItem menuitem1SignOut;
    private javax.swing.JMenuItem menuitemUserprofile;
    private javax.swing.JMenuItem menuitemdelete;
    private javax.swing.JMenuItem menuitemfriend;
    private javax.swing.JMenuItem menuitemgender;
    private javax.swing.JMenuItem menuitemupdate;
    // End of variables declaration//GEN-END:variables
}
