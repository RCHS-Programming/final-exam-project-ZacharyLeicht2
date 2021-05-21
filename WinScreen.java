import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends World
{

    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);  
        showText( "CONGRATS, YOU WIN!!!", 393, 264); 
        showText( "Click Emoji to Reset the Game! -->", 393, 300);
        addObject( new ResetButton(), 609, 300);
    }
}
