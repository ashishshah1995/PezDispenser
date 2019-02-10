public class Example {
 
  public static void main(String[] args) {
    // Your amazing code goes here...
    System.out.println("We are making a new PEZ Dispenser");
    System.out.printf("FUn fact: There are %d PEZ allowed in every dispenzer%n", PezDispenser.MAX_PEZ);
    PezDispenser dispenser = new PezDispenser("Yoda");
    //dispenser.characterName = "Moda";
    System.out.println("The dispenser is "+dispenser.getCharacterName());
    
    if(dispenser.isEmpty()){
    System.out.println("Dispenser is empty");
    }
    
    
    System.out.println("Filling the dizpenser with delicious Pez");
    dispenser.fill();
    
    if(!dispenser.isEmpty()){
    System.out.println("Dispenser is full");
    }
    
    while (dispenser.dispense()){
    System.out.println("Chomp");
    }
    if(dispenser.isEmpty()){
    System.out.println("Ate all the PEZ");
    }
    
    dispenser.fill(4);
    dispenser.fill(2);
    while(dispenser.dispense()){
     System.out.println("CHOMP!!!");
    }
    
    try{
    //dispenser.fill(30);
    //System.out.println("Wont happen");
    }catch(IllegalArgumentException iae){
     System.out.println("Whoo there");
      System.out.printf("The error was %s",iae.getMessage());
    }
    
  }

}