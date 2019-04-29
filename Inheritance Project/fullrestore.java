
/**
 * Write a description of class fullrestore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fullrestore extends healItems
{
    public fullrestore(String name, int cost){
        super(name);
    }
    
    public int heal(){
        System.out.print("You drank the heal item for ");
        return 1;
    }
}
