package by.it.naumenko._examples_.demo04;

// The body of a loop can be empty.
class Empty3 {   
  public static void main(String args[]) { 
    int i; 
    int sum = 0; 
 
    // sum the numbers through 5  
    for(i = 1; i <= 5; sum += i++) ; 
 
    System.out.println("Sum is " + sum); 
  }   
}