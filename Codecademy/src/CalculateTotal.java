import java.util.ArrayList;

class CalculateTotal {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double total = 0;
    
    // Iterate over expenses
    for (int i = 0; i < expenses.size(); i++) {
      total += expenses.get(i);
    }
    
    System.out.println(total);
    
  }
  
}



class Numbers {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      // Add your code below
      if (i%5 != 0) {
        continue;
      } 
      System.out.println(i);

      
    }
  }
}
    