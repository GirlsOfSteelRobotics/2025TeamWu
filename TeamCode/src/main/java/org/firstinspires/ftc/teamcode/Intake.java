package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Intake {
    DcMotor intakeMotor;

    public void intake (){
        intakeMotor.setPower(1);
    }
}


