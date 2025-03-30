public class King 
{
    private String color_;
    private int x_, y_;

    public King(String color, int x, int y) 
    {
        this.color_ = color;
        this.x_ = x;
        this.y_ = y;
    }

    public boolean IsValidMove(int newX, int newY, TablaSah board) 
    {
        if (Math.abs(x_ - newX) <= 1 && Math.abs(y_ - newY) <= 1) 
        {
            return true;
        }

        return false; 
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
