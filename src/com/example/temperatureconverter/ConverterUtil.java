package com.example.temperatureconverter;

public class ConverterUtil {
	
	public static float convertFahrenheitToCelsius(float fahrenheit){
		return((fahrenheit - 30)* 5 / 9);
	}
	
	public static float convertCelsiusToFahrenheit(float celsius){
		return((celsius * 9)/ 5)+ 32;
	}

}
