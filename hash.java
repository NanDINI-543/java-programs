package xyz;
import java.util.*;

public class Hash{
    public static void main(String[] args) {
        
        HashSet<String> hs = new HashSet<>();
        hs.add("tejaswi");
        hs.add("bhavani");
        hs.add("teja");
        hs.add("faree");

       
        System.out.println("HashSet: " + hs);

       
        String nameToCheck = "SRUJAN";
        boolean exists = hs.contains(nameToCheck);
        System.out.println("Does '" + nameToCheck + "' exist? " + exists);

  
        ArrayList<String> arrayList = new ArrayList<>(hs);
        System.out.println("ArrayList: " + arrayList);
    }
}