package hu.ltk.jakabgabor.presenter;

import hu.ltk.jakabgabor.validators.VehicleValidator;
import hu.ltk.jakabgabor.view.View;
import hu.ltk.jakabgabor.interfaces.VehicleDisplayInterface;
import hu.ltk.jakabgabor.models.VehicleModel;

public class Presenter implements VehicleDisplayInterface {
    private VehicleValidator vehicleValidator = new VehicleValidator();
    private View view;

    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void display(String vehicleJson) {
       VehicleModel vehicleModel = vehicleValidator.vehicleIsNull(vehicleJson);
       view.display(vehicleModel);
    }
}
