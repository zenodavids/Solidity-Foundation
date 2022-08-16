/** the 7 steps to solve programming problems in action
 *
 * * Problem :
 * * Given a shape, find its perimeter
 */


//////////////////////////////////////////////////////////////
DEVELOPING THE ALGORITHM

/*
step 1 - solve the problem by hand

 * first, what is the formulae of a perimeter of a shape
 this is the sum of all the length of all the sides of the shape
 * next, draw the shape by hand
 - you must note that a shape is defined by it's points
 * the solve and get your answer by hand.

using co -ordinates(x, y) and going anti-clock wise;

                        5
      (-1, 3)    _________________ (1, 3)
                |                |
                |                |
              4 |                | 4
                |                |
                |                |
      (-1, -1)  |________________| (4, 1)
                        5

 */


/*
*step 2 - write down what you just did.

  * found distance from 1st point to 2nd point (line 15 to 22) was 4
  * found distance from 2nd point to 3rd point (line 22) was 5
  * found distance from 3rd point to 4th point (line 22 to 15) was 4
  * found distance from 4th point to 1st point (line 15) was 5
  * add 4 + 5 + 4 + 5 = 18
  * 18 is my answer
  */


/*
step 3 - find patterns

 * generalize - look for similar steps and express them as repetition
 * next, we give each distance between points ( 4 , 5 , 4 , 5) a name. ie; currDist

 so redefining step 2 and finding patterns, we get;
  *==> found distance from 1st pt to 2nd pt (line 15 to 22) name it currDist
  Add 0 + currDist = 4
  *==> found distance from 2nd pt to 3rd pt (line 22) name it currDist
  Add 4 + currDist = 9
  *==> found distance from 3rd pt to 4th pt (line 22 to 15) name it currDist
  Add 9 + currDist = 13
  *==> found distance from 4th pt to 1st pt (line 15) name it currDist
  Add 13 + currDist = 18
  *==> 18 is my answer


  * next, we name the total perimeter of the shape (4, 9, 13, 18) totalPerimeter and update the pattern;

  start with totalPerimeter = 0;
  *==> find distance from 1st pt to 2nd pt (line 15 to 22) name it currDist
  update totalPerimeter to be => totalPerimeter + currDist
  *==> find distance from 2nd pt to 3rd pt (line 22) name it currDist
 update totalPerimeter to be => totalPerimeter + currDist
  *==> find distance from 3rd pt to 4th pt (line 22 to 15) name it currDist
  update totalPerimeter to be => totalPerimeter + currDist
  *==> find distance from 4th pt to 1st pt (line 15) name it currDist
  update totalPerimeter to be => totalPerimeter + currDist
  *==> totalPerimeter is my answer


  * lastly, we use the 4th to 1st point as the first line and give a variable name 'prevPt' to the points we just finished with, 'currPt' to the points we are currently on;

  *start with totalPerimeter = 0;
  *start with prevPt as the last point;
  update totalPerimeter to be => totalPerimeter + currDist
  *update prevPt to be the 1st pt
  *==> find distance from prevPt to currPt, name it currDist
  update totalPerimeter to be => totalPerimeter + currDist
  *update prevPt to be the 2nd pt
  *==> find distance from prevPt to currPt, name it currDist
  update totalPerimeter to be => totalPerimeter + currDist
  *update prevPt to be the 3rd pt
  *==> find distance from prevPt to currPt, name it currDist
  update totalPerimeter to be => totalPerimeter + currDist
  *update prevPt to be the 4th pt
  *==> totalPerimeter is my answer


 * finally, we summarize the pattern to be;

 * start with totalPerimeter = 0
 * start with prevPt = the last point
 * for each currPt in the shape,
    * find the distance from prevPt to currPt, name it currDist
    * Update totalPerimeter to be totalPerimeter + currDist
    * update prevPt to be currPt
 * totalPerimeter is my answer

  */

////////////////////////////////////////////////////////////////////////

TESTING THE ALGORITHM


/**
 * we test the above algorithm using a different shape below with three points;
 1st point is (-3, 4) (from line 119 - downwards)
 2nd point is (-3, -4)
 3rd point is from the last line to upward

using co -ordinates(x, y) and going anti-clock wise;


              (-3, 4)     /|
                        /  |
                      /    |
                8   /      | 10
                  /        |
                /          |
    (-3, -4)  /            | (3, -4)
            /______________|
                  6


 * start with totalPerimeter = 0
 * start with prevPt = the last point ( 3rd point in this case)
 * for each currPt in the shape,
    * find the distance from prevPt to currPt, name it currDist
    * Update totalPerimeter to be totalPerimeter + currDist
    * update prevPt to be currPt
 * totalPerimeter is my answer

and this works!

now lets translate it to code.
 *  */

/////////////////////////////////////////////////////////////

TRANSLATE TO CODE

import edu.duke.*;

public class PerimeterRunner {
    public double getPerimeter (Shape s) {

        // Start with totalPerim = 0
        double totalPerim = 0.0;

        // Start wth prevPt = the last point
        Point prevPt = s.getLastPoint(); // getLastPoint() is from the edu.duke module.

        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {

            // Find distance from prevPt point to currPt
            double currDist = prevPt.distance(currPt);

            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;

            // Update prevPt to be currPt
            prevPt = currPt;
        }

        // totalPerim is the answer
        return totalPerim;
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
    }

    public static void main (String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        pr.testPerimeter();
    }
}

