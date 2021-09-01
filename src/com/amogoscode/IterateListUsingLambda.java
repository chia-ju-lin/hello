package com.amogoscode;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class IterateListUsingLambda {

    public static void main(String[] args) {
	    // sout enter to println
        System.out.println("my first java app");
        System.out.println();
        System.out.println();
        System.out.println();


        //lambda expression iterate thru map
        Map<String,Double> map = new HashMap<>();
        map.put("apple",2.0);
        map.put("bananna",1.99);
        map.put("orange",3.99);

        map.forEach((k,v) -> System.out.println("produce name: "+k+" has price "+v));

        //lambda expression iterate thru list
        List list = new ArrayList();
        list.add("Filip");
        list.add("Tobi");
        list.add("Kuang");

        list.forEach(name -> System.out.println(name));

        //two ways update List eletments
//        for (int i = 0; i < list.size(); i++) {
//            String b = (String)list.get(i)+"bb";
//            list.set(i,b);
//        }
//        list.stream().forEach(eachName ->  list.set(list.indexOf(eachName),"aa"+eachName));
//        list.forEach(name -> System.out.println(name));

        //update collection = remove + add
        Collection<String> oldValues= (Collection<String>) list;
        Collection<String> newValues= new ArrayList<String>();
        oldValues.stream().forEach(v -> newValues.add("cc"+v));
//        newValues = list;

        //encodedValues.stream().forEach(v -> encodedValues.add("cc"+v));

        // for-each loop
//        for (String s : oldValues) {
//            newValues.add("cc"+s);
//        }
//        for (int i = 0; i < encodedValues.size(); i++) {
//            String encodedValue = iterator();
//			encodedValues.remove();
//		}

//        while(encodedValues.remove(encodedValues.)) num++;
//        encodedValues.addAll(Collections.nCopies(num, updateCar));
        newValues.forEach(name -> System.out.println(name));


    }


}
