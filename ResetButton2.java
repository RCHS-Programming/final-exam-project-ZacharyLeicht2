import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ResetButton2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ResetButton2 extends Actor
{
    /**
     * Act - do whatever the ResetButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // When the Button is clicked, it resets the World.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld( new FrogWorld() );
        }
    }    
}
