package kaua.com.br.chatserver.model;

import java.time.LocalDateTime;

import kaua.com.br.chatserver.enums.Status;

public class Message {

	private String senderName;

	private String receiverName;

	private String message;

	private LocalDateTime date;

	private Status status;

	public Message() {
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Message [senderName=" + senderName + ", receiverName=" + receiverName + ", message=" + message
				+ ", date=" + date + ", status=" + status + "]";
	}

}
