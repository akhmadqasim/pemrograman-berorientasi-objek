import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstStage extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public FirstStage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Balon player1 = new Balon();
        this.addObject(player1, 40, 50);
        
        Balon player2 = new Balon();
        this.addObject(player2, 140, 150);
    }
}
