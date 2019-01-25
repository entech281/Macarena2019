package frc.robot.commands;

import frc.robot.subsystems.BaseSubsystem;
import frc.robot.subsystems.GrabberSubsystem;

public class PushOutCubeAndOpenCommand extends BaseCommand{
    private GrabberSubsystem grab;
    public PushOutCubeAndOpenCommand(BaseSubsystem subsystem) {
        super(subsystem);
        requires(subsystem);
        grab = (GrabberSubsystem) subsystem;
        setTimeout(3);
    }
    @Override
    public void initialize() {
        grab.startShooting();
    }
    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }
    public void end() {
        grab.stopMotors();
        grab.open();
    }
}
