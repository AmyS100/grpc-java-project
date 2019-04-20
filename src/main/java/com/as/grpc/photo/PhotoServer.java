package com.as.grpc.photo;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class PhotoServer {

    private Server server;

    public static void main(String[] args) {
        try {
            PhotoServer photoServer = new PhotoServer();
            photoServer.start_process();
        } catch(Exception e) {
            System.out.println("Exception on startup = " + e);
        }

    }

    private void start_process() throws IOException, InterruptedException {
        System.out.println("gRPC Photo Server running!");

        server = ServerBuilder.forPort(50053)
                .addService(new PhotoService())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run()
            {
                System.out.println("Received Shutdown Request");
                PhotoServer.this.stop();
            }
        });

        server.awaitTermination();
    }

    private void stop() {
        if(server != null) {
            server.shutdown();
        }
    }

}
