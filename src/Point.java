public class Point {
    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public boolean equals(Point point2) {
        if (point2 == null) {
            return false;
        }

        if (x == point2.x && y == point2.y) {
            return true;
        }
        return false;
    }

    public String toString() {
         return label + " is at x = " + x + ", y = " + y;
    }
}
