class Monster
{
  private String Name;
  public Monster(String Name){
    this.Name = Name;
  }
  public String Attack(){
    return "No attack";
  }  
}
class AirMonster
{
  public AirMonster(String Name){
    super(Name);
  }
  @Override
  public String Attack(){
    return "Air attack";
  }  
}
class WaterMonster
{
  public WaterMonster(String Name){
    super(Name);
  }
  @Override
  public String Attack(){
    return "Water attack";
  }  
}
class FireMonster
{
  public FireMonster(String Name){
    super(Name);
  }
  @Override
  public String Attack(){
    return "Fire attack";
  }  
}
class StoneMonster
{
  public StoneMonster(String Name){
    super(Name);
  }
  @Override
  public String Attack(){
    return "Stone attack";
  }  
}

public class Test
{
  public static void main(String[] args) {
    Monster m = new Monster("Monster-A");
    System.out.println(m.Attack());
    m = new AirMonster("Monster-B");
    System.out.println(m.Attack());
    m = new WaterMonster("Monster-C");
    System.out.println(m.Attack());
    m = new FireMonster("Monster-F");
    System.out.println(m.Attack());
    m = new StoneMonster("Monster-S");
    System.out.println(m.Attack());
  }
}
