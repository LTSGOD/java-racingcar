package racingcar.util;

public class RandomNumGenerator implements NumGenerator {
    private static final int ZERO_TO_NINE_CONVERTER = 10;

    public int getNum() {
        return (int) (Math.random() * ZERO_TO_NINE_CONVERTER);
    }
}
