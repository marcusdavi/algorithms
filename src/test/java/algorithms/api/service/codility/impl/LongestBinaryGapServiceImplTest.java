package algorithms.api.service.codility.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import algorithms.api.service.codility.impl.LongestBinaryGapServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class LongestBinaryGapServiceImplTest {

	@InjectMocks
	private LongestBinaryGapServiceImpl service;

	@Test
	public void testGetLongestBinaryGap() {
		assertEquals(0, service.getLongestBinaryGap(15)); // 1111
		assertEquals(5, service.getLongestBinaryGap(1041)); // 10000010001
		assertEquals(0, service.getLongestBinaryGap(32)); // 100000
		assertEquals(1, service.getLongestBinaryGap(55)); // 110111
		assertEquals(2, service.getLongestBinaryGap(57)); // 111001
	}

}
