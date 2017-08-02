package com.oversea.task.service;

import com.oversea.task.obj.Task;
import com.oversea.task.obj.TaskResult;

public interface TaskService {

	public TaskResult orderService(Task task);//下单
	
	public TaskResult shipService(Task task);//爬物流
	
	public TaskResult giftService(Task task);//礼品卡
	
	public TaskResult burshOrderService(Task task);//刷单
	
	public TaskResult burshShipService(Task task);//刷单爬物流
	
	public TaskResult CheckGiftCard(Task task);//爬去礼品卡余额
}
