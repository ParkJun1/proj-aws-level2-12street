package projawslevelstreet.domain;

import projawslevelstreet.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Ordered extends AbstractEvent {

    private Long id;
    private String address;
    private Long productId;
    private Integer qty;
    private String status;
    private String customerId;
}
