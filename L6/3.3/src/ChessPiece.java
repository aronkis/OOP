public abstract class ChessPiece
{
    protected String pieceName_;
    protected int coordX_;
    protected int coordY_;

    public ChessPiece(String pieceName, int coordX, int coordY)
    {
        this.pieceName_ = pieceName;
        this.coordX_ = coordX;
        this.coordY_ = coordY;
    }

    public abstract boolean MovePiece(int newCoordX, int newCoordY, ChessPiece[][] board);

    public int GetCoordX()
    {
        return coordX_;
    }

    public int GetCoordY()
    {
        return coordY_;
    }

    public void SetCoordinates(int newCoordX, int newCoordY)
    {
        this.coordX_ = newCoordX;
        this.coordY_ = newCoordY;
    }

    public String GetPieceName()
    {
        return pieceName_;
    }
}
