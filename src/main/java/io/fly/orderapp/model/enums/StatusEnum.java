package io.fly.orderapp.model.enums;

import java.util.HashMap;
import java.util.Map;


public enum StatusEnum {

    /*READY("R"), INPROGRESS("P"), PENDING("P")

    private final String statusValue;
    private final int intValue;
    private static final Map<String, StatusEnum> automap = new HashMap<>();

    static {
        for (StatusEnum direction : OrientationEnum.values()) {
        	automap.put(direction.getIntValue(), direction);
        }
    }

    StatusEnum(final String position, final String value) {
        this.orientationValue = position;
        this.intValue = value;
    }

    public String getOrientationValue() {
        return this.orientationValue;
    }

    public int getIntValue() {
        return this.intValue;
    }

    public static OrientationEnum getOrientationRotating(OrientationEnum orientationEnum, RotationEnum rotationEnum) {
        OrientationEnum newOriEnum;
        int value = orientationEnum.getIntValue() + rotationEnum.getIntValue();
        if (value < NORTE.getIntValue()) {
        	newOriEnum = OESTE;
        } else if (value > OESTE.getIntValue()) {
        	newOriEnum = NORTE;
        } else {
        	newOriEnum = automap.get(value);
        }
        return newOriEnum;
    }    */

}
