package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp
public class DriveTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        Chassis chassis = new Chassis(hardwareMap);

        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.a){
                chassis.wheelTest(1,0,0,0);
            }
            else if (gamepad1.b){
                chassis.wheelTest(0,1,0,0);
            }
            else if (gamepad1.x){
                chassis.wheelTest(0,0,1,0);
            }
            else if (gamepad1.y){
                chassis.wheelTest(0,0,0,1);
            }
            else{
                chassis.wheelTest(0,0,0,0);
            }
        }
    }
}
