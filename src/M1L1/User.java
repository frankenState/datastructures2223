/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M1L1;

/**
 *
 * @author frank lou
 */
public class User {
    // field variable
    private int id;
    
    // methods
    public int getID() { return this.id; }
    public void setID(int id) { this.id = id; }
    
    private String first_name;
    
    public String getFirstName() { return this.first_name; }
    public void setFirstName(String first_name) { this.first_name = first_name; }
    
    private String last_name;
    public String getLastName() { return this.last_name; }
    public void setLastName(String last_name) { this.last_name = last_name; }
    
    // method overloading
    public String toString(){
        return this.id + ".! " + this.first_name + " " + this.last_name;
    }
    
    public String toString(String prefix){
        return prefix +" "+ this.toString();
    }
    
    // constructor overloading
    // class constructor
    public User(){
        this(0, "a", "b");
    }
    // class constructor
    public User(int id, String first_name, String last_name){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
    }
    
    public static void main(String[] args) {
        
        User u1 = new User();
        u1.setFirstName("John");
        u1.setLastName("Doe");
        u1.setID(5);
//        System.out.println(u1.toString("The value of this object is"));
        
        User u2 = new User(2, "Mark", "Collins");
        System.out.println(u2.toString("test"));
    }
}
