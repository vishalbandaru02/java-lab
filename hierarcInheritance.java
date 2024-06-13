class superhero {
  String name;
  String power;
  
  public superhero(String name,String power){
    this.name=name;
    this.power=power;
 }
  public void usepower() {
   System.out.println(name + " uses" + power);
 }
}
class ironman extends superhero {
  public ironman(String name) {
   super(name ," advanced technology");
  }
}
class spiderman extends superhero {
  public spiderman(String name) {
   super(name ," web-slinging and other abilities");
  }
}
class superman extends superhero {
  public superman(String name) {
   super(name ," jumping and other powers");
  }
}
public class hierarcInheritance {
  public static void main(String[] args){
    ironman iron = new ironman("IronMan");
    spiderman spider = new spiderman("SpiderMan");
    superman man = new superman("SuperMan");
    iron.usepower();
    spider.usepower();
    man.usepower();
  }
}
   