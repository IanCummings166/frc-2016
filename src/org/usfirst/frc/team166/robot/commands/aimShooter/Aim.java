package org.usfirst.frc.team166.robot.commands.aimShooter;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team166.robot.Robot;

/**
 *
 */
public class Aim extends Command {

	public Aim() {
		requires(Robot.aimShooter);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {

	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		SmartDashboard.putNumber("ShooterAngle", Robot.aimShooter.getPotVal());
		Robot.aimShooter.setAngle(Robot.vision.getDesiredShooterAngle());

	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return ((Math.abs(Robot.vision.getDesiredShooterAngle() - Robot.aimShooter.getPotVal())) < 20.0);
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		// Robot.aimShooter.disable();
	}
}
