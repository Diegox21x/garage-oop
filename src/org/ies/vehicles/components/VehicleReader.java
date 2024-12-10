package org.ies.vehicles.components;

import org.ies.vehicles.model.Vehicle;

import java.util.Scanner;

/**
 * Esta clase NO ES un POJO porque ni es una clase de datos, ni tiene getters y setters
 */
public class VehicleReader {
    private final Scanner scanner;

    public VehicleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Vehicle askVehicle() {
        System.out.println("Introduce los datos del vehículo");

        System.out.println("Tipo de vehículo:");
        String vehicleType = scanner.nextLine();

        System.out.println("Color:");
        String color = scanner.nextLine();

        System.out.println("Velocidad máxima:");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Matrícula:");
        String plate = scanner.nextLine();

        Vehicle vehicle = new Vehicle(vehicleType, color, maxSpeed, plate);
        return vehicle;

    }
}
