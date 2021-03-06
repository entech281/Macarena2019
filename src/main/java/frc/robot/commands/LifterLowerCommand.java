package frc.robot.commands;


import frc.robot.subsystems.LifterSubsystem;

public class LifterLowerCommand extends BaseCommand {

    private LifterSubsystem lifter;
    public LifterLowerCommand(LifterSubsystem subsystem) {
        super(subsystem);
        this.lifter = subsystem;
    }


    @Override
    protected void initialize() {
        lifter.motorsDown(LifterSubsystem.DOWN_SPEED_PERCENT);
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
