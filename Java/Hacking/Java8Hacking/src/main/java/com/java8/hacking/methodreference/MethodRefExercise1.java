package com.java8.hacking.methodreference;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Method references help to point to methods by their names
 * A method reference is described using :: (double colon) symbol
 * 
 * A method reference can be used to point the following types of methods:-
 * 
 *	-> Static methods
 *      -> Instance methods
 *      -> Constructors using new operator (TreeSet::new)
 * 
 * @author Prajesh Ananthan
 *
 */
public class MethodRefExercise1 {
    public static void main(String[] args) {
	
	getNames().forEach(System.out::println);

    }

    private static List<String> getNames() {

	List<String> names = new ArrayList<String>();

	names.add("Mahesh");
	names.add("Suresh");
	names.add("Ramesh");
	names.add("Naresh");
	names.add("Kalpesh");

	return names;

    }
}
