package com.geektrust.backend.train.Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.geektrust.backend.train.Service.TrainService;
import com.geektrust.backend.train.Model.Train.CommonTrainStations;
import com.geektrust.backend.train.Model.Train.CombinedTrains;

public class TrainController {
    private final TrainService trainService = new TrainService();

    private final CombinedTrains combinedTrain = new CombinedTrains(trainService.trainA,
            trainService.trainB, CommonTrainStations.stationDistanceFromHydInDescendingOrder);

    public void parseCommandsFromInputFile(String inputFileName) {
        String inputFilePath = "" + inputFileName;
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                trainService.executeCommand(line);
            }
            combinedTrain.combineBogiesAndDepart();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
