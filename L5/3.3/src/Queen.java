public class Queen {
    private String color_;
    private int x_, y_;

    public Queen(String color, int x, int y) 
    {
        this.color_ = color;
        this.x_ = x;
        this.y_ = y;
    }

    public boolean IsValidMove(int newX, int newY, TablaSah board) 
    {
        if (x_ == newX) 
        { 
            for (int i = Math.min(y_, newY) + 1; i < Math.max(y_, newY); i++) 
            {
                if (!board.IsEmpty(x_, i)) 
                {
                    return false; 
                }
            }
            return true;
        }

        if (y_ == newY) 
        { 
            for (int i = Math.min(x_, newX) + 1; i < Math.max(x_, newX); i++) 
            {
                if (!board.IsEmpty(i, y_)) 
                {
                    return false; 
                }
            }
            return true;
        }

        if (Math.abs(x_ - newX) == Math.abs(y_ - newY)) 
        {
            int dx = newX > x_ ? 1 : -1;
            int dy = newY > y_ ? 1 : -1;
            int i = x_ + dx;
            int j = y_ + dy;
            while (i != newX && j != newY) 
            {
                if (!board.IsEmpty(i, j)) 
                {
                    return false;
                }
                i += dx;
                j += dy;
            }
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
