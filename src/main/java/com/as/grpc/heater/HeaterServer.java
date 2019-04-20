package com.as.grpc.heater;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class HeaterServer {

    private Server  server;

    public static void main(String[] args) {
        try {
            HeaterServer heaterServer = new HeaterServer();
            heaterServer.start_process();
        } catch(Exception e) {
            System.out.println("Exception on startup = " + e);
        }

    }

    private void start_process() throws IOException, InterruptedException {
        System.out.println("gRPC Heater Server running!");

        server = ServerBuilder.forPort(50051)
                .addService(new HeaterService())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run()
            {
                System.out.println("Received Shutdown Request");
                HeaterServer.this.stop();
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


