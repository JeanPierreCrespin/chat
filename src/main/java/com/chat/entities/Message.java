package com.chat.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message {
	
    private String from;
    private String to;
    private String content;

    @Override
    public String toString() {
        return super.toString();
    }
}
