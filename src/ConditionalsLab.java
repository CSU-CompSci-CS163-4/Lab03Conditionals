public class ConditionalsLab  {


    // Step 1, 2, 3
    /* Write self-explanation here
    * 
    */
    public static String laneCheck(int value) {
        if (value < 50) {
            return "Slow Lane";
        }
        if(value > 100) {
            return "Jail Lane";
        }
        if(value > 50) {
            return "Fast Lane";
        }

    }
    
    private static void testLaneCheck() {
        System.out.println("Testing laneCheck");
        String test1 = laneCheck(45);
        String test2 = laneCheck(50);
        String test3 = laneCheck(120);
        String test4 = laneCheck(60);
        System.out.printf("Test 1 should return Slow Lane: Returned: %s%n", test1);
        System.out.printf("Test 2 should return Slow Lane: Returned: %s%n", test2);
        System.out.printf("Test 3 should return Jail Time: Returned: %s%n", test3);
        System.out.printf("Test 4 should return Fast Lane: Returned: %s%n", test4);
        System.out.println();
    }


    // Step 4
    /*
     * Self explanation on reason for changes here
     * 
     */
    public static String streetLight1(String color) {
        if (color == "red") {
            return "Stop";
        }
        if (color == "yellow") {
            return "Slow";
        }
        if (color == "green") {
            return "Go";
        }
        return "ERROR";

    }

    private static void testStreetLight1() {
        System.out.println("Testing streetLight1");
        String test1 = streetLight1(new String("red"));
        String test2 = streetLight1(new String("yellow"));
        String test3 = streetLight1(new String("green"));
        String test4 = streetLight1("blue");
        // note we use the "new String()" above to force java to 
        // not use the same memory address
        System.out.printf("Test1 should return Stop: %b (%s)%n", 
            "Stop".equals(test1), test1);
        System.out.printf("Test2 should return Slow: %b (%s)%n", 
            "Slow".equals(test2), test2);
        System.out.printf("Test3 should return Go: %b (%s)%n", 
            "Go".equals(test3), test3);
        System.out.printf("Test4 should return ERROR: %b (%s)%n",
            "ERROR".equals(test4), test4);
        System.out.println();
    }

    

    public static String streetLight2A(String color) {
        String instruction = "Go";

        if (color.equalsIgnoreCase("red")) {
            instruction = "Stop";
        }
        if (color.equalsIgnoreCase("yellow")) {
            instruction = "Slow";
        }
        return instruction;
    }

    public static String streetLight2B(String color) {
        if (color.equalsIgnoreCase("red")) {
            return "Stop";
        }
        if (color.equalsIgnoreCase("yellow")) {
            return "Slow";
        }
        return "Go";
    }

    // STEP 5
    public static void testStreetLight2AB(){
        System.out.println("Testing streetLight2A");


        System.out.println();


        System.out.println("Testing streetLight2B");

        System.out.println();
    }


    public static String streetLight3(String color) {
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


    /**
     * The following main method is the entry point to your program.
     * We are using the main method simply to 'test' the code
     * in this file. A very common technique.
     * 
     * @param args
     */
    public static void main(String[] args) {
        testStreetLight1();
        testLaneCheck();
        testStreetLight2AB();
    }

}
