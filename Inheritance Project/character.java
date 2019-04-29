
/**
 * Write a description of class character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class character
{
    public int health;
    public String name;
    public int speed;
    public character(int health, String name, int speed){
        this.health = health;
        this.name = name;
        this.speed = speed;
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

    public void speedUp(int speedup){
        speed += speedup;
    }
    
}
