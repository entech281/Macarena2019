package frc.robot.commands;

import frc.robot.subsystems.BaseSubsystem;
import frc.robot.subsystems.GrabberSubsystem;

public class CloseAndIntakeCommand extends BaseCommand{
    private GrabberSubsystem grab; 
    public CloseAndIntakeCommand(BaseSubsystem subsystem) {
        super(subsystem);
        requires(subsystem);
        this.grab=(GrabberSubsystem) subsystem;
        setTimeout(5);
    }
    @Override
    public void initialize() {
        grab.close();
        grab.startLoading();
    }
    @Override
    public void end() {
        grab.stopMotors();
    }
    @Override
    protected boolean isFinished() {
        return grab.isCubeTouchingSwitch()||isTimedOut();
    }

}
