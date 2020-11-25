package oop.d251120.oop2_homework1_2;

public class MovableCircle implements Movable {
  private int radius;
  private MovablePoint center;

  public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
    this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    this.radius = radius;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }

  @Override
  public void moveUp() {
    center.moveUp();
  }

  @Override
  public void moveDown() {
    center.moveDown();
  }

  @Override
  public void moveLeft() {
    center.moveLeft();
  }

  @Override
  public void moveRight() {
    center.moveRight();
  }

  public static void main(String[] args) {
    MovableCircle mc = new MovableCircle(7, 10, 5, 9, 100);
    System.out.println(mc.center.x + " " + mc.center.y);

    mc.moveUp();
    System.out.println(mc.center.x + " " + mc.center.y);
  }
}
