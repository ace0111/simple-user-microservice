package com.acedeveloper.app.ws.ui.model.response;

import java.sql.Date;

public class ErrorMessage {
private Date timestamp;
private String message;


public ErrorMessage(java.util.Date date,String message) {
	this.timestamp = (Date) date;
	this.message = message;
}


public Date getTimestamp() {
	return timestamp;
}
public void setTimestamp(Date timestamp) {
	this.timestamp = timestamp;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}

}
