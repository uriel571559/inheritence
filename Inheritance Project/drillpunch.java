
/**
 * Write a description of class drillpunch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class drillpunch extends weapon
{
    double parryChance;
    boolean parry;
    public drillpunch(String name, int damage, double parryChance){
        super(name, damage);
        this.parryChance = parryChance;
    }
}
