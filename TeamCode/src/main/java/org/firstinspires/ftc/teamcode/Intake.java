package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    DcMotor intakeMotor;

    public Intake(HardwareMap hm){
        intakeMotor = hm.dcMotor.get("intake");
    }

    public void intake (){
        intakeMotor.setPower(1);
    }
    public void stop (){
        intakeMotor.setPower(0);
    }
    public void outtake (){
        intakeMotor.setPower(-1);
    }
}


