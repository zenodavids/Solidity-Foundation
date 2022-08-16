/*
 * HASHMAP

 * this is a class that associate keys with values. generally called a map
 * key must be unique, values can be any anything(ArrayList, String, Integer e tc)
 * one HashMap can replace two arrayLists
 * cannot access items via index one at a time
 * map is more efficient that ArrayList as one HashMap can replace multiple ArrayList
 * SYNTAX
 */
HashMap<String, Integer> map = new HashMap<String, Integer>()
// must specify the key and the value, where key is String, associated value is integer

//////////////////////////////////////////////////////////

// accessing value in map

map.put(w, 1);
// if key isn't in map, add value 1

map.put(w, map.get(w) + 1);
// if the key is in map, get the key and update the value to + 1

size()
containsKey()
get()


// accessing all values in map using a for loop

for(String s : myMap.keySet()){
 //.keySet() accesses each key in a loop with the help of a loop
}



/////////////////////////////////////////////////////////////
gladLib