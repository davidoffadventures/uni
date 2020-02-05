public class Mark {

    private int gMark;
    private String gModule;

    public Mark(String module, int mark) {
        setMark(mark);
        setModule(module);
    }


    public int getMark() {
        return gMark;
    }
    public String getModule() {
        return gModule;
    }
    public void setMark(int mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException();
        }
        gMark = mark;
    }

    public void setModule(String module) {
        gModule = module;
    }
}