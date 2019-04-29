
/**
 * Write a description of class megapotion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class megapotion extends Item
{
    public megapotion(String name, int cost){
        super(name);
    }
    
    public int heal(){
        System.out.print("You drank the heal item for ");
        return 1;
    }
}
