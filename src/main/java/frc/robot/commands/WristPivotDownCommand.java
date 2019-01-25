package frc.robot.commands;

import frc.robot.subsystems.BaseSubsystem;
import frc.robot.subsystems.WristSubsystem;

public class WristPivotDownCommand extends BaseCommand {
    WristSubsystem wrist;
    public WristPivotDownCommand(BaseSubsystem subsystem) {
        super(subsystem, 1.25);
        this.wrist = (WristSubsystem) subsystem;
    }

    public WristPivotDownCommand(BaseSubsystem subsystem, double timeOut) {
        super(subsystem, timeOut);
    }
    public void initialize() {
        wrist.pivotDown();
    }
    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }

}
