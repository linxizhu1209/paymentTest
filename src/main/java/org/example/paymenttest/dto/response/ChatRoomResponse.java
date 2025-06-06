package org.example.paymenttest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatRoomResponse {
    private String roomId;
    private String sender;
    private String lastMessage;
    private LocalDateTime lastMessageTime;



}
