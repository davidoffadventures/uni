public class Comp {

    private double gMark;
    private String gModule;

    public Mark(String module, double mark) {
        setMark(mark);
        setModule(module);
    }


    public double getMark() {
        return gMark;
    }
    public String getModule() {
        return gModule;
    }
    public void setMark(double mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException();
        }
        gMark = mark;
    }

    public void setModule(String module) {
        gModule = module;
    }
}