package com.intanmaijunaidi.vis_writingwebapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intanmaijunaidi.vis_writingwebapp.entity.Document;
import com.intanmaijunaidi.vis_writingwebapp.entity.User;

public interface DocumentRepository extends JpaRepository<Document, Long>{
	
	List<Document> findByUserId (Long userId);
	List<Document> findByTitle (String title);

}
