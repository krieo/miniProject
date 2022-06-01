
import Animals.Animal;
import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Krieolin
 */
public class mainDisplayForm extends javax.swing.JFrame {

    private static int intDisplay = 0;

    /**
     * Creates new form mainDisplayForm
     */
    public mainDisplayForm() {
        initComponents();
        CustomCusor();
        dynamicDisplay();
        displayBestFriends();

        // ImageIcon icon = new ImageIcon("src//images//logo5.png");//src//images//doodles.png
        ImageIcon icon = new ImageIcon(getClass().getResource("logo77.png"));
//scaling image to fit in jlael
        //  lblicon.size().setSize(5000, 300);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(lblicon.getWidth(), lblicon.getHeight(), Image.SCALE_SMOOTH);
        //lblimage.setIcon(icon);
        ImageIcon scaledImage = new ImageIcon(imgScale);
        // lblbackground.setIcon(scaledImage);
        lblicon.setIcon(scaledImage);

        //ImageIcon icon2 = new ImageIcon("src//images//logo6.png");//src//images//doodles.png
        ImageIcon icon2 = new ImageIcon(getClass().getResource("logoall2.png"));
        //scaling image to fit in jlael
        //  lblicon.size().setSize(5000, 300);
        Image img2 = icon2.getImage();
        Image imgScale2 = img2.getScaledInstance(lblheading.getWidth(), lblheading.getHeight(), Image.SCALE_SMOOTH);
        //lblimage.setIcon(icon);
        ImageIcon scaledImage2 = new ImageIcon(imgScale2);
        // lblbackground.setIcon(scaledImage);
        lblheading.setIcon(scaledImage2);
// this.setBackground(scaledImage);
    }

    public void displayBestFriends() {
        Graph<Animal> graph = Filehandlers.GetFromFile();

        int i = 1;
        String strFriends = "";

        ArrayList<valueSorting> sortList = new ArrayList<>();

        int location = 0;
        for (Graph.Edge<Animal> g : graph.getEdges()) {

            if (g.getFromVertex().getValue().getUsername().equals(loggedInInfo.getUsername())) {
                Animal temp = g.getToVertex().getValue();
                valueSorting value = new valueSorting(location, g.getCost(), temp.getName());
                sortList.add(value);
                strFriends += i + ".Name: " + temp.getName() + "\n";
                strFriends += "Relationship strength: " + g.getCost() + "\n";

                i++;
            } else if (g.getToVertex().getValue().getUsername().equals(loggedInInfo.getUsername())) {
                Animal temp = g.getFromVertex().getValue();
                valueSorting value = new valueSorting(location, g.getCost(), temp.getName());
                sortList.add(value);

                strFriends += i + ".Name: " + temp.getName() + "\n";
                strFriends += "Relationship strength: " + g.getCost() + "\n";
                i++;
            }

            location++;
        }
        if (i == 1) {

            strFriends += "It looks like you don't have any friend as yet! why don't you click on the user profiles to add some";

            if (intDisplay == 0) {
                JOptionPane.showMessageDialog(null, "It looks like this is your first time here. Welcome to Pet pals the virtual playground for pets to meet.", "Welcome new user",
                        JOptionPane.INFORMATION_MESSAGE);
                intDisplay += 1;
            }

        }

        int displaySize = 1;
        Collections.sort(sortList, new Comparator<valueSorting>() {
            public int compare(valueSorting c1, valueSorting c2) {
                if (c1.value2 > c2.value2) {
                    return -1;
                }
                if (c1.value2 < c2.value2) {
                    return 1;
                }
                return 0;
            }
        });

        displaySize = 1;
        strFriends = "";
        for (valueSorting v : sortList) {

            //str+= displaySize + "." + g.getVertices().get(v.value1).getValue().getName() +" friends: " + v.value2 +"\n";
            strFriends += displaySize + ".Name: " + v.name + "\n";
            strFriends += "Relationship strength: " + v.value2 + "\n";

            displaySize += 1;
        }
        txtareabestfriend.setText(strFriends);
    }

    public void dynamicDisplay() {

        Graph<Animal> g = Filehandlers.GetFromFile();
        int size = 0;
        Animal temp = null;
        String str = "";
        int displaySize = 1;
        for (Graph.Vertex v : g.getVertices()) {

            if (g.getVertices().get(size).getValue().getUsername().equals(loggedInInfo.getUsername()) && g.getVertices().get(size).getValue().getPassword().equals(loggedInInfo.getPassword())) {
                Animal userAnimal = g.getVertices().get(size).getValue();
                String strtxt = "";
                strtxt += "Name:" + userAnimal.getName() + "\n";
                strtxt += "Description:" + userAnimal.getDescription() + "\n";
                //ImageIcon icon = new ImageIcon(userAnimal.getimagePath());  //uncomment here
                System.out.println("mainDisplayForm.dynamicDisplay():" + userAnimal.getimagePath());
                ImageIcon icon = new ImageIcon(getClass().getResource(userAnimal.getimagePath()));
//scaling image to fit in jlael

                Image img = icon.getImage();
                Image imgScale = img.getScaledInstance(lblsideimage.getWidth(), lblsideimage.getHeight(), Image.SCALE_SMOOTH);
                //lblimage.setIcon(icon);
                ImageIcon scaledImage = new ImageIcon(imgScale);
                lblsideimage.setIcon(scaledImage);
                jTextArea1.setText(strtxt);
            }
            str += displaySize + "." + g.getVertices().get(size).getValue().getName() + "\n";

            temp = g.getVertices().get(size).getValue();
            // JLabel lblimage = new JLabel();
            // ImageIcon icon = new ImageIcon(temp.getimagePath());
            ImageIcon icon = new ImageIcon(getClass().getResource(temp.getimagePath()));
//scaling image to fit in jlael

            Image img = icon.getImage();
            Image imgScale = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            //lblimage.setIcon(icon);
            ImageIcon scaledImage = new ImageIcon(imgScale);
            // lblimage.setIcon(scaledImage);

            JButton myButton = new JButton(scaledImage);
            myButton.setName(String.valueOf(size));

            myButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    //your actions
                    setFriend(Integer.parseInt(myButton.getName()));
                    System.out.println(".actionPerformed(): " + myButton.getName());
                }
            });
            //panelusers.add(new JLabel(""));
            panelusers.add(myButton);

            panelusers.validate();
            panelusers.repaint();
            displaySize += 1;
            size += 1;

        }
    }

    public void setFriend(int location) {
        Graph<Animal> graph = Filehandlers.GetFromFile();
        Vertex<Animal> userVertex = null;
        Vertex<Animal> friendVertex = null;
        int size = 0;
        for (Vertex<Animal> g : graph.getVertices()) {
            if (size == location) {
                friendVertex = g;
            }

            if (g.getValue().getUsername().equals(loggedInInfo.getUsername()) && g.getValue().getPassword().equals(loggedInInfo.getPassword())) {
                userVertex = g;
            }
            size++;
        }

        if (userVertex == null || friendVertex == null) {
            JOptionPane.showMessageDialog(null, "Unable to add this friend at the moment please try again", "Please try again with a new friend",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {
            Edge<Animal> edge = new Edge<>(1, userVertex, friendVertex);
            graph.getEdges().add(edge);
            Filehandlers.saveToFile(graph);
            JOptionPane.showMessageDialog(null, "Friend request sent to " + friendVertex.getValue().getName(), "Friend request sent",
                    JOptionPane.INFORMATION_MESSAGE);
            String setFriendText = txtareabestfriend.getText();
            setFriendText += "\n.Name: " + friendVertex.getValue().getName() + "\n";
            setFriendText += "Relationship strength: Pending friend request" + "\n";
            txtareabestfriend.setText(setFriendText);
        }

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

        jScrollPane2 = new javax.swing.JScrollPane();
        panelusers = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblicon = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelside = new javax.swing.JPanel();
        lblsidepanel = new javax.swing.JLabel();
        lblsideimage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnchatwithfriend = new javax.swing.JButton();
        btnrate = new javax.swing.JButton();
        btnrandomchat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblheading = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtusers = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtareabestfriend = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
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
        setTitle("Home");
        setBackground(new java.awt.Color(51, 255, 255));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setAutoscrolls(true);

        panelusers.setAutoscrolls(true);
        panelusers.setMinimumSize(new java.awt.Dimension(30000, 30000));
        panelusers.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane2.setViewportView(panelusers);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Users you might be interested in. Click their profile picture to add them as a friend!");

        lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo3.png"))); // NOI18N

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setToolTipText("");
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelside.setBackground(new java.awt.Color(255, 153, 51));

        lblsidepanel.setBackground(new java.awt.Color(0, 0, 0));
        lblsidepanel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblsidepanel.setText("                   You");
        lblsidepanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        javax.swing.GroupLayout panelsideLayout = new javax.swing.GroupLayout(panelside);
        panelside.setLayout(panelsideLayout);
        panelsideLayout.setHorizontalGroup(
            panelsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsideLayout.createSequentialGroup()
                .addGroup(panelsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblsideimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblsidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelsideLayout.setVerticalGroup(
            panelsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsideLayout.createSequentialGroup()
                .addComponent(lblsidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsideimage, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 361, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(panelside);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        btnchatwithfriend.setText("Chat with friend");
        btnchatwithfriend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchatwithfriendActionPerformed(evt);
            }
        });

        btnrate.setText("Rate play date");
        btnrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrateActionPerformed(evt);
            }
        });

        btnrandomchat.setText("Random chat");
        btnrandomchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrandomchatActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Quick picks");

        jLabel5.setText("These are some quick picks around the platform, you can also use the navigational tags on the top to move around");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnchatwithfriend, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnrate, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnrandomchat, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnchatwithfriend, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrandomchat, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(20000, 20000));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Top Users");

        txtusers.setEditable(false);
        txtusers.setColumns(20);
        txtusers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtusers.setRows(5);
        jScrollPane1.setViewportView(txtusers);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19763, 19763, 19763))
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        txtareabestfriend.setEditable(false);
        txtareabestfriend.setColumns(20);
        txtareabestfriend.setLineWrap(true);
        txtareabestfriend.setRows(5);
        txtareabestfriend.setWrapStyleWord(true);
        jScrollPane5.setViewportView(txtareabestfriend);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Your best friends!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea1);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblheading, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblheading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnchatwithfriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchatwithfriendActionPerformed
        // TODO add your handling code here:
        //  chatform cf = new chatform();
        // cf.runMain();
        friendform ff = new friendform();
        ff.runMain();
        this.setVisible(false);
    }//GEN-LAST:event_btnchatwithfriendActionPerformed

    private void btnrandomchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrandomchatActionPerformed
        // TODO add your handling code here:
        chatform cf = new chatform();
        int random = ThreadLocalRandom.current().nextInt(0, 24);
        cf.runMain("random", random);
        this.setVisible(false);
    }//GEN-LAST:event_btnrandomchatActionPerformed

    private void btnrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrateActionPerformed
        // TODO add your handling code here:
        RateForm rf = new RateForm();
        rf.runMain();
        this.setVisible(false);

    }//GEN-LAST:event_btnrateActionPerformed

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

    public static void runMain() {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ///

                Graph<Animal> g = Filehandlers.GetFromFile();
                int size = 0;
                Animal updateAnimal = null;
                String str = "";
                int displaySize = 1;
                ArrayList<valueSorting> sortList = new ArrayList();

                for (Graph.Vertex v : g.getVertices()) {
                    valueSorting value = new valueSorting(size, g.getVertices().get(size).getWeight());
                    sortList.add(value);
                    //     str+= displaySize + "." + g.getVertices().get(size).getValue().getName() +" friend: " + g.getVertices().get(size).getWeight() +"\n";
                    size += 1;
                }

                size = 0;
                //     for (Graph.Vertex v : g.getVertices()) {

                //     str+= displaySize + "." + g.getVertices().get(size).getValue().getName() +" friend: " + g.getVertices().get(size).getWeight() +"\n";
//		displaySize+=1;	
                //                size += 1;
                //	}
///  
                size = 0;
                Collections.sort(sortList, new Comparator<valueSorting>() {
                    public int compare(valueSorting c1, valueSorting c2) {
                        if (c1.value2 > c2.value2) {
                            return -1;
                        }
                        if (c1.value2 < c2.value2) {
                            return 1;
                        }
                        return 0;
                    }
                });

                displaySize = 1;
                for (valueSorting v : sortList) {

                    str += displaySize + "." + g.getVertices().get(v.value1).getValue().getName() + " friends: " + v.value2 + "\n";

                    displaySize += 1;
                }

                new mainDisplayForm().setVisible(true);
                txtusers.setText(str);
            }
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
  
public void run() {
                          try {
          //          BufferedImage img = ImageIO.read(new File("animal1.jpg"));
         // Image img2 = img.getScaledInstance(WIDTH, HEIGHT, WIDTH);
         // ImageIcon i = new ImageIcon(img2);
        //lblimage.setIcon(i);
                    System.out.println("hello");
                } catch (Exception ex) {
                              System.out.println(ex.getMessage());
                }
                          ///

        	Graph<Animal> g = Filehandlers.GetFromFile();
		int size = 0;
             Animal updateAnimal = null;
		String str = "";
                int displaySize = 1;
             for (Graph.Vertex v : g.getVertices()) {

                 str+= displaySize + "." + g.getVertices().get(size).getValue().getName() +" friend: " + g.getVertices().get(size).getWeight() +"\n";
		displaySize+=1;	
                  size += 1;
		}

///                          
                new mainDisplayForm().setVisible(true);
txtusers.setText(str);      
            }
        });
         */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchatwithfriend;
    private javax.swing.JButton btnrandomchat;
    private javax.swing.JButton btnrate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblheading;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblsideimage;
    private javax.swing.JLabel lblsidepanel;
    private javax.swing.JMenu menuAnalytics;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuUpdate;
    private javax.swing.JMenuItem menuitem1SignOut;
    private javax.swing.JMenuItem menuitemUserprofile;
    private javax.swing.JMenuItem menuitemdelete;
    private javax.swing.JMenuItem menuitemfriend;
    private javax.swing.JMenuItem menuitemgender;
    private javax.swing.JMenuItem menuitemupdate;
    private javax.swing.JPanel panelside;
    private javax.swing.JPanel panelusers;
    private javax.swing.JTextArea txtareabestfriend;
    private static javax.swing.JTextArea txtusers;
    // End of variables declaration//GEN-END:variables
}
