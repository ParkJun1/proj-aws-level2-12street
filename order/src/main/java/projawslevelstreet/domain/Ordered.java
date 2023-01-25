package projawslevelstreet.domain;

import projawslevelstreet.domain.*;
import projawslevelstreet.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String address;
    private Long productId;
    private Integer qty;
    private String status;
    private String customerId;

    public Ordered(Order aggregate){
        super(aggregate);
    }
    public Ordered(){
        super();
    }
}
