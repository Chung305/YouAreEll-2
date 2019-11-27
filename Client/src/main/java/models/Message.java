package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

/*
 * POJO for an Message object
 */
public class Message {
    @JsonProperty("sequence")
    private String sequence;
    @JsonProperty("timestamp")
    private String timeStamp;
    @JsonProperty("fromid")
    private String fromId;
    @JsonProperty("toid")
    private String toId;
    @JsonProperty("mesage")
    private String message;


    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}