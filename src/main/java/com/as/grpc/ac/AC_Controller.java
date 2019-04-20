package com.as.grpc.ac;

import java.util.ArrayList;

public class AC_Controller extends ArrayList<com.proto.ac.AC_Controller> {
    public static AC_Controller ac_cntrollers;

    public static AC_Controller getInstance() {
        if (ac_cntrollers == null) {
            ac_cntrollers = new AC_Controller();
        }
        return ac_cntrollers;
    }

    public AC_Controller() {
        this.add(com.proto.ac.AC_Controller.newBuilder()
                .setDeviceId(1)
                .setDeviceName("Primary Air Conditioner")
                .setDeviceDescription("Primary AC")
                .setDeviceLocation("Office")
                .setDeviceStatus("OFF")
                .setDeviceTempSetting(0)
                .build());

    }
}




