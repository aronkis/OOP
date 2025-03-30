public class Rook extends ChessPiece
{

    public Rook(String pieceName, int coordX, int coordY)
    {
        super(pieceName, coordX, coordY);
    }

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
        return false;
    }
}
