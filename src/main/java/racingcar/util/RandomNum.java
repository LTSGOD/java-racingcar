package racingcar.util;

public class RandomNum implements Random{
	private final int ZERO_TO_NINE_CONVERTER = 10;

	public int generator() {
		return (int)(Math.random() * ZERO_TO_NINE_CONVERTER);
	}
}
