package src;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import javax.swing.JPanel;

public class Ant extends JPanel{
   private double health;
   private double speed;
   private double damage;
   private String name;
   private int ani_step = 0;
   private int x = 0;
   private int y = 0;
   private BufferedImage spriteSheet; 
   
   public Ant(double h, double s, double d, String n){
      health = h;
      speed = s;
      damage = d; 
      name = n;
      try{
         spriteSheet = ImageIO.read(new File("Sprites/" + name + ".png"));
      }
      catch(Exception v){
         System.out.println(v);
      }
   }
 
   public void draw(Graphics g) {
      super.paintComponent(g);
      g.drawImage(getImage(spriteSheet), x, y, this);
   }

   public BufferedImage getImage(BufferedImage img){
      BufferedImage new_img = spriteSheet;
      
      if(ani_step == 0)
         new_img = (BufferedImage) createImage(new FilteredImageSource(img.getSource(),new CropImageFilter(0,0, 96, 101)));
      else if(ani_step == 1)
         new_img = (BufferedImage) createImage(new FilteredImageSource(img.getSource(),new CropImageFilter(96,0, 96, 101)));
      else if(ani_step == 2)
         new_img = (BufferedImage) createImage(new FilteredImageSource(img.getSource(),new CropImageFilter(192,0, 96, 101)));
      else
         new_img = (BufferedImage) createImage(new FilteredImageSource(img.getSource(),new CropImageFilter(288,0, 96, 101)));

      ani_step++;
      if(ani_step >= 4)
         ani_step = 0;
         
      return new_img;
   }
   
   public void attackAnt(Ant ant) {
      ant.doDamage(damage);
   }
   
   public void doDamage(double amt){
      health -= amt;
   }
   
   public double getHealth(){
      return health;
   }
   public double getSpeed(){
      return speed;
   }
   public double getDamage(){
      return damage;
   }
   public String getName(){
      return name;
   }
   
   
}


