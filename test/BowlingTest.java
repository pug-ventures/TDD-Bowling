import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest
{

    private BowlingGame game;

    @BeforeEach
    public void setUp()
    {
        this.game = new BowlingGame();
    }

    @Test
    public void givenGutterGame_whenScore_thenReturn0()
    {
        game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertEquals(0, game.score());
    }

    @Test
    public void givenGameOfOnes_whenScore_thenReturn20()
    {
        game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertEquals(20, game.score());
    }

    @Test
    public void givenSpareAnd3_whenScore_thenReturn13()
    {
        game.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertEquals(16, game.score());
    }

    @Test
    public void givenStrike3And6_whenScore_thenReturn28() {
        game.roll(10,0, 3,6, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertEquals(28, game.score());
    }
}
