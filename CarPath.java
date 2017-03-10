/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racegame;

import java.util.ArrayList;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
/**
 *
 * @author Tayon
 */
class CarPath extends Path{
ArrayList<Stop> position;

int num = 0;
  
public CarPath(){
    position = new ArrayList<>();
    position.add(new Stop("a",20,20));
    position.add(new Stop("b",50,80));
    position.add(new Stop("c",30,60));
    position.add(new Stop("d",40,50));
    //shift method takes num
    shift(num);
    //generate line
    generateLine();
}  
//shift by 1    
private void shift(int shift){
    for (int i = 0; i < shift; i++)
    {
    position.add(position.remove(0));
    }
    // increment num
    num += 1;    
}

    Stop getStops() {
    return position.get(0);
        
    //To change body of generated methods, choose Tools | Templates.
     
    
   
    private void generateLine()
   {
    getElements().add(new MoveTo(position.get(0).getX(), position.get(0).getY()));
      getElements().add(new LineTo(position.get(0).getX(), position.get(0).getY()));
      getElements().add(new LineTo(position.get(1).getX(), position.get(1).getY()));
      getElements().add(new LineTo(position.get(2).getX(), position.get(2).getY()));
      getElements().add(new LineTo(position.get(3).getX(), position.get(3).getY()));
      getElements().add(new LineTo(position.get(0).getX(), position.get(0).getY()));
      
      //path.setOpacity(pathOpacity);
   }
   public String toSting()
   {
        return position.toString();
   }
}

