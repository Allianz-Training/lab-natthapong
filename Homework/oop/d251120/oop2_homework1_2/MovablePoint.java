package oop.d251120.oop2_homework1_2;

public class MovablePoint implements Movable {
  public int x;
  public int y;
  public int xSpeed;
  public int ySpeed;

  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    // TODO Auto-generated constructor stub
    this.x = x;
    this.y = y;
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }

  @Override
  public void moveUp() {
    this.y = y + ySpeed;
  }

  @Override
  public void moveDown() {
    this.y = y - ySpeed;
  }

  @Override
  public void moveLeft() {
    this.x = x - xSpeed;
  }

  @Override
  public void moveRight() {
    this.x = x + xSpeed;
  }
}
