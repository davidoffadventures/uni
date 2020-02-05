public class testMarkClass {

    public void test_Mark_module_constructor() {
        String expectedModule = "CSF100";
        Mark mark = new Mark("CSF100", 1);
        System.out.println("Module: " + expectedModule);
        System.out.println("Expected output -- Module: " + mark.getModule());
    }

    public void test_Mark_setModule() {
        String expectedModule = "WOWZAMOD";
        Mark marky = new Mark("CSF100", 1);
        marky.setModule("WOWZAMOD");
        System.out.println("Module: " + expectedModule);
        System.out.println("Expected output -- Module: " + marky.getModule());
    }

    public void test_Mark_setMark() {
        int expectedMark = 85;
        Mark marky = new Mark("CSF100", 1);
        marky.setMark(85);
        System.out.println("Mark: " + expectedMark);
        System.out.println("Expected output -- Mark: " + marky.getMark());
    }

    public void test_Mark_mark_constructor() {
        int expectedMark = 1;
        Mark marky = new Mark("CSF100", 1);
        System.out.println("Raw Mark: " + expectedMark);
        System.out.println("Expected output -- Raw Mark: " + marky.getMark());
    }
}