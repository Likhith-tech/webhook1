package com.zkteco.webhoook.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "event", "event_ts", "payload"})
public class WebhookEventDTO  implements Serializable {

	private static final long serialVersionUID = 3367709399381371875L;
		
	@JsonProperty("event")
	private String event;
	
	@JsonProperty("event_ts")
	private Long eventTs;
	
	
	@JsonProperty("payload")
	private Payload payload; 
		
	@Data
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({ "account_id", "object"})
	public class Payload implements Serializable {

		private static final long serialVersionUID = 3367709399381371875L;
		
		@JsonProperty("account_id")
		private String accountId;
		
		@JsonProperty("object")
		private UserDetails object;
		
		@Data
		@JsonInclude(JsonInclude.Include.NON_NULL)
		@JsonPropertyOrder({ "id", "first_name", "last_name", "email", "type"})
		public class UserDetails implements Serializable {

			private static final long serialVersionUID = 3367709399381371875L;
			
			@JsonProperty("id")
			private String id;
			
			@JsonProperty("first_name")
			private String firstName;
			
			@JsonProperty("last_name")
			private String lastName;
			
			@JsonProperty("email")
			private String email;
			
			@JsonProperty("type")
			private String type;
			
		}
		
	} 
		
}
