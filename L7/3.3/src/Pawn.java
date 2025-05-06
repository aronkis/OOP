public class Pawn implements ChessPiece 
{
    private String pieceName_;
    private int coordX_;
    private int coordY_;

    public Pawn(String pieceName, int coordX, int coordY) 
    {
        this.pieceName_ = pieceName;
        this.coordX_ = coordX;
        this.coordY_ = coordY;
    }

    @Override
    public boolean MovePiece(int newCoordX, int newCoordY, ChessPiece[][] board) 
    {
        if (newCoordY == coordY_ && newCoordX == coordX_ + 1)
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
