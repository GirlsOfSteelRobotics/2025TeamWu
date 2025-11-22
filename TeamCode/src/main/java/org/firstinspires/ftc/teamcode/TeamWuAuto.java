package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@com.qualcomm.robotcore.eventloop.opmode.Autonomous

public class TeamWuAuto extends LinearOpMode {


    @Override
    public void runOpMode() throws InterruptedException {
        Chassis chassis = new Chassis(hardwareMap);
        Intake intake = new Intake(hardwareMap);
        Launcher launcher = new Launcher(hardwareMap);

        waitForStart();




    }

}

