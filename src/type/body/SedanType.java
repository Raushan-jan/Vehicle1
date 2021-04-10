package type.body;

import type.VehcileTypeEnume;

public class SedanType extends VehicleTypeByBodyType{
    @Override
    public String getTypeName() {
        return VehcileTypeEnume.SEDAN.name();
    }
}