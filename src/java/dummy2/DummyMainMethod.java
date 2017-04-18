/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy2;

import static dummy2.DummyInterface.dummyVariable;

/**
 *
 * @author muralidhar
 */
public class DummyMainMethod extends DummyAbstract implements DummyInterface,dummyInterface2{
    
    public static void main(String[] args) {
        /*we can instantiate an interface only for anonymous subclass implementing the interface. We dont need to implement
        interface to create an instance as done below*/
        DummyInterface int1 = new DummyInterface() {
            @Override
            public String displaySyring() {
                return dummyVariable;
            }
        };
        
        dummyInterface2 int2 = new dummyInterface2() {
            @Override
            public String displaySyring() {
                return dummyVariable;
            }
        };
        //an abstract class cannot be instantiated. Here we are instantiating the anonymous subclass of abstract class
        DummyAbstract abstract1 = new DummyAbstract(){
            @Override
            String displayOther() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        System.out.println(int1.displaySyring());
        System.out.println(int2.displaySyring());
    }

    @Override
    public String displaySyring() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    String displayOther() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
