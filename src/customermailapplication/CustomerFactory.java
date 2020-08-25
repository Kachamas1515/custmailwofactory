/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermailapplication;

/**
 *
 * @author amam
 */
public class CustomerFactory {

    public static Customer createCustomer(String type) {
        if (type.equals("Regular")) {
            return new RegularCustomer();
        } else if (type.equals("Mountain")) {
            return new MountainCustomer();
        } else if (type.equals("Delinquent")) {
            return new DelinquentCustomer();
        }
        return null;

    }
}
