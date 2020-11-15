package part6;

public class MovableRectangle extends Rectangle {
    private MovablePoint point1;
    private MovablePoint point2;
    public MovableRectangle(int length, int width, int xSpeed, int ySpeed) {
        super(length,width);
        point1 = new MovablePoint(0,0,xSpeed,ySpeed);
        point2 = new MovablePoint(length,width,xSpeed,ySpeed);
    }

    public boolean Check() {
        return (point1.xSpeed == point2.xSpeed) && (point1.ySpeed == point2.ySpeed);
    }

    public void moveUp() {
        this.point1.moveUp();
        this.point2.moveUp();
    }
    public void moveDown() {
        this.point1.moveDown();
        this.point2.moveDown();
    }
    public void moveLeft() {
        this.point1.moveLeft();
        this.point2.moveLeft();
    }
    public void moveRight() {
        this.point1.moveRight();
        this.point2.moveRight();
    }

}
