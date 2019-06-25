package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("ROCK"), PAPER("PAPER"), SCISSOR("SCISSOR");
    private String stringValue;

    RockPaperScissorHandSign(String stringValue){
        this.stringValue = stringValue;
    }

    public RockPaperScissorHandSign getWinner() {
        if (this.stringValue.equals("ROCK")) return RockPaperScissorHandSign.valueOf("PAPER");
        if (this.stringValue.equals("PAPER")) return RockPaperScissorHandSign.valueOf("SCISSOR");
        else return RockPaperScissorHandSign.valueOf("ROCK");
    }

    public RockPaperScissorHandSign getLoser() {
        if (this.stringValue.equals("ROCK")) return RockPaperScissorHandSign.valueOf("SCISSOR");
        if (this.stringValue.equals("PAPER")) return RockPaperScissorHandSign.valueOf("ROCK");
        else return RockPaperScissorHandSign.valueOf("PAPER");
    }
}
