
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public int beepers;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void findTreasure() {
        findFirstBeeper();
        while(beepers !=5) {
            findGoal();
        }
        finish();
       
    }
    public void findFirstBeeper(){
        while (!nextToABeeper()){
            move();
        }
    }
    public void findGoal(){
        beepers = 0;
        while (nextToABeeper()){
            pickBeeper();
            beepers++;
        }
        if (beepers ==5){
            finish();
        }
        else if (beepers ==1){
            faceNorth();
            while(!nextToABeeper()){
                move();
            }
        }
        else if (beepers ==2){
            faceEast();
            while(!nextToABeeper()){
                move();
            }
        }
        else if (beepers == 3){
            faceSouth();
            while(!nextToABeeper()){
                move();
            }
        }
        else if (beepers == 4){
            faceWest();
            while(!nextToABeeper()){
                move();
            }
        }
    }
    public void faceNorth(){
        while (!facingNorth()){
            turnLeft();
        }
    }
    public void faceSouth(){
        while (!facingSouth()){
            turnLeft();
        }
    }
    public void faceEast(){
        while (!facingEast()){
            turnLeft();
        }
    }
    public void faceWest(){
        while (!facingWest()){
            turnLeft();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void finish(){
        //
     }
}

