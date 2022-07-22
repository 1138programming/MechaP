// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Hood extends SubsystemBase {
  /** Creates a new Hood. */
  public TalonSRX hood;

  public Hood() {
    hood = new TalonSRX(6);
  }
 
 public void raiseHood(){
        hood.set(ControlMode.PercentOutput, .4);
      }

      public void lowerHood(){
        hood.set(ControlMode.PercentOutput, -.4);
      }

      public void stopHood(){
        hood.set(ControlMode.PercentOutput, 0);
      }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
