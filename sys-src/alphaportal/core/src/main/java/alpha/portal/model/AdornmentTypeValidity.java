package alpha.portal.model;

public enum AdornmentTypeValidity {
	VALID("Gültig"), INVALID("Ungültig");

	private final String name;

	private AdornmentValueType dataValueType;

	/**
	 * Instantiates a new AdornmentType.
	 * 
	 * @param name
	 *            the value of the specific adornment.
	 */
	AdornmentTypeValidity(final String name) {
		this.name = name;
	}

	/**
	 * gets the value of the enum list.
	 * 
	 * @return the value
	 */
	public String value() {
		return name;
	}

	/**
	 * goes through the list of default adornments and returns an object of the
	 * type AdornmentType, if the given value equals with one out of the lists.
	 * 
	 * @param value
	 *            the value of the adornment.
	 * @return an AdornmentType object.
	 */
	public static AdornmentTypeValidity fromValue(final String value) {
		for (final AdornmentTypeValidity adornmentTypeVisibility : AdornmentTypeValidity
				.values()) {
			if (adornmentTypeVisibility.name.equals(value)) {
				return adornmentTypeVisibility;
			}
		}
		return null;
	}
}