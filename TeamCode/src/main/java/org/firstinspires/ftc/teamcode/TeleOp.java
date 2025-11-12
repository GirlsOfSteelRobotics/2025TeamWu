package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp

public class TeleOp extends LinearOpMode {


    @Override
    public void runOpMode() throws InterruptedException {
        Chassis chassis = new Chassis(hardwareMap);
        Intake intake = new Intake(hardwareMap);
        Launcher launcher = new Launcher(hardwareMap);
        Gate gate = new Gate(hardwareMap);

        telemetry = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());

        waitForStart();
        while (opModeIsActive()) {
            chassis.driveField(gamepad1.left_stick_x, -gamepad1.left_stick_y, gamepad1.right_stick_x);
            if (gamepad1.right_trigger>0) {
                intake.intake();
            } else if (gamepad1.right_bumper) {
                intake.outtake();
            } else {
                intake.stop();
            }


            if(gamepad1.b){
                chassis.resetIMU();
            }
            if(gamepad1.left_trigger>0){
                launcher.setRPM();
            }
            else{
                launcher.stop();
            }
            chassis.IMUtelemetry(telemetry);
            launcher.launcherTelemetry(telemetry);
            telemetry.update();
        }
    }

}
