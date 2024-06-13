class bicycle{
 void displayFeatures(){
  System.out.println("Features: pedals, Manual power.");
   }
}

class motorbike extends bicycle {
  void displayFeatures() {
    super.displayFeatures();
    System.out.println("Added features by motorbike: Engine");
   }
}
 
class electricbike extends motorbike {
  void displayFeatures() {
   super.displayFeatures();
   System.out.println("New features by electricbike: electric motor and battery!");
  }
}
 
class multiInheritance {
  public static void main(String []args) {
   electricbike evbike = new electricbike();
   evbike.displayFeatures();
  }
}

   