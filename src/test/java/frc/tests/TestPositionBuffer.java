package frc.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import frc.robot.subsystems.Position;
import frc.robot.subsystems.PositionBuffer;

public class TestPositionBuffer {

	@Test
	public void testEmptyBufferReadsFinished() {
		PositionBuffer buf = new PositionBuffer();
		assertFalse(buf.hasNextPosition());
		
		buf.addPosition(new Position(80,80));
		assertTrue(buf.hasNextPosition());
		
		Position p = buf.getCurrentPosition();
		assertTrue(buf.hasNextPosition());
		
		buf.next();
		assertFalse(buf.hasNextPosition());
	}
	
}
