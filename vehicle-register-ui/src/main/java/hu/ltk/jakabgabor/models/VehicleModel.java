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

    public VehicleModel() {
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

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
