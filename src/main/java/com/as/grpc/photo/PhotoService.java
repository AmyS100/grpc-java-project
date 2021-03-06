package com.as.grpc.photo;

import com.google.protobuf.ByteString;
import com.proto.photo.*;
import io.grpc.stub.StreamObserver;

public class PhotoService extends PhotoServiceGrpc.PhotoServiceImplBase {
    @Override
    public StreamObserver<LoadPhotoRequest> viewPhoto(StreamObserver<PhotoViewResponse> responseObserver) {
        return new StreamObserver<LoadPhotoRequest>() {

            private ByteString result;

            @Override
            public void onNext(LoadPhotoRequest value) {
                if (result == null) {
                    result = value.getPhoto();
                } else {
                    result = result.concat(value.getPhoto());
                }
                System.out.println("Received messages with " +
                        value.getPhoto().size() + " bytes");
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error = " + t);
            }

            @Override
            public void onCompleted() {
                System.out.println("Total bytes received: " + result.size());
                responseObserver.onNext(
                        PhotoViewResponse.newBuilder()
                                .setFinishedUpload(true)
                                .build());
                responseObserver.onCompleted();
            }
        };
    }

}
