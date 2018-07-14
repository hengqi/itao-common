package com.itao.common.result;

import java.util.List;

public class EasyUIDataGridResult {
	private long total;   // 总条数
	private List<?> rows; // 一页的数据列表

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}
}
