// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5536.titan2017.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5536.titan2017.Robot;

/**
 *
 */
public class driveManual extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
	private final float TWISTMOD = 1f;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public driveManual() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	    	
    	float x = (float) Robot.oi.xbox1.getRawAxis(0);
    	//float x = (float) Robot.oi.joystick1.getX();
    	float y = (float) Robot.oi.xbox1.getRawAxis(1);
    	//float y = (float) Robot.oi.joystick1.getY();
    	float twist = (float) Robot.oi.xbox1.getRawAxis(4) * TWISTMOD;
    	//float twist = (float) Robot.oi.joystick2.getX() * TWISTMOD;
    	
    	if(Math.abs(x) <= 0.05){
    		x = 0;
    	}
    	if(Math.abs(y) <= 0.05){
    		y = 0;
    	}
    	if(Math.abs(twist) <= 0.30){
    		twist = 0;
    	}
    	
    	Robot.driveTrain.driveManual(x, y, twist);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.driveManual(0, 0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
