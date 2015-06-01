package com.test.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapUtils {
	
	@SuppressWarnings("unchecked")
	public <K, V>Map<K, V> readMap() {
		Map<K, V> map = new LinkedHashMap<K, V>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 8175212941150615159L;

			{
				put((K)"name", (V)"Julius");
				put((K)"nickname", (V)"Batman");
				put((K)"age", (V)Integer.valueOf(25));
				put((K)"height", (V)Integer.valueOf(179));
				put((K)"sexual orientation", (V)"straight");
			}
		};
		
		return map;
	}
}
