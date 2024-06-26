// Juego Gomoku 15x15 estilo libre
// versión: 20240420
// autor: Carlos Grasa Lambea

import javax.swing.*;
import java.util.ArrayList;

import static javax.swing.JOptionPane.showMessageDialog;

public class Gomoku extends javax.swing.JFrame implements ControlGomoku {
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gomoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gomoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gomoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gomoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gomoku().setVisible(true);
            }
        });
    }
    public Gomoku() {
        esActivaInterfaz=false;
        initComponents();
        establecerIcono();
        rellenarArrayDeCasillas();
        borrarMarcas();
        campoEstado.setText(" "+"elija iniciar turno...");
        return;
    }
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();

        campoEstado = new javax.swing.JLabel();
        botonA = new javax.swing.JButton();
        botonB = new javax.swing.JButton();
        botonC = new javax.swing.JButton();

        a0 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        a9 = new javax.swing.JLabel();
        a10 = new javax.swing.JLabel();
        a11 = new javax.swing.JLabel();
        a12 = new javax.swing.JLabel();
        a13 = new javax.swing.JLabel();
        a14 = new javax.swing.JLabel();
        a15 = new javax.swing.JLabel();
        a16 = new javax.swing.JLabel();
        a17 = new javax.swing.JLabel();
        a18 = new javax.swing.JLabel();
        a19 = new javax.swing.JLabel();
        a20 = new javax.swing.JLabel();
        a21 = new javax.swing.JLabel();
        a22 = new javax.swing.JLabel();
        a23 = new javax.swing.JLabel();
        a24 = new javax.swing.JLabel();
        a25 = new javax.swing.JLabel();
        a26 = new javax.swing.JLabel();
        a27 = new javax.swing.JLabel();
        a28 = new javax.swing.JLabel();
        a29 = new javax.swing.JLabel();
        a30 = new javax.swing.JLabel();
        a31 = new javax.swing.JLabel();
        a32 = new javax.swing.JLabel();
        a33 = new javax.swing.JLabel();
        a34 = new javax.swing.JLabel();
        a35 = new javax.swing.JLabel();
        a36 = new javax.swing.JLabel();
        a37 = new javax.swing.JLabel();
        a38 = new javax.swing.JLabel();
        a39 = new javax.swing.JLabel();
        a40 = new javax.swing.JLabel();
        a41 = new javax.swing.JLabel();
        a42 = new javax.swing.JLabel();
        a43 = new javax.swing.JLabel();
        a44 = new javax.swing.JLabel();
        a45 = new javax.swing.JLabel();
        a46 = new javax.swing.JLabel();
        a47 = new javax.swing.JLabel();
        a48 = new javax.swing.JLabel();
        a49 = new javax.swing.JLabel();
        a50 = new javax.swing.JLabel();
        a51 = new javax.swing.JLabel();
        a52 = new javax.swing.JLabel();
        a53 = new javax.swing.JLabel();
        a54 = new javax.swing.JLabel();
        a55 = new javax.swing.JLabel();
        a56 = new javax.swing.JLabel();
        a57 = new javax.swing.JLabel();
        a58 = new javax.swing.JLabel();
        a59 = new javax.swing.JLabel();
        a60 = new javax.swing.JLabel();
        a61 = new javax.swing.JLabel();
        a62 = new javax.swing.JLabel();
        a63 = new javax.swing.JLabel();
        a64 = new javax.swing.JLabel();
        a65 = new javax.swing.JLabel();
        a66 = new javax.swing.JLabel();
        a67 = new javax.swing.JLabel();
        a68 = new javax.swing.JLabel();
        a69 = new javax.swing.JLabel();
        a70 = new javax.swing.JLabel();
        a71 = new javax.swing.JLabel();
        a72 = new javax.swing.JLabel();
        a73 = new javax.swing.JLabel();
        a74 = new javax.swing.JLabel();
        a75 = new javax.swing.JLabel();
        a76 = new javax.swing.JLabel();
        a77 = new javax.swing.JLabel();
        a78 = new javax.swing.JLabel();
        a79 = new javax.swing.JLabel();
        a80 = new javax.swing.JLabel();
        a81 = new javax.swing.JLabel();
        a82 = new javax.swing.JLabel();
        a83 = new javax.swing.JLabel();
        a84 = new javax.swing.JLabel();
        a85 = new javax.swing.JLabel();
        a86 = new javax.swing.JLabel();
        a87 = new javax.swing.JLabel();
        a88 = new javax.swing.JLabel();
        a89 = new javax.swing.JLabel();
        a90 = new javax.swing.JLabel();
        a91 = new javax.swing.JLabel();
        a92 = new javax.swing.JLabel();
        a93 = new javax.swing.JLabel();
        a94 = new javax.swing.JLabel();
        a95 = new javax.swing.JLabel();
        a96 = new javax.swing.JLabel();
        a97 = new javax.swing.JLabel();
        a98 = new javax.swing.JLabel();
        a99 = new javax.swing.JLabel();
        a100 = new javax.swing.JLabel();
        a101 = new javax.swing.JLabel();
        a102 = new javax.swing.JLabel();
        a103 = new javax.swing.JLabel();
        a104 = new javax.swing.JLabel();
        a105 = new javax.swing.JLabel();
        a106 = new javax.swing.JLabel();
        a107 = new javax.swing.JLabel();
        a108 = new javax.swing.JLabel();
        a109 = new javax.swing.JLabel();
        a110 = new javax.swing.JLabel();
        a111 = new javax.swing.JLabel();
        a112 = new javax.swing.JLabel();
        a113 = new javax.swing.JLabel();
        a114 = new javax.swing.JLabel();
        a115 = new javax.swing.JLabel();
        a116 = new javax.swing.JLabel();
        a117 = new javax.swing.JLabel();
        a118 = new javax.swing.JLabel();
        a119 = new javax.swing.JLabel();
        a120 = new javax.swing.JLabel();
        a121 = new javax.swing.JLabel();
        a122 = new javax.swing.JLabel();
        a123 = new javax.swing.JLabel();
        a124 = new javax.swing.JLabel();
        a125 = new javax.swing.JLabel();
        a126 = new javax.swing.JLabel();
        a127 = new javax.swing.JLabel();
        a128 = new javax.swing.JLabel();
        a129 = new javax.swing.JLabel();
        a130 = new javax.swing.JLabel();
        a131 = new javax.swing.JLabel();
        a132 = new javax.swing.JLabel();
        a133 = new javax.swing.JLabel();
        a134 = new javax.swing.JLabel();
        a135 = new javax.swing.JLabel();
        a136 = new javax.swing.JLabel();
        a137 = new javax.swing.JLabel();
        a138 = new javax.swing.JLabel();
        a139 = new javax.swing.JLabel();
        a140 = new javax.swing.JLabel();
        a141 = new javax.swing.JLabel();
        a142 = new javax.swing.JLabel();
        a143 = new javax.swing.JLabel();
        a144 = new javax.swing.JLabel();
        a145 = new javax.swing.JLabel();
        a146 = new javax.swing.JLabel();
        a147 = new javax.swing.JLabel();
        a148 = new javax.swing.JLabel();
        a149 = new javax.swing.JLabel();
        a150 = new javax.swing.JLabel();
        a151 = new javax.swing.JLabel();
        a152 = new javax.swing.JLabel();
        a153 = new javax.swing.JLabel();
        a154 = new javax.swing.JLabel();
        a155 = new javax.swing.JLabel();
        a156 = new javax.swing.JLabel();
        a157 = new javax.swing.JLabel();
        a158 = new javax.swing.JLabel();
        a159 = new javax.swing.JLabel();
        a160 = new javax.swing.JLabel();
        a161 = new javax.swing.JLabel();
        a162 = new javax.swing.JLabel();
        a163 = new javax.swing.JLabel();
        a164 = new javax.swing.JLabel();
        a165 = new javax.swing.JLabel();
        a166 = new javax.swing.JLabel();
        a167 = new javax.swing.JLabel();
        a168 = new javax.swing.JLabel();
        a169 = new javax.swing.JLabel();
        a170 = new javax.swing.JLabel();
        a171 = new javax.swing.JLabel();
        a172 = new javax.swing.JLabel();
        a173 = new javax.swing.JLabel();
        a174 = new javax.swing.JLabel();
        a175 = new javax.swing.JLabel();
        a176 = new javax.swing.JLabel();
        a177 = new javax.swing.JLabel();
        a178 = new javax.swing.JLabel();
        a179 = new javax.swing.JLabel();
        a180 = new javax.swing.JLabel();
        a181 = new javax.swing.JLabel();
        a182 = new javax.swing.JLabel();
        a183 = new javax.swing.JLabel();
        a184 = new javax.swing.JLabel();
        a185 = new javax.swing.JLabel();
        a186 = new javax.swing.JLabel();
        a187 = new javax.swing.JLabel();
        a188 = new javax.swing.JLabel();
        a189 = new javax.swing.JLabel();
        a190 = new javax.swing.JLabel();
        a191 = new javax.swing.JLabel();
        a192 = new javax.swing.JLabel();
        a193 = new javax.swing.JLabel();
        a194 = new javax.swing.JLabel();
        a195 = new javax.swing.JLabel();
        a196 = new javax.swing.JLabel();
        a197 = new javax.swing.JLabel();
        a198 = new javax.swing.JLabel();
        a199 = new javax.swing.JLabel();
        a200 = new javax.swing.JLabel();
        a201 = new javax.swing.JLabel();
        a202 = new javax.swing.JLabel();
        a203 = new javax.swing.JLabel();
        a204 = new javax.swing.JLabel();
        a205 = new javax.swing.JLabel();
        a206 = new javax.swing.JLabel();
        a207 = new javax.swing.JLabel();
        a208 = new javax.swing.JLabel();
        a209 = new javax.swing.JLabel();
        a210 = new javax.swing.JLabel();
        a211 = new javax.swing.JLabel();
        a212 = new javax.swing.JLabel();
        a213 = new javax.swing.JLabel();
        a214 = new javax.swing.JLabel();
        a215 = new javax.swing.JLabel();
        a216 = new javax.swing.JLabel();
        a217 = new javax.swing.JLabel();
        a218 = new javax.swing.JLabel();
        a219 = new javax.swing.JLabel();
        a220 = new javax.swing.JLabel();
        a221 = new javax.swing.JLabel();
        a222 = new javax.swing.JLabel();
        a223 = new javax.swing.JLabel();
        a224 = new javax.swing.JLabel();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gomoku - © 2024 Carlos Grasa Lambea");
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setFocusCycleRoot(false);
        setFocusable(false);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFocusable(false);
        jPanel1.setRequestFocusEnabled(false);

        a0.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a0.setToolTipText("");
        a0.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a0.setOpaque(true);
        a0.setRequestFocusEnabled(false);
        a0.setVerifyInputWhenFocusTarget(false);
        a0.addMouseListener(formListener);

        a1.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a1.setToolTipText("");
        a1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a1.setOpaque(true);
        a1.setRequestFocusEnabled(false);
        a1.setVerifyInputWhenFocusTarget(false);
        a1.addMouseListener(formListener);

        a2.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a2.setToolTipText("");
        a2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a2.setOpaque(true);
        a2.setRequestFocusEnabled(false);
        a2.setVerifyInputWhenFocusTarget(false);
        a2.addMouseListener(formListener);

        a3.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a3.setToolTipText("");
        a3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a3.setOpaque(true);
        a3.setRequestFocusEnabled(false);
        a3.setVerifyInputWhenFocusTarget(false);
        a3.addMouseListener(formListener);

        a4.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a4.setToolTipText("");
        a4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a4.setOpaque(true);
        a4.setRequestFocusEnabled(false);
        a4.setVerifyInputWhenFocusTarget(false);
        a4.addMouseListener(formListener);

        a5.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a5.setToolTipText("");
        a5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a5.setOpaque(true);
        a5.setRequestFocusEnabled(false);
        a5.setVerifyInputWhenFocusTarget(false);
        a5.addMouseListener(formListener);

        a6.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a6.setToolTipText("");
        a6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a6.setOpaque(true);
        a6.setRequestFocusEnabled(false);
        a6.setVerifyInputWhenFocusTarget(false);
        a6.addMouseListener(formListener);

        a7.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a7.setToolTipText("");
        a7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a7.setOpaque(true);
        a7.setRequestFocusEnabled(false);
        a7.setVerifyInputWhenFocusTarget(false);
        a7.addMouseListener(formListener);

        a8.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a8.setToolTipText("");
        a8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a8.setOpaque(true);
        a8.setRequestFocusEnabled(false);
        a8.setVerifyInputWhenFocusTarget(false);
        a8.addMouseListener(formListener);

        a9.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a9.setToolTipText("");
        a9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a9.setOpaque(true);
        a9.setRequestFocusEnabled(false);
        a9.setVerifyInputWhenFocusTarget(false);
        a9.addMouseListener(formListener);

        a10.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a10.setToolTipText("");
        a10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a10.setOpaque(true);
        a10.setRequestFocusEnabled(false);
        a10.setVerifyInputWhenFocusTarget(false);
        a10.addMouseListener(formListener);

        a11.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a11.setToolTipText("");
        a11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a11.setOpaque(true);
        a11.setRequestFocusEnabled(false);
        a11.setVerifyInputWhenFocusTarget(false);
        a11.addMouseListener(formListener);

        a12.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a12.setToolTipText("");
        a12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a12.setOpaque(true);
        a12.setRequestFocusEnabled(false);
        a12.setVerifyInputWhenFocusTarget(false);
        a12.addMouseListener(formListener);

        a13.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a13.setToolTipText("");
        a13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a13.setOpaque(true);
        a13.setRequestFocusEnabled(false);
        a13.setVerifyInputWhenFocusTarget(false);
        a13.addMouseListener(formListener);

        a14.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a14.setToolTipText("");
        a14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a14.setOpaque(true);
        a14.setRequestFocusEnabled(false);
        a14.setVerifyInputWhenFocusTarget(false);
        a14.addMouseListener(formListener);

        a24.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a24.setToolTipText("");
        a24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a24.setOpaque(true);
        a24.setRequestFocusEnabled(false);
        a24.setVerifyInputWhenFocusTarget(false);
        a24.addMouseListener(formListener);

        a25.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a25.setToolTipText("");
        a25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a25.setOpaque(true);
        a25.setRequestFocusEnabled(false);
        a25.setVerifyInputWhenFocusTarget(false);
        a25.addMouseListener(formListener);

        a26.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a26.setToolTipText("");
        a26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a26.setOpaque(true);
        a26.setRequestFocusEnabled(false);
        a26.setVerifyInputWhenFocusTarget(false);
        a26.addMouseListener(formListener);

        a27.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a27.setToolTipText("");
        a27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a27.setOpaque(true);
        a27.setRequestFocusEnabled(false);
        a27.setVerifyInputWhenFocusTarget(false);
        a27.addMouseListener(formListener);

        a28.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a28.setToolTipText("");
        a28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a28.setOpaque(true);
        a28.setRequestFocusEnabled(false);
        a28.setVerifyInputWhenFocusTarget(false);
        a28.addMouseListener(formListener);

        a29.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a29.setToolTipText("");
        a29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a29.setOpaque(true);
        a29.setRequestFocusEnabled(false);
        a29.setVerifyInputWhenFocusTarget(false);
        a29.addMouseListener(formListener);

        a16.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a16.setToolTipText("");
        a16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a16.setOpaque(true);
        a16.setRequestFocusEnabled(false);
        a16.setVerifyInputWhenFocusTarget(false);
        a16.addMouseListener(formListener);

        a17.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a17.setToolTipText("");
        a17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a17.setOpaque(true);
        a17.setRequestFocusEnabled(false);
        a17.setVerifyInputWhenFocusTarget(false);
        a17.addMouseListener(formListener);

        a15.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a15.setToolTipText("");
        a15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a15.setOpaque(true);
        a15.setRequestFocusEnabled(false);
        a15.setVerifyInputWhenFocusTarget(false);
        a15.addMouseListener(formListener);

        a18.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a18.setToolTipText("");
        a18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a18.setOpaque(true);
        a18.setRequestFocusEnabled(false);
        a18.setVerifyInputWhenFocusTarget(false);
        a18.addMouseListener(formListener);

        a19.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a19.setToolTipText("");
        a19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a19.setOpaque(true);
        a19.setRequestFocusEnabled(false);
        a19.setVerifyInputWhenFocusTarget(false);
        a19.addMouseListener(formListener);

        a20.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a20.setToolTipText("");
        a20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a20.setOpaque(true);
        a20.setRequestFocusEnabled(false);
        a20.setVerifyInputWhenFocusTarget(false);
        a20.addMouseListener(formListener);

        a21.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a21.setToolTipText("");
        a21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a21.setOpaque(true);
        a21.setRequestFocusEnabled(false);
        a21.setVerifyInputWhenFocusTarget(false);
        a21.addMouseListener(formListener);

        a22.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a22.setToolTipText("");
        a22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a22.setOpaque(true);
        a22.setRequestFocusEnabled(false);
        a22.setVerifyInputWhenFocusTarget(false);
        a22.addMouseListener(formListener);

        a23.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a23.setToolTipText("");
        a23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a23.setOpaque(true);
        a23.setRequestFocusEnabled(false);
        a23.setVerifyInputWhenFocusTarget(false);
        a23.addMouseListener(formListener);

        a39.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a39.setToolTipText("");
        a39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a39.setOpaque(true);
        a39.setRequestFocusEnabled(false);
        a39.setVerifyInputWhenFocusTarget(false);
        a39.addMouseListener(formListener);

        a40.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a40.setToolTipText("");
        a40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a40.setOpaque(true);
        a40.setRequestFocusEnabled(false);
        a40.setVerifyInputWhenFocusTarget(false);
        a40.addMouseListener(formListener);

        a41.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a41.setToolTipText("");
        a41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a41.setOpaque(true);
        a41.setRequestFocusEnabled(false);
        a41.setVerifyInputWhenFocusTarget(false);
        a41.addMouseListener(formListener);

        a42.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a42.setToolTipText("");
        a42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a42.setOpaque(true);
        a42.setRequestFocusEnabled(false);
        a42.setVerifyInputWhenFocusTarget(false);
        a42.addMouseListener(formListener);

        a43.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a43.setToolTipText("");
        a43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a43.setOpaque(true);
        a43.setRequestFocusEnabled(false);
        a43.setVerifyInputWhenFocusTarget(false);
        a43.addMouseListener(formListener);

        a44.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a44.setToolTipText("");
        a44.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a44.setOpaque(true);
        a44.setRequestFocusEnabled(false);
        a44.setVerifyInputWhenFocusTarget(false);
        a44.addMouseListener(formListener);

        a54.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a54.setToolTipText("");
        a54.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a54.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a54.setOpaque(true);
        a54.setRequestFocusEnabled(false);
        a54.setVerifyInputWhenFocusTarget(false);
        a54.addMouseListener(formListener);

        a55.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a55.setToolTipText("");
        a55.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a55.setOpaque(true);
        a55.setRequestFocusEnabled(false);
        a55.setVerifyInputWhenFocusTarget(false);
        a55.addMouseListener(formListener);

        a56.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a56.setToolTipText("");
        a56.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a56.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a56.setOpaque(true);
        a56.setRequestFocusEnabled(false);
        a56.setVerifyInputWhenFocusTarget(false);
        a56.addMouseListener(formListener);

        a57.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a57.setToolTipText("");
        a57.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a57.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a57.setOpaque(true);
        a57.setRequestFocusEnabled(false);
        a57.setVerifyInputWhenFocusTarget(false);
        a57.addMouseListener(formListener);

        a58.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a58.setToolTipText("");
        a58.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a58.setOpaque(true);
        a58.setRequestFocusEnabled(false);
        a58.setVerifyInputWhenFocusTarget(false);
        a58.addMouseListener(formListener);

        a59.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a59.setToolTipText("");
        a59.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a59.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a59.setOpaque(true);
        a59.setRequestFocusEnabled(false);
        a59.setVerifyInputWhenFocusTarget(false);
        a59.addMouseListener(formListener);

        a46.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a46.setToolTipText("");
        a46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a46.setOpaque(true);
        a46.setRequestFocusEnabled(false);
        a46.setVerifyInputWhenFocusTarget(false);
        a46.addMouseListener(formListener);

        a47.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a47.setToolTipText("");
        a47.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a47.setOpaque(true);
        a47.setRequestFocusEnabled(false);
        a47.setVerifyInputWhenFocusTarget(false);
        a47.addMouseListener(formListener);

        a45.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a45.setToolTipText("");
        a45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a45.setOpaque(true);
        a45.setRequestFocusEnabled(false);
        a45.setVerifyInputWhenFocusTarget(false);
        a45.addMouseListener(formListener);

        a48.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a48.setToolTipText("");
        a48.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a48.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a48.setOpaque(true);
        a48.setRequestFocusEnabled(false);
        a48.setVerifyInputWhenFocusTarget(false);
        a48.addMouseListener(formListener);

        a49.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a49.setToolTipText("");
        a49.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a49.setOpaque(true);
        a49.setRequestFocusEnabled(false);
        a49.setVerifyInputWhenFocusTarget(false);
        a49.addMouseListener(formListener);

        a50.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a50.setToolTipText("");
        a50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a50.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a50.setOpaque(true);
        a50.setRequestFocusEnabled(false);
        a50.setVerifyInputWhenFocusTarget(false);
        a50.addMouseListener(formListener);

        a51.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a51.setToolTipText("");
        a51.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a51.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a51.setOpaque(true);
        a51.setRequestFocusEnabled(false);
        a51.setVerifyInputWhenFocusTarget(false);
        a51.addMouseListener(formListener);

        a52.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a52.setToolTipText("");
        a52.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a52.setOpaque(true);
        a52.setRequestFocusEnabled(false);
        a52.setVerifyInputWhenFocusTarget(false);
        a52.addMouseListener(formListener);

        a53.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a53.setToolTipText("");
        a53.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a53.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a53.setOpaque(true);
        a53.setRequestFocusEnabled(false);
        a53.setVerifyInputWhenFocusTarget(false);
        a53.addMouseListener(formListener);

        a31.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a31.setToolTipText("");
        a31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a31.setOpaque(true);
        a31.setRequestFocusEnabled(false);
        a31.setVerifyInputWhenFocusTarget(false);
        a31.addMouseListener(formListener);

        a32.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a32.setToolTipText("");
        a32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a32.setOpaque(true);
        a32.setRequestFocusEnabled(false);
        a32.setVerifyInputWhenFocusTarget(false);
        a32.addMouseListener(formListener);

        a30.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a30.setToolTipText("");
        a30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a30.setOpaque(true);
        a30.setRequestFocusEnabled(false);
        a30.setVerifyInputWhenFocusTarget(false);
        a30.addMouseListener(formListener);

        a33.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a33.setToolTipText("");
        a33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a33.setOpaque(true);
        a33.setRequestFocusEnabled(false);
        a33.setVerifyInputWhenFocusTarget(false);
        a33.addMouseListener(formListener);

        a34.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a34.setToolTipText("");
        a34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a34.setOpaque(true);
        a34.setRequestFocusEnabled(false);
        a34.setVerifyInputWhenFocusTarget(false);
        a34.addMouseListener(formListener);

        a35.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a35.setToolTipText("");
        a35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a35.setOpaque(true);
        a35.setRequestFocusEnabled(false);
        a35.setVerifyInputWhenFocusTarget(false);
        a35.addMouseListener(formListener);

        a36.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a36.setToolTipText("");
        a36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a36.setOpaque(true);
        a36.setRequestFocusEnabled(false);
        a36.setVerifyInputWhenFocusTarget(false);
        a36.addMouseListener(formListener);

        a37.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a37.setToolTipText("");
        a37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a37.setOpaque(true);
        a37.setRequestFocusEnabled(false);
        a37.setVerifyInputWhenFocusTarget(false);
        a37.addMouseListener(formListener);

        a38.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a38.setToolTipText("");
        a38.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a38.setOpaque(true);
        a38.setRequestFocusEnabled(false);
        a38.setVerifyInputWhenFocusTarget(false);
        a38.addMouseListener(formListener);

        a69.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a69.setToolTipText("");
        a69.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a69.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a69.setOpaque(true);
        a69.setRequestFocusEnabled(false);
        a69.setVerifyInputWhenFocusTarget(false);
        a69.addMouseListener(formListener);

        a70.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a70.setToolTipText("");
        a70.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a70.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a70.setOpaque(true);
        a70.setRequestFocusEnabled(false);
        a70.setVerifyInputWhenFocusTarget(false);
        a70.addMouseListener(formListener);

        a71.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a71.setToolTipText("");
        a71.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a71.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a71.setOpaque(true);
        a71.setRequestFocusEnabled(false);
        a71.setVerifyInputWhenFocusTarget(false);
        a71.addMouseListener(formListener);

        a72.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a72.setToolTipText("");
        a72.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a72.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a72.setOpaque(true);
        a72.setRequestFocusEnabled(false);
        a72.setVerifyInputWhenFocusTarget(false);
        a72.addMouseListener(formListener);

        a73.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a73.setToolTipText("");
        a73.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a73.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a73.setOpaque(true);
        a73.setRequestFocusEnabled(false);
        a73.setVerifyInputWhenFocusTarget(false);
        a73.addMouseListener(formListener);

        a74.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a74.setToolTipText("");
        a74.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a74.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a74.setOpaque(true);
        a74.setRequestFocusEnabled(false);
        a74.setVerifyInputWhenFocusTarget(false);
        a74.addMouseListener(formListener);

        a61.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a61.setToolTipText("");
        a61.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a61.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a61.setOpaque(true);
        a61.setRequestFocusEnabled(false);
        a61.setVerifyInputWhenFocusTarget(false);
        a61.addMouseListener(formListener);

        a62.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a62.setToolTipText("");
        a62.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a62.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a62.setOpaque(true);
        a62.setRequestFocusEnabled(false);
        a62.setVerifyInputWhenFocusTarget(false);
        a62.addMouseListener(formListener);

        a60.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a60.setToolTipText("");
        a60.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a60.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a60.setOpaque(true);
        a60.setRequestFocusEnabled(false);
        a60.setVerifyInputWhenFocusTarget(false);
        a60.addMouseListener(formListener);

        a63.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a63.setToolTipText("");
        a63.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a63.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a63.setOpaque(true);
        a63.setRequestFocusEnabled(false);
        a63.setVerifyInputWhenFocusTarget(false);
        a63.addMouseListener(formListener);

        a64.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a64.setToolTipText("");
        a64.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a64.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a64.setOpaque(true);
        a64.setRequestFocusEnabled(false);
        a64.setVerifyInputWhenFocusTarget(false);
        a64.addMouseListener(formListener);

        a65.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a65.setToolTipText("");
        a65.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a65.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a65.setOpaque(true);
        a65.setRequestFocusEnabled(false);
        a65.setVerifyInputWhenFocusTarget(false);
        a65.addMouseListener(formListener);

        a66.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a66.setToolTipText("");
        a66.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a66.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a66.setOpaque(true);
        a66.setRequestFocusEnabled(false);
        a66.setVerifyInputWhenFocusTarget(false);
        a66.addMouseListener(formListener);

        a67.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a67.setToolTipText("");
        a67.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a67.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a67.setOpaque(true);
        a67.setRequestFocusEnabled(false);
        a67.setVerifyInputWhenFocusTarget(false);
        a67.addMouseListener(formListener);

        a68.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a68.setToolTipText("");
        a68.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a68.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a68.setOpaque(true);
        a68.setRequestFocusEnabled(false);
        a68.setVerifyInputWhenFocusTarget(false);
        a68.addMouseListener(formListener);

        a84.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a84.setToolTipText("");
        a84.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a84.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a84.setOpaque(true);
        a84.setRequestFocusEnabled(false);
        a84.setVerifyInputWhenFocusTarget(false);
        a84.addMouseListener(formListener);

        a85.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a85.setToolTipText("");
        a85.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a85.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a85.setOpaque(true);
        a85.setRequestFocusEnabled(false);
        a85.setVerifyInputWhenFocusTarget(false);
        a85.addMouseListener(formListener);

        a86.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a86.setToolTipText("");
        a86.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a86.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a86.setOpaque(true);
        a86.setRequestFocusEnabled(false);
        a86.setVerifyInputWhenFocusTarget(false);
        a86.addMouseListener(formListener);

        a87.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a87.setToolTipText("");
        a87.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a87.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a87.setOpaque(true);
        a87.setRequestFocusEnabled(false);
        a87.setVerifyInputWhenFocusTarget(false);
        a87.addMouseListener(formListener);

        a88.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a88.setToolTipText("");
        a88.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a88.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a88.setOpaque(true);
        a88.setRequestFocusEnabled(false);
        a88.setVerifyInputWhenFocusTarget(false);
        a88.addMouseListener(formListener);

        a89.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a89.setToolTipText("");
        a89.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a89.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a89.setOpaque(true);
        a89.setRequestFocusEnabled(false);
        a89.setVerifyInputWhenFocusTarget(false);
        a89.addMouseListener(formListener);

        a99.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a99.setToolTipText("");
        a99.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a99.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a99.setOpaque(true);
        a99.setRequestFocusEnabled(false);
        a99.setVerifyInputWhenFocusTarget(false);
        a99.addMouseListener(formListener);

        a100.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a100.setToolTipText("");
        a100.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a100.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a100.setOpaque(true);
        a100.setRequestFocusEnabled(false);
        a100.setVerifyInputWhenFocusTarget(false);
        a100.addMouseListener(formListener);

        a101.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a101.setToolTipText("");
        a101.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a101.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a101.setOpaque(true);
        a101.setRequestFocusEnabled(false);
        a101.setVerifyInputWhenFocusTarget(false);
        a101.addMouseListener(formListener);

        a102.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a102.setToolTipText("");
        a102.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a102.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a102.setOpaque(true);
        a102.setRequestFocusEnabled(false);
        a102.setVerifyInputWhenFocusTarget(false);
        a102.addMouseListener(formListener);

        a103.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a103.setToolTipText("");
        a103.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a103.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a103.setOpaque(true);
        a103.setRequestFocusEnabled(false);
        a103.setVerifyInputWhenFocusTarget(false);
        a103.addMouseListener(formListener);

        a104.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a104.setToolTipText("");
        a104.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a104.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a104.setOpaque(true);
        a104.setRequestFocusEnabled(false);
        a104.setVerifyInputWhenFocusTarget(false);
        a104.addMouseListener(formListener);

        a91.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a91.setToolTipText("");
        a91.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a91.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a91.setOpaque(true);
        a91.setRequestFocusEnabled(false);
        a91.setVerifyInputWhenFocusTarget(false);
        a91.addMouseListener(formListener);

        a92.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a92.setToolTipText("");
        a92.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a92.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a92.setOpaque(true);
        a92.setRequestFocusEnabled(false);
        a92.setVerifyInputWhenFocusTarget(false);
        a92.addMouseListener(formListener);

        a90.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a90.setToolTipText("");
        a90.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a90.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a90.setOpaque(true);
        a90.setRequestFocusEnabled(false);
        a90.setVerifyInputWhenFocusTarget(false);
        a90.addMouseListener(formListener);

        a93.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a93.setToolTipText("");
        a93.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a93.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a93.setOpaque(true);
        a93.setRequestFocusEnabled(false);
        a93.setVerifyInputWhenFocusTarget(false);
        a93.addMouseListener(formListener);

        a94.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a94.setToolTipText("");
        a94.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a94.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a94.setOpaque(true);
        a94.setRequestFocusEnabled(false);
        a94.setVerifyInputWhenFocusTarget(false);
        a94.addMouseListener(formListener);

        a95.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a95.setToolTipText("");
        a95.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a95.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a95.setOpaque(true);
        a95.setRequestFocusEnabled(false);
        a95.setVerifyInputWhenFocusTarget(false);
        a95.addMouseListener(formListener);

        a96.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a96.setToolTipText("");
        a96.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a96.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a96.setOpaque(true);
        a96.setRequestFocusEnabled(false);
        a96.setVerifyInputWhenFocusTarget(false);
        a96.addMouseListener(formListener);

        a97.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a97.setToolTipText("");
        a97.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a97.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a97.setOpaque(true);
        a97.setRequestFocusEnabled(false);
        a97.setVerifyInputWhenFocusTarget(false);
        a97.addMouseListener(formListener);

        a98.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a98.setToolTipText("");
        a98.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a98.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a98.setOpaque(true);
        a98.setRequestFocusEnabled(false);
        a98.setVerifyInputWhenFocusTarget(false);
        a98.addMouseListener(formListener);

        a114.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a114.setToolTipText("");
        a114.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a114.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a114.setOpaque(true);
        a114.setRequestFocusEnabled(false);
        a114.setVerifyInputWhenFocusTarget(false);
        a114.addMouseListener(formListener);

        a115.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a115.setToolTipText("");
        a115.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a115.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a115.setOpaque(true);
        a115.setRequestFocusEnabled(false);
        a115.setVerifyInputWhenFocusTarget(false);
        a115.addMouseListener(formListener);

        a116.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a116.setToolTipText("");
        a116.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a116.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a116.setOpaque(true);
        a116.setRequestFocusEnabled(false);
        a116.setVerifyInputWhenFocusTarget(false);
        a116.addMouseListener(formListener);

        a117.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a117.setToolTipText("");
        a117.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a117.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a117.setOpaque(true);
        a117.setRequestFocusEnabled(false);
        a117.setVerifyInputWhenFocusTarget(false);
        a117.addMouseListener(formListener);

        a118.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a118.setToolTipText("");
        a118.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a118.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a118.setOpaque(true);
        a118.setRequestFocusEnabled(false);
        a118.setVerifyInputWhenFocusTarget(false);
        a118.addMouseListener(formListener);

        a119.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a119.setToolTipText("");
        a119.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a119.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a119.setOpaque(true);
        a119.setRequestFocusEnabled(false);
        a119.setVerifyInputWhenFocusTarget(false);
        a119.addMouseListener(formListener);

        a129.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a129.setToolTipText("");
        a129.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a129.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a129.setOpaque(true);
        a129.setRequestFocusEnabled(false);
        a129.setVerifyInputWhenFocusTarget(false);
        a129.addMouseListener(formListener);

        a130.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a130.setToolTipText("");
        a130.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a130.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a130.setOpaque(true);
        a130.setRequestFocusEnabled(false);
        a130.setVerifyInputWhenFocusTarget(false);
        a130.addMouseListener(formListener);

        a131.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a131.setToolTipText("");
        a131.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a131.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a131.setOpaque(true);
        a131.setRequestFocusEnabled(false);
        a131.setVerifyInputWhenFocusTarget(false);
        a131.addMouseListener(formListener);

        a132.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a132.setToolTipText("");
        a132.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a132.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a132.setOpaque(true);
        a132.setRequestFocusEnabled(false);
        a132.setVerifyInputWhenFocusTarget(false);
        a132.addMouseListener(formListener);

        a133.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a133.setToolTipText("");
        a133.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a133.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a133.setOpaque(true);
        a133.setRequestFocusEnabled(false);
        a133.setVerifyInputWhenFocusTarget(false);
        a133.addMouseListener(formListener);

        a134.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a134.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a134.setToolTipText("");
        a134.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a134.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a134.setOpaque(true);
        a134.setRequestFocusEnabled(false);
        a134.setVerifyInputWhenFocusTarget(false);
        a134.addMouseListener(formListener);

        a121.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a121.setToolTipText("");
        a121.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a121.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a121.setOpaque(true);
        a121.setRequestFocusEnabled(false);
        a121.setVerifyInputWhenFocusTarget(false);
        a121.addMouseListener(formListener);

        a122.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a122.setToolTipText("");
        a122.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a122.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a122.setOpaque(true);
        a122.setRequestFocusEnabled(false);
        a122.setVerifyInputWhenFocusTarget(false);
        a122.addMouseListener(formListener);

        a120.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a120.setToolTipText("");
        a120.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a120.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a120.setOpaque(true);
        a120.setRequestFocusEnabled(false);
        a120.setVerifyInputWhenFocusTarget(false);
        a120.addMouseListener(formListener);

        a123.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a123.setToolTipText("");
        a123.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a123.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a123.setOpaque(true);
        a123.setRequestFocusEnabled(false);
        a123.setVerifyInputWhenFocusTarget(false);
        a123.addMouseListener(formListener);

        a124.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a124.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a124.setToolTipText("");
        a124.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a124.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a124.setOpaque(true);
        a124.setRequestFocusEnabled(false);
        a124.setVerifyInputWhenFocusTarget(false);
        a124.addMouseListener(formListener);

        a125.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a125.setToolTipText("");
        a125.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a125.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a125.setOpaque(true);
        a125.setRequestFocusEnabled(false);
        a125.setVerifyInputWhenFocusTarget(false);
        a125.addMouseListener(formListener);

        a126.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a126.setToolTipText("");
        a126.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a126.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a126.setOpaque(true);
        a126.setRequestFocusEnabled(false);
        a126.setVerifyInputWhenFocusTarget(false);
        a126.addMouseListener(formListener);

        a127.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a127.setToolTipText("");
        a127.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a127.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a127.setOpaque(true);
        a127.setRequestFocusEnabled(false);
        a127.setVerifyInputWhenFocusTarget(false);
        a127.addMouseListener(formListener);

        a128.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a128.setToolTipText("");
        a128.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a128.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a128.setOpaque(true);
        a128.setRequestFocusEnabled(false);
        a128.setVerifyInputWhenFocusTarget(false);
        a128.addMouseListener(formListener);

        a106.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a106.setToolTipText("");
        a106.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a106.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a106.setOpaque(true);
        a106.setRequestFocusEnabled(false);
        a106.setVerifyInputWhenFocusTarget(false);
        a106.addMouseListener(formListener);

        a107.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a107.setToolTipText("");
        a107.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a107.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a107.setOpaque(true);
        a107.setRequestFocusEnabled(false);
        a107.setVerifyInputWhenFocusTarget(false);
        a107.addMouseListener(formListener);

        a105.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a105.setToolTipText("");
        a105.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a105.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a105.setOpaque(true);
        a105.setRequestFocusEnabled(false);
        a105.setVerifyInputWhenFocusTarget(false);
        a105.addMouseListener(formListener);

        a108.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a108.setToolTipText("");
        a108.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a108.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a108.setOpaque(true);
        a108.setRequestFocusEnabled(false);
        a108.setVerifyInputWhenFocusTarget(false);
        a108.addMouseListener(formListener);

        a109.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a109.setToolTipText("");
        a109.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a109.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a109.setOpaque(true);
        a109.setRequestFocusEnabled(false);
        a109.setVerifyInputWhenFocusTarget(false);
        a109.addMouseListener(formListener);

        a110.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a110.setToolTipText("");
        a110.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a110.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a110.setOpaque(true);
        a110.setRequestFocusEnabled(false);
        a110.setVerifyInputWhenFocusTarget(false);
        a110.addMouseListener(formListener);

        a111.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a111.setToolTipText("");
        a111.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a111.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a111.setOpaque(true);
        a111.setRequestFocusEnabled(false);
        a111.setVerifyInputWhenFocusTarget(false);
        a111.addMouseListener(formListener);

        a112.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a112.setToolTipText("");
        a112.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a112.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a112.setOpaque(true);
        a112.setRequestFocusEnabled(false);
        a112.setVerifyInputWhenFocusTarget(false);
        a112.addMouseListener(formListener);

        a113.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a113.setToolTipText("");
        a113.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a113.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a113.setOpaque(true);
        a113.setRequestFocusEnabled(false);
        a113.setVerifyInputWhenFocusTarget(false);
        a113.addMouseListener(formListener);

        a144.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a144.setToolTipText("");
        a144.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a144.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a144.setOpaque(true);
        a144.setRequestFocusEnabled(false);
        a144.setVerifyInputWhenFocusTarget(false);
        a144.addMouseListener(formListener);

        a145.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a145.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a145.setToolTipText("");
        a145.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a145.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a145.setOpaque(true);
        a145.setRequestFocusEnabled(false);
        a145.setVerifyInputWhenFocusTarget(false);
        a145.addMouseListener(formListener);

        a146.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a146.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a146.setToolTipText("");
        a146.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a146.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a146.setOpaque(true);
        a146.setRequestFocusEnabled(false);
        a146.setVerifyInputWhenFocusTarget(false);
        a146.addMouseListener(formListener);

        a147.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a147.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a147.setToolTipText("");
        a147.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a147.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a147.setOpaque(true);
        a147.setRequestFocusEnabled(false);
        a147.setVerifyInputWhenFocusTarget(false);
        a147.addMouseListener(formListener);

        a148.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a148.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a148.setToolTipText("");
        a148.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a148.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a148.setOpaque(true);
        a148.setRequestFocusEnabled(false);
        a148.setVerifyInputWhenFocusTarget(false);
        a148.addMouseListener(formListener);

        a149.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a149.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a149.setToolTipText("");
        a149.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a149.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a149.setOpaque(true);
        a149.setRequestFocusEnabled(false);
        a149.setVerifyInputWhenFocusTarget(false);
        a149.addMouseListener(formListener);

        a136.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a136.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a136.setToolTipText("");
        a136.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a136.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a136.setOpaque(true);
        a136.setRequestFocusEnabled(false);
        a136.setVerifyInputWhenFocusTarget(false);
        a136.addMouseListener(formListener);

        a137.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a137.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a137.setToolTipText("");
        a137.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a137.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a137.setOpaque(true);
        a137.setRequestFocusEnabled(false);
        a137.setVerifyInputWhenFocusTarget(false);
        a137.addMouseListener(formListener);

        a135.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a135.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a135.setToolTipText("");
        a135.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a135.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a135.setOpaque(true);
        a135.setRequestFocusEnabled(false);
        a135.setVerifyInputWhenFocusTarget(false);
        a135.addMouseListener(formListener);

        a138.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a138.setToolTipText("");
        a138.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a138.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a138.setOpaque(true);
        a138.setRequestFocusEnabled(false);
        a138.setVerifyInputWhenFocusTarget(false);
        a138.addMouseListener(formListener);

        a139.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a139.setToolTipText("");
        a139.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a139.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a139.setOpaque(true);
        a139.setRequestFocusEnabled(false);
        a139.setVerifyInputWhenFocusTarget(false);
        a139.addMouseListener(formListener);

        a140.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a140.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a140.setToolTipText("");
        a140.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a140.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a140.setOpaque(true);
        a140.setRequestFocusEnabled(false);
        a140.setVerifyInputWhenFocusTarget(false);
        a140.addMouseListener(formListener);

        a141.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a141.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a141.setToolTipText("");
        a141.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a141.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a141.setOpaque(true);
        a141.setRequestFocusEnabled(false);
        a141.setVerifyInputWhenFocusTarget(false);
        a141.addMouseListener(formListener);

        a142.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a142.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a142.setToolTipText("");
        a142.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a142.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a142.setOpaque(true);
        a142.setRequestFocusEnabled(false);
        a142.setVerifyInputWhenFocusTarget(false);
        a142.addMouseListener(formListener);

        a143.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a143.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a143.setToolTipText("");
        a143.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a143.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a143.setOpaque(true);
        a143.setRequestFocusEnabled(false);
        a143.setVerifyInputWhenFocusTarget(false);
        a143.addMouseListener(formListener);

        a76.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a76.setToolTipText("");
        a76.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a76.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a76.setOpaque(true);
        a76.setRequestFocusEnabled(false);
        a76.setVerifyInputWhenFocusTarget(false);
        a76.addMouseListener(formListener);

        a77.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a77.setToolTipText("");
        a77.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a77.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a77.setOpaque(true);
        a77.setRequestFocusEnabled(false);
        a77.setVerifyInputWhenFocusTarget(false);
        a77.addMouseListener(formListener);

        a75.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a75.setToolTipText("");
        a75.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a75.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a75.setOpaque(true);
        a75.setRequestFocusEnabled(false);
        a75.setVerifyInputWhenFocusTarget(false);
        a75.addMouseListener(formListener);

        a78.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a78.setToolTipText("");
        a78.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a78.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a78.setOpaque(true);
        a78.setRequestFocusEnabled(false);
        a78.setVerifyInputWhenFocusTarget(false);
        a78.addMouseListener(formListener);

        a79.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a79.setToolTipText("");
        a79.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a79.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a79.setOpaque(true);
        a79.setRequestFocusEnabled(false);
        a79.setVerifyInputWhenFocusTarget(false);
        a79.addMouseListener(formListener);

        a80.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a80.setToolTipText("");
        a80.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a80.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a80.setOpaque(true);
        a80.setRequestFocusEnabled(false);
        a80.setVerifyInputWhenFocusTarget(false);
        a80.addMouseListener(formListener);

        a81.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a81.setToolTipText("");
        a81.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a81.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a81.setOpaque(true);
        a81.setRequestFocusEnabled(false);
        a81.setVerifyInputWhenFocusTarget(false);
        a81.addMouseListener(formListener);

        a82.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a82.setToolTipText("");
        a82.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a82.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a82.setOpaque(true);
        a82.setRequestFocusEnabled(false);
        a82.setVerifyInputWhenFocusTarget(false);
        a82.addMouseListener(formListener);

        a83.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a83.setToolTipText("");
        a83.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a83.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a83.setOpaque(true);
        a83.setRequestFocusEnabled(false);
        a83.setVerifyInputWhenFocusTarget(false);
        a83.addMouseListener(formListener);

        a150.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a150.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a150.setToolTipText("");
        a150.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a150.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a150.setOpaque(true);
        a150.setRequestFocusEnabled(false);
        a150.setVerifyInputWhenFocusTarget(false);
        a150.addMouseListener(formListener);

        a151.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a151.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a151.setToolTipText("");
        a151.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a151.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a151.setOpaque(true);
        a151.setRequestFocusEnabled(false);
        a151.setVerifyInputWhenFocusTarget(false);
        a151.addMouseListener(formListener);

        a152.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a152.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a152.setToolTipText("");
        a152.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a152.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a152.setOpaque(true);
        a152.setRequestFocusEnabled(false);
        a152.setVerifyInputWhenFocusTarget(false);
        a152.addMouseListener(formListener);

        a153.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a153.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a153.setToolTipText("");
        a153.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a153.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a153.setOpaque(true);
        a153.setRequestFocusEnabled(false);
        a153.setVerifyInputWhenFocusTarget(false);
        a153.addMouseListener(formListener);

        a154.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a154.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a154.setToolTipText("");
        a154.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a154.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a154.setOpaque(true);
        a154.setRequestFocusEnabled(false);
        a154.setVerifyInputWhenFocusTarget(false);
        a154.addMouseListener(formListener);

        a155.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a155.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a155.setToolTipText("");
        a155.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a155.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a155.setOpaque(true);
        a155.setRequestFocusEnabled(false);
        a155.setVerifyInputWhenFocusTarget(false);
        a155.addMouseListener(formListener);

        a156.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a156.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a156.setToolTipText("");
        a156.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a156.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a156.setOpaque(true);
        a156.setRequestFocusEnabled(false);
        a156.setVerifyInputWhenFocusTarget(false);
        a156.addMouseListener(formListener);

        a157.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a157.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a157.setToolTipText("");
        a157.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a157.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a157.setOpaque(true);
        a157.setRequestFocusEnabled(false);
        a157.setVerifyInputWhenFocusTarget(false);
        a157.addMouseListener(formListener);

        a158.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a158.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a158.setToolTipText("");
        a158.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a158.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a158.setOpaque(true);
        a158.setRequestFocusEnabled(false);
        a158.setVerifyInputWhenFocusTarget(false);
        a158.addMouseListener(formListener);

        a159.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a159.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a159.setToolTipText("");
        a159.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a159.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a159.setOpaque(true);
        a159.setRequestFocusEnabled(false);
        a159.setVerifyInputWhenFocusTarget(false);
        a159.addMouseListener(formListener);

        a160.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a160.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a160.setToolTipText("");
        a160.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a160.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a160.setOpaque(true);
        a160.setRequestFocusEnabled(false);
        a160.setVerifyInputWhenFocusTarget(false);
        a160.addMouseListener(formListener);

        a161.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a161.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a161.setToolTipText("");
        a161.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a161.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a161.setOpaque(true);
        a161.setRequestFocusEnabled(false);
        a161.setVerifyInputWhenFocusTarget(false);
        a161.addMouseListener(formListener);

        a162.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a162.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a162.setToolTipText("");
        a162.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a162.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a162.setOpaque(true);
        a162.setRequestFocusEnabled(false);
        a162.setVerifyInputWhenFocusTarget(false);
        a162.addMouseListener(formListener);

        a163.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a163.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a163.setToolTipText("");
        a163.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a163.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a163.setOpaque(true);
        a163.setRequestFocusEnabled(false);
        a163.setVerifyInputWhenFocusTarget(false);
        a163.addMouseListener(formListener);

        a164.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a164.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a164.setToolTipText("");
        a164.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a164.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a164.setOpaque(true);
        a164.setRequestFocusEnabled(false);
        a164.setVerifyInputWhenFocusTarget(false);
        a164.addMouseListener(formListener);

        a165.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a165.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a165.setToolTipText("");
        a165.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a165.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a165.setOpaque(true);
        a165.setRequestFocusEnabled(false);
        a165.setVerifyInputWhenFocusTarget(false);
        a165.addMouseListener(formListener);

        a166.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a166.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a166.setToolTipText("");
        a166.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a166.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a166.setOpaque(true);
        a166.setRequestFocusEnabled(false);
        a166.setVerifyInputWhenFocusTarget(false);
        a166.addMouseListener(formListener);

        a167.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a167.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a167.setToolTipText("");
        a167.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a167.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a167.setOpaque(true);
        a167.setRequestFocusEnabled(false);
        a167.setVerifyInputWhenFocusTarget(false);
        a167.addMouseListener(formListener);

        a168.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a168.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a168.setToolTipText("");
        a168.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a168.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a168.setOpaque(true);
        a168.setRequestFocusEnabled(false);
        a168.setVerifyInputWhenFocusTarget(false);
        a168.addMouseListener(formListener);

        a169.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a169.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a169.setToolTipText("");
        a169.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a169.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a169.setOpaque(true);
        a169.setRequestFocusEnabled(false);
        a169.setVerifyInputWhenFocusTarget(false);
        a169.addMouseListener(formListener);

        a170.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a170.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a170.setToolTipText("");
        a170.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a170.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a170.setOpaque(true);
        a170.setRequestFocusEnabled(false);
        a170.setVerifyInputWhenFocusTarget(false);
        a170.addMouseListener(formListener);

        a171.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a171.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a171.setToolTipText("");
        a171.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a171.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a171.setOpaque(true);
        a171.setRequestFocusEnabled(false);
        a171.setVerifyInputWhenFocusTarget(false);
        a171.addMouseListener(formListener);

        a172.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a172.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a172.setToolTipText("");
        a172.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a172.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a172.setOpaque(true);
        a172.setRequestFocusEnabled(false);
        a172.setVerifyInputWhenFocusTarget(false);
        a172.addMouseListener(formListener);

        a173.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a173.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a173.setToolTipText("");
        a173.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a173.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a173.setOpaque(true);
        a173.setRequestFocusEnabled(false);
        a173.setVerifyInputWhenFocusTarget(false);
        a173.addMouseListener(formListener);

        a174.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a174.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a174.setToolTipText("");
        a174.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a174.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a174.setOpaque(true);
        a174.setRequestFocusEnabled(false);
        a174.setVerifyInputWhenFocusTarget(false);
        a174.addMouseListener(formListener);

        a175.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a175.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a175.setToolTipText("");
        a175.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a175.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a175.setOpaque(true);
        a175.setRequestFocusEnabled(false);
        a175.setVerifyInputWhenFocusTarget(false);
        a175.addMouseListener(formListener);

        a176.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a176.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a176.setToolTipText("");
        a176.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a176.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a176.setOpaque(true);
        a176.setRequestFocusEnabled(false);
        a176.setVerifyInputWhenFocusTarget(false);
        a176.addMouseListener(formListener);

        a177.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a177.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a177.setToolTipText("");
        a177.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a177.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a177.setOpaque(true);
        a177.setRequestFocusEnabled(false);
        a177.setVerifyInputWhenFocusTarget(false);
        a177.addMouseListener(formListener);

        a178.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a178.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a178.setToolTipText("");
        a178.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a178.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a178.setOpaque(true);
        a178.setRequestFocusEnabled(false);
        a178.setVerifyInputWhenFocusTarget(false);
        a178.addMouseListener(formListener);

        a179.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a179.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a179.setToolTipText("");
        a179.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a179.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a179.setOpaque(true);
        a179.setRequestFocusEnabled(false);
        a179.setVerifyInputWhenFocusTarget(false);
        a179.addMouseListener(formListener);

        a180.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a180.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a180.setToolTipText("");
        a180.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a180.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a180.setOpaque(true);
        a180.setRequestFocusEnabled(false);
        a180.setVerifyInputWhenFocusTarget(false);
        a180.addMouseListener(formListener);

        a181.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a181.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a181.setToolTipText("");
        a181.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a181.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a181.setOpaque(true);
        a181.setRequestFocusEnabled(false);
        a181.setVerifyInputWhenFocusTarget(false);
        a181.addMouseListener(formListener);

        a182.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a182.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a182.setToolTipText("");
        a182.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a182.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a182.setOpaque(true);
        a182.setRequestFocusEnabled(false);
        a182.setVerifyInputWhenFocusTarget(false);
        a182.addMouseListener(formListener);

        a183.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a183.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a183.setToolTipText("");
        a183.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a183.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a183.setOpaque(true);
        a183.setRequestFocusEnabled(false);
        a183.setVerifyInputWhenFocusTarget(false);
        a183.addMouseListener(formListener);

        a184.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a184.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a184.setToolTipText("");
        a184.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a184.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a184.setOpaque(true);
        a184.setRequestFocusEnabled(false);
        a184.setVerifyInputWhenFocusTarget(false);
        a184.addMouseListener(formListener);

        a185.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a185.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a185.setToolTipText("");
        a185.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a185.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a185.setOpaque(true);
        a185.setRequestFocusEnabled(false);
        a185.setVerifyInputWhenFocusTarget(false);
        a185.addMouseListener(formListener);

        a186.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a186.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a186.setToolTipText("");
        a186.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a186.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a186.setOpaque(true);
        a186.setRequestFocusEnabled(false);
        a186.setVerifyInputWhenFocusTarget(false);
        a186.addMouseListener(formListener);

        a187.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a187.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a187.setToolTipText("");
        a187.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a187.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a187.setOpaque(true);
        a187.setRequestFocusEnabled(false);
        a187.setVerifyInputWhenFocusTarget(false);
        a187.addMouseListener(formListener);

        a188.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a188.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a188.setToolTipText("");
        a188.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a188.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a188.setOpaque(true);
        a188.setRequestFocusEnabled(false);
        a188.setVerifyInputWhenFocusTarget(false);
        a188.addMouseListener(formListener);

        a189.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a189.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a189.setToolTipText("");
        a189.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a189.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a189.setOpaque(true);
        a189.setRequestFocusEnabled(false);
        a189.setVerifyInputWhenFocusTarget(false);
        a189.addMouseListener(formListener);

        a190.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a190.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a190.setToolTipText("");
        a190.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a190.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a190.setOpaque(true);
        a190.setRequestFocusEnabled(false);
        a190.setVerifyInputWhenFocusTarget(false);
        a190.addMouseListener(formListener);

        a191.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a191.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a191.setToolTipText("");
        a191.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a191.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a191.setOpaque(true);
        a191.setRequestFocusEnabled(false);
        a191.setVerifyInputWhenFocusTarget(false);
        a191.addMouseListener(formListener);

        a192.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a192.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a192.setToolTipText("");
        a192.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a192.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a192.setOpaque(true);
        a192.setRequestFocusEnabled(false);
        a192.setVerifyInputWhenFocusTarget(false);
        a192.addMouseListener(formListener);

        a193.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a193.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a193.setToolTipText("");
        a193.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a193.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a193.setOpaque(true);
        a193.setRequestFocusEnabled(false);
        a193.setVerifyInputWhenFocusTarget(false);
        a193.addMouseListener(formListener);

        a194.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a194.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a194.setToolTipText("");
        a194.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a194.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a194.setOpaque(true);
        a194.setRequestFocusEnabled(false);
        a194.setVerifyInputWhenFocusTarget(false);
        a194.addMouseListener(formListener);

        a195.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a195.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a195.setToolTipText("");
        a195.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a195.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a195.setOpaque(true);
        a195.setRequestFocusEnabled(false);
        a195.setVerifyInputWhenFocusTarget(false);
        a195.addMouseListener(formListener);

        a196.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a196.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a196.setToolTipText("");
        a196.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a196.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a196.setOpaque(true);
        a196.setRequestFocusEnabled(false);
        a196.setVerifyInputWhenFocusTarget(false);
        a196.addMouseListener(formListener);

        a197.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a197.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a197.setToolTipText("");
        a197.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a197.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a197.setOpaque(true);
        a197.setRequestFocusEnabled(false);
        a197.setVerifyInputWhenFocusTarget(false);
        a197.addMouseListener(formListener);

        a198.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a198.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a198.setToolTipText("");
        a198.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a198.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a198.setOpaque(true);
        a198.setRequestFocusEnabled(false);
        a198.setVerifyInputWhenFocusTarget(false);
        a198.addMouseListener(formListener);

        a199.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a199.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a199.setToolTipText("");
        a199.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a199.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a199.setOpaque(true);
        a199.setRequestFocusEnabled(false);
        a199.setVerifyInputWhenFocusTarget(false);
        a199.addMouseListener(formListener);

        a200.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a200.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a200.setToolTipText("");
        a200.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a200.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a200.setOpaque(true);
        a200.setRequestFocusEnabled(false);
        a200.setVerifyInputWhenFocusTarget(false);
        a200.addMouseListener(formListener);

        a201.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a201.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a201.setToolTipText("");
        a201.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a201.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a201.setOpaque(true);
        a201.setRequestFocusEnabled(false);
        a201.setVerifyInputWhenFocusTarget(false);
        a201.addMouseListener(formListener);

        a202.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a202.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a202.setToolTipText("");
        a202.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a202.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a202.setOpaque(true);
        a202.setRequestFocusEnabled(false);
        a202.setVerifyInputWhenFocusTarget(false);
        a202.addMouseListener(formListener);

        a203.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a203.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a203.setToolTipText("");
        a203.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a203.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a203.setOpaque(true);
        a203.setRequestFocusEnabled(false);
        a203.setVerifyInputWhenFocusTarget(false);
        a203.addMouseListener(formListener);

        a204.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a204.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a204.setToolTipText("");
        a204.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a204.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a204.setOpaque(true);
        a204.setRequestFocusEnabled(false);
        a204.setVerifyInputWhenFocusTarget(false);
        a204.addMouseListener(formListener);

        a205.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a205.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a205.setToolTipText("");
        a205.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a205.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a205.setOpaque(true);
        a205.setRequestFocusEnabled(false);
        a205.setVerifyInputWhenFocusTarget(false);
        a205.addMouseListener(formListener);

        a206.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a206.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a206.setToolTipText("");
        a206.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a206.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a206.setOpaque(true);
        a206.setRequestFocusEnabled(false);
        a206.setVerifyInputWhenFocusTarget(false);
        a206.addMouseListener(formListener);

        a207.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a207.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a207.setToolTipText("");
        a207.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a207.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a207.setOpaque(true);
        a207.setRequestFocusEnabled(false);
        a207.setVerifyInputWhenFocusTarget(false);
        a207.addMouseListener(formListener);

        a208.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a208.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a208.setToolTipText("");
        a208.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a208.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a208.setOpaque(true);
        a208.setRequestFocusEnabled(false);
        a208.setVerifyInputWhenFocusTarget(false);
        a208.addMouseListener(formListener);

        a209.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a209.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a209.setToolTipText("");
        a209.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a209.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a209.setOpaque(true);
        a209.setRequestFocusEnabled(false);
        a209.setVerifyInputWhenFocusTarget(false);
        a209.addMouseListener(formListener);

        a210.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a210.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a210.setToolTipText("");
        a210.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a210.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a210.setOpaque(true);
        a210.setRequestFocusEnabled(false);
        a210.setVerifyInputWhenFocusTarget(false);
        a210.addMouseListener(formListener);

        a211.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a211.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a211.setToolTipText("");
        a211.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a211.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a211.setOpaque(true);
        a211.setRequestFocusEnabled(false);
        a211.setVerifyInputWhenFocusTarget(false);
        a211.addMouseListener(formListener);

        a212.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a212.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a212.setToolTipText("");
        a212.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a212.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a212.setOpaque(true);
        a212.setRequestFocusEnabled(false);
        a212.setVerifyInputWhenFocusTarget(false);
        a212.addMouseListener(formListener);

        a213.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a213.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a213.setToolTipText("");
        a213.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a213.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a213.setOpaque(true);
        a213.setRequestFocusEnabled(false);
        a213.setVerifyInputWhenFocusTarget(false);
        a213.addMouseListener(formListener);

        a214.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a214.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a214.setToolTipText("");
        a214.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a214.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a214.setOpaque(true);
        a214.setRequestFocusEnabled(false);
        a214.setVerifyInputWhenFocusTarget(false);
        a214.addMouseListener(formListener);

        a215.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a215.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a215.setToolTipText("");
        a215.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a215.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a215.setOpaque(true);
        a215.setRequestFocusEnabled(false);
        a215.setVerifyInputWhenFocusTarget(false);
        a215.addMouseListener(formListener);

        a216.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a216.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a216.setToolTipText("");
        a216.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a216.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a216.setOpaque(true);
        a216.setRequestFocusEnabled(false);
        a216.setVerifyInputWhenFocusTarget(false);
        a216.addMouseListener(formListener);

        a217.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a217.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a217.setToolTipText("");
        a217.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a217.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a217.setOpaque(true);
        a217.setRequestFocusEnabled(false);
        a217.setVerifyInputWhenFocusTarget(false);
        a217.addMouseListener(formListener);

        a218.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a218.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a218.setToolTipText("");
        a218.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a218.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a218.setOpaque(true);
        a218.setRequestFocusEnabled(false);
        a218.setVerifyInputWhenFocusTarget(false);
        a218.addMouseListener(formListener);

        a219.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a219.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a219.setToolTipText("");
        a219.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a219.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a219.setOpaque(true);
        a219.setRequestFocusEnabled(false);
        a219.setVerifyInputWhenFocusTarget(false);
        a219.addMouseListener(formListener);

        a220.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a220.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a220.setToolTipText("");
        a220.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a220.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a220.setOpaque(true);
        a220.setRequestFocusEnabled(false);
        a220.setVerifyInputWhenFocusTarget(false);
        a220.addMouseListener(formListener);

        a221.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a221.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a221.setToolTipText("");
        a221.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a221.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a221.setOpaque(true);
        a221.setRequestFocusEnabled(false);
        a221.setVerifyInputWhenFocusTarget(false);
        a221.addMouseListener(formListener);

        a222.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a222.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a222.setToolTipText("");
        a222.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a222.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a222.setOpaque(true);
        a222.setRequestFocusEnabled(false);
        a222.setVerifyInputWhenFocusTarget(false);
        a222.addMouseListener(formListener);

        a223.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a223.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a223.setToolTipText("");
        a223.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a223.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a223.setOpaque(true);
        a223.setRequestFocusEnabled(false);
        a223.setVerifyInputWhenFocusTarget(false);
        a223.addMouseListener(formListener);

        a224.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        a224.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a224.setToolTipText("");
        a224.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a224.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a224.setOpaque(true);
        a224.setRequestFocusEnabled(false);
        a224.setVerifyInputWhenFocusTarget(false);
        a224.addMouseListener(formListener);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(a150, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a151, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a152, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a153, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a154, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a155, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a156, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a157, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a158, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a159, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a160, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a161, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a162, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a163, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(a164, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(a0, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(a15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(a30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(a45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a53, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a54, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a55, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a56, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a57, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a58, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a59, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(a60, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a61, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a62, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a63, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a64, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a65, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a66, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a67, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a68, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a69, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a70, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a71, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a72, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a73, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a74, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(a75, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a76, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a77, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a78, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a79, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a80, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a81, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a82, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a83, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a84, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a85, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a86, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a87, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a88, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a89, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(a90, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a91, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a92, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a93, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a94, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a95, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a96, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a97, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a98, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a99, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a100, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a101, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a102, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a103, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a104, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(a105, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a106, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a107, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a108, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a109, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a110, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a111, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a112, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a113, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a114, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a115, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a116, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a117, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a118, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a119, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(a120, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a121, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a122, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a123, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a124, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a125, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a126, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a127, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a128, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a129, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a130, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a131, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a132, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a133, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a134, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(a135, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a136, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a137, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a138, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a139, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a140, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a141, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a142, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a143, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a144, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a145, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a146, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a147, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a148, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(a149, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(a165, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a166, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a167, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a168, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a169, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a170, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a171, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a172, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a173, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a174, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a175, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a176, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a177, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a178, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(a179, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(a180, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a181, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a182, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a183, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a184, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a185, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a186, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a187, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a188, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a189, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a190, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a191, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a192, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a193, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(a194, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(a195, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a196, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a197, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a198, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a199, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a200, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a201, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a202, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a203, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a204, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a205, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a206, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a207, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a208, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(a209, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(a210, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a211, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a212, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a213, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a214, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a215, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a216, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a217, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a218, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a219, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a220, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a221, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a222, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a223, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(a224, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a0, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a59, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a58, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a57, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a56, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a55, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a54, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a53, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a74, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a73, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a72, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a71, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a70, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a69, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a68, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a65, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a66, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a67, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a64, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a63, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a62, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a61, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a60, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a89, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a88, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a87, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a86, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a85, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a84, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a83, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a80, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a81, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a82, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a79, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a78, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a77, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a76, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a75, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a104, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a103, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a102, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a101, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a100, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a99, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a98, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a95, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a96, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a97, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a94, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a93, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a92, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a91, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a90, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a119, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a118, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a117, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a116, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a115, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a114, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a113, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a110, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a111, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a112, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a109, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a108, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a107, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a106, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a105, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a134, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a133, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a132, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a131, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a130, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a129, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a128, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a125, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a126, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a127, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a124, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a123, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a122, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a121, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a120, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a149, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a148, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a147, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a146, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a145, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a144, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a143, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a140, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a141, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a142, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a139, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a138, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a137, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a136, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a135, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a151, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a152, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a150, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a153, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a154, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a155, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a156, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a157, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a158, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a159, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a160, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a161, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a162, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a163, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a164, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a166, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a167, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a165, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a168, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a169, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a170, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a171, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a172, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a173, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a174, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a175, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a176, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a177, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a178, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a179, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a181, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a182, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a180, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a183, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a184, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a185, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a186, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a187, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a188, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a189, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a190, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a191, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a192, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a193, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a194, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a196, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a197, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a195, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a198, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a199, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a200, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a201, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a202, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a203, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a204, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a205, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a206, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a207, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a208, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a209, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(a211, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a212, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a210, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a213, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a214, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a215, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a216, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a217, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a218, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a219, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a220, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a221, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a222, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a223, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a224, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        // a0.getAccessibleContext().setAccessibleName("c0"); // desactivado

        campoEstado.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        campoEstado.setText(" estado:");
        campoEstado.setToolTipText("");
        campoEstado.setAlignmentY(0.0F);
        campoEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoEstado.setFocusable(false);
        campoEstado.setName(""); // NOI18N
        campoEstado.setRequestFocusEnabled(false);
        campoEstado.setVerifyInputWhenFocusTarget(false);

        botonA.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        botonA.setText("iniciar A");
        botonA.setToolTipText("");
        botonA.setFocusable(false);
        botonA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonA.setMargin(new java.awt.Insets(5, 14, 2, 14));
        botonA.setRequestFocusEnabled(false);
        botonA.setRolloverEnabled(false);
        botonA.addActionListener(formListener);

        botonB.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        botonB.setText("iniciar B");
        botonB.setToolTipText("");
        botonB.setFocusable(false);
        botonB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonB.setMargin(new java.awt.Insets(5, 14, 2, 14));
        botonB.setRequestFocusEnabled(false);
        botonB.setRolloverEnabled(false);
        botonB.addActionListener(formListener);

        botonC.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        botonC.setText("ayuda");
        botonC.setToolTipText("");
        botonC.setFocusable(false);
        botonC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonC.setMargin(new java.awt.Insets(5, 14, 2, 14));
        botonC.setRequestFocusEnabled(false);
        botonC.setRolloverEnabled(false);
        botonC.addActionListener(formListener);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(botonA, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botonB, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botonC, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botonA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == botonA) {
                Gomoku.this.botonAActionPerformed(evt);
            }
            else if (evt.getSource() == botonB) {
                Gomoku.this.botonBActionPerformed(evt);
            }
            else if (evt.getSource() == botonC) {
                Gomoku.this.botonCActionPerformed(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            casillaPulsada(evt);
        }


        public void mouseEntered(java.awt.event.MouseEvent evt) {
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
        }
    }

    private void botonAActionPerformed(java.awt.event.ActionEvent evt) {
        pulsandoBotonA(evt); // implementado en métodos propios
        return;
    }

    private void botonBActionPerformed(java.awt.event.ActionEvent evt) {
        pulsandoBotonB(evt); // implementado en métodos propios
        return;
    }

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {
        pulsandoBotonC(evt); // implementado en métodos propios
        return;
    }

    private void casillaPulsada(java.awt.event.MouseEvent evt) {
        pulsandoCasilla(evt); // implementado en métodos propios
        return;
    }

    javax.swing.JLabel a0;
    javax.swing.JLabel a1;
    javax.swing.JLabel a2;
    javax.swing.JLabel a3;
    javax.swing.JLabel a4;
    javax.swing.JLabel a5;
    javax.swing.JLabel a6;
    javax.swing.JLabel a7;
    javax.swing.JLabel a8;
    javax.swing.JLabel a9;
    javax.swing.JLabel a10;
    javax.swing.JLabel a11;
    javax.swing.JLabel a12;
    javax.swing.JLabel a13;
    javax.swing.JLabel a14;
    javax.swing.JLabel a15;
    javax.swing.JLabel a16;
    javax.swing.JLabel a17;
    javax.swing.JLabel a18;
    javax.swing.JLabel a19;
    javax.swing.JLabel a20;
    javax.swing.JLabel a21;
    javax.swing.JLabel a22;
    javax.swing.JLabel a23;
    javax.swing.JLabel a24;
    javax.swing.JLabel a25;
    javax.swing.JLabel a26;
    javax.swing.JLabel a27;
    javax.swing.JLabel a28;
    javax.swing.JLabel a29;
    javax.swing.JLabel a30;
    javax.swing.JLabel a31;
    javax.swing.JLabel a32;
    javax.swing.JLabel a33;
    javax.swing.JLabel a34;
    javax.swing.JLabel a35;
    javax.swing.JLabel a36;
    javax.swing.JLabel a37;
    javax.swing.JLabel a38;
    javax.swing.JLabel a39;
    javax.swing.JLabel a40;
    javax.swing.JLabel a41;
    javax.swing.JLabel a42;
    javax.swing.JLabel a43;
    javax.swing.JLabel a44;
    javax.swing.JLabel a45;
    javax.swing.JLabel a46;
    javax.swing.JLabel a47;
    javax.swing.JLabel a48;
    javax.swing.JLabel a49;
    javax.swing.JLabel a50;
    javax.swing.JLabel a51;
    javax.swing.JLabel a52;
    javax.swing.JLabel a53;
    javax.swing.JLabel a54;
    javax.swing.JLabel a55;
    javax.swing.JLabel a56;
    javax.swing.JLabel a57;
    javax.swing.JLabel a58;
    javax.swing.JLabel a59;
    javax.swing.JLabel a60;
    javax.swing.JLabel a61;
    javax.swing.JLabel a62;
    javax.swing.JLabel a63;
    javax.swing.JLabel a64;
    javax.swing.JLabel a65;
    javax.swing.JLabel a66;
    javax.swing.JLabel a67;
    javax.swing.JLabel a68;
    javax.swing.JLabel a69;
    javax.swing.JLabel a70;
    javax.swing.JLabel a71;
    javax.swing.JLabel a72;
    javax.swing.JLabel a73;
    javax.swing.JLabel a74;
    javax.swing.JLabel a75;
    javax.swing.JLabel a76;
    javax.swing.JLabel a77;
    javax.swing.JLabel a78;
    javax.swing.JLabel a79;
    javax.swing.JLabel a80;
    javax.swing.JLabel a81;
    javax.swing.JLabel a82;
    javax.swing.JLabel a83;
    javax.swing.JLabel a84;
    javax.swing.JLabel a85;
    javax.swing.JLabel a86;
    javax.swing.JLabel a87;
    javax.swing.JLabel a88;
    javax.swing.JLabel a89;
    javax.swing.JLabel a90;
    javax.swing.JLabel a91;
    javax.swing.JLabel a92;
    javax.swing.JLabel a93;
    javax.swing.JLabel a94;
    javax.swing.JLabel a95;
    javax.swing.JLabel a96;
    javax.swing.JLabel a97;
    javax.swing.JLabel a98;
    javax.swing.JLabel a99;
    javax.swing.JLabel a100;
    javax.swing.JLabel a101;
    javax.swing.JLabel a102;
    javax.swing.JLabel a103;
    javax.swing.JLabel a104;
    javax.swing.JLabel a105;
    javax.swing.JLabel a106;
    javax.swing.JLabel a107;
    javax.swing.JLabel a108;
    javax.swing.JLabel a109;
    javax.swing.JLabel a110;
    javax.swing.JLabel a111;
    javax.swing.JLabel a112;
    javax.swing.JLabel a113;
    javax.swing.JLabel a114;
    javax.swing.JLabel a115;
    javax.swing.JLabel a116;
    javax.swing.JLabel a117;
    javax.swing.JLabel a118;
    javax.swing.JLabel a119;
    javax.swing.JLabel a120;
    javax.swing.JLabel a121;
    javax.swing.JLabel a122;
    javax.swing.JLabel a123;
    javax.swing.JLabel a124;
    javax.swing.JLabel a125;
    javax.swing.JLabel a126;
    javax.swing.JLabel a127;
    javax.swing.JLabel a128;
    javax.swing.JLabel a129;
    javax.swing.JLabel a130;
    javax.swing.JLabel a131;
    javax.swing.JLabel a132;
    javax.swing.JLabel a133;
    javax.swing.JLabel a134;
    javax.swing.JLabel a135;
    javax.swing.JLabel a136;
    javax.swing.JLabel a137;
    javax.swing.JLabel a138;
    javax.swing.JLabel a139;
    javax.swing.JLabel a140;
    javax.swing.JLabel a141;
    javax.swing.JLabel a142;
    javax.swing.JLabel a143;
    javax.swing.JLabel a144;
    javax.swing.JLabel a145;
    javax.swing.JLabel a146;
    javax.swing.JLabel a147;
    javax.swing.JLabel a148;
    javax.swing.JLabel a149;
    javax.swing.JLabel a150;
    javax.swing.JLabel a151;
    javax.swing.JLabel a152;
    javax.swing.JLabel a153;
    javax.swing.JLabel a154;
    javax.swing.JLabel a155;
    javax.swing.JLabel a156;
    javax.swing.JLabel a157;
    javax.swing.JLabel a158;
    javax.swing.JLabel a159;
    javax.swing.JLabel a160;
    javax.swing.JLabel a161;
    javax.swing.JLabel a162;
    javax.swing.JLabel a163;
    javax.swing.JLabel a164;
    javax.swing.JLabel a165;
    javax.swing.JLabel a166;
    javax.swing.JLabel a167;
    javax.swing.JLabel a168;
    javax.swing.JLabel a169;
    javax.swing.JLabel a170;
    javax.swing.JLabel a171;
    javax.swing.JLabel a172;
    javax.swing.JLabel a173;
    javax.swing.JLabel a174;
    javax.swing.JLabel a175;
    javax.swing.JLabel a176;
    javax.swing.JLabel a177;
    javax.swing.JLabel a178;
    javax.swing.JLabel a179;
    javax.swing.JLabel a180;
    javax.swing.JLabel a181;
    javax.swing.JLabel a182;
    javax.swing.JLabel a183;
    javax.swing.JLabel a184;
    javax.swing.JLabel a185;
    javax.swing.JLabel a186;
    javax.swing.JLabel a187;
    javax.swing.JLabel a188;
    javax.swing.JLabel a189;
    javax.swing.JLabel a190;
    javax.swing.JLabel a191;
    javax.swing.JLabel a192;
    javax.swing.JLabel a193;
    javax.swing.JLabel a194;
    javax.swing.JLabel a195;
    javax.swing.JLabel a196;
    javax.swing.JLabel a197;
    javax.swing.JLabel a198;
    javax.swing.JLabel a199;
    javax.swing.JLabel a200;
    javax.swing.JLabel a201;
    javax.swing.JLabel a202;
    javax.swing.JLabel a203;
    javax.swing.JLabel a204;
    javax.swing.JLabel a205;
    javax.swing.JLabel a206;
    javax.swing.JLabel a207;
    javax.swing.JLabel a208;
    javax.swing.JLabel a209;
    javax.swing.JLabel a210;
    javax.swing.JLabel a211;
    javax.swing.JLabel a212;
    javax.swing.JLabel a213;
    javax.swing.JLabel a214;
    javax.swing.JLabel a215;
    javax.swing.JLabel a216;
    javax.swing.JLabel a217;
    javax.swing.JLabel a218;
    javax.swing.JLabel a219;
    javax.swing.JLabel a220;
    javax.swing.JLabel a221;
    javax.swing.JLabel a222;
    javax.swing.JLabel a223;
    javax.swing.JLabel a224;
    javax.swing.JButton botonA;
    javax.swing.JButton botonB;
    javax.swing.JButton botonC;
    javax.swing.ButtonGroup buttonGroup1;
    javax.swing.JLabel campoEstado;
    javax.swing.JPanel jPanel1;

    // métodos propios
    public void rellenarArrayDeCasillas() {
        vectorizarCasilla(a0);
        vectorizarCasilla(a1);
        vectorizarCasilla(a2);
        vectorizarCasilla(a3);
        vectorizarCasilla(a4);
        vectorizarCasilla(a5);
        vectorizarCasilla(a6);
        vectorizarCasilla(a7);
        vectorizarCasilla(a8);
        vectorizarCasilla(a9);
        vectorizarCasilla(a10);
        vectorizarCasilla(a11);
        vectorizarCasilla(a12);
        vectorizarCasilla(a13);
        vectorizarCasilla(a14);
        vectorizarCasilla(a15);
        vectorizarCasilla(a16);
        vectorizarCasilla(a17);
        vectorizarCasilla(a18);
        vectorizarCasilla(a19);
        vectorizarCasilla(a20);
        vectorizarCasilla(a21);
        vectorizarCasilla(a22);
        vectorizarCasilla(a23);
        vectorizarCasilla(a24);
        vectorizarCasilla(a25);
        vectorizarCasilla(a26);
        vectorizarCasilla(a27);
        vectorizarCasilla(a28);
        vectorizarCasilla(a29);
        vectorizarCasilla(a30);
        vectorizarCasilla(a31);
        vectorizarCasilla(a32);
        vectorizarCasilla(a33);
        vectorizarCasilla(a34);
        vectorizarCasilla(a35);
        vectorizarCasilla(a36);
        vectorizarCasilla(a37);
        vectorizarCasilla(a38);
        vectorizarCasilla(a39);
        vectorizarCasilla(a40);
        vectorizarCasilla(a41);
        vectorizarCasilla(a42);
        vectorizarCasilla(a43);
        vectorizarCasilla(a44);
        vectorizarCasilla(a45);
        vectorizarCasilla(a46);
        vectorizarCasilla(a47);
        vectorizarCasilla(a48);
        vectorizarCasilla(a49);
        vectorizarCasilla(a50);
        vectorizarCasilla(a51);
        vectorizarCasilla(a52);
        vectorizarCasilla(a53);
        vectorizarCasilla(a54);
        vectorizarCasilla(a55);
        vectorizarCasilla(a56);
        vectorizarCasilla(a57);
        vectorizarCasilla(a58);
        vectorizarCasilla(a59);
        vectorizarCasilla(a60);
        vectorizarCasilla(a61);
        vectorizarCasilla(a62);
        vectorizarCasilla(a63);
        vectorizarCasilla(a64);
        vectorizarCasilla(a65);
        vectorizarCasilla(a66);
        vectorizarCasilla(a67);
        vectorizarCasilla(a68);
        vectorizarCasilla(a69);
        vectorizarCasilla(a70);
        vectorizarCasilla(a71);
        vectorizarCasilla(a72);
        vectorizarCasilla(a73);
        vectorizarCasilla(a74);
        vectorizarCasilla(a75);
        vectorizarCasilla(a76);
        vectorizarCasilla(a77);
        vectorizarCasilla(a78);
        vectorizarCasilla(a79);
        vectorizarCasilla(a80);
        vectorizarCasilla(a81);
        vectorizarCasilla(a82);
        vectorizarCasilla(a83);
        vectorizarCasilla(a84);
        vectorizarCasilla(a85);
        vectorizarCasilla(a86);
        vectorizarCasilla(a87);
        vectorizarCasilla(a88);
        vectorizarCasilla(a89);
        vectorizarCasilla(a90);
        vectorizarCasilla(a91);
        vectorizarCasilla(a92);
        vectorizarCasilla(a93);
        vectorizarCasilla(a94);
        vectorizarCasilla(a95);
        vectorizarCasilla(a96);
        vectorizarCasilla(a97);
        vectorizarCasilla(a98);
        vectorizarCasilla(a99);
        vectorizarCasilla(a100);
        vectorizarCasilla(a101);
        vectorizarCasilla(a102);
        vectorizarCasilla(a103);
        vectorizarCasilla(a104);
        vectorizarCasilla(a105);
        vectorizarCasilla(a106);
        vectorizarCasilla(a107);
        vectorizarCasilla(a108);
        vectorizarCasilla(a109);
        vectorizarCasilla(a110);
        vectorizarCasilla(a111);
        vectorizarCasilla(a112);
        vectorizarCasilla(a113);
        vectorizarCasilla(a114);
        vectorizarCasilla(a115);
        vectorizarCasilla(a116);
        vectorizarCasilla(a117);
        vectorizarCasilla(a118);
        vectorizarCasilla(a119);
        vectorizarCasilla(a120);
        vectorizarCasilla(a121);
        vectorizarCasilla(a122);
        vectorizarCasilla(a123);
        vectorizarCasilla(a124);
        vectorizarCasilla(a125);
        vectorizarCasilla(a126);
        vectorizarCasilla(a127);
        vectorizarCasilla(a128);
        vectorizarCasilla(a129);
        vectorizarCasilla(a130);
        vectorizarCasilla(a131);
        vectorizarCasilla(a132);
        vectorizarCasilla(a133);
        vectorizarCasilla(a134);
        vectorizarCasilla(a135);
        vectorizarCasilla(a136);
        vectorizarCasilla(a137);
        vectorizarCasilla(a138);
        vectorizarCasilla(a139);
        vectorizarCasilla(a140);
        vectorizarCasilla(a141);
        vectorizarCasilla(a142);
        vectorizarCasilla(a143);
        vectorizarCasilla(a144);
        vectorizarCasilla(a145);
        vectorizarCasilla(a146);
        vectorizarCasilla(a147);
        vectorizarCasilla(a148);
        vectorizarCasilla(a149);
        vectorizarCasilla(a150);
        vectorizarCasilla(a151);
        vectorizarCasilla(a152);
        vectorizarCasilla(a153);
        vectorizarCasilla(a154);
        vectorizarCasilla(a155);
        vectorizarCasilla(a156);
        vectorizarCasilla(a157);
        vectorizarCasilla(a158);
        vectorizarCasilla(a159);
        vectorizarCasilla(a160);
        vectorizarCasilla(a161);
        vectorizarCasilla(a162);
        vectorizarCasilla(a163);
        vectorizarCasilla(a164);
        vectorizarCasilla(a165);
        vectorizarCasilla(a166);
        vectorizarCasilla(a167);
        vectorizarCasilla(a168);
        vectorizarCasilla(a169);
        vectorizarCasilla(a170);
        vectorizarCasilla(a171);
        vectorizarCasilla(a172);
        vectorizarCasilla(a173);
        vectorizarCasilla(a174);
        vectorizarCasilla(a175);
        vectorizarCasilla(a176);
        vectorizarCasilla(a177);
        vectorizarCasilla(a178);
        vectorizarCasilla(a179);
        vectorizarCasilla(a180);
        vectorizarCasilla(a181);
        vectorizarCasilla(a182);
        vectorizarCasilla(a183);
        vectorizarCasilla(a184);
        vectorizarCasilla(a185);
        vectorizarCasilla(a186);
        vectorizarCasilla(a187);
        vectorizarCasilla(a188);
        vectorizarCasilla(a189);
        vectorizarCasilla(a190);
        vectorizarCasilla(a191);
        vectorizarCasilla(a192);
        vectorizarCasilla(a193);
        vectorizarCasilla(a194);
        vectorizarCasilla(a195);
        vectorizarCasilla(a196);
        vectorizarCasilla(a197);
        vectorizarCasilla(a198);
        vectorizarCasilla(a199);
        vectorizarCasilla(a200);
        vectorizarCasilla(a201);
        vectorizarCasilla(a202);
        vectorizarCasilla(a203);
        vectorizarCasilla(a204);
        vectorizarCasilla(a205);
        vectorizarCasilla(a206);
        vectorizarCasilla(a207);
        vectorizarCasilla(a208);
        vectorizarCasilla(a209);
        vectorizarCasilla(a210);
        vectorizarCasilla(a211);
        vectorizarCasilla(a212);
        vectorizarCasilla(a213);
        vectorizarCasilla(a214);
        vectorizarCasilla(a215);
        vectorizarCasilla(a216);
        vectorizarCasilla(a217);
        vectorizarCasilla(a218);
        vectorizarCasilla(a219);
        vectorizarCasilla(a220);
        vectorizarCasilla(a221);
        vectorizarCasilla(a222);
        vectorizarCasilla(a223);
        vectorizarCasilla(a224);
        return;
    }

    // campos propios
    boolean esActivaInterfaz=true; // interfaz gráfica en activo
    boolean esTurnoA=true; // comienza jugador A

    // métodos propios
    public void establecerIcono() {
        this.setIconImage((new ImageIcon("logodesarrollador64.png")).getImage());
        return;
    }
    public void pulsandoBotonA(java.awt.event.ActionEvent evt) {
        esActivaInterfaz=false;
        borrarMarcas();
        esTurnoA=true;
        campoEstado.setText(" "+"es turno del jugador A");
        botonA.setEnabled(false);
        botonB.setEnabled(false);
        esActivaInterfaz=true;
        return;
    }
    public void pulsandoBotonB(java.awt.event.ActionEvent evt) {
        esActivaInterfaz=false;
        borrarMarcas();
        esTurnoA=false;
        campoEstado.setText(" "+"es turno del jugador B");
        esActivaInterfaz=true;
        return;
    }
    public void pulsandoBotonC(java.awt.event.ActionEvent evt) {
        showMessageDialog(
                null,
                "El objetivo del juego consiste en marcar cinco\ncasillas contiguas con el mismo color\n"
                        +"en línea de manera horizontal, vertical o diagonal.\nParticipan dos jugadores por turno.",
                "Acerca de Gomoku...",
                JOptionPane.INFORMATION_MESSAGE
        );
        return;
    }

    public void pulsandoCasilla(java.awt.event.MouseEvent evt) {
        int ordinal=getOrdinal((JLabel) evt.getSource());
        if (esActivaInterfaz && ordinal>=0 && getMarca(ordinal)==marcaVacia ) {
            esActivaInterfaz=false;
            setMarca(ordinal, esTurnoA ? marcaA : marcaB);
            ((JLabel) evt.getSource()).setBackground(esTurnoA ? colorA : colorB);
            ((JLabel) evt.getSource()).setOpaque(true);
            esTurnoA = !esTurnoA;
            verificarEstado();
            campoEstado.setText(" "+"es turno del jugador "+(esTurnoA ? "A" : "B"));
        }
        return;
    }
    public void ganaJugadorA() {
        campoEstado.setText(" "+"Ha ganado el jugador A. Fin.");
        return;
    }
    public void ganaJugadorB() {
        campoEstado.setText(" "+"Ha ganado el jugador B. Fin.");
        return;
    }
    public void verificarEstado() {
        campoEstado.setText(" "+"verificando jugada...");
/*
        for (int fila=0; fila<numFilas; fila++) {
            for (int columna = 0; columna < numColumnas - 4; columna++) {
                if (getMarca(fila, columna) != marcaVacia
                        && getMarca(fila, columna) == getMarca(fila, columna + 1)
                        && getMarca(fila, columna) == getMarca(fila, columna + 2)
                        && getMarca(fila, columna) == getMarca(fila, columna + 3)
                        && getMarca(fila, columna) == getMarca(fila, columna + 4)
                ) {
                    if (getMarca(fila, columna) == marcaA)
                        ganaJugadorA();
                    else
                        ganaJugadorB();
                }
            }
        }
        for (int columna = 0; columna < numColumnas; columna++) {
            for (int fila=0; fila<numFilas-4; fila++) {
                if (
                        getMarca(fila, columna) != marcaVacia
                        && getMarca(fila, columna) == getMarca(fila + 1, columna)
                        && getMarca(fila, columna) == getMarca(fila + 2, columna)
                        && getMarca(fila, columna) == getMarca(fila + 3, columna)
                        && getMarca(fila, columna) == getMarca(fila + 4, columna)
                ) {
                    if (getMarca(fila, columna) == marcaA)
                        ganaJugadorA();
                    else
                        ganaJugadorB();
                }
            }
        }
 */
        esActivaInterfaz=true;
        return;
    }
}
