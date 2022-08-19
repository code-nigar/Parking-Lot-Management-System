/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Forms;

/**
 *
 * @author sharjeel sultan
 */
public class Vehicle {
    
    public enum VehicleType {
        CAR, CRUISER, VAN, MOTORBIKE
    }
    private String licenseNumber;
    private final VehicleType type;
    private int assignedTicket ;

  public Vehicle(VehicleType type,String licenseNumber,int assignedTicket) {
    this.type = type;
    this.licenseNumber=licenseNumber;
    this.assignedTicket=assignedTicket;
  }
 
}

