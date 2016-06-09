/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalayouty;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author jrwoj_000
 */
class Ramka extends JFrame{
    JPanel mainPanel;
    public Ramka(String napis){
        JFrame f = new JFrame();
        setTitle(napis);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainPanel = new JPanel(new GridLayout(2,2));
        this.add(mainPanel);
        
    }
    void stworzPrzyciski(JPanel p){
        for(int i=0; i<10; i++){
            JButton b = new JButton("" + i);
            p.add(b);
        }
    }
    void stworzMenu(JFrame frame){
        JMenuBar bar = new JMenuBar();
        JMenu plik = new JMenu("Plik");
        bar.add(plik);
        JMenuItem nowy = new JMenuItem("Nowy");
        plik.add(nowy);
        JMenuItem otworz = new JMenuItem("Otwórz");
        plik.add(otworz);
        
        JMenu edycja = new JMenu("Edycja");
        bar.add(edycja);
        JMenuItem kopiuj = new JMenuItem("Kopiuj");
        edycja.add(kopiuj);
        JMenuItem wklej = new JMenuItem("Wklej");
        edycja.add(wklej);
        //CheckboxMenuItem zaznaczenie = new CheckboxMenuItem("Zaznaczenie", true);
       //edycja.add((Action) zaznaczenie);
        
        frame.setJMenuBar(bar);
    }
}
public class JavaLayouty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ramka ramka1 = new Ramka("Ramka1");

        
        JPanel borderL = new JPanel(new BorderLayout());
        JPanel gridL = new JPanel(new GridLayout(5,2));
        JPanel boxL = new JPanel();
        boxL.setLayout(new BoxLayout(boxL, BoxLayout.Y_AXIS));
        JPanel flowL = new JPanel(new FlowLayout());
        
       
        borderL.setBorder(BorderFactory.createRaisedBevelBorder());
        gridL.setBorder(BorderFactory.createLineBorder(Color.red, 5));
        boxL.setBorder(BorderFactory.createBevelBorder(0));
        flowL.setBorder(BorderFactory.createEtchedBorder());
        
        ramka1.mainPanel.add(borderL);
        ramka1.mainPanel.add(gridL);
        ramka1.mainPanel.add(boxL);
        ramka1.mainPanel.add(flowL);
        
        ramka1.stworzPrzyciski(borderL);
        ramka1.stworzPrzyciski(gridL);
        ramka1.stworzPrzyciski(boxL);
        ramka1.stworzPrzyciski(flowL);
        
        ramka1.stworzMenu(ramka1);
        ramka1.setVisible(true);
    }
    
}
