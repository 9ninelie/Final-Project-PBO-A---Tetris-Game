package main;

import logic.boardSimple;
import logic.clearBaris;
import logic.downData;
import logic.tampilData;
import logic.event.evenMove;
import logic.event.inputEventListener;

public class gameController implements inputEventListener {

    private boardSimple board = new boardSimple(10, 26);
    private final guiController viewController;

    public gameController(guiController c){
        this.viewController = c;
        this.viewController.setEventListener(this);
        board.membuatNewBrick();
        this.viewController.initGameView(board.getBoardMatrix(), board.getTampilData());
        this.viewController.bindScore(board.getSkor().skorProperty());
    }

    @Override
    public downData onDownEvent(evenMove event) {
        boolean bisaGerak = board.moveBrickDown();
        clearBaris clear = null;
        if(!bisaGerak){
            board.mergeBrickToBackground();
            clear = board.clearBaris();
            if(clear.getLinesRemoved() > 0 ){
                board.getSkor().add(clear.getScoreBonus());
            }
            if(board.membuatNewBrick()){
                viewController.gameOverPanel();
            }
        }
        viewController.refreshGameBackground(board.getBoardMatrix());
        return new downData(clear, board.getTampilData());
    }

    @Override
    public tampilData onLeftEvent(){
        board.moveBrickLeft();
        return board.getTampilData();
    }
    @Override
    public tampilData onRightEvent(){
        board.moveBrickRight();
        return board.getTampilData();
    }
    @Override
    public tampilData onRotateEvent(){
        board.rotateBrickLeft();
        return board.getTampilData();
    }
}
