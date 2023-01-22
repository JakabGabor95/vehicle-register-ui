package hu.ltk.jakabgabor.presenter;

import com.google.gson.Gson;
import hu.ltk.jakabgabor.parser.JsonParser;
import hu.ltk.jakabgabor.validators.VehicleValidator;
import hu.ltk.jakabgabor.view.View;
import hu.ltk.jakabgabor.interfaces.VehicleDisplayInterface;
import hu.ltk.jakabgabor.models.VehicleModel;

public class Presenter implements VehicleDisplayInterface {
    private View view = new View();
    private JsonParser jsonParser = new JsonParser();
    private VehicleValidator vehicleValidator = new VehicleValidator();
    @Override
    public void display(String vehicleJson) {
       VehicleModel vehicleModel = vehicleValidator.vehicleIsNull(vehicleJson);
        view.display(vehicleModel);
    }
}
