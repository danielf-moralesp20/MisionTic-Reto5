package utils;

import java.util.Optional;

public class FieldUtils {
	private FieldUtils() {
	}
	
	public static boolean isEmpty(String val) {
		return Optional.ofNullable(val).isEmpty() || val.trim().isEmpty();
	}
	
	public static boolean isNumber(String val) {
		return !isEmpty(val) && val.matches("^\\d+$");
	}
	
	public static boolean isDate(String val) {
		return !isEmpty(val) && val.matches("^([1-9]\\d{3,3}|9\\d{3,3})-(1[0-2]|0?[1-9])-(3[0-1]|[1-2][0-9]|0?[1-9])");
	}
}
