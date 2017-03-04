// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5536.titan2017;

import org.usfirst.frc5536.titan2017.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc5536.titan2017.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton feedBtn;
    public JoystickButton fireBtn;
    public JoystickButton climbBtn;
    public JoystickButton closeBtn;
    public JoystickButton openBtn;
    public JoystickButton downBtn;
    public JoystickButton upBtn;
    public JoystickButton reverseShooterBtn;
    public Joystick xbox1;
    public JoystickButton climbCamBtn;
    public JoystickButton gearCamBtn;
    public JoystickButton fillHopperCamBtn;
    public JoystickButton lightBtn;
    public JoystickButton shootCamBtn;
    public Joystick xbox2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        xbox2 = new Joystick(1);
        
        shootCamBtn = new JoystickButton(xbox2, 4);
        shootCamBtn.whileHeld(new cameraHighGoal());
        lightBtn = new JoystickButton(xbox2, 5);
        lightBtn.whileHeld(new lightOn());
        fillHopperCamBtn = new JoystickButton(xbox2, 3);
        fillHopperCamBtn.whenPressed(new cameraHopper());
        gearCamBtn = new JoystickButton(xbox2, 2);
        gearCamBtn.whenPressed(new cameraGear());
        climbCamBtn = new JoystickButton(xbox2, 1);
        climbCamBtn.whenPressed(new cameraClimb());
        xbox1 = new Joystick(0);
        
        reverseShooterBtn = new JoystickButton(xbox1, 2);
        reverseShooterBtn.whileHeld(new reverseShooter());
        upBtn = new JoystickButton(xbox1, 6);
        upBtn.whenPressed(new clawUp());
        downBtn = new JoystickButton(xbox1, 5);
        downBtn.whenPressed(new clawDown());
        openBtn = new JoystickButton(xbox1, 7);
        openBtn.whenPressed(new clawOpen());
        closeBtn = new JoystickButton(xbox1, 8);
        closeBtn.whenPressed(new clawClose());
        climbBtn = new JoystickButton(xbox1, 4);
        climbBtn.whileHeld(new climbRope());
        fireBtn = new JoystickButton(xbox1, 3);
        fireBtn.whileHeld(new fireBalls());
        feedBtn = new JoystickButton(xbox1, 1);
        feedBtn.whileHeld(new feedBalls());


        // SmartDashboard Buttons
        SmartDashboard.putData("fwdFromWall", new fwdFromWall());
        SmartDashboard.putData("autoLeft30", new autoLeft30());
        SmartDashboard.putData("autoRight30", new autoRight30());
        SmartDashboard.putData("fwdToPeg", new fwdToPeg());
        SmartDashboard.putData("centerGearScore", new centerGearScore());
        SmartDashboard.putData("leftGearScore", new leftGearScore());
        SmartDashboard.putData("rightGearScore", new rightGearScore());
        SmartDashboard.putData("lightOn", new lightOn());
        SmartDashboard.putData("cameraHighGoal", new cameraHighGoal());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getxbox1() {
        return xbox1;
    }

    public Joystick getxbox2() {
        return xbox2;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

