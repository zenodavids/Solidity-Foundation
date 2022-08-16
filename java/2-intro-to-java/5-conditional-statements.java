// IF ELSE STATEMENT

int f (int x, int y){
    if (x < y){
        System.out.printIn('x < y');
// this is how to print in java - so we print 'x < y'
        return y + x;
// once this is returned, no other return statement in the function works.
    }
    else{
        System.out.printIn( 'x >= y');
        if(x > 8){
            return y + 7;
        }
    }
    return x - 2;
}

int g (){
    int a = f (3, 4);
    int b = f (a, 5);
    return b
}
///////////////////////////////////////////////////////////////////////

// FOR LOOP

// this opens a file and prints out every line in the file
import edu.duke.*;
// allows us to access the FileResource
public class HelloWorld {

	public void runHello () {
		FileResource f;
        //define variable

        f = new FileResource("hello_unicode.txt");
        // assign variable to f

		for (String line : f.lines()) {
		/**
         * *SYNTAX OF A FOR (EACH) LOOP
         *
         * define variable (String line)
         * colon(:) means 'in'
         * f is where the file is.
         *
         * *SEMANTICS
         *
         * use the line variable to loop through f ...
         *  */

			System.out.println(line);
            //... and prints out all the lines
		}
	}

    public static void main (String[] args){
        HelloWorld hw = new HelloWorld();
        hw.runHello();
    }
}

/////////////////////////////////////////////////////////////////
// LOGICAL OR AND

&& // to express AND
|| // to express OR



/*
 * SHORT CIRCUIT EVALUATION mean that if the answer comes from one operand, it does not evaluate the other
 */

// SHORT CIRCUIT EVALUATION example;
if(x < y && y > z){...}
// if x < y is true, there is no need to check if y > z.
// if x < y is false, everything else will be false

if(a > b || c < d){...}
////////////////////////////////////////////////////////////////////////