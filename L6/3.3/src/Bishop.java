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
            int x = coordX_ + dx;
            int y = coordY_ + dy;
            while (x != newCoordX && y != newCoordY)
            {
                if (board[x][y] != null)
                {
                    return false;
                }
                x += dx;
                y += dy;
            }
            SetCoordinates(newCoordX, newCoordY);
            return true;
        }
        return false;
    }
}
