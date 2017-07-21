package com.oversea.task.enums;

public enum RabbitMqType {

	UPDATE_PRODUCT_STATUS("UPDATE_PRODUCT_STATUS_QUEUE","UPDATE_PRODUCT_STATUS_EXCHANGE","更新商品状态接口"),
    ;
	
    private String queue;
    private String exchange;
    private String name;
    
	private RabbitMqType(String queue, String exchange, String name) {
		this.queue = queue;
		this.exchange = exchange;
		this.name = name;
	}

	public String getQueue() {
		return queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
