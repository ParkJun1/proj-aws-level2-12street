package projawslevelstreet.domain;

import projawslevelstreet.domain.*;
import projawslevelstreet.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Shipped extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private Integer productId;
    private Integer orderId;
    private String status;

    public Shipped(Shipping aggregate){
        super(aggregate);
    }
    public Shipped(){
        super();
    }
}
