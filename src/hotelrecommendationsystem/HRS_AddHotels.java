/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelrecommendationsystem;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.UUID;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Vijay Raj Singh
 */
public class HRS_AddHotels extends javax.swing.JFrame {
HotelRecommendationSystem HRS;
String filename = null;
   File image = null;
    String imgpath = null;
    byte[] photo1;
    byte[] photo2;
    byte[] photo3;
    byte[] photo4;
    /**
     * Creates new form HRS_AddHotels
     */
    String ID;
    public HRS_AddHotels() {
        initComponents();
        checkstring="SUBMIT";
        b1.setText(checkstring);
        HRS = new HotelRecommendationSystem();
        setLocationRelativeTo(null);
        ID = "HRS" + UUID.randomUUID().toString().substring(0,4);  
         System.out.println(ID);
         uniqueID();
         fillComboBox();
    }
    String id;
    public HRS_AddHotels(String p) {
        initComponents();
        id =p;
        checkstring="UPDATE";
        b1.setText(checkstring);
        HRS = new HotelRecommendationSystem();
        setLocationRelativeTo(null);
        showUpdate1();
        fillComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_img1 = new javax.swing.JLabel();
        lbl_img2 = new javax.swing.JLabel();
        lbl_img3 = new javax.swing.JLabel();
        lbl_img4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_location = new javax.swing.JTextField();
        txt_city = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_contact1 = new javax.swing.JTextField();
        txt_contact2 = new javax.swing.JTextField();
        txt_about = new javax.swing.JTextField();
        cu = new javax.swing.JRadioButton();
        fam = new javax.swing.JRadioButton();
        busi = new javax.swing.JRadioButton();
        bach = new javax.swing.JRadioButton();
        txt_price = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Hotel Details");

        jLabel2.setText("Hotel ID");

        jLabel3.setText("Hotel Name");

        jLabel4.setText("Location / Area");

        jLabel5.setText("State");

        jLabel6.setText("City");

        jLabel7.setText("Contact No.1");

        jLabel8.setText("Contact No.2");

        jLabel9.setText("About");

        jLabel10.setText("Prefered For");

        jLabel11.setText("Email ID");

        jLabel12.setText("Price");

        lbl_img1.setText("          Image1");

        lbl_img2.setText("           Image2");

        lbl_img3.setText("           Image3");

        lbl_img4.setText("           Image4");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setText("Upload 4 Images");

        jButton1.setText("Choose File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Choose File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Choose File");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Choose File");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.setText("SUBMIT");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        cu.setText("Couple");
        cu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuActionPerformed(evt);
            }
        });

        fam.setText("Family");
        fam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                famActionPerformed(evt);
            }
        });

        busi.setText("Business");
        busi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busiActionPerformed(evt);
            }
        });

        bach.setText("Bachelors");
        bach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bachActionPerformed(evt);
            }
        });

        jLabel18.setText("Address");

        jButton5.setBackground(new java.awt.Color(102, 102, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel17)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel18))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_city, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_location, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_address, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(cb1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton1)
                                .addGap(195, 195, 195)
                                .addComponent(jButton2)
                                .addGap(0, 2, Short.MAX_VALUE)))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_contact1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                .addComponent(txt_contact2)
                                .addComponent(txt_about)
                                .addComponent(txt_price))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fam, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bach))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(lbl_img4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(20, 20, 20)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(475, 475, 475)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_contact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_contact2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_about, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cu)
                    .addComponent(fam)
                    .addComponent(busi)
                    .addComponent(bach)
                    .addComponent(jLabel18)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_img1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_img2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_img3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_img4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void fillComboBox()
    {
       String c1="select * from state";
        
        try
        {
         HRS.rs=HRS.stm.executeQuery(c1);
         while(HRS.rs.next())
         {
             cb1.addItem(HRS.rs.getString("COL 2"));
             
         }
        }
        catch(Exception e){
           System.out.println(e);
        }  
    }
    
    
    public void uniqueID(){
        
        txt_id.setText(ID);
    }
    
    
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
  String s1 = txt_id.getText();
        String sq = "select HotelID from hr_addtable where HotelID='"+s1+"'";
              
        try{
            
            HRS.rs = HRS.stm.executeQuery(sq);
            if(HRS.rs.next()==false)
            {
                
                dataSave();
               
            }else
            {
                dataUpdate2(s1);
            }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
       
    }//GEN-LAST:event_b1ActionPerformed

    public void dataSave()
    {
        try{
    String sql = "insert into hr_addtable (HotelID,HotelName,HLocation_Area,State,City,Address,EmailID,ContNo_1,ContNo_2,About,Price,Preferd_for,Image1,Image2,Image3,Image4) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    HRS.pst=HRS.con.prepareStatement(sql);
    HRS.pst.setString(1, txt_id.getText());
    HRS.pst.setString(2, txt_name.getText());
    HRS.pst.setString(3, txt_location.getText());
   String v1=cb1.getSelectedItem().toString();
         HRS.pst.setString(4,v1);
    HRS.pst.setString(5, txt_city.getText());
    HRS.pst.setString(6, txt_address.getText());
    HRS.pst.setString(7, txt_email.getText());
    HRS.pst.setString(8, txt_contact1.getText());
    HRS.pst.setString(9, txt_contact2.getText());
    HRS.pst.setString(10, txt_about.getText());
    HRS.pst.setString(11, txt_price.getText());
    HRS.pst.setString(12, cfbb);
    HRS.pst.setBytes(13,photo1);
    HRS.pst.setBytes(14,photo2);
    HRS.pst.setBytes(15,photo3);
    HRS.pst.setBytes(16,photo4);
    
    HRS.pst.execute();
    
    JOptionPane.showMessageDialog(null,"Add Hotel");
}   catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
}     
     
    }
    
    
    
    
    
    public void dataUpdate2(String k)
    {
        try{
             String sql="Update hr_addtable set HotelID=?, HotelName=?, HLocation_Area=?, State=?, City=?, Address=?, EmailID=?, ContNo_1=?, ContNo_2=?, About=?, Price=?,Preferd_for=?,Image1=?,Image2=?,Image3=?,Image4=? where HotelID='"+k+"'" ; 
          
            HRS.pst=HRS.con.prepareStatement(sql);
    HRS.pst.setString(1, txt_id.getText());
    HRS.pst.setString(2, txt_name.getText());
    HRS.pst.setString(3, txt_location.getText());
   String v1=cb1.getSelectedItem().toString();
         HRS.pst.setString(4,v1);
    HRS.pst.setString(5, txt_city.getText());
    HRS.pst.setString(6, txt_address.getText());
    HRS.pst.setString(7, txt_email.getText());
    HRS.pst.setString(8, txt_contact1.getText());
    HRS.pst.setString(9, txt_contact2.getText());
    HRS.pst.setString(10, txt_about.getText());
    HRS.pst.setString(11, txt_price.getText());
    HRS.pst.setString(12, cfbb);
    HRS.pst.setBytes(13,photo1);
    HRS.pst.setBytes(14,photo2);
    HRS.pst.setBytes(15,photo3);
    HRS.pst.setBytes(16,photo4);
    int i = JOptionPane.showConfirmDialog(this,"Do you really want to update this Hotel","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(i==JOptionPane.YES_OPTION){
            System.out.println("start");
    HRS.pst.executeUpdate();
    System.out.println("end");
     JOptionPane.showMessageDialog(null,"Update Successfuly");
        }else{
             JOptionPane.showMessageDialog(null,"oops!!!");
        }
    
        }catch(Exception e){
            
        }
        
        
    }
    
    public void showUpdate1()
    {
       try{
         String s= "select *from hr_addtable where HotelID = '"+id+"'";
         HRS.rs=HRS.stm.executeQuery(s);
         if(HRS.rs.next()){
             txt_id.setText(HRS.rs.getString("HotelID"));
             txt_name.setText(HRS.rs.getString("HotelName"));
             txt_location.setText(HRS.rs.getString("HLocation_Area"));
             cb1.setSelectedItem(HRS.rs.getString("State"));
             txt_city.setText(HRS.rs.getString("City"));
             txt_address.setText(HRS.rs.getString("Address"));
             txt_email.setText(HRS.rs.getString("EmailID"));
             txt_contact1.setText(HRS.rs.getString("ContNo_1"));
             txt_contact2.setText(HRS.rs.getString("ContNo_2"));
             txt_about.setText(HRS.rs.getString("About"));
             txt_price.setText(HRS.rs.getString("Price"));
             
             
             byte [] imgbyte1 = HRS.rs.getBytes("Image1");  
        
        ImageIcon ic1=new ImageIcon(imgbyte1);
        Image im1=ic1.getImage().getScaledInstance(lbl_img1.getWidth(), lbl_img1.getHeight(),Image.SCALE_SMOOTH);
          ImageIcon newImage1=new ImageIcon(im1);
          lbl_img1.setIcon(newImage1);
          
           byte [] imgbyte2 = HRS.rs.getBytes("Image2");  
        
        ImageIcon ic2=new ImageIcon(imgbyte2);
        Image im2=ic2.getImage().getScaledInstance(lbl_img2.getWidth(), lbl_img2.getHeight(),Image.SCALE_SMOOTH);
          ImageIcon newImage2=new ImageIcon(im2);
          lbl_img2.setIcon(newImage2);
          
           byte [] imgbyte3 = HRS.rs.getBytes("Image3");  
        
        ImageIcon ic3=new ImageIcon(imgbyte3);
        Image im3=ic3.getImage().getScaledInstance(lbl_img3.getWidth(), lbl_img3.getHeight(),Image.SCALE_SMOOTH);
          ImageIcon newImage3=new ImageIcon(im3);
          lbl_img3.setIcon(newImage3);
          
           byte [] imgbyte4 = HRS.rs.getBytes("Image4");  
        
        ImageIcon ic4=new ImageIcon(imgbyte4);
        Image im4=ic4.getImage().getScaledInstance(lbl_img4.getWidth(), lbl_img4.getHeight(),Image.SCALE_SMOOTH);
          ImageIcon newImage4=new ImageIcon(im4);
          lbl_img4.setIcon(newImage4);
         }
         
       } catch(Exception e){
           System.out.println(e);
       }
        
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
       chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
       filename=f.getAbsolutePath();
       ImageIcon icon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img1.getWidth(), lbl_img1.getHeight(),Image.SCALE_SMOOTH));
       lbl_img1.setIcon(icon);
       try{
            image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            photo1=bos.toByteArray();
            System.out.printf("......byte code........");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"..@@@@@.."+e);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         JFileChooser chooser = new JFileChooser();
       chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
       filename=f.getAbsolutePath();
       ImageIcon icon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img2.getWidth(), lbl_img2.getHeight(),Image.SCALE_SMOOTH));
       lbl_img2.setIcon(icon);
       try{
            image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            photo2=bos.toByteArray();
            System.out.printf("......byte code........");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"..@@@@@.."+e);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         JFileChooser chooser = new JFileChooser();
       chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
       filename=f.getAbsolutePath();
       ImageIcon icon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img3.getWidth(), lbl_img3.getHeight(),Image.SCALE_SMOOTH));
       lbl_img3.setIcon(icon);
       try{
            image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            photo3=bos.toByteArray();
            System.out.printf("......byte code........");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"..@@@@@.."+e);
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         JFileChooser chooser = new JFileChooser();
       chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
       filename=f.getAbsolutePath();
       ImageIcon icon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img4.getWidth(), lbl_img4.getHeight(),Image.SCALE_SMOOTH));
       lbl_img4.setIcon(icon);
       try{
            image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            photo4=bos.toByteArray();
            System.out.printf("......byte code........");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"..@@@@@.."+e);
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuActionPerformed
       cfbb="Couple";
    }//GEN-LAST:event_cuActionPerformed

    private void famActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_famActionPerformed
        cfbb="Family";
    }//GEN-LAST:event_famActionPerformed

    private void busiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busiActionPerformed
        cfbb="Business";
    }//GEN-LAST:event_busiActionPerformed

    private void bachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bachActionPerformed
        cfbb="Bachelors";
    }//GEN-LAST:event_bachActionPerformed

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
            java.util.logging.Logger.getLogger(HRS_AddHotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRS_AddHotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRS_AddHotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRS_AddHotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRS_AddHotels().setVisible(true);
            }
        });
    }
public String checkstring;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JRadioButton bach;
    private javax.swing.JRadioButton busi;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JRadioButton cu;
    private javax.swing.JRadioButton fam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_img1;
    private javax.swing.JLabel lbl_img2;
    private javax.swing.JLabel lbl_img3;
    private javax.swing.JLabel lbl_img4;
    private javax.swing.JTextField txt_about;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_contact1;
    private javax.swing.JTextField txt_contact2;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_location;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_price;
    // End of variables declaration//GEN-END:variables
private String cfbb;

}
