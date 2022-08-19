package pshcqrs.domain;

import java.util.Date;
import lombok.Data;
import pshcqrs.infra.AbstractEvent;

@Data
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private String productName;
    private String orderStatus;
}
