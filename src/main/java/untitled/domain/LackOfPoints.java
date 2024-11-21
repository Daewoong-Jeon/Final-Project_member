package untitled.domain;

import untitled.domain.*;
import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class LackOfPoints extends AbstractEvent {

    private String id;
    private Integer rentalPoint;

    public LackOfPoints(Member aggregate) {
        super(aggregate);
    }

    public LackOfPoints() {
        super();
    }
}
//>>> DDD / Domain Event