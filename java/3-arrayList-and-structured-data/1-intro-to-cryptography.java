/*
* strings are immutable
 * StringBuilder class is like the String object but it can mutate and modify strings

 * .append(n)
this method put String,int, char, etc at the end

 * .insert(n)
this method put String,int, char, etc at any location you want

 * .charAt(n)
gets characters by their index

 * .setCharAt(n)
sets characters by their index

 * .toString(n)
get back string that you made


 *
 */

 * StringBuilder sb = new StringBuilder("Hello") //Hello
 //create new StringBuilder

 sb.append('World'); // HelloWorld

 sb.insert(5, 'Around The'); // Hello Around The World

 /////////////////////////////////////////////////////////////////////////////////

 // reversing strings

 String s = 'pit';

 public String reverse(String s){

  String ret = "";

  int k; //initialize k before the loop to make it accessible outside the loop, after the loop


  for(int k=0; k < s.lenght(); k += 1){

   ret = s.charAt(k) + ret;
  }
  return ret //using 'pit', ret becomes 'tip'
 }

 ///////////////////////////////////////////////////////////////////////////////////

// CHARACTER
char a = 'b' // this is a character - can also hold '1', ' ' etc
String a = "b" // this is a string



// methods with characters

isLowerCase(ch)
// returns boolean if ch is lowercased

toLowerCase(ch)
// returns lowercase version of ch

toUpperCase(ch)
// returns Uppercase version of ch

isDigit(ch)
// returns boolean if ch is 0 - 9

/////////////////////////////////////////////////////////////////////////////////////

// the CAESAR CIPHER CODE - not secure... just for fun

import edu.duke.*;

public class CaesarCipher {

 public String encrypt (String input, int key){

  StringBuilder encrypted = new StringBuilder(input);
  // make a string builder with the message (encrypted)

  String Alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  //write down the alphabets

  String shiftedAlphabets = alphabets.substring(key) + alphabets.substring(0, key);
  //compute the shifted alphabets

  for(int i = 0; i < encrypted.length(); i ++){
  //count form 0 to < length of encrypted, (call it i)

   char currChar = encrypted.charAt(i);
   //look at every character (i) of the encrypted (call it currChar)

   int idx = alphabets.indexOf(currChar);
   //find the index of currChar in the alphabet(call it idx)

   if(idx != -1){
    //if idx is in the alphabets

    char newChar = shiftedAlphabets.charAt(idx);
    //get the idxth character of shiftedAlphabets (call it newChar)

    encrypted.setCharAt(i, newChar);
    //replace the ith character of shiftedAlphabet(newChar)
   }

  }

  return encrypted.toString();

 }

 public void testCaesar(){
  int key = 17; // 1 - 25
  // the number of times the alphabet goes backwards - the CAESAR CIPHER

  FileResource fr = new FileResource();

  String message = toUpperCase(fr.asString());

  String encrypted = encrypt(message, key);

  System.out.println(encrypted);

  String decrypted = encrypt(encrypted, 26-key);

  System.out.println(decrypted);

 }

}

//////////////////////////////////////////////////////////////////////////////////////
