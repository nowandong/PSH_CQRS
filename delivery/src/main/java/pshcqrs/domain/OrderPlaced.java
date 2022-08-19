package pshcqrs.domain;

import java.util.*;
import lombok.*;
import pshcqrs.domain.*;
import pshcqrs.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private String productName;
    private String orderStatus;
    // keep

}
