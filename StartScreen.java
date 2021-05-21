import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        showText( "Welcome to Frog Jump!", 393, 264); 
        showText( "Click the Red Car to Read the Description! -->", 393, 305);
        showText( "Click The Frog to Start the Game! -->", 393, 350);
        showText( "Made By: Zachary Leicht", 635, 572);
        addObject( new StartButton(), 609, 350);
        addObject( new RulesButton(), 650, 305);
    }
}
