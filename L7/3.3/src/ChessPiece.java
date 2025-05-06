public interface ChessPiece
{
    boolean MovePiece(int newCoordX, int newCoordY, ChessPiece[][] board);

    int GetCoordX();

    int GetCoordY();

    void SetCoordinates(int newCoordX, int newCoordY);

    String GetPieceName();
}