
/**
 * Write a description of class superpotion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class superpotion extends Item
{
    public superpotion(String name, int cost){
        super(name);
    }
    
    public int heal(){
        System.out.print("You drank the heal item for ");
        return 1;
    }
}
