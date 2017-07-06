/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eighth_project;

/**
 *
 * @author Boro_s99
 */
public class Eighth_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int testArray[] = {2,6,3,4,8};
        for (int i = 0; i < testArray.length; i++) //standard loop
        {
            System.out.println(testArray[i]);
        }
        for (int u : testArray) // for each loop
        {
            System.out.println(u);
            
        }
    }
    
}
