
/**
 * Write a description of class berserker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class berserker extends character
{
    public int health;
    public String name;
    public int speed;
    public berserker(int health, String name, int speed){
        super(health, name, speed);
    }
    
    public void heal(int gain){
        health += gain;
        if (health > 100){
            health = 120;
        }
    }

    public void hurt(int damaged){
        health -= damaged;
        if (health > 0){
            health = 0;
        }
    }
}
