
/**
 * Write a description of class healItems here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class healItems extends Item
{
    public healItems(String name, int cost){
        super(name);
    }
    
    public int heal(){
        System.out.print("You drank the heal item for ");
        return 1;
    }
}
