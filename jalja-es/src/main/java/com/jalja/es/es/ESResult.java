package com.jalja.es.es;

import java.util.List;

public class ESResult {
	private long total;
	private List<?> lists;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getLists() {
		return lists;
	}
	public void setLists(List<?> lists) {
		this.lists = lists;
	}
	
}
