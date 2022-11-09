package com.continew.uniqbackend.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Data {
	private String did;
	private String title;
	private String type;
	@JsonProperty
	private List<Content> content;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Content> getContent() {
		return content;
	}
	public void setContent(List<Content> content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "{" +
				"\"did\": \"" + did + '\"' +
				", \"title\": \"" + title + '\"' +
				", \"type\": \"" + type + '\"' +
				", \"content\": " + content +
				'}';
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}
}
