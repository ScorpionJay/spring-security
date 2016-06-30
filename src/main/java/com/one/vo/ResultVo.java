package com.one.vo;

import java.io.Serializable;

/**
 * @author jay
 * @since 2016年6月30日
 */
public class ResultVo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * code 0: ok
	 */
	private Integer code = 0;

	/**
	 * return object
	 */
	private Object obj;

	public ResultVo(Integer code, Object obj) {
		super();
		this.code = code;
		this.obj = obj;
	}

	public ResultVo() {
		super();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "ResultVo [code=" + code + ", obj=" + obj + "]";
	}

}
