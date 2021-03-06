package com.qad.form;

import java.util.List;

@SuppressWarnings("unchecked")
public class ListPageLoader<Content> implements PageLoader<Content>{

	List<?> list;
	
	PageManager<Content> pager;
	
	public ListPageLoader(List<?> list){
		this.list=list;
		pager=new PageManager<Content>(this,1,0);//start from 0
	}
	
	@Override
	public boolean loadPage(int pageNo, int pageSize) {
		pager.notifyPageLoad(LOAD_COMPLETE, pageNo, list.size()-1, (Content) list.get(pageNo));
		return true;
	}

	@Override
	public PageManager<Content> getPager() {
		return pager;
	}
	
}
