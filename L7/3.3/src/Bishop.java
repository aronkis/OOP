public class Bishop implements ChessPiece 
{
    private String pieceName_;
    private int coordX_;
    private int coordY_;

    public Bishop(String pieceName, int coordX, int coordY) 
    {
        this.pieceName_ = pieceName;
        this.coordX_ = coordX;
        this.coordY_ = coordY;
    }

    @Override
    public boolean MovePiece(int newCoordX, int newCoordY, ChessPiece[][] board) 
    {
        if (Math.abs(newCoordX - coordX_) == Math.abs(newCoordY - coordY_)) 
        {
            int dx = (newCoordX > coordX_) ? 1 : -1;
            int dy = (newCoordY > coordY_) ? 1 : -1;
            for (int x = coordX_ + dx, y = coordY_ + dy; x != newCoordX && 
                y != newCoordY; x += dx, y += dy) 
            {
                if (board[x][y] != null) 
                {
                    return false;
                }
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
