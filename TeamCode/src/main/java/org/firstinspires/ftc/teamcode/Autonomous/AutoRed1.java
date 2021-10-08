package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.HardwareFreightFrenzy;

//just parking on launch line
@Autonomous (name = "AutoRed1")
public class AutoRed1 extends LinearOpMode {
    HardwareFreightFrenzy Gerty = new HardwareFreightFrenzy();

    @Override
    public void runOpMode() throws InterruptedException {

        System.out.println("Starting up");
        telemetry.addData("init pressed", "about to initialize");
        telemetry.update();

        System.out.println("Initialize Robot");
        Gerty.InitializeRobot(hardwareMap);
        System.out.println("Robot Initialized");

        telemetry.addData("Status", "Ready!");

        telemetry.update();

        waitForStart();
        Gerty.DriveStraight(1,500,1);

        Thread.sleep(5000);


    }
}
