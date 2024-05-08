package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class helloWorld extends OpMode {

    public DcMotor motor;
    public Servo servo;

    public void init() {
        telemetry.addData("Hello", "World");
        motor = hardwareMap.dcMotor.get("Hex Motor");
        servo = hardwareMap.servo.get("Servo");
    }

    @Override
    public void loop(){
        telemetry.addData("Motor Power", motor.getPower());

        if (gamepad1.a) {
            motor.setPower(1.0);
        } else if (gamepad1.y) {
            motor.setPower(0.5);
        } else {
            motor.setPower(0.0);
        }

        if (gamepad1.x) {
            servo.setPosition(1.0);
        } else if (gamepad1.b) {
            servo.setPosition(0.0);
        }
        telemetry.update();
    }
}