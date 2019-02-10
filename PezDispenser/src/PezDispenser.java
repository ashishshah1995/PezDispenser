class PezDispenser
{
  public static final int MAX_PEZ=12;
   final private String characterName;
  private int pezCount;
  
  
  //Constructor
  public PezDispenser(String characterName)
    
  {
    this.characterName= characterName;
    pezCount=0;
    
  }
  
  public void fill()
  {
    fill(MAX_PEZ);
  }
  
  //Methoc Overloading
  public void fill(int pezAmount)
  {
    int newAmount = pezCount+pezAmount;
    if(newAmount > MAX_PEZ)
    {
      throw new IllegalArgumentException("Too many Pez");
    }
   pezCount = newAmount; 
  }
    
  public boolean dispense(){
    boolean wasDispensed = false;
    if(!isEmpty())
    {
      pezCount--;
      wasDispensed = true;
    }
    return wasDispensed;
  }
  
  public String getCharacterName()
  {
    return characterName;
  }
  
  public boolean isEmpty()
  {
    return pezCount ==0; // will return true
  }
  

}

