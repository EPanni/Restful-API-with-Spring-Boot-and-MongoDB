package com.panni.restfulapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panni.restfulapi.domain.User;
import com.panni.restfulapi.dto.UserDTO;
import com.panni.restfulapi.repositories.UserRepository;
import com.panni.restfulapi.services.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;
    
    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){

        Optional<User> user = repo.findById(id);
        if (user.isEmpty()){
            throw new ObjectNotFoundException(id);
        }
        return user.get();
    }

    public User insert (User user){

        return repo.insert(user);
    }
    

    public User fromDTO(UserDTO userDTO){

        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());

    }

    public void delete(String id){
        findById(id);
        repo.deleteById(id);
    }

    public User update (User user){
        User newObj = findById(user.getId());
        newObj.setEmail(user.getEmail());
        newObj.setName(user.getName());
        repo.save(newObj);
        return newObj;
        }
}
