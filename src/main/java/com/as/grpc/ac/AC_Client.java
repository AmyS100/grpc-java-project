package com.as.grpc.ac;
import com.proto.ac.ACDetailResponse;
import com.proto.ac.ACDeviceTempRequest;
import com.proto.ac.AC_ServiceGrpc;
import com.proto.ac.GetByDeviceIdRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AC_Client {

    JFrame frame;
    JTextArea message_text_area = new JTextArea();
    ManagedChannel  channel = null;
    AC_ServiceGrpc.AC_ServiceBlockingStub synchClient;
    JTextField temp_value;


    public AC_Client() {
        run_client();
    }

    public static void main(String[] args) {
        AC_Client acClient = new AC_Client();
    }

    private void run_client() {

        frame =new JFrame("AC Controller");//creating instance of JFrame

        JPanel panel = new JPanel();
        JLabel temp_label = new JLabel("Set Temp");
        temp_value = new JTextField(3);
        temp_value.setText("18");

        panel.add(temp_label);
        panel.add(temp_value);

        JButton newTempButton = new JButton("Reset Temp ");//creating instance of JButton
        panel.add(newTempButton);//adding button in JFrame
        newTempButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                setTemp();
            }
        });

        JButton showDetailsButton = new JButton("Show AC Details ");//creating instance of JButton
        panel.add(showDetailsButton);//adding button in JFrame
        showDetailsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                showDetails();
            }
        });

        JButton offButton = new JButton("Switch Off ");//creating instance of JButton
        panel.add(offButton);//adding button in JFrame
        offButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                switchOff();
            }
        });


        message_text_area = new JTextArea(10, 30);
        panel.add(message_text_area);
        message_text_area.setText("AC Client is running.");


        frame.add(panel);
        frame.setSize(750,350);//400 width and 500 height
        //frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible

    }


    private void switchOff() {

        channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        // create the stub
        synchClient =  AC_ServiceGrpc.newBlockingStub(channel);

        GetByDeviceIdRequest ac_to_control = GetByDeviceIdRequest.newBuilder().setDeviceId(1).build();
        ACDetailResponse server_response = synchClient.setToOff(ac_to_control);

        String result = server_response.getAcController().toString();
        message_text_area.setText(result);

        System.out.println(result);

        System.out.println("Shutting down AC Client");
        channel.shutdown();
    }

    private void showDetails() {

        channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        // create the stub
        synchClient =  AC_ServiceGrpc.newBlockingStub(channel);

        GetByDeviceIdRequest ac_to_control = GetByDeviceIdRequest.newBuilder().setDeviceId(1).build();
        ACDetailResponse server_response = synchClient.showCurrentDetails(ac_to_control);

        message_text_area.setText("Current Details : ");
        String result = server_response.getAcController().toString();
        message_text_area.append(result);

        System.out.println(result);

        System.out.println("Shutting down AC Client");
        channel.shutdown();
    }

    private void setTemp() {

        channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        // create the stub
        synchClient =  AC_ServiceGrpc.newBlockingStub(channel);

        String temp_s = temp_value.getText();
        int temp_v = 0;

        try {
            temp_v = Integer.parseInt(temp_s);
        } catch (Exception e) {
            temp_v = 0;
        }

        if(temp_v >= 0 && temp_v < 100) {
            ACDeviceTempRequest ac_to_control = ACDeviceTempRequest.newBuilder().setDeviceId(1).setNewTempSetting(temp_v).build();
            ACDetailResponse server_response = synchClient.setTemp(ac_to_control);


            String result = server_response.getAcController().toString();
            message_text_area.setText(result);

            System.out.println(result);
        }
        else {
            message_text_area.setText("You must enter a valid temperature setting between 0 and 100 degrees");
        }

        System.out.println("Shutting down AC Client");
        channel.shutdown();
    }

}
