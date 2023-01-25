package projawslevelstreet.domain;

import projawslevelstreet.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class ShippingCanceled extends AbstractEvent {

    private Long id;
    private String address;
    private Integer qty;
    private Integer productId;
    private Integer orderId;
    private String status;
}
