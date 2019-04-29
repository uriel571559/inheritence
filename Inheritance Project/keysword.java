
/**
 * Write a description of class sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class keysword extends weapon{
    double parryChance;
    boolean parry;
    public keysword(String name, int damage, double parryChance){
        super(name, damage);
        this.parryChance = parryChance;
    }
}
