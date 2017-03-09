
package racingsim;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * GUI class is the entry point for the program
 * it creates the cars, stadium, RaceInfo and glues everything together
 * 
 * @author Grant Osborn
 */
public class GUI extends Application {
    private ArrayList<Car> carList;
    
    
  //creates cars and adds them to car list
    public void makeCars(){
        carList = new ArrayList<>();
        carList.add(new Car("car 1"));
        carList.add(new Car("car 2"));
        carList.add(new Car("car 3"));
        carList.add(new Car("car 4"));
    }
    
    
    //starts the animation
    private void startRace(){
        for(Car c: carList){
            c.go();
        }
    }
    
   
    
    
    //Starts the program
    @Override
    public void start(Stage primaryStage){
        makeCars();
        
        RaceInfo raceInfo = new RaceInfo(carList);
        Stadium stadium = new Stadium(carList);
        
        //borderPane holds the Stadium, RaceInfo and start button
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(0, 0, 10, 0));
        root.setCenter(stadium);        
        root.setRight(raceInfo);
        
        
        
        Button btn = new Button();
        btn.setPrefSize(100, 45);
        BorderPane.setAlignment(btn, Pos.CENTER);
        root.setBottom(btn);
        
        btn.setText("start");
        btn.setTooltip(new Tooltip("can only be pressed once"));
        btn.setOnAction(e->{
            startRace();
            btn.setDisable(true);
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
