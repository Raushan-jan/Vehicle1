package type.fuel;

import type.VehcileTypeEnume;

public class DieselType extends VehicleTypeByFuelType {
    @Override
    public String getTypeName() {
        return VehcileTypeEnume.DIESEL.name();
    }
}