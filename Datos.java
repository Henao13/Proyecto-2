import java.util.*;
public class Datos{
  private String station;
  private String name;
  private String date;
  private String prcp;
  private String tavg;
  private String tmax;
  private String tmin;
  
  public Datos(ArrayList<String>e){
    this.station = e.get(0);
    this.name = e.get(1);
    this.date = e.get(2);
    this.prcp = e.get(3);
    this.tavg = e.get(4);
    this.tmax = e.get(5); 
    this.tmin = e.get(6);
  }
  public String getStation(){
    return this.station;
  }
  public String getName(){
    return this.name;
    }
  public String getDate(){
    return this.date;
    }
  public String getPrcp(){
    return this.prcp;
    }
  public String getTavg(){
    return this.tavg;
    }
  public String getTmax(){
    return this.tmax;
    }
  public String getTmin(){
    return this.tmin;
    }
  public void setName(String n){
    this.name= n;
  }
    public void setStation(String s){
    this.station= s;
  }
    public void setDate(String d){
    this.date= d;
  }
    public void setPrcp(String p){
    this.prcp= p;
  }
    public void setTavg(String avg){
    this.tavg= avg;
  }
    public void setTmin(String min){
    this.tmin= min;
  }
    public void setTmax(String max){
    this.tmax= max;
  }
}