import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoseScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoseScreen extends World
{

    /**
     * Constructor for objects of class LoseScreen.
     * 
     */
    public LoseScreen()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        showText( "SORRY, YOU LOSE!", 400, 264);
        showText( "Click Emoji to Reset the Game! -->", 393, 300);
        showText( "Click Here to go Back to Start Screen! -->", 555, 572);
        addObject( new ResetButton2(), 609, 300); 
        addObject( new BackButton(), 764, 572);
    }
}
