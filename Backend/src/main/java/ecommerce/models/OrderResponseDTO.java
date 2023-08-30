package ecommerce.models;

import java.util.List;

import ecommerce.entities.Order;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderResponseDTO {

	private Order order;
	
	private List<OrderDetailsDTO> details;
	
}
