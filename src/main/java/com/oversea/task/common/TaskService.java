package com.oversea.task.common;

import com.oversea.task.obj.Task;
import com.oversea.task.obj.TaskResult;

public interface TaskService {

	public TaskResult orderService(Task task);//下单
	
	public TaskResult shipService(Task task);//爬物流
	
	public TaskResult giftService(Task task);//礼品卡
	
	public TaskResult burshOrderService(Task task);//刷单
	
	public TaskResult burshShipService(Task task);//刷单爬物流
	
	public TaskResult CheckGiftCard(Task task);//爬去礼品卡余额
	
	public TaskResult productOrderCheckService(Task task);//校验商品是否可以售卖
	
	public TaskResult manualOrder(Task task);//手动处理订单
	
	public TaskResult manualShip(Task task);//手动处理订单
	
	public TaskResult externalOrder(Task task);//第三方自动下单
	public TaskResult externalShip(Task task);//第三方自动爬物流
	public TaskResult skyxShip(Task task);
}
