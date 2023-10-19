
package com.geektrust.backend;

import com.geektrust.backend.train.Controller.TrainController;


public class App {

    public static void main(String[] args) {
        if (args.length != 1) {
            for(int i =0; i< args.length; i++){

                System.out.println(args[i]);
            }
            System.err.println("provide path to the input file as a command-line argument.");
            System.exit(1);
        }
        train(args);
       
    }

    public static void train(String[] args) {
        String[] inputFilePaths = {args[0]};

        for (String inputFileName : inputFilePaths) {
            try {

                TrainController trainController = new TrainController();
                trainController.parseCommandsFromInputFile(inputFileName);
            } catch (Exception e) {

                e.printStackTrace();
            }
        } 
    }
}



