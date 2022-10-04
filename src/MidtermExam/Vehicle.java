/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MidtermExam;

/**
 *
 * @author frank lou
 */
public class Vehicle {
    private int passengers;
    public int getP(){ return this.passengers; }
    public void setP(int n){ this.passengers = n; }
    
    public Vehicle(int passengers){
        this.passengers = passengers;
    }
    
    class Motorcycle extends Vehicle {
        public String type;
        Motorcycle(int passengers, String type){
          super(passengers);
          this.type = type;
        }
    }
}

