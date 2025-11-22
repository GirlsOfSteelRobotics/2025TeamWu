package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp

public class Debugging extends LinearOpMode {


    @Override
    public void runOpMode() throws InterruptedException {
        Chassis chassis = new Chassis(hardwareMap);
        Intake intake = new Intake(hardwareMap);
        Launcher launcher = new Launcher(hardwareMap);
        Gate gate = new Gate(hardwareMap);

        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.a) {
                chassis.drive(1, 0, 0);
            }
            else if (gamepad1.b) {
                chassis.drive(0, 1, 0);
            }
            else if (gamepad1.x) {
                chassis.drive(0, 0, 1);
            }
            else{
                chassis.drive(0,0,0);
            }
        }
    }
}
