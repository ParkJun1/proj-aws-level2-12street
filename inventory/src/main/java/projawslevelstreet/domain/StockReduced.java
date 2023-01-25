package projawslevelstreet.domain;

import projawslevelstreet.domain.*;
import projawslevelstreet.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class StockReduced extends AbstractEvent {

    private Long id;
    private Integer qty;

    public StockReduced(Stock aggregate){
        super(aggregate);
    }
    public StockReduced(){
        super();
    }
}
