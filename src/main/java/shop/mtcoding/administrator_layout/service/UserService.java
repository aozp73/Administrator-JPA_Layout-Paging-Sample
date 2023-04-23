package shop.mtcoding.administrator_layout.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.administrator_layout.modules.user.entity.User;
import shop.mtcoding.administrator_layout.modules.user.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Page<User> getUserList(Pageable pageable) {

        return userRepository.findAll(pageable);
    }

    public Page<User> getUserListByEmailContaining(String email, Pageable pageable) {
        return userRepository.findByEmailContaining(email, pageable);
    }
}
