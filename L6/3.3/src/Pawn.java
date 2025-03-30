public class Pawn extends ChessPiece
{

    public Pawn(String pieceName, int coordX, int coordY)
    {
        super(pieceName, coordX, coordY);
    }

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
}
