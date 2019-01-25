package frc.robot;

import frc.robot.commands.CloseAndIntakeCommand;
import frc.robot.commands.GrabberCloseCommand;
import frc.robot.commands.GrabberLoadCommand;
import frc.robot.commands.GrabberOpenCommand;
import frc.robot.commands.GrabberShootCommand;
import frc.robot.commands.GrabberStopCommand;
import frc.robot.commands.LifterHomeCommand;
import frc.robot.commands.LifterTopCommand;
import frc.robot.commands.PushOutCubeAndOpenCommand;
import frc.robot.commands.LifterLowerCommand;
import frc.robot.commands.LifterRaiseCommand;
import frc.robot.commands.LifterStopCommand;
import frc.robot.commands.WristPivotDownCommand;
import frc.robot.commands.WristPivotUpCommand;

/**
 * An interface that creates commands. This is a seam that allows testing
 * OperatorInterface without the need to create a Robot instance, which cannot
 * be done because wpilib
 * 
 * @author dcowden
 *
 */
public interface CommandFactory {
    
    LifterRaiseCommand createLifterRaiseCommand();
    
    LifterLowerCommand createLifterLowerCommand();
    
    LifterHomeCommand createLifterHomeCommand();
    
    LifterTopCommand createLifterTopCommand();

    GrabberLoadCommand createGrabberLoadCommand();
    
    GrabberShootCommand createGrabberShootCommand();
    
    GrabberStopCommand createGrabberStopCommand();
    
    GrabberOpenCommand createGrabberOpenCommand();
    
    GrabberCloseCommand createGrabberCloseCommand();
    
    WristPivotUpCommand createWristPivotUpCommand();
    
    WristPivotDownCommand createWristPivotDownCommand();
    
    LifterStopCommand createLifterStopCommand();
    
    CloseAndIntakeCommand createCloseAndIntakeCommand();
    
    PushOutCubeAndOpenCommand createPushOutCubeAndOpenCommand();
}
