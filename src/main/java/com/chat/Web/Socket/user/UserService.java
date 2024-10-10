package com.chat.Web.Socket.user;

import com.chat.Web.Socket.enu.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        user.setStatus(Status.ONLINE);
        userRepository.save(user);
    }

    public void disconnect(User user) {
     var storedUser = userRepository.findById(user.getNickName())
             .orElse(null);
     if(storedUser!=null) {
         storedUser.setStatus(Status.OFFLINE);
         userRepository.save(storedUser);
     }
    }

    public List<User> findConnectedUser() {
       return  userRepository.findAllByStatus(Status.ONLINE);
    }
}
