package org.usfirst.frc.team166.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team166.robot.commands.MediumRangeShot;
import org.usfirst.frc.team166.robot.commands.MoveActuatorsDown;
import org.usfirst.frc.team166.robot.commands.MoveActuatorsUp;
import org.usfirst.frc.team166.robot.commands.drive.DriveDistance;
import org.usfirst.frc.team166.robot.commands.shooter.SetShooterSpeed;
import org.usfirst.frc.team166.robot.commands.shooterLock.UnlockShooter;

/**
 *
 */
public class AllDownMidAuto extends CommandGroup {

	public AllDownMidAuto() {
		addSequential(new SetShooterSpeed(.9));
		addSequential(new MoveActuatorsDown());
		addSequential(new DriveDistance(.9, 162));
		addSequential(new MoveActuatorsUp());
		addSequential(new UnlockShooter());
		addSequential(new MediumRangeShot());
		// addSequential(new ToggleDriveDirection());
	}
}
