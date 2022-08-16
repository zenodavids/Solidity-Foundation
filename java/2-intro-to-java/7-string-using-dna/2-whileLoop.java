/*
 *

 *  USING THE DNA STATEMENT ;
 assume we have a large statement of strings to find DNA patterns

 * USING THE 7 STEPS TO DOLVE PROBLEMS
 * 1 - write the code by hand
 * 2 - solve the code by hand
 * 3 - find patterns

 * 3b - generalize

 * =>  find the occurrence of 'ATG' and call it 'startIndex'
 * =>  find 'TAA' starting from (startIndex + 3)  and call this result 'currIndex'
 * => as long as currIndex is not equals to -1 (using a .substring method that returns -1 when the string cant be found)
 * => check if (currIndex - startIndex) is a multiple of 3
    if so, the text between startIndex and currIndex + 3 is your answer.
    if not, update currIndex to the index of the next 'TAA' starting from (currIndex + 1)
your answer is the empty string


 __ */________ WHILE LOOP__________

 /* this loop is generally used for 'as long as (condition)'
  * SYNTAX
  */

while (x < y) {
    System.out.println(x);
    x = x + 3;
}

// we can also use boolean with the while loop
while(true){
    //do something
}


//the translate the above to code

////////////////////////////////////////////////////////////////////////////////

//using while loops for the DNA using just 'ATG' and 'TAA'

public class FindGeneWhile{
    public String findGene(String dna){

        int startIndex = dna.indexOf("ATG");
        //find first occurrence of 'ATG' and assign it 'startIndex'

        int currIndex = dna.indexOf("TAA", startIndex + 3);
        //find the 'TAA' starting from (startIndex + 3) assign it
        //starts looking for 'TAA' after the startIndex + 3 letters in front of the startIndex

        while(currIndex != -1){
        // as long as currIndex is not equals to -1 (-1 will be returned if 'TAA' cannot be found in the DNA statement)

            if((currIndex - startIndex) % 3 == 0){
                //check if (currIndex - startIndex) is a multiple of 3
                // (currIndex - startIndex) means all the letters between the startIndex and currIndex, including the startIndex and currIndex

                return dna.substring(startIndex, currIndex + 3);
                //if so, the text between startIndex and currIndex + 3 is your answer
            }
            else{
                currIndex = dna.indexOf("TAA", currIndex + 1);
                //if not, update currIndex to the index of the next 'TAA', starting from currIndex + 1
            }


        }
        return "";
    //your answer is an empty string
    }

        public void testFindSimple(){
        String dna = "AATGCGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        String gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);

        dna = "AATGCTAGGGTAATATGGT";
        System.out.println("DNA strand is " + dna);
        String gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);
    }
}

/////////////////////////////////////////////////////////////////////////////////////

//REDEFINING THE ABOVE CODE TO GET EITHER OF THE THREE STOP CODONS

public class AllCodons{
    public int findStopCodon(String dnaStr, int startIndex, String stopCodon){

        int currIndex = dnaStr.indexOf(stopCodon, startIndex + 3);
        //find stopCodon starting from (startIndex + 3), currIndex

        while(currIndex != -1){
        //as long as currIndex is not equal to -1

            if((currIndex - startIndex) % 3 == 0){
            //check if currIndex - startIndex is a multiple of 3

                return currIndex;
            //if so, currIndex is the answer, return it.
            }
            else {

                currIndex = dnaStr.indexOf(stopCodon, currIndex + 1);
            //if not, update currIndex, looking for stopCodon again
            }

        }
        return dnaStr.length()
        //if we exit the loop, we didn't find stopCodon, we return dnaStr.length
    }
    public String findGene(String dna){

        int startIndex = dna.indexOf("ATG");
        // find first occurrence of 'ATG', startIndex

        if(startIndex ==-1){
            return -1;
        // if startIndex is -1, return ''
        }

        int taaIndex = findStopCodon(dna, startIndex, "TAA" );
        // use taaIndex to store findStopCodon(dna, startIndex, "TAA" )

        int tagIndex = findStopCodon(dna, startIndex, "TAG" );
        // use tagIndex to store findStopCodon(dna, startIndex, "TAG" )

        int tgaIndex = findStopCodon(dna, startIndex, "TGA" );
        // use tgaIndex to store findStopCodon(dna, startIndex, "TGA" )

        int minIndex = Math.min(tgaIndex, Math.min(taaIndex, tagIndex))
        // store in minIndex the smallest of these values

        if(minIndex == dna.length()){
            return "";
        // if minIndex is dna.length()? nothing found, return ""
        }

        return dna.substring(startIndex, minIndex + 3);
        // otherwise, answer is text from startIndex to minIndex + 3
    }

    //testing int findStopCodon(String dnaStr, int startIndex, String stopCodon) for errors
    public void testFindStop(){ //to print out answers

        //            012345678901234567890123
        String dna = "xxxyyyzzzTAAxxzcczcTAAxx";
        int dex = findStopCodon(dna, 0, "TAA")
        if(dex != 9 )System.out.println("error on 9");
        dex = findStopCodon(dna, 9, "TAA")
        if(dex != 21) System.out.println("error on 21");
        dex = findStopCodon(dna, 1, "TAA")
        if(dex != -1) System.out.println("error on 26");
        dex = findStopCodon(dna, 0, "TAG")
        if(dex != -1) System.out.println("error on 26");
        //print if there is an error


        System.out.println("test is finished");
        // prints when the tests are finished
    }
}

//////////////////////////////////////////////////////////////////////////////////////







