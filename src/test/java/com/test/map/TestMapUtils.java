package com.test.map;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMapUtils {
	private MapUtils mapUtils;
	private static final Logger LOG = LoggerFactory.getLogger(TestMapUtils.class);
	
	@Before
	public void setUp() {
		mapUtils = new MapUtils();
	}
	
	@Test
	public void testReadMap() {
		Map<String, Object> map = mapUtils.readMap();
		
		LOG.info("list of keys {} and values {}", map.keySet(), map.values());
		assertNotNull(map);
		assertEquals(179, map.get("height"));
	}

}
