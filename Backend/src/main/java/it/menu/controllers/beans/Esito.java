package it.menu.controllers.beans;

import java.util.Arrays;

public class Esito {

	// Internal code
	private Integer code = 0;

	// Key for identifing the text of a static message
	private String target = null;

	// String arguments to be associated with the key
	private String[] args = null;

	public Esito(String target) {
		this.code = -1;
		this.target = target;
	}

	public Esito(Integer code, String target) {
		this.code = code;
		this.target = target;
	}

	public Esito(Integer code, String target, String[] args) {
		super();
		this.code = code;
		this.target = target;
		this.args = args;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String[] getArgs() {
		return args;
	}

	public void setArgs(String[] args) {
		this.args = args;
	}

	@Override
	public String toString() {
		return "Esito [code=" + code + ", target=" + target + ", args=" + Arrays.toString(args) + "]";
	}

	
}