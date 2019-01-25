package frc.robot.commands;

import frc.robot.subsystems.LifterSubsystem;

public class LifterRaiseCommand extends BaseCommand {

    private LifterSubsystem lifter;
    public LifterRaiseCommand(LifterSubsystem subsystem) {
        super(subsystem);
        this.lifter = subsystem;
    }

    @Override
    protected void initialize() {
        lifter.motorsUp(LifterSubsystem.UP_SPEED_PERCENT);
    }

	@Override
	protected void end() {
	}

    @Override
    protected boolean isFinished() {        
        return true;
    }

	@Override
	protected void interrupted() {
	}

}
