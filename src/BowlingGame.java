import java.security.PublicKey;

public class BowlingGame
{
    private int rollNumber = 0;
    private int[] rolls = new int[21];

    public void roll(int pinsDown)
    {
        rolls[rollNumber] = pinsDown;
        rollNumber++;
    }

    public void roll(int ... rolls)
    {
        for (int pinsDown : rolls)
        {
            roll(pinsDown);
        }
    }

    public int score()
    {
        int score = 0;
        int cursor = 0;

        for (int frame = 0; frame < 10; frame++)
        {

            if (isSpare(cursor))
            {
                score = score + rolls[cursor] + rolls[cursor + 1] + rolls[cursor+2];
            }
            else
            {
                score = score + rolls[cursor] + rolls[cursor + 1];
            }
            cursor += 2;
        }

        return score;
    }

    public boolean isSpare(int cursor)
    {
        return rolls[cursor] + rolls[cursor+1] == 10;
    }
}
