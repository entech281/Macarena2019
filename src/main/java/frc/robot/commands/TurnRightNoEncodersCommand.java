package frc.robot.commands;

import frc.robot.DriveInstruction;
import frc.robot.DriveInstructionSource;
import frc.robot.subsystems.drive.BaseDriveSubsystem.DriveMode;
import frc.robot.subsystems.drive.RealDriveSubsystem;

public class TurnRightNoEncodersCommand extends BaseCommand {

	private RealDriveSubsystem drive;
	private double turnSpeed = 0.0;
	public TurnRightNoEncodersCommand(RealDriveSubsystem drive, double driveTimeSeconds,double turnSpeed) {
		super(drive,driveTimeSeconds);
		this.drive = drive;
		this.turnSpeed = turnSpeed;
	}

	@Override
	protected void initialize() {
		drive.setMode(DriveMode.SPEED_DRIVE);
		DriveInstructionSource justTurnRight = new DriveInstructionSource() {

			@Override
			public DriveInstruction getNextInstruction() {
			    
			    //TODO: this is bad and wrong. why is lateral forward and forward lateral, 
			    //and why does this have to be negative?
				return new DriveInstruction( -turnSpeed, 0.0);
			}
			
		};
		drive.setupNewDriveSource(justTurnRight);
	}

	@Override
	protected void end() {
		drive.restoreOriginalDriveSource();
		drive.stop();
	}

	@Override
	protected boolean isFinished() {		
		return isTimedOut();
	}

}
