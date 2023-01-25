package projawslevelstreet.domain;

import projawslevelstreet.domain.*;
import projawslevelstreet.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private Integer qty;

    public StockIncreased(Stock aggregate){
        super(aggregate);
    }
    public StockIncreased(){
        super();
    }
}
