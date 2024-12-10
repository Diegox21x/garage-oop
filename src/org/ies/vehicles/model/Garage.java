package org.ies.vehicles.model;

import java.util.Arrays;
import java.util.Objects;

public class Garage {
    private String name;
    private String direction;
    private Vehicle[] vehicles;

    public Garage(String name, String direction, Vehicle[] vehicles) {
        this.name = name;
        this.direction = direction;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(name, garage.name) && Objects.equals(direction, garage.direction) && Objects.deepEquals(vehicles, garage.vehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, direction, Arrays.hashCode(vehicles));
    }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                ", direction='" + direction + '\'' +
                ", vehicles=" + Arrays.toString(vehicles) +
                '}';
    }
}
