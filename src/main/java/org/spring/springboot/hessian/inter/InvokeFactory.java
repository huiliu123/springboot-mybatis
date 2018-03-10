package org.spring.springboot.hessian.inter;

import java.util.Map;

public class InvokeFactory {
	private Map<String, InvokeInterface> invokeMap;
	


	public Map<String, InvokeInterface> getInvokeMap() {
		return invokeMap;
	}



	public void setInvokeMap(Map<String, InvokeInterface> invokeMap) {
		this.invokeMap = invokeMap;
	}



	/**
	 * ���ݷ�������ȡ ��Ӧ��ʵ��
	 */
	public InvokeInterface getInvoke(String key) {
		return invokeMap.get(key);
	}
}
