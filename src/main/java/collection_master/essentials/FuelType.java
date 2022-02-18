package collection_master.essentials;

import java.util.Objects;


/**
 * Enum описывающий виды топлива.
 *
 * @author Владислав Дюжев
 * @version 1.0
 */
public enum FuelType {
    GASOLINE("GASOLINE"),
    KEROSENE("KEROSENE"),
    DIESEL("DIESEL"),
    MANPOWER("MANPOWER"),
    PLASMA("PLASMA");

    private final String name;

    FuelType(String name) {
        this.name = name;
    }

    public static FuelType getByName(String name) {
        for (FuelType fuelType : FuelType.values()) {
            if (Objects.equals(fuelType.name, name)) {
                return fuelType;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
