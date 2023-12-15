package fr.nolan.app;

import com.github.bhlangonijr.chesslib.game.Game;
import com.github.bhlangonijr.chesslib.pgn.PgnHolder;

import java.util.ArrayList;
import java.util.List;

public class PgnChecker {

    private PgnHolder pgn;
    private List<Game> games;

    PgnChecker(String path) {
        this.pgn = new PgnHolder("src/test/resources/" + path);
    }

    public PgnHolder getPgn() {
        return pgn;
    }

    public void loadData() {
        try {
            this.pgn.loadPgn();
            this.games = new ArrayList<>(pgn.getGames());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void checkWhitePlayers() throws RuntimeException {
        checkGameNumber();
        this.games.forEach(game -> {
            if (game.getWhitePlayer().getName().isEmpty()) {
                throw new RuntimeException("Error: no white player in game " + game.getGameId());
            }
        });
    }

    public void checkBlackPlayers() throws RuntimeException {
        checkGameNumber();
        this.games.forEach(game -> {
            if (game.getBlackPlayer().getName().isEmpty()) {
                throw new RuntimeException("Error: no black player in game " + game.getGameId());
            }
        });
    }

    public void checkGameResults() throws RuntimeException {
        checkGameNumber();
        this.games.forEach(game -> {
            if (game.getResult().value().equals("ONGOING")) {
                throw new RuntimeException("Error: no final result in game " + game.getGameId());
            }
        });
    }

    public void checkGameNumber() {
        if (this.games.isEmpty()) throw new RuntimeException("Error: no valid game was found");
    }
}
