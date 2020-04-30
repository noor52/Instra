//package com.ewsd.controllers;
//
//
//import javax.servlet.ServletContext;
//
//import com.ewsd.dto.ImageDto;
//import com.ewsd.dto.PostCommentDto;
//import com.ewsd.dto.PostDto;
////import com.ewsd.service.PostService;
//import com.ewsd.model.Post;
//import com.ewsd.repositories.UserRepository;
//import com.ewsd.service.PostService;
//import com.ewsd.service.UserService;
//import com.ewsd.util.Constants;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Controller
//public class PostController {
//
//
//    @Autowired
//    ServletContext context;
//
//
//    @Autowired
//    PostService postService;
//    @Autowired
//    UserService userService;
//
//    private final PasswordEncoder passwordEncoder;
//    private final UserRepository userRepository;
//
//    public PostController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//
//    @RequestMapping(value = "/",  method = RequestMethod.GET)
//    public String root(Model model) {
//        model.addAttribute("post", new PostDto());
//        var data =postService.getAll("",0,5,"PDA");
//
//        List<PostDto> postDtoList= new ArrayList<PostDto>();
//        for (Post temp : data.getContent()) {
//            PostDto postDto= new PostDto();
//        }
//        model.addAttribute("users", userRepository.findAll());
//        model.addAttribute("posts", data.getContent());
//        model.addAttribute("totalPages",data.getTotalPages());
//        model.addAttribute("pageIndex",0);
//        model.addAttribute("PostCommentDto",new PostCommentDto());
//
//        var username="";
//        Object principal = null;
////                SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        if (principal instanceof UserDetails) {
//            username = ((UserDetails)principal).getUsername();
//        } else {
//            username = principal.toString();
//        }
//        model.addAttribute("loginUser",userService.getUserByUserName(username).get());
//
//        return "index";
//    }
//
//    @RequestMapping(value = "/",params= {"_search","_pageIndex","_rows","_sort"},  method = RequestMethod.GET)
//    public String getAll(Model model,
//                         @RequestParam(value = "_search") String searchText,
//                         @RequestParam(value = "_pageIndex") int pageIndex,
//                         @RequestParam(value = "_rows") int rows,
//                         @RequestParam(value = "_sort") String sort) {
//        model.addAttribute("post", new PostDto());
//        var data =postService.getAll(searchText,pageIndex,rows,sort);
//
//        List<PostDto> postDtoList= new ArrayList<PostDto>();
//        for (Post temp : data.getContent()) {
//            PostDto postDto= new PostDto();
//
//        }
//        model.addAttribute("users", userRepository.findAll());
//        model.addAttribute("posts", data.getContent());
//        model.addAttribute("totalPages",data.getTotalPages());
//        model.addAttribute("pageIndex",pageIndex);
//        model.addAttribute("PostCommentDto",new PostCommentDto());
//
//        var username="";
//        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        if (principal instanceof UserDetails) {
//            username = ((UserDetails)principal).getUsername();
//        } else {
//            username = principal.toString();
//        }
//        model.addAttribute("loginUser",userService.getUserByUserName(username).get());
//
//        return "index";
//    }
//
//    @GetMapping("/account/index")
//    public String account(Model model) {
//        model.addAttribute("post", new PostDto());
//        var username="";
//        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        if (principal instanceof UserDetails) {
//            username = ((UserDetails)principal).getUsername();
//        } else {
//            username = principal.toString();
//        }
//
//        var data=userService.getUserByUserName(username).get();
//        model.addAttribute("user", data);
//        return "account/index";
//    }
//
//}