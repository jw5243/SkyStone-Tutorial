package org.firstinspires.ftc.teamcode.main;

import org.firstinspires.ftc.teamcode.debugging.IllegalMessageTypeException;
import org.firstinspires.ftc.teamcode.debugging.RobotDebug;
import org.firstinspires.ftc.teamcode.lib.geometry.Pose2d;

public abstract class Robot implements RobotDebug {
    private static boolean isUsingComputer = true;

    @Override
    public void init_debug() {

    }

    @Override
    public void start_debug() {

    }

    @Override
    public void loop_debug() throws IllegalMessageTypeException {

    }

    @Override
    public void sendMotionProfileData() {

    }

    @Override
    public Pose2d getFieldPosition() {
        return new Pose2d();
    }

    public static boolean isUsingComputer() {
        return isUsingComputer;
    }

    public static void setUsingComputer(boolean usingComputer) {
        isUsingComputer = usingComputer;
    }
}
