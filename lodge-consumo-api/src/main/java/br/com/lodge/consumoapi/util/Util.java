package br.com.lodge.consumoapi.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {
	
	public static String convertObjectAsJsonString(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
