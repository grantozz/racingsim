/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racingsim;

import java.util.ArrayList;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 *
 * @author Grant osborn
 * 
 * The RaceInfo Class displays all the information about all the cars in the race
 * 
 */
public class RaceInfo extends TextFlow {

    //a refferance to the list of cars in the race
    ArrayList<Car> carList;
    
    public RaceInfo(ArrayList<Car> carList){
        super(new Text(),new Text(),new Text(),new Text());
        this.carList = carList;
        init();
        displayPathInfo();
        findWinner().setWinner();
        // find the car with the longest time and update the gui when they are finished
        findLoser().getPathTransition().setOnFinished(e->displayWinnerInfo());
    }
    
    private void init(){
        this.setPrefSize(200, 400);
        this.setLineSpacing(12);
        
    }
    
    /**
     * Searches through the car list to find and return the car with the longest time
     * 
     * @return the Car with the longest time to finish the race/path 
     */
    private Car findLoser(){
      Car loser =  carList.get(0);
      for(Car c:carList){
          if(c.getTime()>loser.getTime()){
              loser=c;
          }
      }
      return loser;  
    }
    
     /**
     * Searches through the car list to find and return the car with the shortest time
     * 
     * @return the Car with the shortest time to finish the race/path 
     */
    private Car findWinner(){
      Car winner =  carList.get(0);
      for(Car c:carList){
          if(c.getTime()<winner.getTime()){
              winner=c;
          }
      }
      return winner;
    }
    
    
    
   /**
    * iterates over the list of cars displaying their paths on the gui
    * each cars information is two lines apart   
    *
    */
    private void displayPathInfo(){
         for(int i = 0; i<4 ;i++){
            Car car = carList.get(i);
            Text t= (Text) this.getChildren().get(i);
            t.setText("\n\n"+car.getName() + " path is "+car.getPath().toString());
         }
    }
    
    
    /**
     * Displays the path along with the speed and time of each car 
     * also shows witch car won
     */
    public void displayWinnerInfo(){
        for(int i = 0; i<4 ;i++){
            Text t= (Text) this.getChildren().get(i);
            t.setText(formatInfo(i));
        }
    }
    
    
    
    private String formatInfo(int num){
        StringBuilder sb = new StringBuilder();
        Car car = carList.get(num);
        sb.append("\n\n");
        sb.append(car.getName());
        sb.append(" path is ");
        sb.append(car.getPath().toString());
        sb.append("\nspeed: ").append(car.getSpeed()).append(" time: ").append(car.getTime());
        if(car.getWinner()){
            sb.append("\nWinner!");
        }
        return sb.toString();
        
        
        
        
    }
    
}
