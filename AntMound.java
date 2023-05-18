import java.util.*;

public class AntMound{
   private double health;
   private double spawnRate;
   private Ant antType;
   private int level = 1;
   
   public AntMound(double h, double sr, Ant antTy){
      health = h;
      spawnRate = sr;
      antType = antTy;
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


