/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M1L1;

/**
 *
 * @author frank lou\\
 * Note: Ligtas Points 
 *  Garcia * 2
 *  Monera * 3
 *  Camuta * 4
 *  Lumbab * 3
 */
public class Student extends User {
    
    private String program;
    
    public Student(String program, int id, String first_name, String last_name) {
        // invoking the parent's constructor
        super(id, first_name, last_name);
        this.program = program;
    }
    
    
    // Method overriding
    // Polymorphism
    @Override
    public String toString(){
        return super.toString() + " " + this.program;
    }
    
    public static void main(String[] args) {
//        Student s1 = new Student("BSIS", 2, "Mark", "Collins");
//        System.out.println(s1.toString("test"));
//        
        int head_count;
        
        int test_num[] = new int[5];
        
        int test_num2d[][] = new int[5][10];
        test_num2d[4][9] = 10;
        
//        for (int i = 0; i < test_num2d.length; i++) {
//            for (int j = 0; j < test_num2d[i].length; j++) {
//                System.out.printf("%5s", test_num2d[i][j]);
//            } System.out.println();
//        }

        Double dbl_example = new Double(50);
        double dbl_eample_2 = 50.0;
        System.out.println(dbl_example);
    }
}
