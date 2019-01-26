package frc.robot.subsystems;

public class FakeLifterSubsystem extends LifterSubsystem {

    protected double currentHeight= 0;
    
    public static final double INCHES_PER_CLICK=0.25;
    //SpotBugs: protected double moveSpeed = 0.0;
    
    //SpotBugs: private FakeMotorStatus status = FakeMotorStatus.STOPPED;
    
    public enum FakeMotorStatus{
        MOVING_UP,
        MOVING_DOWN,
        STOPPED
    }
    
    @Override
    public void motorsUp(double speedPercent) {
        //SpotBugs: status = FakeMotorStatus.MOVING_UP;
        //SpotBugs: moveSpeed = speedPercent*INCHES_PER_CLICK;
    }

    @Override
    public void motorsDown(double speedPercent) {
        //SpotBugs: status = FakeMotorStatus.MOVING_DOWN;
        //SpotBugs: moveSpeed = speedPercent*INCHES_PER_CLICK;
    }

    @Override
    public void motorsOff() {
        //SpotBugs: status = FakeMotorStatus.STOPPED;
        //SpotBugs: moveSpeed = 0;
    }

    @Override
    public boolean isLifterAtBottom() {
        return currentHeight <= 0;
    }

}
