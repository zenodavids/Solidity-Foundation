/*
 *  Class ArrayList is from the java.util package
 * unlike arrays, this expands using the.add()
 * provides access via index so that items can be reached without iterating over all items
 * essential in implementing storage resource
 * stores objects, not primitives, so integer, not int
 * ArrayList must store Integer OR String items, not both in the ArrayList
 * to use the arrayList, import it from the java.util
 import java.util.ArrayList; or
 import java.util.*;
 *
 * SYNTAX
*/

ArrayList<Integer> num = new ArrayList<Integer>();
//for integers

ArrayList<String> words = new ArrayList<String>();
// creates a new constructor and assign to the variable 'words'

words.add("hello");
// add the string 'hello' to the end arraylist

words.size();
// returns the of elements stored in an arraylist


String s = words.get(1)
// get the item indexed '1' in the arraylist and assign it to variable s

words.set(0, "goodbye")
// this sets / change the first indexed item of the arraylist to 'goodbye'

///////////////////////////////////////////////////////////////////////////////

// LOOPS WITH ARRAYLIST

// loop 1
// use this when you want to access the indexes of the items in the arraylist

ArrayList<String> lst = new ArrayList<String>();
//starts empty

for(String i = 0; i < lst.size(); i ++){

 String val = lst.get(i);
 // get() access elements via index during loop

 // process val
}


// loop 2
//use this when you don't need the indexes, but just the items in the arraylist
ArrayList<String> a = new ArrayList<String>();
//starts empty

for(String s : a){
 //process s
}





