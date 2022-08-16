import edu.duke.FileResource;
import org.apache.commons.csv.*;

public class exports {
    public static void main(String[] args ) {

        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
//        System.out.println(countryInfo(parser, "Nauru"));
//        listExportersTwoProducts(parser, "gold", "diamonds");
//        listExportersTwoProducts(parser, "sugar", "");
//        System.out.println(numberOfExporters(parser, "gold"));      //3
//        bigExporters(parser, "$999,999,999");

        //-----QUIZ QUESTIONS-----//

        listExportersTwoProducts(parser, "cotton", "flowers");
        listExportersTwoProducts(parser, "cocoa", "");
        bigExporters(parser, "$999,999,999,999");
    }


    public static String countryInfo(CSVParser parser, String country){

        for(CSVRecord record: parser){
            if(record.get("Country").equals(country)){
                System.out.println(country + ": " + record.get("Exports")
                + ": " + record.get("Value (dollars)"));
            }
        }
        return "NOT FOUND";
    }

    public static void listExportersTwoProducts(CSVParser parser, String exporItem1, String exportItem2){

        int counter = 0;
        for(CSVRecord record: parser){
            if(record.get("Exports").contains(exporItem1) && record.get("Exports").contains(exportItem2)){
                System.out.println(record.get("Country"));
                counter++;
            }
        }
        System.out.println("Number of countries that export " + exporItem1 + " and " + exportItem2 + " are " + counter);
    }

    public static int numberOfExporters(CSVParser parser, String exportItem){

        int counter = 0;

        for(CSVRecord record: parser){
            if(record.get("Exports").contains(exportItem)){
                counter++;
            }
        }
        return counter;
    }

    public static void bigExporters(CSVParser parser, String amount){

        String newAmount = amount.replaceAll("[$,]", "");

        for(CSVRecord record: parser){
            String currValue = record.get("Value (dollars)").replaceAll("[$,]", "");
            if(Float.parseFloat(currValue) > Float.parseFloat(newAmount)){
                System.out.println(record.get("Country") + ": " + record.get("Value (dollars)"));
            }
        }
    }

}
















// public class WhichCountriesExport{

//  public void listExporters(CSVParser parser, String exportOfInterest, String exportOfInterest2 ){

//   for (CSVRecord record : parser){
//    //for each row in the CSV file

//    String export = record.get("Exports");
//    //look at the export column

//    if(export.contains(exportOfInterest)){
//     //check if it contains exportOfInterest

//     String country = record.get("Country");
//     System.out.println(country);
//     //if so, write down the "country" from that row
//    }
//   }
//  }
//  /////
//  //lets test the code
//  public void whoExportsCoffee(){
// ;
//   FileResource fr = new FileResource();
//   //asks us for the csv file

//   CSVParser parser = fr.getCSVParser();


//   listExporters(parser, "gold","diamonds");
//   //we need to look for countries that export coffee
//  }
// }





// public class FindGeneSimpleAndTest {
//     public String findGeneSimple(String dna){
//         //start codon is 'ATG'
//         //stop codon is 'TAA'

//         String result = '';
//         //the empty value also mean 'null'

//         int startIndex = dna.indexof('ATG')
//     // use the 'indexof' function to look for 'ATG'

//         int stopIndex = dna.indexof('TAA', startIndex + 3)
//     //start looking for 'TAA' where the startIndex+3 ('ATG' is three letters)
//         result = dna.substring(startIndex, stopIndex+3)
//     //this gets the startIndex and all the letters after it including the last three letters of the stopIndex ('TAA')

//         return result;
//     }

//     public void testFindGeneSimple(){
//         String dna = 'AATGCGTAATATGGT';
//         System.out.println('DNA strand is' + dna);
//         String gene = findGeneSimple(dna);
//         System.out.println('Gene is' + gene);

//         dna = 'AATGCTAGGGTAATATGGT';
//         System.out.println('DNA strand is' + dna);
//         String gene = findGeneSimple(dna);
//         System.out.println('Gene is' + gene);
//     }
// }