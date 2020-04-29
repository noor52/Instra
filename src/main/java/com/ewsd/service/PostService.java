package com.ewsd.service;

import com.ewsd.dto.PostDto;
import com.ewsd.model.Post;
import com.ewsd.model.PostImage;
import com.ewsd.repositories.PostImageRepository;
import com.ewsd.repositories.PostRepository;
import com.ewsd.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostImageRepository postImageRepository;

    public void insert(PostDto postdto) {
        Post post = new Post();
        post.setUser(postdto.getUser());
        post.setPostContent(postdto.getPostContent());
        post.setPostDate(new Date());

        postRepository.save(post);
        for (var temp : postdto.getImageDto()) {
            postImageRepository.save(new PostImage(temp.getImageName(), new Date(), post));
        }

    }

    public Page<Post> getAll(String searchText, int pageIndex, int rows, String sort) {
        Pageable pageWithElements;
        if(sort.equals("PDA")) {
            pageWithElements = PageRequest.of(pageIndex, rows, Sort.by("postDate").descending());
        }else {
            pageWithElements = PageRequest.of(pageIndex, rows,Sort.by("postDate").descending());
        }
        Page<Post> teams=postRepository.fullTextSearch(searchText,pageWithElements);
        return teams;
    }
}
