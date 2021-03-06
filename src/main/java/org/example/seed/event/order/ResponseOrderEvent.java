package org.example.seed.event.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.seed.domain.Order;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by PINA on 22/05/2017.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class ResponseOrderEvent {
    private Order order;
}
