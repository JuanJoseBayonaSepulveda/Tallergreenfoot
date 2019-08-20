import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Terran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Terran extends Actor
{
     private int posX;         
    private int posY; 
    public int vida;
    
    public Terran()
    {
        posX = 10;
        posY = 10;
    }
    /**
     * Act - do whatever the Protoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move();
            }
             public void move()
    {
        setLocation (getX() + posX, getY() + posY);
        estaTocandoBorde();
        estaChocando();
    }
    
    private void estaTocandoBorde()
    {
        if (getX() == 0 || getX() == getWorld().getWidth()-1) {
            posX = -posX;
            turn(2);
        }
        if (getY() == 0 || getY() == getWorld().getHeight()-1) {
            posY = -posY;
            turn(2);
        }
    }
    
     private void estaChocando(){
       if (isTouching(Protoss.class)){
           posX = Greenfoot.getRandomNumber(20);
           vida=vida-20;
           if(vida==0){
               getWorld().removeObjects(getWorld().getObjects(Terran.class));
        }
        }
    }
   
    }
   


