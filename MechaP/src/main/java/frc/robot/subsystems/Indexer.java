package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Indexer extends SubsystemBase {
    public TalonSRX indexer;
   

    public Indexer() {
        indexer = new TalonSRX(8);
    }

    public void spinIndexer(double speed) {
        indexer.set(ControlMode.PercentOutput, -speed);
      }
      
   public void stopIndexer() {
        indexer.set(ControlMode.PercentOutput, 0);
      }

     
}
