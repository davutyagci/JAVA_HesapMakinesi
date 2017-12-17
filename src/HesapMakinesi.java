
import java.util.Random;
public class HesapMakinesi extends javax.swing.JFrame {
   boolean f=false;
   double birinci,ikinci,islemsonucu;
   char t;
   String x="",cikti="";
    public HesapMakinesi() {
        initComponents();
        bg1.add(OnaltilikRB);
        bg1.add(IkiliRB);
        bg1.add(OndalikRB);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        bA.setEnabled(false);
        bB.setEnabled(false);
        bC.setEnabled(false);
        bD.setEnabled(false);
        bE.setEnabled(false);
        bF.setEnabled(false);
        btanh.setEnabled(true);
        bcos.setEnabled(true);
        bust.setEnabled(true);
        Faktoriyel.setEnabled(true);
        bRasgelSayi.setEnabled(true);
        bHdenDye.setEnabled(false);
        Cıkartma.setEnabled(true);
        Bolme.setEnabled(true);
        Carpma.setEnabled(true);
        Toplam.setEnabled(true);
        bdp.setEnabled(true);
        bsin.setEnabled(true);
        bEsittir.setEnabled(true);
        bBdenDye.setEnabled(false);
        blog.setEnabled(true);
          
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hesap = new javax.swing.JTextArea();
        Sonuc = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bdp = new javax.swing.JButton();
        bEsittir = new javax.swing.JButton();
        Toplam = new javax.swing.JButton();
        Cıkartma = new javax.swing.JButton();
        bsin = new javax.swing.JButton();
        bcos = new javax.swing.JButton();
        bust = new javax.swing.JButton();
        blog = new javax.swing.JButton();
        bBdenDye = new javax.swing.JButton();
        bHdenDye = new javax.swing.JButton();
        bA = new javax.swing.JButton();
        bB = new javax.swing.JButton();
        bC = new javax.swing.JButton();
        bD = new javax.swing.JButton();
        bE = new javax.swing.JButton();
        bF = new javax.swing.JButton();
        IkiliRB = new javax.swing.JRadioButton();
        OndalikRB = new javax.swing.JRadioButton();
        OnaltilikRB = new javax.swing.JRadioButton();
        Faktoriyel = new javax.swing.JButton();
        bBasamakSayisi = new javax.swing.JButton();
        Carpma = new javax.swing.JButton();
        bRasgelSayi = new javax.swing.JButton();
        btanh = new javax.swing.JButton();
        Bolme = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        Sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        Hesap.setEditable(false);
        Hesap.setColumns(20);
        Hesap.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        Hesap.setRows(5);
        jScrollPane1.setViewportView(Hesap);

        Sonuc.setEditable(false);
        Sonuc.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        Sonuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SonucActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        b1.setText("1");
        b1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b1.setMaximumSize(new java.awt.Dimension(42, 27));
        b1.setMinimumSize(new java.awt.Dimension(42, 27));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        b2.setText("2");
        b2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b2.setMaximumSize(new java.awt.Dimension(42, 27));
        b2.setMinimumSize(new java.awt.Dimension(42, 27));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        b3.setText("3");
        b3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b3.setMaximumSize(new java.awt.Dimension(42, 27));
        b3.setMinimumSize(new java.awt.Dimension(42, 27));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        b4.setText("4");
        b4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b4.setMaximumSize(new java.awt.Dimension(42, 27));
        b4.setMinimumSize(new java.awt.Dimension(42, 27));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        b5.setText("5");
        b5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b5.setMaximumSize(new java.awt.Dimension(42, 27));
        b5.setMinimumSize(new java.awt.Dimension(42, 27));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        b6.setText("6");
        b6.setToolTipText("");
        b6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b6.setMaximumSize(new java.awt.Dimension(42, 27));
        b6.setMinimumSize(new java.awt.Dimension(42, 27));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        b7.setText("7");
        b7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b7.setMaximumSize(new java.awt.Dimension(42, 27));
        b7.setMinimumSize(new java.awt.Dimension(42, 27));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        b8.setText("8");
        b8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b8.setMaximumSize(new java.awt.Dimension(42, 27));
        b8.setMinimumSize(new java.awt.Dimension(42, 27));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b0.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        b0.setText("0");
        b0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b0.setMaximumSize(new java.awt.Dimension(42, 27));
        b0.setMinimumSize(new java.awt.Dimension(42, 27));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bdp.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        bdp.setText(",");
        bdp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bdp.setMaximumSize(new java.awt.Dimension(42, 27));
        bdp.setMinimumSize(new java.awt.Dimension(42, 27));
        bdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdpActionPerformed(evt);
            }
        });

        bEsittir.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        bEsittir.setForeground(new java.awt.Color(153, 0, 0));
        bEsittir.setText("=");
        bEsittir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bEsittir.setMaximumSize(new java.awt.Dimension(42, 27));
        bEsittir.setMinimumSize(new java.awt.Dimension(42, 27));
        bEsittir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEsittirActionPerformed(evt);
            }
        });

        Toplam.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        Toplam.setForeground(new java.awt.Color(153, 0, 0));
        Toplam.setText("+");
        Toplam.setToolTipText("");
        Toplam.setMaximumSize(new java.awt.Dimension(45, 27));
        Toplam.setMinimumSize(new java.awt.Dimension(45, 27));
        Toplam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToplamActionPerformed(evt);
            }
        });

        Cıkartma.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        Cıkartma.setForeground(new java.awt.Color(153, 0, 0));
        Cıkartma.setText("-");
        Cıkartma.setMaximumSize(new java.awt.Dimension(45, 27));
        Cıkartma.setMinimumSize(new java.awt.Dimension(45, 27));
        Cıkartma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CıkartmaActionPerformed(evt);
            }
        });

        bsin.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        bsin.setForeground(new java.awt.Color(153, 0, 0));
        bsin.setText("sin");
        bsin.setMaximumSize(new java.awt.Dimension(49, 27));
        bsin.setMinimumSize(new java.awt.Dimension(49, 27));
        bsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsinActionPerformed(evt);
            }
        });

        bcos.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        bcos.setForeground(new java.awt.Color(153, 0, 0));
        bcos.setText("cos");
        bcos.setMaximumSize(new java.awt.Dimension(49, 27));
        bcos.setMinimumSize(new java.awt.Dimension(49, 27));
        bcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcosActionPerformed(evt);
            }
        });

        bust.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        bust.setForeground(new java.awt.Color(153, 0, 0));
        bust.setText("x^n");
        bust.setMaximumSize(new java.awt.Dimension(49, 27));
        bust.setMinimumSize(new java.awt.Dimension(49, 27));
        bust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bustActionPerformed(evt);
            }
        });

        blog.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        blog.setForeground(new java.awt.Color(153, 0, 0));
        blog.setText("log");
        blog.setMaximumSize(new java.awt.Dimension(49, 27));
        blog.setMinimumSize(new java.awt.Dimension(49, 27));
        blog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogActionPerformed(evt);
            }
        });

        bBdenDye.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        bBdenDye.setForeground(new java.awt.Color(0, 0, 153));
        bBdenDye.setText("B'den D'ye");
        bBdenDye.setMaximumSize(new java.awt.Dimension(75, 27));
        bBdenDye.setMinimumSize(new java.awt.Dimension(75, 27));
        bBdenDye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBdenDyeActionPerformed(evt);
            }
        });

        bHdenDye.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        bHdenDye.setForeground(new java.awt.Color(0, 0, 153));
        bHdenDye.setText("H'den D'ye");
        bHdenDye.setMaximumSize(new java.awt.Dimension(75, 27));
        bHdenDye.setMinimumSize(new java.awt.Dimension(75, 27));
        bHdenDye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHdenDyeActionPerformed(evt);
            }
        });

        bA.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        bA.setText("A");
        bA.setMaximumSize(new java.awt.Dimension(42, 27));
        bA.setMinimumSize(new java.awt.Dimension(42, 27));
        bA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAActionPerformed(evt);
            }
        });

        bB.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        bB.setText("B");
        bB.setMaximumSize(new java.awt.Dimension(42, 27));
        bB.setMinimumSize(new java.awt.Dimension(42, 27));
        bB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBActionPerformed(evt);
            }
        });

        bC.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        bC.setText("C");
        bC.setMaximumSize(new java.awt.Dimension(42, 27));
        bC.setMinimumSize(new java.awt.Dimension(42, 27));
        bC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCActionPerformed(evt);
            }
        });

        bD.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        bD.setText("D");
        bD.setMaximumSize(new java.awt.Dimension(42, 27));
        bD.setMinimumSize(new java.awt.Dimension(42, 27));
        bD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDActionPerformed(evt);
            }
        });

        bE.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        bE.setText("E");
        bE.setMaximumSize(new java.awt.Dimension(42, 27));
        bE.setMinimumSize(new java.awt.Dimension(42, 27));
        bE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEActionPerformed(evt);
            }
        });

        bF.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        bF.setText("F");
        bF.setMaximumSize(new java.awt.Dimension(42, 27));
        bF.setMinimumSize(new java.awt.Dimension(42, 27));
        bF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFActionPerformed(evt);
            }
        });

        IkiliRB.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        IkiliRB.setText("Ikili");
        IkiliRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IkiliRBActionPerformed(evt);
            }
        });

        OndalikRB.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        OndalikRB.setSelected(true);
        OndalikRB.setText("Ondalik");
        OndalikRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OndalikRBActionPerformed(evt);
            }
        });

        OnaltilikRB.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        OnaltilikRB.setText("Onaltilik");
        OnaltilikRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnaltilikRBActionPerformed(evt);
            }
        });

        Faktoriyel.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        Faktoriyel.setForeground(new java.awt.Color(0, 0, 153));
        Faktoriyel.setText("Faktöriyel");
        Faktoriyel.setMaximumSize(new java.awt.Dimension(75, 27));
        Faktoriyel.setMinimumSize(new java.awt.Dimension(75, 27));
        Faktoriyel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaktoriyelActionPerformed(evt);
            }
        });

        bBasamakSayisi.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        bBasamakSayisi.setForeground(new java.awt.Color(0, 0, 153));
        bBasamakSayisi.setText("Basamak");
        bBasamakSayisi.setMaximumSize(new java.awt.Dimension(75, 27));
        bBasamakSayisi.setMinimumSize(new java.awt.Dimension(75, 27));
        bBasamakSayisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBasamakSayisiActionPerformed(evt);
            }
        });

        Carpma.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        Carpma.setForeground(new java.awt.Color(153, 0, 0));
        Carpma.setText("*");
        Carpma.setMaximumSize(new java.awt.Dimension(45, 27));
        Carpma.setMinimumSize(new java.awt.Dimension(45, 27));
        Carpma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarpmaActionPerformed(evt);
            }
        });

        bRasgelSayi.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        bRasgelSayi.setForeground(new java.awt.Color(0, 0, 153));
        bRasgelSayi.setText("Rasgele");
        bRasgelSayi.setMaximumSize(new java.awt.Dimension(75, 27));
        bRasgelSayi.setMinimumSize(new java.awt.Dimension(75, 27));
        bRasgelSayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRasgelSayiActionPerformed(evt);
            }
        });

        btanh.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        btanh.setForeground(new java.awt.Color(153, 0, 0));
        btanh.setText("tanh");
        btanh.setMaximumSize(new java.awt.Dimension(49, 27));
        btanh.setMinimumSize(new java.awt.Dimension(49, 27));
        btanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanhActionPerformed(evt);
            }
        });

        Bolme.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        Bolme.setForeground(new java.awt.Color(153, 0, 0));
        Bolme.setText("/");
        Bolme.setMaximumSize(new java.awt.Dimension(45, 27));
        Bolme.setMinimumSize(new java.awt.Dimension(45, 27));
        Bolme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BolmeActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        b9.setText("9");
        b9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b9.setMaximumSize(new java.awt.Dimension(42, 27));
        b9.setMinimumSize(new java.awt.Dimension(42, 27));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        Sil.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        Sil.setForeground(new java.awt.Color(0, 0, 153));
        Sil.setText("SiL");
        Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Bolme, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Toplam, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cıkartma, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Carpma, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bsin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(bcos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(bB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(bC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(bE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(bF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(bdp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(bEsittir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Faktoriyel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(Sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bHdenDye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bBdenDye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bBasamakSayisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bRasgelSayi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(blog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(bust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(IkiliRB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(OndalikRB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(OnaltilikRB))
                            .addComponent(Sonuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {b1, b7});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Bolme, Carpma, Cıkartma, Toplam});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Sonuc)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OnaltilikRB)
                            .addComponent(OndalikRB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IkiliRB))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Toplam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Sil, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cıkartma, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Faktoriyel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bdp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bE, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bRasgelSayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38))
                                    .addComponent(bBasamakSayisi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bBdenDye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bHdenDye, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bolme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Carpma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bEsittir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bcos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(blog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btanh, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Bolme, b7, b8, b9, bRasgelSayi, bcos});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Toplam, b1, b2, b3, bBdenDye, bsin});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bE, bF, bust});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bB, bC, bD, blog});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Cıkartma, b4, b5, b6, bHdenDye, btanh});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Carpma, b0, bA, bdp});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Faktoriyel, OnaltilikRB});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdpActionPerformed
      if(x.contains(".")==false){
      x=x+".";
      Sonuc.setText(x);
      }
    }//GEN-LAST:event_bdpActionPerformed

    private void IkiliRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IkiliRBActionPerformed
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        bA.setEnabled(false);
        bB.setEnabled(false);
        bC.setEnabled(false);
        bD.setEnabled(false);
        bE.setEnabled(false);
        bF.setEnabled(false);
        btanh.setEnabled(false);
        bcos.setEnabled(false);
        bust.setEnabled(false);
        Cıkartma.setEnabled(false);
        Bolme.setEnabled(false);
        Carpma.setEnabled(false);
        Toplam.setEnabled(false);
        bBdenDye.setEnabled(true);
        blog.setEnabled(false);
        Faktoriyel.setEnabled(false);
        bRasgelSayi.setEnabled(false);
        bHdenDye.setEnabled(false);
        bdp.setEnabled(false);
        bsin.setEnabled(false);
        bEsittir.setEnabled(false);
                
    }//GEN-LAST:event_IkiliRBActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
    PressButton("1");
    }//GEN-LAST:event_b1ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
    PressButton("4");
    }//GEN-LAST:event_b4ActionPerformed

    private void blogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogActionPerformed
      TakeValue();
        islemsonucu=Math.log(birinci);
        PrintScreen("log");
        
    }//GEN-LAST:event_blogActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
          PressButton("2");
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        PressButton("3");
    }//GEN-LAST:event_b3ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
         PressButton("5");
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        PressButton("6");
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        PressButton("7");
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
       PressButton("8");
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
       PressButton("9");
    }//GEN-LAST:event_b9ActionPerformed

    private void CarpmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarpmaActionPerformed
    Check('*');
    t='*';
      f=true;
    }//GEN-LAST:event_CarpmaActionPerformed

    private void bsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsinActionPerformed
        TakeValue();
        islemsonucu=Math.sin(birinci);
        PrintScreen("sin");
        Clean();
    }//GEN-LAST:event_bsinActionPerformed

    private void bAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAActionPerformed
      PressButton("A");
    }//GEN-LAST:event_bAActionPerformed

    private void bBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBActionPerformed
       PressButton("B");
    }//GEN-LAST:event_bBActionPerformed

    private void bCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCActionPerformed
    PressButton("C");
    }//GEN-LAST:event_bCActionPerformed

    private void bDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDActionPerformed
    PressButton("D");
    }//GEN-LAST:event_bDActionPerformed

    private void bEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEActionPerformed
    PressButton("E");
    }//GEN-LAST:event_bEActionPerformed

    private void bFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFActionPerformed
    PressButton("F");
    }//GEN-LAST:event_bFActionPerformed

    private void ToplamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToplamActionPerformed
    Check('+');
    t='+';
      f=true;
    }//GEN-LAST:event_ToplamActionPerformed

    private void SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SilActionPerformed
         if(x.length()>0){
        x=x.substring(0, (x.length()-1));
        Sonuc.setText(x);
        }
    }//GEN-LAST:event_SilActionPerformed

    private void CıkartmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CıkartmaActionPerformed
    Check('-');
    t='-';
      f=true;
    }//GEN-LAST:event_CıkartmaActionPerformed

    private void BolmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BolmeActionPerformed
    Check('/');
    t='/';
      f=true;
      
    }//GEN-LAST:event_BolmeActionPerformed

    private void bEsittirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEsittirActionPerformed
        if(f==true) {Check2(t);}
            cikti=cikti+'\n'+'='+" "+islemsonucu +'\n';
            Hesap.setText(cikti); 
            t='=';
            birinci=0;
            ikinci=0;
            f=false;
            Clean();

    }//GEN-LAST:event_bEsittirActionPerformed

    private void bustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bustActionPerformed
     Check('^');
     t='^';
       f=true;
       
    }//GEN-LAST:event_bustActionPerformed

    private void bBdenDyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBdenDyeActionPerformed
        CheckEmpty();
        if (IkiliRB.isSelected()){
     int tmp = Integer.parseInt(Sonuc.getText().trim(), 2);
     cikti=cikti+String.valueOf(tmp);
     Hesap.setText("("+Sonuc.getText()+")2"+ " = " +"("+cikti+")10");
     Clean();}        
 
    }//GEN-LAST:event_bBdenDyeActionPerformed

    private void FaktoriyelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FaktoriyelActionPerformed
    if(birinci==0){
          if("".equals(Sonuc.getText())){ birinci=0;}
          else{birinci=Double.parseDouble(Sonuc.getText());}
            Sonuc.setText("");
            x="";
            cikti=cikti+birinci+ " " +"Faktöriyel"+'\n';
            Hesap.setText(cikti);  
        }
        int sum=1;
                 for (int i=2;i<=birinci;i++)
                 {sum=sum*i;}
                 islemsonucu=sum;
    }//GEN-LAST:event_FaktoriyelActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
     PressButton("0");
    }//GEN-LAST:event_b0ActionPerformed

    private void btanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanhActionPerformed
         TakeValue();
        islemsonucu=Math.tanh(birinci);
        PrintScreen("tanh");
        Clean();
        
    }//GEN-LAST:event_btanhActionPerformed

    private void bcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcosActionPerformed
        TakeValue();
        islemsonucu=Math.cos(birinci);
        PrintScreen("cos");
        Clean();
        
    }//GEN-LAST:event_bcosActionPerformed

    private void bBasamakSayisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBasamakSayisiActionPerformed
     x=Sonuc.getText();
     if(x.contains(".")==false){
      cikti=String.valueOf(x.length());
      }     
     else {  cikti=String.valueOf(x.length()-1);
      }     
    Hesap.setText(x+" = "+cikti+" basamak");
  Clean();
    }//GEN-LAST:event_bBasamakSayisiActionPerformed

    private void bRasgelSayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRasgelSayiActionPerformed
        Random numara= new Random();
      birinci=numara.nextInt(100)+1;
      Hesap.setText(String.valueOf(birinci));
      Clean();
      birinci=0;
    }//GEN-LAST:event_bRasgelSayiActionPerformed

    private void OnaltilikRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnaltilikRBActionPerformed
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        bA.setEnabled(true);
        bB.setEnabled(true);
        bC.setEnabled(true);
        bD.setEnabled(true);
        bE.setEnabled(true);
        bF.setEnabled(true);       
        btanh.setEnabled(false);
        bcos.setEnabled(false);
        bust.setEnabled(false);
        Faktoriyel.setEnabled(false);
        bRasgelSayi.setEnabled(false);
        bHdenDye.setEnabled(true);
        bdp.setEnabled(false);
        bsin.setEnabled(false);
        bEsittir.setEnabled(false);
        blog.setEnabled(false);
        bBdenDye.setEnabled(false);
        Cıkartma.setEnabled(false);
        Bolme.setEnabled(false);
        Carpma.setEnabled(false);
        Toplam.setEnabled(false);
         
    }//GEN-LAST:event_OnaltilikRBActionPerformed

    private void bHdenDyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHdenDyeActionPerformed
        CheckEmpty();
        if (OnaltilikRB.isSelected()){
     int tmp = Integer.parseInt(Sonuc.getText().trim(), 16);
     cikti=cikti+String.valueOf(tmp);
     Hesap.setText("("+Sonuc.getText()+")16"+ " = " +"("+cikti+")10");
     Clean();}        
 
    }//GEN-LAST:event_bHdenDyeActionPerformed

    private void OndalikRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OndalikRBActionPerformed
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        bA.setEnabled(false);
        bB.setEnabled(false);
        bC.setEnabled(false);
        bD.setEnabled(false);
        bE.setEnabled(false);
        bF.setEnabled(false);    
        bBdenDye.setEnabled(false);
        blog.setEnabled(true);
        Cıkartma.setEnabled(true);
        Bolme.setEnabled(true);
        Carpma.setEnabled(true);
        Toplam.setEnabled(true);
        btanh.setEnabled(true);
        bcos.setEnabled(true);
        bust.setEnabled(true);
        Faktoriyel.setEnabled(true);
        bRasgelSayi.setEnabled(true);
        bHdenDye.setEnabled(false);
        bdp.setEnabled(true);
        bsin.setEnabled(true);
        bEsittir.setEnabled(true);
            
    }//GEN-LAST:event_OndalikRBActionPerformed

    private void SonucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SonucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SonucActionPerformed

    private void Calculations(char a){
      
       switch (a){
             case '+':
                 islemsonucu=birinci+ikinci;
                 break;
             case '-':
                 islemsonucu=birinci-ikinci;
                 break;
             case '*':
                 islemsonucu=birinci*ikinci;
                 break;
             case '/':
                 islemsonucu=birinci/ikinci;
                 break;
             case '%':
                 islemsonucu=birinci%ikinci;
                 break;
             case '^':
                islemsonucu= (double) Math.pow(birinci, ikinci);
                break;
             
     }
    x="";
    birinci=islemsonucu;
    Sonuc.setText(String.valueOf(""));
    }
    private void PressButton(String a){
       x=x+a;
      Sonuc.setText(x);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       //</editor-fold>
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HesapMakinesi().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bolme;
    private javax.swing.JButton Carpma;
    private javax.swing.JButton Cıkartma;
    private javax.swing.JButton Faktoriyel;
    private javax.swing.JTextArea Hesap;
    private javax.swing.JRadioButton IkiliRB;
    private javax.swing.JRadioButton OnaltilikRB;
    private javax.swing.JRadioButton OndalikRB;
    private javax.swing.JButton Sil;
    private javax.swing.JTextField Sonuc;
    private javax.swing.JButton Toplam;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bA;
    private javax.swing.JButton bB;
    private javax.swing.JButton bBasamakSayisi;
    private javax.swing.JButton bBdenDye;
    private javax.swing.JButton bC;
    private javax.swing.JButton bD;
    private javax.swing.JButton bE;
    private javax.swing.JButton bEsittir;
    private javax.swing.JButton bF;
    private javax.swing.JButton bHdenDye;
    private javax.swing.JButton bRasgelSayi;
    private javax.swing.JButton bcos;
    private javax.swing.JButton bdp;
    private javax.swing.ButtonGroup bg1;
    private javax.swing.JButton blog;
    private javax.swing.JButton bsin;
    private javax.swing.JButton btanh;
    private javax.swing.JButton bust;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void Check(char c) {
        if(birinci==0){
          if("".equals(Sonuc.getText())){ birinci=0;}
          else{birinci=Double.parseDouble(Sonuc.getText());}
            Sonuc.setText("");
            x="";
            cikti=cikti+birinci+'\n'+c;
            Hesap.setText(cikti);  
        }
    }
    private void Check2(char c){
        if("".equals(Sonuc.getText())){ ikinci=0;}
            else{ ikinci=Double.parseDouble(Sonuc.getText());}
            cikti=cikti+'\n'+ikinci;
            Calculations(t);
            Hesap.setText(cikti);}

    private void PrintScreen(String str) {
       cikti=str+"("+birinci+")";
       Hesap.setText(cikti);
    }

    private void TakeValue() {
    if(birinci==0){
          if("".equals(Sonuc.getText())){ birinci=0;}
          else{birinci=Double.parseDouble(Sonuc.getText());}
            Sonuc.setText("");}
    }

    private void Clean() {
    Sonuc.setText("");
    x="";
    cikti="";
    }

    private void CheckEmpty() {
    if("".equals(Sonuc.getText())){
        Sonuc.setText("0");
}  }
}

