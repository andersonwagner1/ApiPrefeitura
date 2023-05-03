package br.com.prefeitura.diadema.dto;

import java.util.List;



public class TreeDto {
	Long key;
	String label;
	String data;
	String icon;
	List<TreeDto> children;
	public Long getKey() {
		return key;
	}
	public void setKey(Long key) {
		this.key = key;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public List<TreeDto> getChildren() {
		return children;
	}
	public void setChildren(List<TreeDto> children) {
		this.children = children;
	}
	
 
	

	
	
	
}
