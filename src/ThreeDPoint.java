public class ThreeDPoint extends Point {
    private int z;

    public ThreeDPoint(String label, int x, int y, int z) {
        super(label, x, y);
        this.z = z;
    }

    public boolean equals(Point point2) {
        if (!(point2 instanceof ThreeDPoint)) {
            return false;
        }

        ThreeDPoint newObj = (ThreeDPoint) point2;

        if (super.equals(newObj) && z == newObj.z) {
            return true;
        }
        return false;
    }
}