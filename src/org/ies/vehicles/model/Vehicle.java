package org.ies.vehicles.model;

import java.util.Objects;

/**
 * Esto es un POJO (Plain Old Java Object), porque sirve para guardar los datos de un vehiculo.
 * Para que sea una clase sea POJO:
 * - Todos los campos son privados
 * - Cada campo tiene un getter y un setter
 * - Hay un constructor con todos los campos
 * - Hay un hashCode y equals
 * - Es una clase que sirve para representar datos
 */
public class Vehicle {
    private String vehicleType;
    private String color;
    private int maxSpeed;
    private String plate;

    public Vehicle(String vehicleType, String color, int maxSpeed, String plate) {
        this.vehicleType = vehicleType;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.plate = plate;
    }

    public void info() {
        System.out.println(this.toString());
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return maxSpeed == vehicle.maxSpeed && Objects.equals(vehicleType, vehicle.vehicleType) && Objects.equals(color, vehicle.color) && Objects.equals(plate, vehicle.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleType, color, maxSpeed, plate);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType='" + vehicleType + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", plate='" + plate + '\'' +
                '}';
    }
}
