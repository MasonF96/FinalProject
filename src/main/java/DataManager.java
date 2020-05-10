
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mason
 */
public class DataManager {
    private ArrayList<Customer> dataStore;
    
    public DataManager() {
        this.dataStore = new ArrayList<Customer>();
    }
    
    
    public ArrayList<Customer> getAll() {
        return dataStore;
    }
    
    public void create(Customer customerToCreate) {
        this.dataStore.add(customerToCreate);
    }
}
