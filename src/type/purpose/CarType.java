package type.purpose;

import type.VehcileTypeEnume;

public class CarType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehcileTypeEnume.CAR.name();
    }
}