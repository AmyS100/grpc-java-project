package com.as.grpc.ac;

import  com.as.grpc.ac.*;
import com.proto.ac.ACDetailResponse;
import com.proto.ac.ACDeviceTempRequest;
import com.proto.ac.AC_ServiceGrpc;
import com.proto.ac.GetByDeviceIdRequest;

import io.grpc.stub.StreamObserver;

import java.util.ArrayList;

import static com.as.grpc.ac.AC_Controller.ac_cntrollers;

public class AC_Service extends AC_ServiceGrpc.AC_ServiceImplBase {


    @Override
    public void setToOff(GetByDeviceIdRequest request, StreamObserver<ACDetailResponse> responseObserver) {

        ArrayList<com.proto.ac.AC_Controller> temp_list = AC_Controller.getInstance();
        int new_temp_setting = 0;

        for(int i=0; i<temp_list.size(); i++) {

            com.proto.ac.AC_Controller ac_rec = (com.proto.ac.AC_Controller) temp_list.get(i);

            ac_cntrollers.clear();

            ac_cntrollers.add(com.proto.ac.AC_Controller.newBuilder()
                    .setDeviceId(ac_rec.getDeviceId())
                    .setDeviceName(ac_rec.getDeviceName())
                    .setDeviceDescription(ac_rec.getDeviceDescription())
                    .setDeviceLocation(ac_rec.getDeviceLocation())
                    .setDeviceStatus("OFF")
                    .setDeviceTempSetting(new_temp_setting)
                    .build());
        }

        // loop through all of the Ac'S
        for(com.proto.ac.AC_Controller ac_unit : ac_cntrollers) {

            ACDetailResponse response = ACDetailResponse.newBuilder().setAcController(ac_unit).build();

            // this is the next response to send
            responseObserver.onNext(response);
            // let the server know we are finished sending
            responseObserver.onCompleted();
            return;

        }

    }

    @Override
    public void setTemp(ACDeviceTempRequest request, StreamObserver<ACDetailResponse> responseObserver) {
        ArrayList<com.proto.ac.AC_Controller> temp_list = AC_Controller.getInstance();

        int new_temp_setting = request.getNewTempSetting();

        for(int i=0; i<temp_list.size(); i++) {

            com.proto.ac.AC_Controller ac_rec = (com.proto.ac.AC_Controller) temp_list.get(i);

            ac_cntrollers.clear();

            ac_cntrollers.add(com.proto.ac.AC_Controller.newBuilder()
                    .setDeviceId(ac_rec.getDeviceId())
                    .setDeviceName(ac_rec.getDeviceName())
                    .setDeviceDescription(ac_rec.getDeviceDescription())
                    .setDeviceLocation(ac_rec.getDeviceLocation())
                    .setDeviceStatus("ON")
                    .setDeviceTempSetting(new_temp_setting)
                    .build());
        }

        // loop through all of the Ac'S
        for(com.proto.ac.AC_Controller ac_unit : ac_cntrollers) {

            ACDetailResponse response = ACDetailResponse.newBuilder().setAcController(ac_unit).build();

            // this is the next response to send
            responseObserver.onNext(response);
            // let the server know we are finished sending
            responseObserver.onCompleted();
            return;

        }

    }




    @Override
    public void showCurrentDetails(GetByDeviceIdRequest request, StreamObserver<ACDetailResponse> responseObserver) {

        // loop through all of the heaters
        for(com.proto.ac.AC_Controller ac : AC_Controller.getInstance() ) {

            // if the request device_id matches the one in memory
            if(ac.getDeviceId() == request.getDeviceId()) {

                ACDetailResponse response = ACDetailResponse.newBuilder().setAcController(ac).build();

                // this is the next response to send
                responseObserver.onNext(response);
                // let the server know we are finished sending
                responseObserver.onCompleted();
                return;
            }
        }

    }
}

