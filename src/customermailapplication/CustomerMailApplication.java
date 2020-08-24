/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer mycustomer = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch (type) {
            case 1:
            mycustomer = CustomerFactory.createCustomer("Regular");
                break;
            case 2:
            mycustomer = CustomerFactory.createCustomer("Mountain");
                break;
            case 3:
            mycustomer = CustomerFactory.createCustomer("Delinquent");
                break;

        }
        System.out.println(mycustomer.createMail());
    }
}
