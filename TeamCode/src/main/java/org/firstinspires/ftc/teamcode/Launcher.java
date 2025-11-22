package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
@Config
public class Launcher {
    DcMotorEx leftLauncherMotor;

    DcMotorEx rightLauncherMotor;
    public static double kf=.0005;
    public static double goal = 400;
    public static double kp=.0002;
    public Launcher (HardwareMap hm){
        leftLauncherMotor = (DcMotorEx) hm.dcMotor.get("leftlauncher");

        rightLauncherMotor = (DcMotorEx) hm.dcMotor.get("rightlauncher");
        leftLauncherMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    public void stupidShoot(){
        leftLauncherMotor.setPower(.5);
        rightLauncherMotor.setPower(.5);
    }
    public void stop(){
        leftLauncherMotor.setPower(0);
        rightLauncherMotor.setPower(0);
    }
    public void launcherTelemetry(Telemetry telemetry){
        telemetry.addData("launcher", rightLauncherMotor.getVelocity());
    }
    public void setRPM(){

        double output = goal*kf+(goal-rightLauncherMotor.getVelocity())*kp;
        rightLauncherMotor.setPower(output);
        leftLauncherMotor.setPower(output);
    }
}
