public class TestChessBoard
{
    public static void main(String[] args)
    {
        ChessPiece[][] board = new ChessPiece[8][8];

        board[1][0] = new Pawn("WP", 1, 0);
        board[0][0] = new Rook("WR", 0, 0);
        board[2][2] = new Bishop("WB", 2, 2);

        PrintBoard(board);

        MovePiece(board, "WP", 2, 0);
        MovePiece(board, "WR", 0, 5);
        MovePiece(board, "WB", 4, 4);

        PrintBoard(board);
    }

    public static void MovePiece(ChessPiece[][] board, String pieceName, int newCoordX, int newCoordY)
    {
        boolean moveSuccessful = false;
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                ChessPiece currentPiece = board[i][j];
                if (currentPiece != null && currentPiece.GetPieceName().equals(pieceName))
                {
                    if (currentPiece.MovePiece(newCoordX, newCoordY, board))
                    {
                        board[i][j] = null;
                        board[newCoordX][newCoordY] = currentPiece;
                        moveSuccessful = true;
                        break;
                    }
                }
            }
            if (moveSuccessful)
            {
                break;
            }
        }

        if (moveSuccessful)
        {
            System.out.println("Move successful: " + pieceName + " moved to (" + newCoordX + ", " + newCoordY + ")");
        }
        else
        {
            System.out.println("Invalid move: " + pieceName + " cannot move to (" + newCoordX + ", " + newCoordY + ")");
        }
    }

    public static void PrintBoard(ChessPiece[][] board)
    {
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (board[i][j] != null)
                {
                    System.out.print(board[i][j].GetPieceName() + " ");
                }
                else
                {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
