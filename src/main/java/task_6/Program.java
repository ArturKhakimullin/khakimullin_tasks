package task_6;

public class Program {
    private int length;
    private int width ;
    public Program( int l, int w) {
        this.length = l;
        this.width = w;
    }
    public boolean isSquare() {
        return length == width;

    }
}
