public class the_office {
  public static String boredom(Person[] staff) {
    String result = "";
    int bd = 0;
    
    for (Person person : staff) {
      String department = person.department;
      
      if (department.equals("accounts")) {
        bd += 1;
      } 
      else if (department.equals("finance")) {
        bd += 2;
      }
      else if (department.equals("canteen")) {
        bd += 10;
      }
      else if (department.equals("regulation")) {
        bd += 3;
      }
      else if (department.equals("trading")) {
        bd += 6;
      }
      else if (department.equals("IS")) {
        bd += 8;
      }
      else if (department.equals("retail")) {
        bd += 5;
      }
      else if (department.equals("cleaning")) {
        bd += 4;
      }
      else if (department.equals("pissing about")) {
        bd += 25;
      }
      else if (department.equals("change")) {
        bd += 6;
      } else {
        bd += 0;
      }
    }
    
    if (bd <= 80) {
      result = "kill me now";
    }
    else if (bd > 80 && bd < 100) {
      result = "i can handle this";
    } else {
      result = "party time!!";
    }
    
    return result;
  }
}
