
package mypkg;

public class Guest extends Person{

    public Guest(String id, String name, String password) {
        super(id, name, password);
    }

    @Override
    public void setData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
