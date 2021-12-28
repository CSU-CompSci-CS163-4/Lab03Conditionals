package Week3;

public class ConditionalsLab implements Conditionals {
    @Override
    public String streetLight1(String color) {
        if (color == "red") {
            return "Stop";
        }
        if (color == "yellow") {
            return "Slow";
        }
        if (color == "green") {
            return "Go";
        }

    }

    @Override
    public String streetLight2A(String color) {
        String instruction = "Go";

        if (color.equalsIgnoreCase("red")) {
            instruction = "Stop";
        }
        if (color.equalsIgnoreCase("yellow")) {
            instruction = "Slow";
        }
        return instruction;
    }

    @Override
    public String streetLight2B(String color) {
        if (color.equalsIgnoreCase("red")) {
            return "Stop";
        }
        if (color.equalsIgnoreCase("yellow")) {
            return "Slow";
        }
        return "Go";
    }

    @Override
    public String streetLight3(String color) {
        String instruction;

        if (color.equalsIgnoreCase("red")) {
            instruction = "Stop";
        } else if (color.equalsIgnoreCase("yellow")) {
            instruction = "Slow";
        } else if (color.equalsIgnoreCase("green")) {
            instruction = "Go";
        } else {
            instruction = "Invalid color";
        }
        return instruction;
    }
}
