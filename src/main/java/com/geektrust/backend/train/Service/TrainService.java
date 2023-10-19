package com.geektrust.backend.train.Service;

import com.geektrust.backend.train.Model.Train.TrainA;
import com.geektrust.backend.train.Model.Train.TrainB;

public class TrainService {
    public final TrainA trainA;
    public final TrainB trainB;
    
    public TrainService() {
        trainA = new TrainA();
        trainB = new TrainB();
    }
    

    public void executeCommand(String command) {
        trainA.executeCommand(command);
        trainB.executeCommand(command);
    }
}


