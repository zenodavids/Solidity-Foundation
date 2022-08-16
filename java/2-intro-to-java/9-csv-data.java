/*
 * CSV - Commas Separated Values
 * csv files standard - IETF RFC 4180
 *

 using this example 'foods.csv';

 the header
 * Name,Favorite Food, Favorite Color
 the body
 * Drew,Chocolate,Green
 * Owen,Pineapple,Blue
 * Susan,Cake,Purple

 working with the above file

  first, if we are using duke's FileResource
  * import edu.duke.*;
  next,
 * import org.apache.commons.csv.*;
  */

// CODE TO PRINT OUT NAME AND FAVORITE FOOD
public class FirstCSVExample{
 public void readFood(){

  FileResource food = new FileResource();
  //assign variable food, create new FileResource
  //if new FileResource argument is empty, it asks us for csv file

  CSVParser parser = food.getCSVParser();
  //ask the FileResource to get parser from apache library

  for(CSVRecord record : parser){
   //loop over the parser get the csv record

   System.out.println(record.get('Name')+ " ");
   // prints the name list in food csv
   System.out.println(record.get('Favorite Food'));
   // prints the Favorite Food list in food csv along side the name list
  }

 }
}

///////////////////////////////////////////////////////////

/*
 * CHECK WHICH COUNTRY EXPORTED COFFEE
 Country, Exports
 Nigeria,"weed, guns, bombs"
 Ghana,"weed, coffee, bombs"
 Liberia,"weed, guns, bombs"
 Niger,"weed, guns, coffee"


*/

import edu.duke.*;
import org.apache.commons.csv.*;

public class WhichCountriesExport{

 public void listExporters(CSVParser parser, String exportOfInterest ){

  for (CSVRecord record : parser){
   //for each row in the CSV file

   String export = record.get("Exports");
   //look at the export column

   if(export.contains(exportOfInterest)){
    //check if it contains exportOfInterest

    String country = record.get("Country");
    System.out.println(country)
    //if so, write down the "country" from that row
   }
  }
 }
 /////
 //lets test the code
 public void whoExportsCoffee(){
;
  FileResource fr = new FileResource()
  //asks us for the csv file

  CSVParser parser = fr.getCSVParser();

  listExporters(parser, "coffee");
  //we need to look for countries that export coffee
 }
}

/////////////////////////////////////////////////////////////////////

// CONVERTING STRINGS TO NUMBERS

//using this;
String yearStr = record.get("year")

int value = Integer.parseInt(yearStr) // convert to integer
double value = Double.parseDouble(yearStr) // convert to Double / floats

///////////////////////////////////////////////////////////////////

/*
 * CHECK FOR HOTTEST DAY

 TimeEST,TemperatureF,dewPointF
 1.51am,28.5,23
 3.40pm,30,22

 etc.

 *
 */

 import edu.duke.*;
 import org.apache.commons.csv.*;
 import java.io.*;

 public class CSVMax {

  // FOR DATA IN SINGLE CSV FILE
  public CSVRecord hottestHourInFile(CSVParser parser) {

   CSVRecord largestSoFar = null;
   //start with largestSoFar as nothing

   for (CSVRecord currentRow : parser){
    //for each row (currentRow) in the csv file

    if(largestSoFar == null){
    //if largestSoFar is nothing

    largestSoFar = currentRow;
    //largestSoFar becomes the currentRow
    }
    else{
     //otherwise.

     double currentTemp = double.parseDouble(currentRow.get("TemperatureF"));
     double largestTemp = double.parseDouble(currentRow.get("TemperatureF"));
     //convert the assigned variables to double

     if (currentTemp > largestTemp){
     //check if currentRow's temperature > largestSoFar's temperature

      largestSoFar = currentRow;
      //if so, update largestSoFar to currentRow
     }

    }


   }
   return largestSoFar
   //largestSoFar is the answer

  }
  //test / call our method for data single file
  public void testHottestInDay(){
   FileResource fr = new FileResource();
   CSVRecord largest = hottestHourInFile(fr.getCSVParser());
   //calls the method we just wrote
   System.out.println('hottest temperature was ' + largest.get("TemperatureF") + ' at ' + largest.get("TimeEST"));
  }

  // FOR DATA IN MULTIPLE CSV FILES
  public CSVRecord hottestInManyDays(){

   DirectoryResource dr = new DirectoryResource();
   //assign to dr and asks for multiple files

   for(File f : dr.selectedFiles()){
   //iterate / loop through files

   FileResource fr = new FileResource(f);
   CSVRecord currentRow = hottestHourInFile(fr.getCSVParser());
   //use method to get largest in file.

    if(largestSoFar == null){
     largestSoFar = currentRow;
    }
    else{
     //otherwise.

     double currentTemp = double.parseDouble(currentRow.get("TemperatureF"));
     double largestTemp = double.parseDouble(currentRow.get("TemperatureF"));
     //convert the assigned variables to double

     if (currentTemp > largestTemp){
     //check if currentRow's temperature > largestSoFar's temperature

      largestSoFar = currentRow;
      //if so, update largestSoFar to currentRow
     }

    }

   }
   return largestSoFar;
  }

   //test / call our method for data multiple files
   public void testHottestInManyDays(){

    CSVRecord largest = hottestInManyDays();
    //assign method to variable

    System.out.println('hottest temperature was ' + largest.get("TemperatureF") + ' at ' + largest.get("DateUTC"));
    //dateutc is the column that give more details about the suppose day and year.
   }
 }