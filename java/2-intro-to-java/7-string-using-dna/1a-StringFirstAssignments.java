

public class StringFirstAssignments {
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

		if ((stopIndex - startIndex) % 3 == 0) {
    // if the sequence is in pairs of 3, starting and ending with atg and taa
			return dna.substring(startIndex, stopIndex+3);
//this gets the startIndex and all the letters after it including the last three letters of the stopIndex ('TAA')
		}
		else {
			return "";
		}

        
    }

    public void testFindGeneSimple(){
        String dna = "AAATGCCCTAACTAGATTAAGAAACC";
        System.out.println("DNA strand is " + dna);
        String gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);

        // dna = "AATGCTAGGGTAATATGGT";
        // System.out.println("DNA strand is " + dna);
        // String gene = findGeneSimple(dna);
        // System.out.println("Gene is " + gene);
    }
}
