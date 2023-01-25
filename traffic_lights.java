public class TrafficLights {

  public static String updateLight(String current) {
  
    if (current == "green") {
            current = "yellow";
        } else if (current == "yellow") {
            current = "red";
        } else if (current == "red") {
            current = "green";
        }
    
    return current;
  }
  
}
