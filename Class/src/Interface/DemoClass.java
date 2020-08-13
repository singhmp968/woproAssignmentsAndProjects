package Interface;

interface IntDemo
{ 
    void display();
    
}
class classOne implements IntDemo{
    void add(int x,int y){
    System.out.println("Thesumis:"+(x+y));}
    public void display(){
        System.out.println("WelcometoInterfaces");}}
        
        class classTwo implements IntDemo{
            void multiply(int i,int j,int k){
                System.out.println("Theresult:"+(i*j*k));}
                public void display(){
                    System.out.println("WelcometoJava");}}
                  public class DemoClass{
                        public static void main(String args[]){
                            classOne c1=new classOne();
                            c1.add(10,20);
                            c1.display();
                            classTwo c2=new classTwo();
                            c2.multiply(5,10,15);
                            c2.display();
                            
                    System.out.println("************************************");    
                            IntDemo c4= new classOne();
                            c4.display();
                            c4 = new classTwo();
                            c4.display();
                        }}

