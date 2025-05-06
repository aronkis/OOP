public class Knight implements ChessPiece 
{
    private String pieceName_;
    private int coordX_;
    private int coordY_;

    public Knight(String pieceName, int coordX, int coordY) 
    {
        this.pieceName_ = pieceName;
        this.coordX_ = coordX;
        this.coordY_ = coordY;
    }

    @Override
    public boolean MovePiece(int newCoordX, int newCoordY, ChessPiece[][] board) 
    {
        int dx = Math.abs(newCoordX - coordX_);
        int dy = Math.abs(newCoordY - coordY_);
        if (dx * dy == 2) 
        {
            if (board[newCoordX][newCoordY] == null) 
            {
                SetCoordinates(newCoordX, newCoordY);
                return true;
            }
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