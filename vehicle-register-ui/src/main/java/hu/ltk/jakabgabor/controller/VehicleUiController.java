package hu.ltk.jakabgabor.controller;
import com.google.gson.Gson;
import hu.ltk.jakabgabor.interfaces.VehicleRegisterInteractorInterface;
import hu.ltk.jakabgabor.models.VehicleModel;
import hu.ltk.jakabgabor.view.View;

public class VehicleUiController {
    private VehicleRegisterInteractorInterface vehicleRegisterInteractorInterface;
    private Gson gson = new Gson();

    public VehicleUiController(VehicleRegisterInteractorInterface vehicleRegisterInteractorInterface) {
        this.vehicleRegisterInteractorInterface = vehicleRegisterInteractorInterface;
    }

    public void createNewVehicle(VehicleModel vehicleModel) {
        vehicleRegisterInteractorInterface.createNewVehicle(gson.toJson(vehicleModel));
    }

    public void getVehicleByRegistrationNumber(String registrationNumber) {
        vehicleRegisterInteractorInterface.getVehicleByRegistrationNumber(gson.toJson(registrationNumber));
    }


}
