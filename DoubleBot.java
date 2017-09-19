


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;
    

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        pickAllBeepers();
        putThePile();
        move();
        placeDoubleBeepers();
        returnHome();

    }
    
    public void pickAllBeepers() {
         move();
        while (nextToABeeper()){
            beepers++;
            pickBeeper();
        }
        
    }
    
    public void placeDoubleBeepers() {
        for(int i =0; i < beepers*2; i++) {
            putBeeper();
        }
        move();
    }
    public void putThePile(){
        for(int i =0; i < beepers; i++) {
            putBeeper();
        }
    }
    public void returnHome(){
        turnLeft();
        turnLeft();
        move();
        move();
        
        move();
        turnLeft();
        turnLeft();
    }
}
