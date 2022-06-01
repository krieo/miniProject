
import Animals.Animal;
import com.jwetherell.algorithms.data_structures.Graph;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Krieolin
 */
public class friendform extends javax.swing.JFrame {

    private int ratingAnimal;
    private Graph.Vertex<Animal> myVertex;
    private String direction = "";
    private static int didrun = 0;

    /**
     * Creates new form friendform
     */
    public friendform() {
        initComponents();
        dynamicDisplay();
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

    public void displayUser(int id, String mydirection) {
        Graph<Animal> g = Filehandlers.GetFromFile();

        //txtuser.setText(g.getVertices().get(id).getValue().getName());  
        if (mydirection.equals("from")) {
            direction = mydirection;
            //txtuser.setText(g.getEdges().get(id).getFromVertex().getValue().getName());
            var temp = g.getEdges().get(id).getFromVertex();
            int myId = 0;
            for (Graph.Vertex<Animal> graph : g.getVertices()) {
                if (temp.getValue() == graph.getValue()) {
                    temp = graph;
                    break;
                }
                myId++;
            }

            friendProfile fp = new friendProfile();
            fp.runMain(myId);
            this.setVisible(false);
        } else {
            direction = mydirection;
//  txtuser.setText(g.getEdges().get(id).getToVertex().getValue().getName());

            var temp = g.getEdges().get(id).getToVertex();
            int myId = 0;
            for (Graph.Vertex<Animal> graph : g.getVertices()) {
                if (temp.getValue() == graph.getValue()) {
                    temp = graph;
                    break;
                }
                myId++;
            }

            friendProfile fp = new friendProfile();
            fp.runMain(myId);
            this.setVisible(false);

        }

    }

    public void displayUserChat(int id, String mydirection) {
        Graph<Animal> g = Filehandlers.GetFromFile();

        //txtuser.setText(g.getVertices().get(id).getValue().getName());  
        if (mydirection.equals("from")) {
            direction = mydirection;
            //txtuser.setText(g.getEdges().get(id).getFromVertex().getValue().getName());
            var temp = g.getEdges().get(id).getFromVertex();
            int myId = 0;
            for (Graph.Vertex<Animal> graph : g.getVertices()) {
                if (temp.getValue() == graph.getValue()) {
                    temp = graph;
                    break;
                }
                myId++;
            }

            chatform fp = new chatform();
            fp.runMain("", myId);
            this.setVisible(false);

        } else {
            direction = mydirection;
//  txtuser.setText(g.getEdges().get(id).getToVertex().getValue().getName());

            var temp = g.getEdges().get(id).getToVertex();
            int myId = 0;
            for (Graph.Vertex<Animal> graph : g.getVertices()) {
                if (temp.getValue() == graph.getValue()) {
                    temp = graph;
                    break;
                }
                myId++;
            }

            chatform fp = new chatform();
            fp.runMain("", myId);
            this.setVisible(false);

        }
    }

    public void dynamicDisplay() {
        boolean hasFriends = false;
        Graph<Animal> g = Filehandlers.GetFromFile();
        int size = 0;
        Animal temp = null;
        String str = "";
        int displaySize = 1;
        Animal userAnimal = null;

        for (Graph.Vertex v : g.getVertices()) {
            if (g.getVertices().get(size).getValue().getUsername().equals(loggedInInfo.getUsername()) && g.getVertices().get(size).getValue().getPassword().equals(loggedInInfo.getPassword())) {
                userAnimal = g.getVertices().get(size).getValue();
                myVertex = g.getVertices().get(size);
            }
            size++;
        }

        if (userAnimal == null) {
            userAnimal = g.getVertices().get(1).getValue();
            myVertex = g.getVertices().get(1);
        }
        size = 0;
        for (Graph.Edge<Animal> v : g.getEdges()) {

            if (v.getToVertex().getValue() == userAnimal) {
                str += displaySize + "." + v.getFromVertex().getValue().getName() + "\n";

                temp = v.getFromVertex().getValue();
                // JLabel lblimage = new JLabel();
                //ImageIcon icon = new ImageIcon(temp.getimagePath());
                ImageIcon icon = new ImageIcon(getClass().getResource(temp.getimagePath()));
//scaling image to fit in jlael

                Image img = icon.getImage();
                Image imgScale = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                //lblimage.setIcon(icon);
                ImageIcon scaledImage = new ImageIcon(imgScale);
                // lblimage.setIcon(scaledImage);
                JButton myButton = new JButton(scaledImage);
                hasFriends = true;
                int vertextPostion = size;
                /*
     for(Graph.Vertex<Animal> a : g.getVertices())
     {
       if(a.getValue() == v.getFromVertex().getValue())
       {
           
       break;
       }
         vertextPostion++;
     }
                 */
                myButton.setName(String.valueOf(vertextPostion));
                myButton.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //your actions
                        //   txtuser.setText("");
                        displayUser(Integer.parseInt(myButton.getName()), "from");

                    }
                });
                // panelusers.add(new JButton(scaledImage));
                panelusers.add(myButton);
                //panelusers.add(new JLabel(""));
                panelusers.validate();
                panelusers.repaint();

                JButton myButton2 = new JButton(scaledImage);

                myButton2.setName(String.valueOf(vertextPostion));
                myButton2.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //your actions
                        //   txtuser.setText("");
                        displayUserChat(Integer.parseInt(myButton2.getName()), "from");

                    }
                });
                // panelusers.add(new JButton(scaledImage));
                panelchat.add(myButton2);
                //panelusers.add(new JLabel(""));
                panelchat.validate();
                panelchat.repaint();

                System.out.println("RateForm.dynamicDisplay():TO" + temp.getimagePath());
            } else if (v.getFromVertex().getValue() == userAnimal) {
                str += displaySize + "." + v.getToVertex().getValue().getName() + "\n";

                temp = v.getToVertex().getValue();
                // JLabel lblimage = new JLabel();
                //   ImageIcon icon = new ImageIcon(temp.getimagePath());
                ImageIcon icon = new ImageIcon(getClass().getResource(temp.getimagePath()));
                //scaling image to fit in jlael

                Image img = icon.getImage();
                Image imgScale = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                //lblimage.setIcon(icon);
                ImageIcon scaledImage = new ImageIcon(imgScale);
                // lblimage.setIcon(scaledImage);
                JButton myButton = new JButton(scaledImage);
                hasFriends = true;
                int vertextPostion = size;
                /*
       for(Graph.Vertex<Animal> a : g.getVertices())
     {
       if(a.getValue() == v.getToVertex().getValue())
       {
           
       break;
       }
         vertextPostion++;
     }*/
                myButton.setName(String.valueOf(vertextPostion));
                //myButton.setName(String.valueOf(size));

                myButton.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //your actions
                        displayUser(Integer.parseInt(myButton.getName()), "to");
                    }
                });
                // panelusers.add(new JButton(scaledImage));
                panelusers.add(myButton);
                //panelusers.add(new JLabel(""));
                panelusers.validate();
                panelusers.repaint();

                JButton myButton2 = new JButton(scaledImage);
                myButton2.setName(String.valueOf(vertextPostion));
                //myButton.setName(String.valueOf(size));

                myButton2.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //your actions
                        displayUserChat(Integer.parseInt(myButton2.getName()), "to");
                    }
                });
                // panelusers.add(new JButton(scaledImage));
                panelchat.add(myButton2);
                //panelusers.add(new JLabel(""));
                panelchat.validate();
                panelchat.repaint();

                System.out.println("RateForm.dynamicDisplay():From");
                System.out.println("RateForm.dynamicDisplay()" + temp.getimagePath());
            }

            displaySize += 1;
            size += 1;
        }

        if (hasFriends == false) {
            if (didrun == 0) {
                JOptionPane.showMessageDialog(null, "It looks like you don't have any friends as yet, why don't you go to the home screen and click some profiles to send some friend requests", "Lets get you a pal", JOptionPane.INFORMATION_MESSAGE);
                didrun++;
            }
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelusers = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelchat = new javax.swing.JPanel();
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
        setTitle("Friend list");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Your Friend list: why don't you click on one of them to view their profile!");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("want to chat? click one of these!");

        panelusers.setAutoscrolls(true);
        panelusers.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane1.setViewportView(panelusers);

        panelchat.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane2.setViewportView(panelchat);

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
            .addComponent(jScrollPane2)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(377, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    public void runMain() {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new friendform().setVisible(true);
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
            java.util.logging.Logger.getLogger(friendform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(friendform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(friendform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(friendform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new friendform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuAnalytics;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuUpdate;
    private javax.swing.JMenuItem menuitem1SignOut;
    private javax.swing.JMenuItem menuitemUserprofile;
    private javax.swing.JMenuItem menuitemdelete;
    private javax.swing.JMenuItem menuitemfriend;
    private javax.swing.JMenuItem menuitemgender;
    private javax.swing.JMenuItem menuitemupdate;
    private javax.swing.JPanel panelchat;
    private javax.swing.JPanel panelusers;
    // End of variables declaration//GEN-END:variables
}
