package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Chassis {
    private final DcMotor frontLeft;
    private final DcMotor backLeft;
    private final DcMotor frontRight;
    private final DcMotor backRight;

    public Chassis(HardwareMap hm) {
        frontLeft = hm.dcMotor.get("frontLeft");
        backLeft = hm.dcMotor.get("backLeft");
        frontRight = hm.dcMotor.get("frontRight");
        backRight = hm.dcMotor.get("backRight");
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void drive(double x, double y, double rot) {
        setAll(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rot), 1);
        double frontLeftPower = (y + x + rot) / denominator;
        double backLeftPower = (y - x + rot) / denominator;
        double frontRightPower = (y - x - rot) / denominator;
        double backRightPower = (y + x - rot) / denominator;

        frontLeft.setPower(frontLeftPower);
        backLeft.setPower(backLeftPower);
        frontRight.setPower(frontRightPower);
        backRight.setPower(backRightPower);
    }

    public void wheelTest(double frontLeftPower, double frontRightPower, double backLeftPower, double backRightPower) {
        frontLeft.setPower(frontLeftPower);
        backLeft.setPower(backLeftPower);
        frontRight.setPower(frontRightPower);
        backRight.setPower(backRightPower);

    }

    public void goForward(int distance) {
        setAll(DcMotor.RunMode.RUN_TO_POSITION);
        frontLeft.setTargetPosition(frontLeft.getCurrentPosition() + distance);
        frontLeft.setPower(1);
        frontRight.setTargetPosition(frontRight.getCurrentPosition() + distance);
        frontRight.setPower(1);
        backLeft.setTargetPosition(backLeft.getCurrentPosition() + distance);
        backLeft.setPower(1);
        backRight.setTargetPosition(backRight.getCurrentPosition() + distance);
        backRight.setPower(1);

        while (frontLeft.isBusy()) {

        }
    }
    public void setAll(DcMotor.RunMode mode) {
        frontLeft.setMode(mode);
        backLeft.setMode(mode);
        frontRight.setMode(mode);
        frontLeft.setMode(mode);
    }
}
