import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RulesButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RulesButton extends Actor
{
    /**
     * Act - do whatever the RulesButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // When the Button is clicked, it resets the World.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld( new RulesScreen() );
        }
    }    
}
