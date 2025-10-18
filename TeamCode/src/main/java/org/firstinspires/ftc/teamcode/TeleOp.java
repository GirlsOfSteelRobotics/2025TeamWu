package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp

public class TeleOp extends LinearOpMode {


    @Override
    public void runOpMode() throws InterruptedException {
        Chassis chassis = new Chassis(hardwareMap);
        Intake intake = new Intake(hardwareMap);
        Launcher launcher = new Launcher(hardwareMap);
        Gate gate = new Gate(hardwareMap);

        waitForStart();
        while (opModeIsActive()) {
            chassis.drive(gamepad1.left_stick_x, -gamepad1.left_stick_y, gamepad1.right_stick_x);
            if (gamepad1.y) {
                intake.intake();
            } else if (gamepad1.b) {
                intake.outtake();
            } else {
                intake.stop();
            }
            if (gamepad1.x) {
                launcher.stupidShoot();
            } else {
                launcher.stop();
            }

            if (gamepad1.a) {
                gate.liftGate();
            }
            if (gamepad1.dpad_down) {
                gate.lowerGate();
            }


        }
    }

}
