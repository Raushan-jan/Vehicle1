package type.body;

import type.VehcileTypeEnume;

public class WagonType extends VehicleTypeByBodyType{
    @Override
    public String getTypeName() {
        return VehcileTypeEnume.WAGON.name();
    }
}