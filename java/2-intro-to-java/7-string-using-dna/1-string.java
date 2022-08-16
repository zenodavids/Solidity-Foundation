/*
* DNA related concepts - getting domain knowledge on DNA

* - DNA typicalLy consists of four numerous letters; A, T, C, G
* - each letter represent a NUCLEOTIDE, which is the building blocks of DNA.
* - three NUCLEOTIDES (three DNA letters) make a CODON
* - a CODON describe one AMINO ACID
* - letters 'ATG' ( also referred to as start CODON) is what indicate the start of a gene
* - letters 'TAA, 'TAG' and 'TGA' ( also referred to as stop CODON) are what indicate the end of a gene
* - everything between and including 'ATG' and 'TAA', 'TAG' or 'TGA'  makes up one gene
* - a valid gene must have a valid sequence of codons(in three pairs) that starts with 'ATG' and ends with 'TAA', 'TAG' or 'TGA'

*/

//////////////////////////////////////////////////////////////////////

//POSITION IN STRINGS

//google java string to learn more

String s = "dukeprogramming"
// using this as an example;

s.indexOf("program") // 4
// to find some letters in a string at gives us the index of the first letter in its argument

s.indexOf("z") // -1
//this will return -1 because 'z' IS NOT in the string s.

s.indexOf("g", 8) // 14
// ignores indexes 0 - 7 and starts looking for 'g' from index 8 till the end of the string. ir returns the index of the first 'g' it finds,starting from index 8

s.substring(4, 7) // 'pro'
// 4 is the index number to START our range and the letter at index 4 will be INCLUDED in the results
// 7 is the index to STOP our range and the letter at index 7 will be EXCLUDED from the results
//7 - 4 = 3 so we will get 3 letters start from index 4 and excluding index 7 from this result

s.length() // 15
// gives us the length of a string

s.startsWith("duke") // true
// checks if s starts with 'duke'

s.endsWith("king") // false
// checks if s ends with 'king'

s.isEmpty() // false
//tells us if a string is empty or not


///////////////////////////////////////////////////////////////////////////
// example
public class FindGeneSimpleAndTest {
    public String findGeneSimple(String dna){
        //start codon is 'ATG'
        //stop codon is 'TAA'

        String result = "";
        //the empty value also mean 'null'

        int startIndex = dna.indexOf("ATG");
    // use the 'indexof' function to look for 'ATG'

        if(startIndex == -1) {//no ATG
            return "";
        }

        int stopIndex = dna.indexOf("TAA", startIndex + 3);
    //start looking for 'TAA' where the startIndex+3 ('ATG' is three letters)

        if(stopIndex == -1) {//no TAA
            return "";
        }

        result = dna.substring(startIndex, stopIndex+3);
    //this gets the startIndex and all the letters after it including the last three letters of the stopIndex ('TAA')

        return result;
    }

    public void testFindGeneSimple(){
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

