package projawslevelstreet.domain;

import projawslevelstreet.domain.*;
import projawslevelstreet.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String address;
    private Long productId;
    private Integer qty;
    private String status;
    private String customerId;
}


