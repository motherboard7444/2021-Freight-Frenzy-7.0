package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.HardwareFreightFrenzy;
//right wobble third square
@Autonomous (name = "AutoRed5")
public class AutoRed5 extends LinearOpMode {
    HardwareFreightFrenzy Gerty =  new HardwareFreightFrenzy();
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
        //strafe right
        Gerty.DriveSideways(.5,1000,1,1,1,1);
        Thread.sleep(1000);

        Gerty.DriveStraight(1,5000,1);
        Thread.sleep(5000);

        Gerty.DriveStraight(1,2000,-1);
        Thread.sleep(2000);


    }
}
