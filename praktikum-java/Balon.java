import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Balloons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balon extends Actor
{
    /**
     * Act - do whatever the Balloons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int Jalan = Greenfoot.getRandomNumber(5) + 1;
        move(10);
        
        if (isAtEdge()) {
            turn(Greenfoot.getRandomNumber(360));
        }
    }
}
