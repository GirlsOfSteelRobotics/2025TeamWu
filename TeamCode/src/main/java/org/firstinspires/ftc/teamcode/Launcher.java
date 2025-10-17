package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Launcher {
    DcMotor leftLauncherMotor;

    DcMotor rightLauncherMotor;

    public Launcher (HardwareMap hm){
        leftLauncherMotor = hm.dcMotor.get("leftlauncher");

        rightLauncherMotor = hm.dcMotor.get("rightlauncher");

    }
    public void stupidShoot(){
        leftLauncherMotor.setPower(1);
        rightLauncherMotor.setPower(1);
    }
    public void stop(){
        leftLauncherMotor.setPower(0);
        rightLauncherMotor.setPower(0);
    }
}
