public class Knight 
{
    private String color_;
    private int x_, y_;

    public Knight(String color, int x, int y) 
    {
        this.color_ = color;
        this.x_ = x;
        this.y_ = y;
    }

    public boolean IsValidMove(int newX, int newY, TablaSah board) 
    {
        int dx = Math.abs(x_ - newX);
        int dy = Math.abs(y_ - newY);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }

    public int GetX() 
    {
        return x_;
    }

    public int GetY() 
    {
        return y_;
    }

    public void SetPosition(int newX, int newY) 
    {
        this.x_ = newX;
        this.y_ = newY;
    }
}
