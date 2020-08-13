package Interface;

interface FirstInterface{
    int addMethod(int x,int y);
    float divMethod(int m,int n);
    void display();
int VAR1=10;float VAR2=20.65f;}
public class MyClass implements FirstInterface{
    public int addMethod(int a,int b){
        return(a+b);}
        public float divMethod(int i,int j){
            return(i/j);}
            public void display(){
                System.out.println("Variable1:"+VAR1);
                System.out.println("Variable2:"+VAR2);}}

//*******************%%%%%%%%%%%%%%%$$$$$$$$####
//interface I1
//{private int a=100;
//protected void m1();}
//public class A1 implements I1 {
//    public void m1() {System.out.println("In m1 method");}}