
/**
 * Write a description of class shotlock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class shotlock extends weapon
{
    double parryChance;
    boolean parry;
    public shotlock(String name, int damage, double parryChance){
        super(name, damage);
        this.parryChance = parryChance;
    }
}
