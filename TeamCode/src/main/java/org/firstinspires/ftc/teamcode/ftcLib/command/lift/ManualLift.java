package org.firstinspires.ftc.teamcode.ftcLib.command.lift;

import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.ftcLib.subsystem.ArmSubsystem;

import java.util.function.DoubleSupplier;

public class ManualLift extends CommandBase {
    private final ArmSubsystem arm;
    private DoubleSupplier input;

    public ManualLift(ArmSubsystem arm, DoubleSupplier input) {
        this.arm = arm;
        this.input = input;
        addRequirements(arm);
    }

    @Override
    public void execute() {
        arm.manualSlide(input.getAsDouble());
    }

    public boolean isFinished() {
        return false;
    }
}
