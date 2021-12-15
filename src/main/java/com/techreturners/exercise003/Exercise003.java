package com.techreturners.exercise003;

import java.util.Arrays;
import java.util.Optional;

/**
 * Created list of Ice cream flavours with its code
 * 
 * @author revathi
 *
 */
enum IcecreamFlavours {
	PISTACHIO("Pistachio", 0), RASPBERRY_RIPPLE("Raspberry Ripple", 1), VANILLA("Vanilla", 2),
	MINT_CHOCOLATE_CHIP("Mint Chocolate Chip", 3), CHOCOLATE("Chocolate", 4), MANGO_SORBET("Mango Sorbet", 5);

	private final String key;
	private final Integer value;

	IcecreamFlavours(String key, Integer value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public Integer getValue() {
		return value;
	}
}

public class Exercise003 {
	/**
	 * This method used to return code of the given ice cream flavour
	 * 
	 * @param iceCreamFlavour
	 * @return Ice cream flavour code
	 */
	int getIceCreamCode(String iceCreamFlavour) {
		if (iceCreamFlavour == null || iceCreamFlavour.isEmpty()) {
			return -1;
		}
		Optional<IcecreamFlavours> iceCreamFlavourEnum = Arrays.stream(IcecreamFlavours.values())
				.filter(iceCream -> iceCream.getKey().equalsIgnoreCase(iceCreamFlavour)).findFirst();

		return iceCreamFlavourEnum.get().getValue();
	}

	/**
	 * This method implemented to return the list of ice cream flavour
	 * 
	 * @return Ice cream flavour list
	 */
	String[] iceCreamFlavours() {
		String[] iceCreamFlavourList = new String[6];
		try {
			Arrays.stream(IcecreamFlavours.values()).forEach((iceCreamFlavour) -> {
				iceCreamFlavourList[iceCreamFlavour.getValue()] = iceCreamFlavour.getKey();
			});
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index bound of exception in iceCreamFlavours");
			e.printStackTrace();
		}
		return iceCreamFlavourList;
	}
}
