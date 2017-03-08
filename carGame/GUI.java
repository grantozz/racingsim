
package racingsim;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Grant Osborn
 */
public class GUI extends Application {
    ArrayList<Car> carList;
    
    
  
    public void makeCars(){
        carList = new ArrayList<>();
        
        carList.add(new Car("car 1"));
        carList.add(new Car("car 2"));
        carList.add(new Car("car 3"));
        carList.add(new Car("car 4"));
        
    }
    
    
    private void startRace(){
        for(Car c: carList){
            c.go();
        }
    }
    
    @Override
    public void start(Stage primaryStage){
        makeCars();
        
        RaceInfo raceInfo = new RaceInfo(carList);
        Stadium stadium = new Stadium(carList);
        
        //borderPane holds the Stadium, RaceInfo and start button
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(0, 0, 10, 0));

        root.setLeft(stadium);        
      
        root.setRight(raceInfo);
        
        
        
        Button btn = new Button();
        btn.setPrefSize(100, 45);
        BorderPane.setAlignment(btn, Pos.CENTER);
        root.setBottom(btn);
        
        btn.setText("start");
        btn.setOnAction(e->{
            startRace();
            
        });
       
        
        
        
        
        Scene scene = new Scene(root, 640, 460);
        
        primaryStage.setTitle("Race Simulation");
        primaryStage.setScene(scene);
        // the racetrack(CarPath) can not be moved by a layout manager 
        //so a min window size is set so that it will never get cut off 
        primaryStage.setMinWidth(scene.getWidth());
        primaryStage.setMinHeight(scene.getHeight());
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
