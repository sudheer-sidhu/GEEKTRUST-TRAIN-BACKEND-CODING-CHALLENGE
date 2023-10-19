package com.geektrust.backend.train.Model.Train;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CombinedTrains extends CommonTrainStations {
    private final TrainA trainA;
    private final TrainB trainB;

    public CombinedTrains(TrainA trainA, TrainB trainB, Map<String, Integer> stationDistanceFromHydInDescendingOrder) {
        super();
        this.trainA = trainA;
        this.trainB = trainB;
    }


    public void combineBogiesAndDepart() {
        List<String> trainAB_Bogies = new ArrayList<>();

        if (trainA.getTrainA_Bogies() != null) {
            trainAB_Bogies.addAll(trainA.getTrainA_Bogies());
        }

        if (trainB.getTrainB_Bogies() != null) {
            trainAB_Bogies.addAll(trainB.getTrainB_Bogies());
        }

        trainAB_Bogies.sort((station1, station2) -> {
            int distance1 = stationDistanceFromHydInDescendingOrder.getOrDefault(station1, Integer.MAX_VALUE);
            int distance2 = stationDistanceFromHydInDescendingOrder.getOrDefault(station2, Integer.MAX_VALUE);
            return distance2 - distance1;
        });

        trainAB_Bogies.removeIf(station -> station.equalsIgnoreCase("HYB"));

        if (trainAB_Bogies.isEmpty()) {
            System.out.println("JOURNEY_ENDED");
        } else {
            System.out.print("DEPARTURE TRAIN_AB ENGINE ENGINE ");
            System.out.println(String.join(" ", trainAB_Bogies));
        }
    }

   
}

