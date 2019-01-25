package frc.robot.commands;

import frc.robot.subsystems.BaseSubsystem;
import frc.robot.subsystems.WristSubsystem;

public class WristPivotUpCommand extends BaseCommand {
    WristSubsystem wrist;
    public WristPivotUpCommand(BaseSubsystem subsystem) {
        super(subsystem);
        this.wrist = (WristSubsystem) subsystem;
    }

    public WristPivotUpCommand(BaseSubsystem subsystem, double timeOut) {
        super(subsystem, timeOut);
    }
    
    public void execute() {
        wrist.pivotUp();
    }
    
    @Override
    protected boolean isFinished() {
        return true;
    }

}
