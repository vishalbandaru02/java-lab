class job{
    String position="Software Engineer";
         }
class Dream extends job{
    String sname="Vishal";
    void display(){
           System.out.println("name:"+sname);
           System.out.println(super.position);
        }
}
class DreamImpl{
          public static void main(String[] args){
                Dream d=new Dream();
                d.display();
        }
}