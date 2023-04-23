package shop.mtcoding.administrator_layout.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.administrator_layout.modules.user.entity.User;
import shop.mtcoding.administrator_layout.service.UserService;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

}
