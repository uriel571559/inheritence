
/**
 * Write a description of class potion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class potion extends Item{
   public potion(String name, int cost){
        super(name);
    }
    
    public int heal(){
        System.out.print("You drank the heal item for ");
        return 1;
    }
}
