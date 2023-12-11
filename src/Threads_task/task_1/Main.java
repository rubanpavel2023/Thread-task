package Threads_task.task_1;

public class Main {

    static String name;

    public static void main(String[] args) {

        name = "Robot 1.0";
        Robot rob1 = getRobot(name);
        getRobotInfo(rob1);

        name = "Robot 2.0";
        Robot rob2 = getRobot(name);
        getRobotInfo(rob2);
    }

    private static Robot getRobot(String name) {
        return new Robot(name);
    }

    private static void getRobotInfo(Robot robot) {
        System.out.println(robot.getName() + " state: " + robot.getState());
        robot.start();
        System.out.println(robot.getName() + " state: " + robot.getState());
    }
}
