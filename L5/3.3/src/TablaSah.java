public class TablaSah 
{
    public TablaSah() 
    {
        for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
                board_[i][j] = null;
            }
        }
    }

    public void PlacePiece(String piece, int fromX, int fromY, int toX, int toY) 
    {
        if (board_[fromX][fromY] != null) 
        {
            board_[fromX][fromY] = null;
        }

        board_[toX][toY] = piece;
    }

    public boolean IsValidMove(int x, int y) 
    {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    public boolean IsEmpty(int x, int y) 
    {
        return board_[x][y] == null;
    }

    public boolean MovePiece(int fromX, int fromY, int toX, int toY, String piece) 
    {
        if (!IsValidMove(toX, toY)) 
        {
            return false; 
        }

        if (!IsEmpty(toX, toY) && !board_[toX][toY].equals(piece)) 
        {
            return false; 
        }

        PlacePiece(piece, fromX, fromY, toX, toY); 
        return true;
    }

    public void PrintBoard() 
    {
        for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
                if (board_[i][j] == null) 
                {
                    System.out.print(". ");
                } else 
                {
                    System.out.print(board_[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private String[][] board_ = new String[8][8];
}
