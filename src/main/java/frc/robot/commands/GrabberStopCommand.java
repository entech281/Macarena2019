package frc.robot.commands;

import frc.robot.subsystems.BaseSubsystem;
import frc.robot.subsystems.GrabberSubsystem;

public class GrabberStopCommand extends BaseCommand {
    private GrabberSubsystem grab;
    public GrabberStopCommand(BaseSubsystem subsystem) {
        super(subsystem);
        grab = (GrabberSubsystem)subsystem;
    }

    public GrabberStopCommand(BaseSubsystem subsystem, double timeOut) {
        super(subsystem, timeOut);
        
    }
    
    @Override
    protected void initialize() {
        grab.stopMotors();
    }

    @Override
    protected void execute() {
    }

    @Override
    protected boolean isFinished() {
        return true;
    }

}
