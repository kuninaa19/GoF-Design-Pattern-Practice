package com.pattern.gof.mediator;

import java.util.Optional;

public class ATC implements Mediator {
    private Runway runway;
    private Plane plane;

    @Override
    public void takeOff() {
        if (plane == null || runway == null) {
            System.out.println("It's impossible");
            return;
        }
        if (!plane.isReady() && !runway.isReady()) {
            plane.readyCommand();
            runway.readyCommand();
            return;
        }

        if (!plane.isReady()) {
            plane.readyCommand();
            runway.waitCommand();
            return;
        }

        if (!runway.isReady()) {
            plane.waitCommand();
            runway.readyCommand();
            return;
        }

        runway.changeStatus(false);

        plane.takeOffCommand();
    }

    @Override
    public void setRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void setPlane(Plane plane) {
        this.plane = plane;
    }
}
