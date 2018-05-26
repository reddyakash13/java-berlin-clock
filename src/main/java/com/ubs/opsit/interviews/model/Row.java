package com.ubs.opsit.interviews.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Row {

    private List<Lamp> lamps;

    public Row(int numberOfLamps, Color color) {
        lamps = IntStream.range(0, numberOfLamps).mapToObj(count -> new Lamp(color)).collect(Collectors.toList());
    }

    public void turnOnLampsTill(int lampNumber) {
        for (int i=0; i< lamps.size(); i++){
            if (i < lampNumber) {
                lamps.get(i).turnOn();
            } else {
                lamps.get(i).turnOff();
            }
        }
    }

    public void chageColor(Color color, int... lampIndexes) {
        for (int index : lampIndexes) {
            lamps.get(index - 1).setColor(color);
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Lamp lamp : lamps) {
            sb.append(lamp.toString());
        }
        return sb.toString();
    }

    public List<Lamp> getLamps() {
        return lamps;
    }
}
