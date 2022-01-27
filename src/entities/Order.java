package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private SimpleDateFormat sfd= new SimpleDateFormat ("dd/MM/yyyy");
	private Date moment;
	private OrderStatus status;
	Cliente client;
	private List<OrderItem> items = new ArrayList();

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Cliente client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Cliente getCliente() {
		return client;
	}

	public void setCliente(Cliente client) {
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void addItem(OrderItem quantity) {

		items.add(quantity);
	}

	public void removeItem(OrderItem quantity) {

		items.remove(quantity);
	}

	public Double total() {

		Double sum = 0.0;
		for (OrderItem it : items) {

			sum += it.subTotal();
		}

		return sum;
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sfd.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
}
