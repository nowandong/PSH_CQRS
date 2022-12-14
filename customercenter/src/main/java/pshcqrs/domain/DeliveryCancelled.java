package pshcqrs.domain;

import java.util.Date;
import lombok.Data;
import pshcqrs.infra.AbstractEvent;

@Data
public class DeliveryCancelled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long productId;
    private String productName;
    private String deliveryStatus;
}
