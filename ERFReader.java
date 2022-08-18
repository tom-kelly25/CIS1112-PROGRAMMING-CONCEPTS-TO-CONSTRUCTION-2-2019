public class EEFReader {
//tutorial 3 help with reading file
public string getContents (String path) {
String path = "/Users/rob/example.txt";
// Read the file and display it line by line.
BufferedReader in = null;
try
{
//open stream to file
in = new BufferedReader(new FileReader(path));
try
{
String line = "";
// Try to read the next line in the file
while ((line = in.readLine()) != null)
{
System.out.println(line);// Print the line out
}
}
catch(IOException e){
// Error while reading the file...
}
// Close the file stream when finished reading it.
finally{in.close();}
}
catch (FileNotFoundException e) {
// File could not be found on the disc.
}
catch (IOException e) {
//Could not open or close file.
}
}
}