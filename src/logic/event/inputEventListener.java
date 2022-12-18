package logic.event;

import logic.downData;
import logic.tampilData;

public interface inputEventListener {

    downData onDownEvent(evenMove event);
    tampilData onLeftEvent();
    tampilData onRightEvent();
    tampilData onRotateEvent();
}
