package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.RobotMap;
import frc.robot.RobotMap.PCM;

public class WristSubsystem extends BaseSubsystem {

    //1 private Solenoid up;
    //1 private Solenoid down;

    private DoubleSolenoid solenoid;

    //SpotBugs: private boolean wristUp;

    
    public WristSubsystem() {
    }

    @Override
    public void initialize() {
        solenoid = new DoubleSolenoid(RobotMap.CAN.PC_MODULE, PCM.Wrist.UP, PCM.Wrist.DOWN);
        //SpotBugs: wristUp = true;
        //1 up = new Solenoid(RobotMap.CAN.PC_MODULE, PCM.Wrist.UP);
        //1 down = new Solenoid(RobotMap.CAN.PC_MODULE,PCM.Wrist.DOWN);

    }

    @Override
    public void periodic() {
    	//1 if (wristUp) {
    	//1     up.set(false);
    	//1     down.set(false);
    	//1 } else {
    	//1     up.set(true);
    	//1     down.set(true);
    	//1 }
        //2 if (wristUp) {
    	//2     solenoid.set(DoubleSolenoid.Value.kReverse);
    	//2 } else {
    	//2     solenoid.set(DoubleSolenoid.Value.kForward);
    	//2 }
    }

    public void pivotUp() {
        //SpotBugs: wristUp = true;
        solenoid.set(DoubleSolenoid.Value.kForward);
        //1 up.set(false);
        //1 down.set(false);
    }
    
    public void pivotDown() {
        //SpotBugs: wristUp = false;
        solenoid.set(DoubleSolenoid.Value.kReverse);
        //1 up.set(true);
        //1 down.set(true);
    }
    
}
