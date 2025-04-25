
package hospital;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JFrame;

public class Hospital extends JFrame implements ActionListener{

    Label  W= new Label("Welcome");
    Button D= new Button("Doctors");
    Button P= new Button("Patients");
    Button T= new Button("Tests");
    Button E= new Button("Exit");
    
    
    
   
    
    public Hospital() {
        // Constructor code
        
      this.setTitle("home page") ; 
      this.setBounds(200,200,600,420);
      this.setLayout(null);
      this.setVisible(true);
      
      this.add(D);
      D.setBounds(80, 140, 100, 50);
      D.setBackground(Color.PINK);
      D.setForeground(Color.black);
      
      
      this.add(P);
      P.setBounds(250,140,100,50);
      P.setBackground(Color.PINK);
      P.setForeground(Color.black);
      
      
      this.add(T);
      T.setBounds(410,140 ,100,50);
      T.setBackground(Color.PINK);
      T.setForeground(Color.black);
      
      
      this.add(E);
      E.setBounds(250,300,100,50);
      E.setBackground(Color.GRAY);
      E.setForeground(Color.black);
      
      
      this.add(W);
      W.setBounds(250, 10, 120, 120);
      W.setForeground(Color.GRAY);
      W.setFont(new Font ("Tahoma", Font.PLAIN , 26));
     
     
    }
 
    
    
    @Override
public void actionPerformed(ActionEvent e) {
    // الكود اللي بيحصل لما يتضغط الزر مثلاً
    //بيتنفذ لما يحصل اكشن
    
    
}

    
    
    
    
    
    
   public static void main(String[] args) {
        //تشغيل البرنامج
                Hospital h1 = new Hospital();
                h1.setVisible(true);
            }
   
      
}

        
    

    

