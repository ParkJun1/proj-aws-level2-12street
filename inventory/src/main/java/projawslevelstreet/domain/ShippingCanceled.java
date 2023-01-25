package projawslevelstreet.domain;

import projawslevelstreet.domain.*;
import projawslevelstreet.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class ShippingCanceled extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private Integer productId;
    private Integer orderId;
    private String status;
}


