import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MarcoDeDatos{
  public ArrayList<ArrayList<String>>Lector(String path){
    ArrayList<ArrayList<String>> datos = new ArrayList<ArrayList<String>>();
    Path filePath = Paths.get(path);
    try{
      BufferedReader br = Files.newBufferedReader(filePath);
      String line;
      while((line = br.readLine()) != null){
        String[] datoLinea = line.replace(", ", "-").split(",", -1);
        ArrayList<String> dataTemp = new ArrayList<String>();
        for(String data : datoLinea){
          dataTemp.add(data.replace("\"",""));
        }
        datos.add(dataTemp);
      }      
    }
    catch(IOException a){
      a.printStackTrace();
    }
    datos.remove(0);
    return (datos);
  }
}