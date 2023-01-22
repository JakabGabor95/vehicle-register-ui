package hu.ltk.jakabgabor.parser;

import com.google.gson.Gson;
import hu.ltk.jakabgabor.models.VehicleModel;

public class JsonParser {
    private Gson gson = new Gson();

    public VehicleModel parseJsonToVehicleModel(String vehicleJson) {
        return gson.fromJson(vehicleJson, VehicleModel.class);
    }
}
