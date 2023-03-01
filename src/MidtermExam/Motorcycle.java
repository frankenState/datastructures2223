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
public class Motorcycle extends Vehicle {

    public String type;

    Motorcycle(int passengers, String type) {
        super(passengers);
        this.type = type;
    }
}
