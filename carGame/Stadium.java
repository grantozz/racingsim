
package racingsim;

import java.util.ArrayList;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

/**
 *
 * @author Grant Osborn
 * the Stadium Class contains the track the Cars and displays them on the screen
 * 
 */
public class Stadium extends Pane {
    
    
    
    ArrayList<Car> carList;
    
    
    public Stadium(ArrayList<Car> carList){
        super();
        this.carList=carList;
        addTrack();
        addCars();
    }
    
    
    //add the track to the pane
    public final void addTrack(){
        getChildren().add(carList.get(0).getPath());
    }
    
    //adds Cars to Pane
    private void addCars(){
        for(Car c:carList){
         getChildren().add(c);   
        }
    }
    //draw a small circle at each stop
    private void addStops(){
         Car car= carList.get(0);
         for(Stop s: car.getPath().getStops()){
             addStop(s);
         }
        
    }
    
    //draw a small circle at the x y position each stop
    private void addStop(Stop stop){
         getChildren().add(new Circle(stop.getX(),stop.getY(), 5));
    }
    
    
    
    
    
    
  
    
    
    
    
   
    
    
    
    
}
