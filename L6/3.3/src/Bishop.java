public class Bishop extends ChessPiece 
{

    public Bishop(String pieceName, int coordX, int coordY) 
    {
        super(pieceName, coordX, coordY);
    }

    public boolean MovePiece(int newCoordX, int newCoordY, ChessPiece[][] board) 
    {
        if (Math.abs(newCoordX - coordX_) == Math.abs(newCoordY - coordY_)) 
        {
            int dx = (newCoordX > coordX_) ? 1 : -1;
            int dy = (newCoordY > coordY_) ? 1 : -1;
            for (int x = coordX_ + dx, y = coordY_ + dy; x != newCoordX && y != newCoordY; x += dx, y += dy) 
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
}
