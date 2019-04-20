package com.as.grpc.heater;

import com.proto.heating.Heater;

import java.util.ArrayList;

public class Heaters extends ArrayList<Heater> {

    public static Heaters heaters;

    public static Heaters getInstance() {
        if (heaters == null) {
            heaters = new Heaters();
        }
        return heaters;
    }

    public Heaters() {
        this.add(com.proto.heating.Heater.newBuilder()
                .setDeviceId(1)
                .setDeviceName("Primary Boiler")
                .setDeviceDescription("Main Home Heating")
                .setDeviceLocation("Kitchen")
                .setStatus("OFF")
                .build());

    }



}

