package com.as.grpc.heater;

import com.proto.heating.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;

public class HeaterService extends HeaterServiceGrpc.HeaterServiceImplBase {

    @Override
    public void setToOff(HeaterToUpdateRequest request, StreamObserver<HeaterDetailResponse> responseObserver) {

        ArrayList<com.proto.heating.Heater> temp_list = Heaters.getInstance();

        for(int i=0; i<temp_list.size(); i++) {

            com.proto.heating.Heater heater_rec = (com.proto.heating.Heater) temp_list.get(i);

            Heaters.heaters.clear();

            Heaters.heaters.add(com.proto.heating.Heater.newBuilder()
                    .setDeviceId(heater_rec.getDeviceId())
                    .setDeviceName(heater_rec.getDeviceName())
                    .setDeviceDescription(heater_rec.getDeviceDescription())
                    .setDeviceLocation(heater_rec.getDeviceLocation())
                    .setStatus("OFF")
                    .build());
        }

        // loop through all of the heaters
        for(com.proto.heating.Heater heater : Heaters.heaters) {

            HeaterDetailResponse response = HeaterDetailResponse.newBuilder().setHeater(heater).build();

            // this is the next response to send
            responseObserver.onNext(response);
            // let the server know we are finished sending
            responseObserver.onCompleted();
            return;

        }

    }

    @Override
    public void setTempToHigh(HeaterToUpdateRequest request, StreamObserver<HeaterDetailResponse> responseObserver) {

        ArrayList<com.proto.heating.Heater> temp_list = Heaters.getInstance();

        for(int i=0; i<temp_list.size(); i++) {

            com.proto.heating.Heater heater_rec = (com.proto.heating.Heater) temp_list.get(i);

            Heaters.heaters.clear();

            Heaters.heaters.add(com.proto.heating.Heater.newBuilder()
                    .setDeviceId(heater_rec.getDeviceId())
                    .setDeviceName(heater_rec.getDeviceName())
                    .setDeviceDescription(heater_rec.getDeviceDescription())
                    .setDeviceLocation(heater_rec.getDeviceLocation())
                    .setStatus("HIGH")
                    .build());
        }

        // loop through all of the heaters
        for(com.proto.heating.Heater heater : Heaters.heaters) {

            HeaterDetailResponse response = HeaterDetailResponse.newBuilder().setHeater(heater).build();

            // this is the next response to send
            responseObserver.onNext(response);
            // let the server know we are finished sending
            responseObserver.onCompleted();
            return;

        }

    }

    @Override
    public void setTempToMedium(HeaterToUpdateRequest request, StreamObserver<HeaterDetailResponse> responseObserver) {
        ArrayList<com.proto.heating.Heater> temp_list = Heaters.getInstance();

        for(int i=0; i<temp_list.size(); i++) {

            com.proto.heating.Heater heater_rec = (com.proto.heating.Heater) temp_list.get(i);

            Heaters.heaters.clear();

            Heaters.heaters.add(com.proto.heating.Heater.newBuilder()
                    .setDeviceId(heater_rec.getDeviceId())
                    .setDeviceName(heater_rec.getDeviceName())
                    .setDeviceDescription(heater_rec.getDeviceDescription())
                    .setDeviceLocation(heater_rec.getDeviceLocation())
                    .setStatus("MEDIUM")
                    .build());
        }

        // loop through all of the heaters
        for(com.proto.heating.Heater heater : Heaters.heaters) {

            HeaterDetailResponse response = HeaterDetailResponse.newBuilder().setHeater(heater).build();

            // this is the next response to send
            responseObserver.onNext(response);
            // let the server know we are finished sending
            responseObserver.onCompleted();
            return;

        }
    }

    @Override
    public void setTempToLow(HeaterToUpdateRequest request, StreamObserver<HeaterDetailResponse> responseObserver) {

        ArrayList<com.proto.heating.Heater> temp_list = Heaters.getInstance();

        for(int i=0; i<temp_list.size(); i++) {

            com.proto.heating.Heater heater_rec = (com.proto.heating.Heater) temp_list.get(i);

            Heaters.heaters.clear();

            Heaters.heaters.add(com.proto.heating.Heater.newBuilder()
                    .setDeviceId(heater_rec.getDeviceId())
                    .setDeviceName(heater_rec.getDeviceName())
                    .setDeviceDescription(heater_rec.getDeviceDescription())
                    .setDeviceLocation(heater_rec.getDeviceLocation())
                    .setStatus("LOW")
                    .build());
        }

        // loop through all of the heaters
        for(com.proto.heating.Heater heater : Heaters.heaters) {

            HeaterDetailResponse response = HeaterDetailResponse.newBuilder().setHeater(heater).build();

            // this is the next response to send
            responseObserver.onNext(response);
            // let the server know we are finished sending
            responseObserver.onCompleted();
            return;

        }

    }

    @Override
    public void showStatus(HeaterStatusRequest request, StreamObserver<HeaterStatusResponse> responseObserver) {

        // loop through all of the heaters
        for(com.proto.heating.Heater heater : Heaters.getInstance()) {

            // if the request device_id matches the one in memory
            if(heater.getDeviceId() == request.getDeviceId()) {

                HeaterStatusResponse response = HeaterStatusResponse.newBuilder().setHeater(heater).build();

                // this is the next response to send
                responseObserver.onNext(response);
                // let the server know we are finished sending
                responseObserver.onCompleted();
                return;
            }
        }
    }
}
