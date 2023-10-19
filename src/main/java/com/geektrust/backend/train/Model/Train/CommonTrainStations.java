package com.geektrust.backend.train.Model.Train;

import java.util.HashMap;
import java.util.Map;

public class CommonTrainStations {
    public static final int DISTANCE_IN_KMS_GHY = 4700;
    public static final int DISTANCE_IN_KMS_NJP = 4200;
    public static final int DISTANCE_IN_KMS_PTA = 3800;
    public static final int DISTANCE_IN_KMS_BPL = 2800;
    public static final int DISTANCE_IN_KMS_NDL = 2700;
    public static final int DISTANCE_IN_KMS_ITJ = 2700;
    public static final int DISTANCE_IN_KMS_AGA = 2500;
    public static final int DISTANCE_IN_KMS_NGP = 2400;
    public static final int DISTANCE_IN_Kms_BPL = 2000;
    public static final int DISTANCE_IN_Kms_ITJ = 1900;
    public static final int DISTANCE_IN_Kms_NGP = 1600;

    public static  Map<String, Integer> stationDistanceFromHydInDescendingOrder;


       public CommonTrainStations(){
        stationDistanceFromHydInDescendingOrder = new HashMap<>();
        stationDistanceFromHydInDescendingOrder.put("GHY", DISTANCE_IN_KMS_GHY);
        stationDistanceFromHydInDescendingOrder.put("NJP", DISTANCE_IN_KMS_NJP);
        stationDistanceFromHydInDescendingOrder.put("PTA", DISTANCE_IN_KMS_PTA);
        stationDistanceFromHydInDescendingOrder.put("BPL", DISTANCE_IN_KMS_BPL);
        stationDistanceFromHydInDescendingOrder.put("NDL", DISTANCE_IN_KMS_NDL);
        stationDistanceFromHydInDescendingOrder.put("ITJ", DISTANCE_IN_KMS_ITJ);
        stationDistanceFromHydInDescendingOrder.put("AGA", DISTANCE_IN_KMS_AGA);
        stationDistanceFromHydInDescendingOrder.put("NGP", DISTANCE_IN_KMS_NGP);
        stationDistanceFromHydInDescendingOrder.put("BPL", DISTANCE_IN_Kms_BPL);
        stationDistanceFromHydInDescendingOrder.put("ITJ", DISTANCE_IN_Kms_ITJ);
        stationDistanceFromHydInDescendingOrder.put("NGP", DISTANCE_IN_Kms_NGP);

    }
    
}

