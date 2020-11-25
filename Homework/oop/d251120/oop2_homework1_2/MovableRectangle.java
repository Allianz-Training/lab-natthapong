package oop.d251120.oop2_homework1_2;

public class MovableRectangle implements Movable {
  private MovablePoint topLeft;
  private MovablePoint bottomRight;

  public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
    this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
    this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }

  @Override
  public void moveUp() {
    // TODO Auto-generated method stub
    topLeft.moveUp();
    bottomRight.moveUp();
  }

  @Override
  public void moveDown() {
    // TODO Auto-generated method stub
    topLeft.moveDown();
    bottomRight.moveDown();
  }

  @Override
  public void moveLeft() {
    // TODO Auto-generated method stub
    topLeft.moveLeft();
    bottomRight.moveLeft();
  }

  @Override
  public void moveRight() {
    // TODO Auto-generated method stub
    topLeft.moveRight();
    bottomRight.moveRight();
  }
}
