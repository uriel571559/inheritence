
/**
 * Write a description of class moster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class heartless extends character
{
    public int health;
    public String name;
    public int speed;
    public heartless(int health, String name, int speed){
        super(health, name, speed);
    }
    
    public void heal(int gain){
        health += gain;
        if (health > 100){
            health = 100;
        }
    }

    public void hurt(int damaged){
        health -= damaged;
        if (health > 0){
            health = 0;
        }
    }
}
