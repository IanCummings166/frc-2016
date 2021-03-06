package org.usfirst.frc.team166.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team166.robot.RobotMap;

/**
 *
 */
public class Shooter extends Subsystem {

	Talon shooterLeftSide;
	Talon shooterRightSide;
	Encoder encoderLeft;
	Encoder encoderRight;
	// PIDSpeedController leftPID;
	// PIDSpeedController rightPID;

	final double distancePerPulse = 1.0 / 2500.0 / 37.0;

	public Shooter() {

		shooterLeftSide = new Talon(RobotMap.Pwm.LeftShooterMotor);
		shooterRightSide = new Talon(RobotMap.Pwm.RightShooterMotor);

		encoderLeft = new Encoder(RobotMap.Digital.ShooterLeftChannelA, RobotMap.Digital.ShooterLeftChannelB);
		encoderRight = new Encoder(RobotMap.Digital.ShooterRightChannelA, RobotMap.Digital.ShooterRightChannelB);

		encoderLeft.setPIDSourceType(PIDSourceType.kRate);
		encoderRight.setPIDSourceType(PIDSourceType.kRate);
		encoderLeft.setDistancePerPulse(distancePerPulse);
		encoderRight.setDistancePerPulse(distancePerPulse);

		// leftPID = new PIDSpeedController(encoderLeft, shooterLeftSide, "Shooter", "Left Wheel");
		// rightPID = new PIDSpeedController(encoderRight, shooterRightSide, "Shooter", "Right Wheel");

	}

	// launch the ball
	// public void setSpeed(double power) {
	// leftPID.set(power);
	// rightPID.set(-power);
	// // shooterLeftSide.set(power);
	// // shooterRightSide.set(-power);
	// }

	public void setSpeedOpenLoop(double power) {
		shooterLeftSide.set(power);
		shooterRightSide.set(-power);
	}

	public void updatePIDConstants() {
		double ShooterP = .025;
		double rightShooterP = .00001;
		double ShooterI = 0.0;
		double ShooterD = 0.0;
		double ShooterF = 1.0;

		// leftPID.setConstants(ShooterP, ShooterI, ShooterD, ShooterF);
		// rightPID.setConstants(rightShooterP, ShooterI, ShooterD, ShooterF);

	}

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	@Override
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.

	}
}
