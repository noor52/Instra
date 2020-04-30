package com.ewsd.repositories;



import java.util.List;
import java.util.Optional;

import com.ewsd.model.PostImage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface PostImageRepository extends JpaRepository<PostImage, Long>{

    Optional<PostImage> findByImageId(long imageId);

    //List<PostImage> findByImgPost(Post imgPost);

}