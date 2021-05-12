import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bus extends Actor
{
    private int speed;
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed);
        if(isAtEdge())
        {
            setLocation( 0, getY());
        }
    }    
    
     /**
     * Initialize the speed for the Car.
     */
    public Bus(int setSpeed)
    {
        speed = setSpeed;
    }
}
