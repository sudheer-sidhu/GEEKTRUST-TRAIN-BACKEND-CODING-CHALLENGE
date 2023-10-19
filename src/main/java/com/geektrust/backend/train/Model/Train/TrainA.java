package com.geektrust.backend.train.Model.Train;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrainA implements Train {
    private List<String> trainA_PreJoinRouteStationsList;
    private List<String> trainA_Bogies;
    private boolean executeCalled;

    public List<String> getTrainA_PreJoinRouteStationsList() {
        return trainA_PreJoinRouteStationsList;
    }

    public void setTrainA_PreJoinRouteStationsList(List<String> trainA_PreJoinRouteStationsList) {
        this.trainA_PreJoinRouteStationsList = trainA_PreJoinRouteStationsList;
    }

    public List<String> getTrainA_Bogies() {
        return trainA_Bogies;
    }

    public void setTrainA_Bogies(List<String> trainA_Bogies) {
        this.trainA_Bogies = trainA_Bogies;
    }


    public TrainA() {
        trainA_PreJoinRouteStationsList =
                new ArrayList<>(Arrays.asList("CHN", "SLM", "BLR", "KRN"));

    }

    @Override
    public void executeCommand(String command) {
        String[] args = command.split(" ");
        String train = args[0];
        List<String> stations = new ArrayList<>();

        for (int i = 2; i < args.length; i++) {
            stations.add(args[i]);
        }

        if ("TRAIN_A".equals(train)) {
            trainA_Bogies = new ArrayList<>(stations);
            trainA_Bogies.removeIf(station -> trainA_PreJoinRouteStationsList.contains(station));
        }
        execute();

        
    }

    

    public void execute() {
        if (executeCalled) {
            return;
        }

        if (trainA_Bogies == null) {
            return;
        }


        System.out.print("ARRIVAL TRAIN_A ENGINE ");
        System.out.println(String.join(" ", trainA_Bogies));

        executeCalled = true;
    }
}





