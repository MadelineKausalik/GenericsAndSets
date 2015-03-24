package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LabActivity2 {

    public static void main(String[] args) {
                

                Employee e1 = new Employee("Doe","John","222-22-2222");
                Employee e2 = new Employee("Doe","Jane","333-33-3333");
                Employee e3 = new Employee("Smith","Dave","444-44-4444");
                
                List list2 = new ArrayList();
                
                list2.add(e1.getLastName());
                list2.add(e1.getFirstName());
                list2.add(e1.getSsn());
                list2.add(e2.getLastName());
                list2.add(e2.getFirstName());
                list2.add(e2.getSsn());
                list2.add(e3.getLastName());
                list2.add(e3.getFirstName());
                list2.add(e3.getSsn());
            
                for(int i=0; i < list2.size(); i++) {
                 Employee thing = (Employee)list2.get(i);
                 System.out.println("Array Place: " + i + "   Employee: " + thing);
                }
                
    }
    
}