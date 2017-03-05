/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racingsim;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Grant Osborn
 */
public class GUI extends Application {
    ArrayList<Car> carList;
    
    
  
    public void makeCars(){
        carList = new ArrayList<>();
        for(int i =0;i<4;i++){
        carList.add(new Car("test car"));
        } 
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
        root.setCenter(stadium);        
      
        root.setRight(raceInfo);
        
        
        
        Button btn = new Button();
        root.setBottom(btn);
        btn.setText("start");
        btn.setOnAction(e->{
            startRace();
        });
       
        
        
        
        
        Scene scene = new Scene(root, 640, 400);
        
        primaryStage.setTitle("Race Simulation");
        primaryStage.setScene(scene);
        // the racetrack(CarPath) can not be moved by a layout manager 
        //so a min window size is set so that it will never get cut off 
        primaryStage.setMinWidth(640);
        primaryStage.setMinHeight(400);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
