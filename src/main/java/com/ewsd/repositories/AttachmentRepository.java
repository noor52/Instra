package com.ewsd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ewsd.model.Attachment;
@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, Long>{

}
