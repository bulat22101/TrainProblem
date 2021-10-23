package model;

public class TrainModelImpl implements TrainModel {
    private final boolean[] train;
    private int pointer;

    public TrainModelImpl(boolean[] train) {
        this.pointer = 0;
        this.train = new boolean[train.length];
        System.arraycopy(train, 0, this.train, 0, train.length);
    }

    @Override
    public int getLength() {
        return train.length;
    }

    @Override
    public void moveClockwise() {
        pointer = (pointer + 1) % train.length;
    }

    @Override
    public void moveAntiClockwise() {
        pointer = (pointer +train.length - 1) % train.length;
    }

    @Override
    public void switchLight() {
        train[pointer] ^= true;
    }

    @Override
    public boolean isLightTurnedOn() {
        return train[pointer];
    }
}
