package type.fuel;

import type.VehcileTypeEnume;

public class PetrolType extends VehicleTypeByFuelType{
    @Override
    public String getTypeName() {
        return VehcileTypeEnume.PETROL.name();
    }

}
