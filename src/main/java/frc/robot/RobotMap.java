package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * Note use of inner classes. Subscoping is much more powerful and expressive
 * than concatenation
 */
public class RobotMap {

    public static class CAN {
        public static final int FRONT_LEFT_MOTOR = 1;
        public static final int FRONT_RIGHT_MOTOR = 2;
        public static final int REAR_LEFT_MOTOR = 4;
        public static final int REAR_RIGHT_MOTOR = 3;
        
        public static class Lifter {
            public static final int MOTOR_ONE = 5;
            public static final int MOTOR_TWO = 6;  
        }
        
        public static class Grabber {
            public static final int MOTOR_LEFT = 8;
            public static final int MOTOR_RIGHT = 7;
        }
        
        public static final int PC_MODULE = 10;

    }

    public static class DriveJoystick {
        public static final int PORT = 0;
        public static class Buttons {
            public static final int FIELD_ABSOLUTE_DRIVING = 11;
        }
    }
    
    public static class ControlPanel {
        public static final int PORT = 1;
        public static class Buttons {
            public static final int LIFTER_RAISE = 4;
            public static final int LIFTER_LOWER = 5;
            public static final int LIFTER_TO_TOP = 3;
            public static final int LIFTER_TO_GROUND = 2;
            public static final int GRABBER_LOAD = 8;
            public static final int GRABBER_SHOOT = 9;
            public static final int GRABBER_OPEN = 7;
            public static final int WRIST_UP = 6;
            public static final int AUTO_SCALE_LEFT = 10;
            public static final int AUTO_SCALE_SLASH = 11;
            public static final int AUTO_SCALE_BACKSLASH = 12;
            public static final int AUTO_SCALE_RIGHT = 13;

        }
    }

    public static class PCMChannel {

    }

    public static class DigitalIO {
        public static final int LIFTER_AT_BOTTOM = 0;
        public static final int LIFTER_AT_TOP = 1;
        public static final int GRABBER_CUBE_LOADED = 2;
        // Right switch position works and is the right 3 position
        // Left switch position is currently the preference switch which also works
        // CAUTION: this allows field crew to tell the software that the robot is in
        //  BOTH the left and right position.
        // The preference override is on left 3-position but it's DIO port cannot be read
        public static final int LEFT_SWITCH_POSITION = 5;
        public static final int RIGHT_SWITCH_POSITION = 3;
        public static final int PREFERENCE_SWITCH = 4;
        public static final int LIFTER_ENCODER_A = 8;
        public static final int LIFTER_ENCODER_B = 9;

    }
    
    public static class PCM {
        public static class Grabber {
            public static final int OUTSIDE = 2;
            public static final int INSIDE = 3;
        }
        
        public static class Wrist {
            public static final int UP = 1;
            public static final int DOWN = 0;
        }
    }
    
    public static final double JOYSTICK_Y_SOFTNESS = 1.5;
    public static final double JOYSTICK_X_SOFTNESS = 1.5;

}
