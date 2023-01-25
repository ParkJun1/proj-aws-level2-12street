package projawslevelstreet.domain;

import projawslevelstreet.domain.*;
import projawslevelstreet.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class ShippingCanceled extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private Integer productId;
    private Integer orderId;
    private String status;

    public ShippingCanceled(Shipping aggregate){
        super(aggregate);
    }
    public ShippingCanceled(){
        super();
    }
}
