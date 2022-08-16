// transform XML to CSV using API
public void createCSV() {
 EarthQuakeParser parser = new EarthQuakeParser();
 String source = "http://earthquake.usgs.gov/...";
 ArrayList<QuakeEntry> list = parser.read(source)
 dumpCSV(list);
 System.out.println(list.size())


}

/////////////////////////////////////
/*
 * making filters with different satisfies() method because filter is an interface.
 * below, the 'interface' keyword replaces 'class'.
 * interface is a type that promises certain method
 * class can implement an interface
 * -- must define the promised methods
 * -- can be treated as the interface type
 * --
 */



public interface Filter{


}