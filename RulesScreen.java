import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RulesScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RulesScreen extends World
{

    /**
     * Constructor for objects of class RulesScreen.
     * 
     */
    public RulesScreen()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        showText( "Welcome to Frog Jump!", 393, 264); 
        showText( "The pont of this game is to get the frog across to the other side to win the game", 393, 305);
        showText( "but You only have 4 lives and each time a car hits you, you lose a life,", 393, 325);
        showText( "also be careful about the Man walking,", 393, 345);
        showText( "He can Send you back across the road to the start!", 393, 365);
        showText( "Click Here to go Back! -->", 625, 572);
        addObject( new BackButton(), 764, 572);
    }
}
