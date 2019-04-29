
/**
 * Write a description of class weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class weapon extends Item implements WeaponInterface{
   int damage;
   boolean parry;
   public weapon(String name, int damage){
       super(name);
       this.damage = damage;
   }
   public int attack(){
       return damage;
    }
    public boolean parry(){
        return parry;
    }
}
