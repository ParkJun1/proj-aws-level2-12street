package projawslevelstreet.domain;

import projawslevelstreet.domain.*;
import projawslevelstreet.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private Integer qty;
}


