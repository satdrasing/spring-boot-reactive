package io.satendra.reactivedemo.dao;

import io.satendra.reactivedemo.documents.HelloDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloDao extends ReactiveMongoRepository<HelloDocument, Long> {
}
