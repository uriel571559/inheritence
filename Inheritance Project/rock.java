
/**
 * Write a description of class rock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rock extends weapon
{
    double parryChance;
    boolean parry;
    public rock(String name, int damage, double parryChance){
        super(name, damage);
        this.parryChance = parryChance;
    }
}
