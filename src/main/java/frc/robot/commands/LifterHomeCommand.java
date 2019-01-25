package frc.robot.commands;

import frc.robot.subsystems.LifterSubsystem;

public class LifterHomeCommand extends BaseCommand {

    public static final double TIMEOUT_SECS = 10.;
    
    private LifterSubsystem lifter;
    
    public LifterHomeCommand(LifterSubsystem subsystem) {
        super(subsystem,TIMEOUT_SECS);
        this.lifter = (LifterSubsystem)subsystem;
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        lifter.motorsDown(LifterSubsystem.DOWN_SPEED_PERCENT);        
    }
    
    @Override
    protected void end() {
        lifter.motorsOff();
    }

    @Override
    protected boolean isFinished() {
        return lifter.isLifterAtBottom() || isTimedOut();
    }
    
    @Override
    protected void interrupted() {
        end();
    }
}
