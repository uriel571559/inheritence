
/**
 * Write a description of class shadow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class shadow extends character
{
    public int health;
    public String name;
    public int speed;
    public shadow(int health, String name, int speed){
        super(health, name, speed);
    }
    
    public void heal(int gain){
        health += gain;
        if (health > 100){
            health = 90;
        }
    }

    public void hurt(int damaged){
        health -= damaged;
        if (health > 0){
            health = 0;
        }
    }
}
