
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public int beeperPile;
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        pickUpPile();
        checkIfEven();
        enterAndGetBeepers();
        
        
    }
    public void pickUpPile(){
        while (nextToABeeper()){
            beeperPile++;
            pickBeeper();
        }
    }
    public boolean checkIfEven(){
        if ((beeperPile % 2) ==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void enterAndGetBeepers(){
        if (checkIfEven() == true){
            turnRight();
            move();
            turnLeft();
            while (nextToABeeper()){
                pickBeeper();
            }
            turnLeft();
            move();
            turnRight();
        }
        else{
            turnLeft();
            move();
            turnRight();
            while (nextToABeeper()){
                pickBeeper();
            }
            turnRight();
            move();
            turnLeft();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

