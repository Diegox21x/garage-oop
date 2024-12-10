package org.ies.vehicles.components;

import org.ies.vehicles.model.Vehicle;

import java.util.Scanner;

public class GarageReader {
    private  final Scanner scanner;
    private  final VehicleReader vehicleReader;

    public GarageReader(Scanner scanner , VehicleReader vehicleReader){

        this.scanner = scanner;
        this.vehicleReader = vehicleReader;

    }

    public Garage read(){
        System.out.println("Introduce los datos del garage");
        System.out.println("Nombre");
        String name =
    }


}
