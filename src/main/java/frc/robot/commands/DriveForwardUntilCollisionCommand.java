package frc.robot.commands;

import frc.robot.DriveInstruction;
import frc.robot.DriveInstructionSource;
import frc.robot.subsystems.drive.BaseDriveSubsystem.DriveMode;
import frc.robot.subsystems.drive.RealDriveSubsystem;

public class DriveForwardUntilCollisionCommand extends BaseCommand {

	private RealDriveSubsystem drive;
	private double driveForwardSpeed = 0.0;
	public DriveForwardUntilCollisionCommand(RealDriveSubsystem drive, double driveTimeSeconds,double driveFowardSpeed) {
		super(drive,driveTimeSeconds);
		this.drive = drive;
		this.driveForwardSpeed = driveFowardSpeed;
	}

	@Override
	protected void initialize() {
		drive.setMode(DriveMode.SPEED_DRIVE);
		DriveInstructionSource justGoForward = new DriveInstructionSource() {

			@Override
			public DriveInstruction getNextInstruction() {
			    //TODO: this is bad and wrong. why is lateral forward and forward lateral,
			    //and why does this have to be negative?
				return new DriveInstruction( 0.0, -driveForwardSpeed);
			}

			};
		drive.setupNewDriveSource(justGoForward);
		drive.resetCollision();
		drive.resetTilt();
	}

	@Override
	public void execute() {
	}

	@Override
	protected void end() {
		drive.restoreOriginalDriveSource();
		drive.stop();
	}

	@Override
	protected boolean isFinished() {
		return isTimedOut() || drive.hasCollisionOccurred() || drive.isRobotTipping();
	}

	@Override
	protected void interrupted() {
		end();
	}
}
