package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Gate {
    Servo servo;
    public Gate(HardwareMap hm){
        servo = hm.servo.get("gate");
    }
    public void liftGate(){
        servo.setPosition(1);
    }
    public void lowerGate(){
        servo.setPosition(0);
    }
}
