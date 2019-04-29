
/**
 * Write a description of class staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class staff extends weapon
{
    double parryChance;
    boolean parry;
    public staff(String name, int damage, double parryChance){
        super(name, damage);
        this.parryChance = parryChance;
    }
}
