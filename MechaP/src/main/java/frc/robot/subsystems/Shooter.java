// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import static frc.robot.Constants.*;

public class Shooter extends SubsystemBase {
  /** Creates a new Flywheel. */

  private TalonSRX flywheelMotorUpper;
  private TalonSRX flywheelMotorLower;
 
  public Shooter() {
    flywheelMotorLower = new TalonSRX(KFlywheelMotorLower);
    flywheelMotorUpper = new TalonSRX(KFlywheelMotorUpper);
  }
  
  public void spinFlywheel(double speed) {
    flywheelMotorUpper.set(ControlMode.PercentOutput, speed);
    flywheelMotorLower.set(ControlMode.Follower, KFlywheelMotorUpper);
  }

  public void stopFlywheel() {
    flywheelMotorUpper.set(ControlMode.PercentOutput, 0);
    flywheelMotorLower.set(ControlMode.Follower, KFlywheelMotorUpper);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
