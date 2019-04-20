package com.as.grpc.ac;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AC_Server {

    private Server server;

    public static void main(String[] args) {
        try {
            AC_Server acServer = new AC_Server();
            acServer.start_process();
        } catch(Exception e) {
            System.out.println("Exception on startup = " + e);
        }

    }

    private void start_process() throws IOException, InterruptedException {
        System.out.println("gRPC AC Server running!");

        server = ServerBuilder.forPort(50052)
                .addService(new AC_Service())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run()
            {
                System.out.println("Received Shutdown Request");
                AC_Server.this.stop();
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
