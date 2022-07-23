package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.*;

public class Turret extends SubsystemBase{
    private TalonSRX turretMotor;

    public Turret() {
        turretMotor = new TalonSRX(KTurretMotor);
    }

    public void spinClockwise(double speed) {
        turretMotor.set(ControlMode.PercentOutput, -speed);
    }
    
    public void spinCounterClockwise(double speed) {
        turretMotor.set(ControlMode.PercentOutput, speed);
    }

    public void stopTurret() {
        turretMotor.set(ControlMode.PercentOutput, 0);
    }
}
