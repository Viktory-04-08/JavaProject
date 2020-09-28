/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.LinkedList;

/**
 *
 * @author Netbeans
 */
public class List {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.addToBegin("one");
        list.addToBegin("two");
        list.addToEnd("-one");
        list.addToEnd("-two");
        System.out.println(list);
        // TODO code application logic here
    }

   
    
}
   
    

