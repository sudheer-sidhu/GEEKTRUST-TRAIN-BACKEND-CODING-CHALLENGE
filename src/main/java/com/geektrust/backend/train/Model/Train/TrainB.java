package com.geektrust.backend.train.Model.Train;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TrainB implements Train  {
    private List<String> trainB_PreJoinRouteStationsList;
    private List<String> trainB_Bogies;
    public List<String> getTrainB_PreJoinRouteStationsList() {
        return trainB_PreJoinRouteStationsList;
    }

    public void setTrainB_PreJoinRouteStationsList(List<String> trainB_PreJoinRouteStationsList) {
        this.trainB_PreJoinRouteStationsList = trainB_PreJoinRouteStationsList;
    }

    public List<String> getTrainB_Bogies() {
        return trainB_Bogies;
    }

    public void setTrainB_Bogies(List<String> trainB_Bogies) {
        this.trainB_Bogies = trainB_Bogies;
    }

    public TrainB() {
        trainB_PreJoinRouteStationsList =
                new ArrayList<>(Arrays.asList("TVC", "SRR", "MAQ", "MAO", "PNE"));
    }

    @Override
    public void executeCommand(String command) {
        String[] args = command.split(" ");
        String train = args[0];
        List<String> stations = new ArrayList<>();

        for (int i = 2; i < args.length; i++) {
            stations.add(args[i]);
        }

        if ("TRAIN_B".equals(train)) {
            trainB_Bogies = new ArrayList<>(stations);
            trainB_Bogies.removeIf(station -> trainB_PreJoinRouteStationsList.contains(station));
        }
        execute();
    }

public void execute() {
    if (trainB_Bogies == null) {
        return;
    }
    System.out.print("ARRIVAL TRAIN_B ENGINE ");
    System.out.println(String.join(" ", trainB_Bogies));
 }

}

