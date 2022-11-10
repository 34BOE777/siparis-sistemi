package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SiparisSistemi extends JFrame {

    SiparisSistemi(){
        JCheckBox c1 = new JCheckBox("Elbise @ 200 TL");
        c1.setBounds(90,90,300,10);

        JCheckBox c2 = new JCheckBox("pantolon @ 300 TL");
        c2.setBounds(90,120,300,10);


        JCheckBox c3 = new JCheckBox("Gömlek @ 200 TL");
        c3.setBounds(90,150,300,20);

        JButton b1 = new JButton("satın al");
        b1.setBounds(90,200,300,20);

        add(c1);
        add(c2);
        add(c3);
        add(b1);

        setLayout(null);
        setSize(400,400);
        setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            double total = 0;
            String mesaj = "";
            if(c1.isSelected()){
                total+=300;
                mesaj+="Elbise 200 TL ";
            }
            if(c2.isSelected()){
                total+=300;
                mesaj+="Pantolon 300 TL ";
            }
            if(c3.isSelected()){
                total+=150;
                mesaj+="Elbise 150 TL ";
            }

            mesaj+="--------------------------";
            JOptionPane.showMessageDialog(null,mesaj+ "Toplam borcunuz: "+total);
            }
        });


    }
}
