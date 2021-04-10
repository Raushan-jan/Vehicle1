package type.body;

import type.VehcileTypeEnume;

public class BusType extends VehicleTypeByBodyType{
        @Override
        public String getTypeName() {
            return VehcileTypeEnume.BUS.name();
        }
    }