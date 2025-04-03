public class King extends ChessPiece 
{

    public King(String pieceName, int coordX, int coordY) 
    {
        super(pieceName, coordX, coordY);
    }

    public boolean MovePiece(int newCoordX, int newCoordY, ChessPiece[][] board) 
    {
        if (Math.abs(newCoordX - coordX_) <= 1 && Math.abs(newCoordY - coordY_) <= 1) 
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