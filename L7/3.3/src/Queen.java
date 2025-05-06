public class Queen implements ChessPiece 
{
    private String pieceName_;
    private int coordX_;
    private int coordY_;

    public Queen(String pieceName, int coordX, int coordY) 
    {
        this.pieceName_ = pieceName;
        this.coordX_ = coordX;
        this.coordY_ = coordY;
    }

    @Override
    public boolean MovePiece(int newCoordX, int newCoordY, ChessPiece[][] board) 
    {
        if (newCoordX == coordX_) 
        {
            for (int i = Math.min(coordY_, newCoordY) + 1; i < Math.max(coordY_, newCoordY); i++) 
            {
                if (board[coordX_][i] != null) 
                {
                    return false;
                }
            }
            SetCoordinates(newCoordX, newCoordY);
            return true;
        } 
        else if (newCoordY == coordY_) 
        {
            for (int i = Math.min(coordX_, newCoordX) + 1; i < Math.max(coordX_, newCoordX); i++) 
            {
                if (board[i][coordY_] != null) 
                {
                    return false;
                }
            }
            SetCoordinates(newCoordX, newCoordY);
            return true;
        } 
        else if (Math.abs(newCoordX - coordX_) == Math.abs(newCoordY - coordY_)) 
        {
            int xDirection = (newCoordX - coordX_) > 0 ? 1 : -1;
            int yDirection = (newCoordY - coordY_) > 0 ? 1 : -1;
            int x = coordX_ + xDirection;
            int y = coordY_ + yDirection;
            while (x != newCoordX && y != newCoordY) 
            {
                if (board[x][y] != null) 
                {
                    return false;
                }
                x += xDirection;
                y += yDirection;
            }
            SetCoordinates(newCoordX, newCoordY);
            return true;
        }
        return false;
    }

    @Override
    public int GetCoordX() 
    {
        return coordX_;
    }

    @Override
    public int GetCoordY() 
    {
        return coordY_;
    }

    @Override
    public void SetCoordinates(int newCoordX, int newCoordY) 
    {
        this.coordX_ = newCoordX;
        this.coordY_ = newCoordY;
    }

    @Override
    public String GetPieceName() 
    {
        return pieceName_;
    }
}