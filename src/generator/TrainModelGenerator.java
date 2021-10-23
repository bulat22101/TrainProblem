package generator;

import model.TrainModel;
import model.TrainModelImpl;

import java.util.Random;
import java.util.random.RandomGenerator;

public class TrainModelGenerator {
    private TrainModelGenerator() {
    }

    public static TrainModel generateModel(long seed, int length, int numberOfTurnedOn) {
        boolean[] train = new boolean[length];
        for (int i = 0; i < numberOfTurnedOn; i++) {
            train[i] = true;
        }
        randomPermutation(new Random(seed), train);
        return new TrainModelImpl(train);
    }

    public static void randomPermutation(RandomGenerator randomGenerator, boolean[] array) {
        for (int i = array.length - 1; i > 0; --i) {
            int j = randomGenerator.nextInt(0, i);
            array[i] ^= array[j];
            array[j] ^= array[i];
            array[i] ^= array[j];
        }
    }
}
