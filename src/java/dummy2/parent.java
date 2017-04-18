/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy2;

/**
 *
 * @author muralidhar
 */
public class parent {
    
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        
        a.display("ClassA");
        b.display("ClassB");
        String abc = "Hello World";
        char[] dum = abc.toCharArray();
        String bdf="";
        for(int i=0;i<dum.length;i++){
            bdf = bdf.concat((String.valueOf(dum[i])));
        }
        System.out.println(bdf);
        
    }
}
class A{
    protected String varA = "variableA";
    public void display(String arg){
        System.out.println("From ClassA "+varA);
    }
}
class B extends A{
    private String varB = "variableB";

    
    @Override
    public void display(String arg){
        System.out.println("From ClassB "+varA);
    }
}
