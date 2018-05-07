package com.jzw.common;

import java.io.Serializable;
import java.util.List;

/**
 * 分页通用类<br>
 * @author yyl
 * @time 2017年5月24日上午10:37:26
 * @version 1.0
 */
public class Pager<T> implements Serializable {

    private static final long serialVersionUID = 4542617637761955078L;

    /**
     * currentPage 当前页
     */
    private int currentPage = 1;
    
    /**
     * 从第一条数据开始 默认是0
     */
    private int offset = 0;
    
    /**
     * pageSize 每页大小
     */
    private int pageSize = 10;
    /**
     * pageTotal 总页数
     */
    private int pageTotal;
    /**
     * recordTotal 总条数
     */
    private int recordTotal = 0;
    /**
     * previousPage 前一页
     */
    private int previousPage;
    /**
     * nextPage 下一页
     */
    private int nextPage;
    /**
     * firstPage 第一页
     */
    private int firstPage = 1;
    /**
     * lastPage 最后一页
     */
    private int lastPage;
    /**
     * content 每页的内容
     */
    private List<T> content;
    
    public int getOffset() {
		return offset;
	}
    
    public void setOffset(int currentPage) {
		this.offset = (currentPage -1)*pageSize;
	}

	/**
     * 设置当前页 <br>
     * 
     * @param currentPage
     */
    public void setCurrentPage(int currentPage) {
    	setOffset(currentPage);
        this.currentPage = currentPage;
    }

    /**
     * 设置每页大小,也可以不用赋值,默认大小为10条 <br>
     * 
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 设置总条数,默认为0 <br>
     * 
     * @param recordTotal
     */
    public void setRecordTotal(int recordTotal) {
        this.recordTotal = recordTotal;
        otherAttr();
    }

    /**
     * 设置分页内容 <br>
     * 
     * @param content
     */
    public void setContent(List<T> content) {
        this.content = content;
    }

    /**
     * 设置其他参数
     * 
     */
    public void otherAttr() {
        // 总页数
        this.pageTotal = this.recordTotal % this.pageSize > 0 ? this.recordTotal / this.pageSize + 1 : this.recordTotal / this.pageSize;
        // 第一页
        this.firstPage = 1;
        // 最后一页
        this.lastPage = this.pageTotal;
        // 前一页
        if (this.currentPage > 1) {
            this.previousPage = this.currentPage - 1;
        } else {
            this.previousPage = this.firstPage;
        }
        // 下一页
        if (this.currentPage < this.lastPage) {
            this.nextPage = this.currentPage + 1;
        } else {
            this.nextPage = this.lastPage;
        }
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getPageTotal() {
        return pageTotal;
    }

    public int getRecordTotal() {
        return recordTotal;
    }

    public int getPreviousPage() {
        return previousPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public int getFirstPage() {
        return firstPage;
    }

    public int getLastPage() {
        return lastPage;
    }

    public List<T> getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Pager [currentPage=" + currentPage + ", pageSize=" + pageSize
                + ", pageTotal=" + pageTotal + ", recordTotal=" + recordTotal
                + ", previousPage=" + previousPage + ", nextPage=" + nextPage
                + ", firstPage=" + firstPage + ", lastPage=" + lastPage
                + ", content=" + content + "]";
    }
    
    

}