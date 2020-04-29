package com.ewsd.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.ewsd.dto.PostCommentDto;
import com.ewsd.dto.PostDto;
import com.ewsd.model.Post;
import com.ewsd.service.PostService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ewsd.dto.UserDto;
import com.ewsd.enums.Role;
import com.ewsd.model.User;
import com.ewsd.repositories.UserRepository;
import com.ewsd.service.UserService;

@Controller
public class RootController {



    @Autowired
    PostService postService;
    @Autowired
    UserService userService;

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;



    public RootController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;

    }

//
//    @GetMapping("/")
//    public String root(Model model, Authentication authentication) {
//        var userName = authentication.getName();
//        org.springframework.security.core.userdetails.User authenticateduser = (org.springframework.security.core.userdetails.User) SecurityContextHolder
//                .getContext().getAuthentication().getPrincipal();
//        com.ewsd.model.User u = userService.getUserByName(authenticateduser.getUsername());
//        com.ewsd.model.User user = new com.ewsd.model.User();
//        model.addAttribute("user", u);
//        model.addAttribute("username", userName);
//        return "index2";
//    }





    @RequestMapping(value = "/",  method = RequestMethod.GET)
    public String root(Model model) {
        model.addAttribute("post", new PostDto());
        var data =postService.getAll("",0,5,"PDA");

        List<PostDto> postDtoList= new ArrayList<PostDto>();
        for (Post temp : data.getContent()) {
            PostDto postDto= new PostDto();

        }
        model.addAttribute("users", userRepository.findAll());
        model.addAttribute("posts", data.getContent());
        model.addAttribute("totalPages",data.getTotalPages());
        model.addAttribute("pageIndex",0);
        model.addAttribute("PostCommentDto",new PostCommentDto());

        var username="";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails)principal).getUsername();
        } else {
            username = principal.toString();
        }
        model.addAttribute("loginUser",userService.getUserByUserName(username).get());

        return "index";
    }

    @RequestMapping(value = "/",params= {"_search","_pageIndex","_rows","_sort"},  method = RequestMethod.GET)
    public String getAll(Model model,
                         @RequestParam(value = "_search") String searchText,
                         @RequestParam(value = "_pageIndex") int pageIndex,
                         @RequestParam(value = "_rows") int rows,
                         @RequestParam(value = "_sort") String sort) {
        model.addAttribute("post", new PostDto());
        var data =postService.getAll(searchText,pageIndex,rows,sort);

        List<PostDto> postDtoList= new ArrayList<PostDto>();
        for (Post temp : data.getContent()) {
            PostDto postDto= new PostDto();

        }
        model.addAttribute("users", userRepository.findAll());
        model.addAttribute("posts", data.getContent());
        model.addAttribute("totalPages",data.getTotalPages());
        model.addAttribute("pageIndex",pageIndex);
        model.addAttribute("PostCommentDto",new PostCommentDto());

        var username="";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails)principal).getUsername();
        } else {
            username = principal.toString();
        }
        model.addAttribute("loginUser",userService.getUserByUserName(username).get());

        return "index";
    }

}