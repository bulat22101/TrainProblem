package model;

public interface TrainModel {
    int getLength();

    void moveClockwise();

    void moveAntiClockwise();

    void switchLight();

    boolean isLightTurnedOn();
}
