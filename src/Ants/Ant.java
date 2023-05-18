import java.util.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Ant{
   private double health;
   private double speed;
   private double damage;
   private String name;
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


