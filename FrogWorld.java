import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FrogWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FrogWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public FrogWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        makeGround();
        addCars();
        addGreyCars();
        addAmbulances();
        addBuses();
        addCars2();
        addObject( new Frog(), 370, 510);
    }

    public void makeGround()
    {
        //Bottom safe ground row
        for(int i = 0; i < 14; i++)
        {
            addObject( new Ground(), 10 + 60*i, 570);
        }
        
        //Next safe ground row
        for(int i = 0; i < 14; i++)
        {
            addObject( new Ground(), 10 + 60*i, 510);
        }
        
        //Add random grass
        for(int i = 0; i < 10; i++)
        {
            int x = Greenfoot.getRandomNumber(700) + 50;
            int y = Greenfoot.getRandomNumber(100) + 500; 
            addObject( new Grass(), x, y);
        }
        
        //Add another safe Ground zone
        for( int i = 0; i < 14; i++) 
        {
            addObject( new Ground(), 10 + 60*i, 270); 
        }
        
        //Add the top safe Ground zone
        for( int i = 0; i < 14; i++)
        {
            addObject( new Ground(), 10 + 60*i, 30);
        }
        
        
    }
    
    public void addCars()
    {
        //first row of Cars
        addObject( new Car(5), 30, 450); 
        addObject( new Car(5), 487, 450);
        
        //second row of Cars
        addObject( new Car(5), 80, 390);
        addObject( new Car(5), 309, 390);
        addObject( new Car(5), 692, 390);
        
        //third row of Cars
        addObject( new Car(7), 250, 330); 
        addObject( new Car(7), 625, 330);        
        
    }
    
    public void addGreyCars()
    {
        //Little extra car that moves slower than others
        addObject( new GreyCar(1), 34, 268);
    }
    
    public void addAmbulances()
    {
        //first row of Ambulances 
        addObject( new Ambulance(5), 47, 209);
        
        //second row of Ambulances 
        addObject( new Ambulance(5), 318, 154);
    }
    
    public void addBuses()
    {
        //first row of Buses
        addObject( new Bus(6), 53, 118);
        
        //second row of buses
        addObject( new Bus(8), 177, 92);
    }
    
    public void addCars2()
    {
        //first set of Cars
        addObject( new Car2(5), 708, 213);
        
        //second row of cars
        addObject( new Car2(8), 558, 87);
    }
}
