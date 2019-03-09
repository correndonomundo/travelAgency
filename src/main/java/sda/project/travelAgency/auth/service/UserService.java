package sda.project.travelAgency.auth.service;


import sda.project.travelAgency.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
