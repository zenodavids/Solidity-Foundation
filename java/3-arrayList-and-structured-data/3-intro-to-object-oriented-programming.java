/*
 *  CLASSES are types; they define what is in objects of that type (public)
 - class always start with an uppercase.
 - the name of the java file should match the class name
 - class names should be a noun
 * METHODS (private or public)
 - method name should be a verb. ie if class was a 'car', methods will be 'accelerate'
 * OBJECTS are instances of class; can make many objects with the use of the 'new' keyword
 * FIELD is a variable that lives in an object, instead of a method (private)
 - field names should be noun - things that a class has ie, if class was a 'car', field will be the color of a car
 - fields to class is like pixels to image - an image (class) can have many pixels(fields)
 * CONSTRUCTOR is a code that gets to run when initialized to an object using the 'new' keyword.(public)
 - the constructor name has to be exactly the name of the class it is in
 - constructor has no return type(not even void)
 - to call a constructor, create an object and it will be invoked to initialize the object immediately
 - it you don't create a constructor in your class, the compiler will create one for you

 *ENCAPSULATION is the idea of putting code and data together in an object
 */

 ////////////////////////////////////////////////////////////////////////////
 //DIAGRAM OF A TYPICAL CODE IN JAVA

 public class CaesarCipher{
  //this is a class

  private String alphabet;
  private String shiftedAlphabet;
  //these are fields been initialized

  public CaesarCipher(int key){
   //this is a constructor

   Alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   shiftedAlphabets = alphabets.substring(key) + alphabets.substring(0, key);
   // here the fields are being defined

  }
  // this is the constructor body

  CaesarCipher cc = new CaesarCipher(22);
  // the class used its constructor to create an object
  //this is an object

 }

/*
 * VISIBILITY - public and private


 * public - any code can access public fields / methods
 all the methods / fields other classes are supposed to call

 * private - only code in that class that access private fields / methods

 */