public class Knight extends ChessPiece 
{

    public Knight(String pieceName, int coordX, int coordY) 
    {
        super(pieceName, coordX, coordY);
    }

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
}