package com.kn.characterscount;

public class StringCharactersCount {

	public void characterscount(String inputstring) {

		char[] crr = inputstring.toCharArray();
		int count = 1;

		int number = 0;
		int spaces = 0;
		int specialcharacters = 0;
		int Uppervowels = 0;
		int Lowervowels = 0;
		int Upperconsonents = 0;
		int Lowerconsonents = 0;
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] >= 65 && crr[i] <= 90) {

				if (crr[i] == 'A' || crr[i] == 'E' || crr[i] == 'I' || crr[i] == 'O' || crr[i] == 'U') {
					Uppervowels++;
				} else {
					Upperconsonents++;
				}
			} else if (crr[i] >= 97 && crr[i] <= 122) {
				if (crr[i] == 'a' || crr[i] == 'e' || crr[i] == 'i' || crr[i] == 'o' || crr[i] == 'u') {
					Lowervowels++;
				} else {
					Lowerconsonents++;
				}
			} else if (crr[i] >= '0' && crr[i] <= '9') {
				number++;
			} else if (crr[i] == 32) {
				spaces++;
			} else {
				specialcharacters++;
			}
		}

		System.out.println("Uppervowels count =" + Uppervowels);
		System.out.println("Lowervowels count =" + Lowervowels);
		System.out.println("Upperconsonents count =" + Upperconsonents);
		System.out.println("Lowerconsonents count =" + Lowerconsonents);
		System.out.println("specialcharacters count =" + specialcharacters);
		System.out.println("spaces count =" + spaces);
		System.out.println("number count =" + number);
	}
}
