import java.util.*;
public class Main{
  public static void main(String[]args){    
    MarcoDeDatos marcoDeDatos = new MarcoDeDatos();
    Scanner teclado = new Scanner(System.in);
    ArrayList<Datos>datosMenu = new ArrayList<Datos>();
    System.out.println("Ingrese la ubicación del archivo en su dispositivo que desea analizar o alterar: ");
    String ubicacion = teclado.next();
    ArrayList<ArrayList<String>>listaDatos = marcoDeDatos.Lector(ubicacion);
    for(ArrayList<String> datos : listaDatos){
            Datos e = new Datos(datos);
            datosMenu.add(e);
      }
  
    System.out.println("Escoja la operación que desea realizar: 1. Promedio precipitación,  2. Promedio temperatura máxima, 3. Promedio temperatura mínima,  4. Temperatura más alta,  5. Temperatura menor que, 6. Temperatura mayor que, ");
    int operacion = teclado.nextInt();
    
//PROMEDIOS
    
    float suma_prcp = 0;
    float suma_tavg = 0;
    float suma_tmax = 0;
    float suma_tmin = 0;
    float sumas = 0;
    switch(operacion)
    {
      case 1:
        for(int i=0; i< datosMenu.size();i++){ 
         if(datosMenu.get(i).getPrcp().equals("")){
           sumas++;
         }else{
          suma_prcp += Float.valueOf(datosMenu.get(i).getPrcp());
         }
          
        
        }
      float precip = suma_prcp/(datosMenu.size()-sumas);
        System.out.println("El promedio de la precipitación es:" + precip);
    break;
    
    
      case 2:
        for(int i=0; i< datosMenu.size();i++){
          if(datosMenu.get(i).getTmax().equals("")){
            sumas++;
          }else{
            suma_tmax += Float.valueOf(datosMenu.get(i).getTmax());
          }
          
        }
        float maxima = suma_tmax/(datosMenu.size()-sumas);
          System.out.println("El promedio de la temperatura máxima es: " + maxima);
    break;

      case 3:
        for(int i=0; i< datosMenu.size();i++){
          if(datosMenu.get(i).getTmin().equals("")){
            sumas++;
          }else{
            suma_tmin += Float.valueOf(datosMenu.get(i).getTmin());
          }
          
        }
        float minima = suma_tmin/(datosMenu.size()-sumas);
          System.out.println("El promedio de la temperatura mínima es: " + minima);
    break;

      case 4:
        
        Double maxT=Double.valueOf(datosMenu.get(0).getTmax());
        for(int i=1;i<datosMenu.size();i++){  
          if(maxT< Double.valueOf(datosMenu.get(i).getTmax())){
                maxT=Double.valueOf(datosMenu.get(i).getTmax());  
          }
            System.out.println("La temperatura máxima es: "+ maxT);
          
          
        }
    break;

      case 5:
        
        System.out.println("Ingrese un valor para comparar cuantos datos de temperatura mínima son menores que su valor ");
        double valor = teclado.nextDouble();
        int contador = 0;
        for(int i=0; i < datosMenu.size();i++){
          contador += Double.valueOf(datosMenu.get(i).getTmin());
          if(Double.valueOf(datosMenu.get(i).getTmin()) < valor){
            contador++;
            System.out.println("La cantidad de datos menores al valor ingresado son:" + contador);
          }else if(contador == 0){
            System.out.println("No hay datos menores al valor ingresado");
          }
        }

    break;
      
      
      case 6:
        
        System.out.println("Ingrese un valor para comparar cuantos datos de temperatura máxima son mayores que su valor ");
        double valorMax = teclado.nextDouble();
        int contador1 = 0;
        for(int i=0; i < datosMenu.size();i++){
          contador1 += Double.valueOf(datosMenu.get(i).getTmax());
          if(Double.valueOf(datosMenu.get(i).getTmax()) > valorMax){
            contador1++;
            System.out.println("La cantidad de datos menores al valor ingresado son:" + contador1);
          }else if(contador1 == 0){
            System.out.println("No hay datos menores al valor ingresado");
          }
        }
        
      
        
    
    
    
    
      
    }      
  }
}