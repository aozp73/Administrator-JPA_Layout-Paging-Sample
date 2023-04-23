package shop.mtcoding.administrator_layout.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.administrator_layout.dto.AdmingLoginInDTO;
import shop.mtcoding.administrator_layout.handler.ex.CustomException;
import shop.mtcoding.administrator_layout.modules.user.entity.User;
import shop.mtcoding.administrator_layout.modules.user.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class EtcService {

    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public void 로그인(AdmingLoginInDTO loginDTO) {
        System.out.println("디버깅" + loginDTO.getEmail());
        User userPS = userRepository.findByEmail(loginDTO.getEmail()).orElseThrow(() -> {
            throw new CustomException("관리자 아이디를 확인하세요.", HttpStatus.UNAUTHORIZED);
        });

        if (!userPS.getRole().equals("ADMIN")) {
            throw new CustomException("관리자만 로그인할 수 있습니다", HttpStatus.UNAUTHORIZED);
        }

        if (!loginDTO.getPassword().equals(userPS.getPassword())) {
            throw new CustomException("관리자 암호를 확인하세요.", HttpStatus.UNAUTHORIZED);
        }
    }

}
