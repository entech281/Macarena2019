package frc.robot.subsystems;

public interface PositionSource {
	public Position getCurrentPosition();
	public boolean hasNextPosition();
	public void next();
}
