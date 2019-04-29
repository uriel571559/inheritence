
/**
 * Write a description of class maxpotion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class maxpotion extends Item
{
    public maxpotion(String name, int cost){
        super(name);
    }
    
    public int heal(){
        System.out.print("You drank the heal item for ");
        return 1;
    }
}
