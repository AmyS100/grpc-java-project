package com.as.grpc.heater;

import com.proto.heating.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HeaterClient {

    JFrame frame;
    JTextArea message_text_area = new JTextArea();
    ManagedChannel  channel = null;
    HeaterServiceGrpc.HeaterServiceBlockingStub synchClient = null;

    public HeaterClient() {
        run_client();
    }

    public static void main(String[] args) {

        HeaterClient heaterClient = new HeaterClient();

    }

    private void run_client() {

        frame =new JFrame("Heater Controller");//creating instance of JFrame

        JPanel panel = new JPanel();

        JButton statusButton =new JButton("Show Status ");//creating instance of JButton
        panel.add(statusButton);//adding button in JFrame
        statusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.out.println("Clicked");
                viewStatus();
            }
        });

        JButton lowTempButton =new JButton("Set to Low Temp ");//creating instance of JButton
        panel.add(lowTempButton);//adding button in JFrame
        lowTempButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.out.println("Clicked");
                setLowTemp();
            }
        });

        JButton mediumTempButton =new JButton("Set to Medium Temp ");//creating instance of JButton
        panel.add(mediumTempButton);//adding button in JFrame
        mediumTempButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.out.println("Clicked");
                setMediumTemp();
            }
        });

        JButton highTempButton =new JButton("Set to High Temp ");//creating instance of JButton
        panel.add(highTempButton);//adding button in JFrame
        highTempButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.out.println("Clicked");
                setHighTemp();
            }
        });

        JButton offButton =new JButton("Switch Off ");//creating instance of JButton
        panel.add(offButton);//adding button in JFrame
        offButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.out.println("Clicked");
                switchOff();
            }
        });

        message_text_area = new JTextArea(10, 30);
        panel.add(message_text_area);
        message_text_area.setText("Heater Client is running.");

        frame.add(panel);
        frame.setSize(750,350);//400 width and 500 height
        //frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible

    }


    private void viewStatus() {

        //System.out.println("gRPC Heater Client running!");

        channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        // create the stub
        synchClient = HeaterServiceGrpc.newBlockingStub(channel);

        HeaterStatusRequest heaterRequest = HeaterStatusRequest.newBuilder().setDeviceId(1).build();
        HeaterStatusResponse server_response = synchClient.showStatus(heaterRequest);

        String result = server_response.getHeater().toString();
        message_text_area.setText(result);

        System.out.println(result);

        System.out.println("Shutting down Heating Client");
        channel.shutdown();
    }

    private void setLowTemp() {

        channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        // create the stub
        synchClient = HeaterServiceGrpc.newBlockingStub(channel);

        HeaterToUpdateRequest heaterToUpdate = HeaterToUpdateRequest.newBuilder().setDeviceId(1).build();
        HeaterDetailResponse server_response = synchClient.setTempToLow(heaterToUpdate);

        String result = server_response.getHeater().toString();
        message_text_area.setText(result);

        System.out.println(result);

        System.out.println("Shutting down Heating Client");
        channel.shutdown();
    }

    private void setMediumTemp() {

        channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        // create the stub
        synchClient = HeaterServiceGrpc.newBlockingStub(channel);

        HeaterToUpdateRequest heaterToUpdate = HeaterToUpdateRequest.newBuilder().setDeviceId(1).build();
        HeaterDetailResponse server_response = synchClient.setTempToMedium(heaterToUpdate);

        String result = server_response.getHeater().toString();
        message_text_area.setText(result);

        System.out.println(result);

        System.out.println("Shutting down Heating Client");
        channel.shutdown();
    }

    private void setHighTemp() {

        channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        // create the stub
        synchClient = HeaterServiceGrpc.newBlockingStub(channel);

        HeaterToUpdateRequest heaterToUpdate = HeaterToUpdateRequest.newBuilder().setDeviceId(1).build();
        HeaterDetailResponse server_response = synchClient.setTempToHigh(heaterToUpdate);

        String result = server_response.getHeater().toString();
        message_text_area.setText(result);

        System.out.println(result);

        System.out.println("Shutting down Heating Client");
        channel.shutdown();
    }

    private void switchOff() {

        channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        // create the stub
        synchClient = HeaterServiceGrpc.newBlockingStub(channel);

        HeaterToUpdateRequest heaterToUpdate = HeaterToUpdateRequest.newBuilder().setDeviceId(1).build();
        HeaterDetailResponse server_response = synchClient.setToOff(heaterToUpdate);

        String result = server_response.getHeater().toString();
        message_text_area.setText(result);

        System.out.println(result);

        System.out.println("Shutting down Heating Client");
        channel.shutdown();
    }

}

