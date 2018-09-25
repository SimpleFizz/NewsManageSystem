package com.guigu.pojo;

import java.util.List;

public class Page<T> {
	
	//已知数据
    private int pageNum;    //当前页,从请求那边传过来。
    private int pageSize = 3;    //每页显示的数据条数。
    private long totalRecord;    //总的记录条数。查询数据库得到的数据
    //需要计算得来
    private int totalPage;    //总页数，通过totalRecord和pageSize计算可以得来
    //将每页要显示的数据放在list集合中
    private List<T> list;
    private int start;//从第几条数据开始查  limit  start ,pageSize
    public Page(long totalRecord,int pageNum) {
    	this.totalRecord = totalRecord;
    	//计算一共有多少页
    	totalPage = (int) ((totalRecord%pageSize==0)?(totalRecord/pageSize):(totalRecord/pageSize+1));
    	if(pageNum<=0) {
    		pageNum=1;
    	}else if(pageNum>totalPage) {
    		pageNum = totalPage;
    	}
    	this.pageNum = pageNum;
    	start = (pageNum-1)*pageSize;
		
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}

}
