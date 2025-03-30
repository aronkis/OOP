public class Pawn {
    private String color_;
    private int x_, y_;

    public Pawn(String color, int x, int y) 
    {
        this.color_ = color;
        this.x_ = x;
        this.y_ = y;
    }

    public boolean IsValidMove(int newX, int newY, TablaSah board) 
    {
        int direction = color_.equals("white") ? 1 : -1;

        if (x_ + direction == newX && y_ == newY && board.IsEmpty(newX, newY)) 
        {
            return true;
        }

        if (color_.equals("white") && x_ == 1 && x_ + 2 == newX && y_ == newY && board.IsEmpty(newX, newY)) 
        {
            return true;
        }

        if (color_.equals("black") && x_ == 6 && x_ - 2 == newX && y_ == newY && board.IsEmpty(newX, newY)) 
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
