package com.as.grpc.photo;

import java.util.ArrayList;

public class Photos  extends ArrayList<com.proto.photo.Photo_Info> {

    public static Photos photos;

    public static Photos getInstance() {
        if (photos == null) {
            photos = new Photos();
        }
        return photos;
    }

    public Photos() {
        this.add(com.proto.photo.Photo_Info.newBuilder()
                .setDeviceId(1)
                .setPhotoId(100)
                .build());

    }

}

