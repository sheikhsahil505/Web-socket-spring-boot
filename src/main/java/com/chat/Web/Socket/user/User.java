package com.chat.Web.Socket.user;

import com.chat.Web.Socket.enu.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    private String nickName;
    private String fullName;
    private Status status;
}
