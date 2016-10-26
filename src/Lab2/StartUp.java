/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import common.Employee;
import common.Dog;
import common.Address;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author aschindler1
 */
public class StartUp {
    public static void main(String[] args) {
//        List<Employee> eList = new ArrayList<Employee>();
        Set<Employee> eList = new HashSet<Employee>();
        eList.add(new Employee("Bob", "Joe", "369369369"));
        eList.add(new Employee("Iris", "Violet", "111222333"));
        eList.add(new Employee("Bob", "Joe", "369369369"));
        eList.add(new Employee("Dimmon", "Dixon", "333444777"));
      
        
        eList = new LinkedHashSet<Employee>(eList);
//        System.out.println(eList.get(2).toString() + "\n");
        
        for (Employee e : eList) {
          String firstName = e.getLastName();
            System.out.println(e.toString());
        }
        System.out.println("");
        for (int i = 0; i < eList.size(); i++) {
//            System.out.println(eList.get(i).toString());
        }   
        System.out.println("");        
        eList.remove(2);
        System.out.println(eList.size());  

        eList.add(new Employee("Jebadiah", "Billy", "000999888"));
        System.out.println(eList.size());
        
//        eList.set(1, new Employee("Spadooter", "Spang", "9090909"));
        for (Object e : eList) {
            System.out.println(e.toString());
        }
    }
}
