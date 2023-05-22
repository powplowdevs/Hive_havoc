package src;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class AntMound extends JPanel{
   private double health;
   private double spawnRate;
   private Ant antType;
   private int level = 1;
   private BufferedImage sprite;
   private int HEIGHT = Main.getH();
   private int WIDTH = Main.getW();
   
   public AntMound(double h, double sr, Ant antTy){
      health = h;
      spawnRate = sr;
      antType = antTy;
      try {
            sprite = ImageIO.read(new File("AntHill.png"));
        } 
      catch (Exception e) {
            sprite = null;
        }
   }

   public void draw(Graphics g) {
      super.paintComponent(g);
      g.drawImage(sprite, WIDTH, HEIGHT, this);
   }

   public double getHealth(){
      return health;
   }
   public Ant getAnt(){
    return antType;
   }
   public int getLevel(){
    return level;
   }
   public void levelUp(){
        level++;
   }
   
}


