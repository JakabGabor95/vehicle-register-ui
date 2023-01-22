package hu.ltk.jakabgabor.models;

import hu.ltk.jakabgabor.enums.VehicleType;

public class VehicleModel {
    private String registrationNumber;
    private String make;
    private String model;
    private int numberOfSeats;
    private VehicleType vehicleType;

    public VehicleModel(String registrationNumber, String make, String model, int numberOfSeats, VehicleType vehicleType) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "VehicleModel{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
