package src;

import java.io.*;
import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;



class Main extends JPanel{

    private static int HEIGHT = 900;
    private static int WIDTH = 500;

    //PLAYER1
    private ArrayList<Ant> p1Ants = new ArrayList<Ant>();
    private AntMound p1Mound;
    //PLAYER2
    private ArrayList<Ant> p2Ants = new ArrayList<Ant>();
    private AntMound p2Mound;
    
    public void main(String[] args)
    {
        JFrame APP = new JFrame("Hive Havoc");
        APP.setSize(WIDTH, HEIGHT);

        //temp stuff
        p1Mound = new AntMound(100, 10.0, new FireAnt());
        paintComponent(getGraphics());
    }
    
    public static int getH(){
        return HEIGHT;
    }
    public static int getW(){
        return WIDTH;
    }

    public void paintComponent(Graphics g) {
        //set the background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Frame.WIDTH, Frame.HEIGHT);

        //Graphics2D to enable wider line drawing
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(4));
        g2.drawLine(0, HEIGHT - 100, WIDTH, HEIGHT - 100);

        //Paint active ants
        
        //paint the hill
        p1Mound.draw(g);
        
    }

}