package Snake_bkg_v4;

import static java.lang.Thread.sleep;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Snake_Panel_v3 extends javax.swing.JFrame {

    final int H = 15;
    boolean logo, you_can_play, sound;
    int cpt_logo, leeward, lenght_max, xhead, xhead_save, yhead, yhead_save, cpt_DB;
    DB_positions[] DB = new DB_positions[2];
    DB_jlebel[] DB_jlebel = new DB_jlebel[81];
    Random new_position = new Random();
    Mp3_File Play_sounds = new Mp3_File();

    ImageIcon A = new ImageIcon(getClass().getResource("/image/bookmark_on.png"));
    ImageIcon a = new ImageIcon(getClass().getResource("/image/bookmark_on1.png"));
    ImageIcon C = new ImageIcon(getClass().getResource("/image/wapper_max.png"));
    ImageIcon D = new ImageIcon(getClass().getResource("/image/wapper_min.png"));
    ImageIcon new_img = new ImageIcon(getClass().getResource("/image/body.png"));
    ImageIcon face_look_down = new ImageIcon(getClass().getResource("/image/face-look-down.png"));
    ImageIcon face_look_up = new ImageIcon(getClass().getResource("/image/face-look-up.png"));
    ImageIcon face_look_right = new ImageIcon(getClass().getResource("/image/face-look-right.png"));
    ImageIcon face_look_left = new ImageIcon(getClass().getResource("/image/face-look-left.png"));

    public Snake_Panel_v3() {

        initComponents();
        logo = true;
        sound = false;
        cpt_logo = 0;
        leeward = 2;
        xhead = part1.getX();
        yhead = part1.getY();
        lenght_max = 4;
        DB_jlebel[0] = null;
        DB_jlebel[1] = new DB_jlebel(part1);
        DB_jlebel[2] = new DB_jlebel(part2);
        DB_jlebel[3] = new DB_jlebel(part3);
        DB_jlebel[4] = new DB_jlebel(part4);
        cpt_DB = 0;

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        wapper.setIcon(C);
                        sleep(170);
                        wapper.setIcon(D);
                        sleep(170);
                    } catch (InterruptedException ex) {
                        //    Logger.getLogger(Snake_Panel_v3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } //end while
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    if (logo) {
                        try {
                            draw_2();
                            cpt_logo++;
                            if (cpt_logo == 2) {
                                jPanel2.setVisible(false);
                                jPanel1.setVisible(true);
                                logo = false;
                            }
                        } catch (InterruptedException ex) {
                            //    Logger.getLogger(Snake_Panel_v3.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }// end if 1
                    jPanel2.setVisible(false);
                    if (!logo) {
                        eat_wapper();
                        Snake_Go(true);
                        play_in_frame();
                        are_you_lose();
                    }// end if 2 

                }//end while 
            }
        }.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        part1 = new javax.swing.JLabel();
        part2 = new javax.swing.JLabel();
        part3 = new javax.swing.JLabel();
        part4 = new javax.swing.JLabel();
        wapper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snake");
        setResizable(false);
        setSize(new java.awt.Dimension(645, 540));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel2.setMaximumSize(new java.awt.Dimension(645, 540));
        jPanel2.setPreferredSize(new java.awt.Dimension(645, 540));
        jPanel2.setLayout(null);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Snake_1.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 60, 650, 160);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bookmark_on1.png"))); // NOI18N
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(410, 330, 45, 42);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bookmark_on1.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(360, 330, 45, 42);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bookmark_on1.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(310, 330, 45, 42);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bookmark_on1.png"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(260, 330, 45, 42);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bookmark_on1.png"))); // NOI18N
        jLabel12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel12KeyPressed(evt);
            }
        });
        jPanel2.add(jLabel12);
        jLabel12.setBounds(210, 330, 45, 42);

        getContentPane().add(jPanel2, "card3");

        jPanel1.setMaximumSize(new java.awt.Dimension(645, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(645, 540));
        jPanel1.setLayout(null);

        part1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/face-look-right.png"))); // NOI18N
        jPanel1.add(part1);
        part1.setBounds(165, 345, 15, 15);

        part2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/body.png"))); // NOI18N
        jPanel1.add(part2);
        part2.setBounds(150, 345, 15, 15);

        part3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/body.png"))); // NOI18N
        jPanel1.add(part3);
        part3.setBounds(135, 345, 15, 15);

        part4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/body.png"))); // NOI18N
        jPanel1.add(part4);
        part4.setBounds(120, 345, 15, 15);

        wapper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wapper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/wapper_max.png"))); // NOI18N
        jPanel1.add(wapper);
        wapper.setBounds(330, 90, 15, 15);

        getContentPane().add(jPanel1, "card4");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if (evt.getKeyCode() == evt.VK_RIGHT) {
            //key_pressed=20;
            if (leeward != 4 && leeward != 2 /*&& xhead>=0 && xhead + H <=645 && yhead>=0 && yhead + H<=540*/) {
                xhead = part1.getX() + H;
                yhead = part1.getY();
                leeward = 2;
                part1.setIcon(face_look_right);
                Draw_Snake_Body(false);
            }
        }//VK RIGHT

        if (evt.getKeyCode() == evt.VK_LEFT) {
            //key_pressed=21;
            if (leeward != 2 && leeward != 4 /*&& xhead>=0 && xhead + H<=645 && yhead>=0 && yhead + H <=540*/) {
                xhead = part1.getX() - H;
                yhead = part1.getY();
                leeward = 4;
                part1.setIcon(face_look_left);
                Draw_Snake_Body(false);
            }

        }// VK LEFT

        if (evt.getKeyCode() == evt.VK_UP) {
            //key_pressed=22;
            if (leeward != 3 && leeward != 1 /*&& yhead>=0 && yhead + H<=540 && xhead>=0 && xhead + H<=645*/) {
                xhead = part1.getX();
                yhead = part1.getY() - H;
                leeward = 1;
                part1.setIcon(face_look_up);
                Draw_Snake_Body(false);
            }
        }// VK UP

        if (evt.getKeyCode() == evt.VK_DOWN) {
            //key_pressed=23;
            if (leeward != 1 && leeward != 3 /*&& yhead>=0 && yhead + H<=540 && xhead>=0 && xhead + H<=645*/) {
                xhead = part1.getX();
                yhead = part1.getY() + H;
                leeward = 3;
                part1.setIcon(face_look_down);
                Draw_Snake_Body(false);
            }
        }// VK DOWN

    }//GEN-LAST:event_formKeyPressed

    private void jLabel12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel12KeyPressed

    }//GEN-LAST:event_jLabel12KeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated
    /**
     * ***************** part of methods *************************
     */
    public void just_sleep() {
        try {
            sleep(40);
        } catch (InterruptedException ex) {
        }
    }

    /**
     * **************************************************
     */
    public void play_sounds() {
        Play_sounds.eat_sound();
    }

    /**
     * ***************************************************
     */
    public void Snake_Go(boolean b) {

        if (leeward == 1) {
            yhead -= H;
            Draw_Snake_Body(true);
        }

        if (leeward == 2) {
            xhead += H;
            Draw_Snake_Body(true);
        }

        if (leeward == 3) {
            yhead += H;
            Draw_Snake_Body(true);
        }

        if (leeward == 4) {
            xhead -= H;
            Draw_Snake_Body(true);
        }
        if (b == true) {
            just_sleep();
        }

    }

    /**
     * ***************************************************
     */
    public void Draw_Snake_Body(boolean b) {

        for (int i = 1; i < lenght_max + 1; i++) {

            if (i <= lenght_max) {

                if (cpt_DB % 2 == 0) {

                    DB[0] = new DB_positions(DB_jlebel[i].d.getX(), DB_jlebel[i].d.getY());
                } else {

                    DB[1] = new DB_positions(DB_jlebel[i].d.getX(), DB_jlebel[i].d.getY());
                }
            }
            if (i == 1) {

                DB_jlebel[i].d.setLocation(xhead, yhead);
                cpt_DB++;
            } else {

                cpt_DB++;
                if (cpt_DB % 2 == 0) {

                    DB_jlebel[i].d.setLocation(DB[0].x, DB[0].y);
                } else {
                    DB_jlebel[i].d.setLocation(DB[1].x, DB[1].y);
                }
            }
        }
        if (b == true) {
            just_sleep();
        }
    }

    /**
     * ***************************************************
     */
    public void are_you_lose() {

        String part1_SV = part1.getBounds().toString();
        for (int i = 2; i < lenght_max + 1; i++) {
            if (part1_SV.equals(DB_jlebel[i].d.getBounds().toString())) {
                System.out.println("you lose");
            }
        }

    }

    /**
     * ***************************************************
     */
    public void eat_wapper() {

        if (xhead == wapper.getX() && yhead == wapper.getY()) {
            //if (part1.getX() == wapper.getX() && part1.getY() == wapper.getY()) {    
            play_sounds();
            add_new_part();
            wapper.setVisible(false);
            new_position_for_wapper();
        } else {
            if (DB_jlebel[2].d.getX() == wapper.getX() && DB_jlebel[2].d.getY() == wapper.getY()) {
                play_sounds();
                add_new_part();
                wapper.setVisible(false);
                new_position_for_wapper();
            }
        }
    }

    /**
     * *****************************************************************************
     */
    public void new_position_for_wapper() {
        int x, y, cpt;
        do {
            cpt = 0;
            do {
                x = new_position.nextInt(630);
            } while (x % 15 != 0);
            do {
                y = new_position.nextInt(525);
            } while (y % 15 != 0);

            for (int i = 1; i < lenght_max + 1; i++) {
                if (DB_jlebel[i].d.getX() != x && DB_jlebel[i].d.getY() != y) {
                    cpt++;
                } else {
                    cpt = 0;
                    break;
                }
            }
            /**
             * end for
             */
        } while (cpt != lenght_max);
        wapper.setLocation(x, y);
        wapper.setVisible(true);
    }

    /**
     * *****************************************************************************
     */
    public void add_new_part() {

        String s = "part";
        lenght_max++;
        s += String.valueOf(lenght_max);
        //javax.swing.JLabel d = new javax.swing.JLabel();
        JLabel d = new JLabel();
        d.setName(s);
        DB_jlebel[lenght_max] = new DB_jlebel(d);
        if (leeward == 1) {
            d.setBounds(DB_jlebel[lenght_max - 1].d.getY(), DB_jlebel[lenght_max - 1].d.getY() + H, 15, 15);
        }
        if (leeward == 2) {
            d.setBounds(DB_jlebel[lenght_max - 1].d.getY() - H, DB_jlebel[lenght_max - 1].d.getY(), 15, 15);
        }
        if (leeward == 3) {
            d.setBounds(DB_jlebel[lenght_max - 1].d.getY(), DB_jlebel[lenght_max - 1].d.getY() - H, 15, 15);
        }
        if (leeward == 4) {
            d.setBounds(DB_jlebel[lenght_max - 1].d.getY() + H, DB_jlebel[lenght_max - 1].d.getY(), 15, 15);
        }
        d.setIcon(new_img);
        jPanel1.add(d);
        Draw_Snake_Body(false);

    }

    /**
     * *****************************************************************************
     */
    public void play_in_frame() {

        if (xhead == -H || xhead < -H) {
            xhead = 630;
            Draw_Snake_Body(true);
            Snake_Go(false);
        } else {
            if ((xhead + H) == 660 || xhead > 660) {
                xhead = 0;
                Draw_Snake_Body(true);
                Snake_Go(false);
            }
        }
        if (yhead == -H || yhead < -H) {
            yhead = 525;
            Draw_Snake_Body(true);
            Snake_Go(false);
        } else {
            if ((yhead + H) == 555 || yhead + H > 555) {
                yhead = 0;
                Draw_Snake_Body(true);
                Snake_Go(false);
            }
        }
    }

    /**
     * ****************************************************************************
     */
    public void draw_2() throws InterruptedException {

        sleep(130);
        jLabel11.setIcon(A);
        sleep(130);
        jLabel11.setIcon(a);

        sleep(130);
        jLabel10.setIcon(A);
        sleep(130);
        jLabel10.setIcon(a);

        sleep(130);
        jLabel9.setIcon(A);
        sleep(130);
        jLabel9.setIcon(a);

        sleep(130);
        jLabel8.setIcon(A);
        sleep(130);
        jLabel8.setIcon(a);

        sleep(130);
        jLabel12.setIcon(A);
        sleep(130);
        jLabel12.setIcon(a);

    }

    /**
     * ********************************main
     *
     ***************************************************
     * @param args
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Snake_Panel_v3().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel part1;
    private javax.swing.JLabel part2;
    private javax.swing.JLabel part3;
    private javax.swing.JLabel part4;
    private javax.swing.JLabel wapper;
    // End of variables declaration//GEN-END:variables
}
