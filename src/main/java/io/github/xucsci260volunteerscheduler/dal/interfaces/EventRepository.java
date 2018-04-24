package io.github.xucsci260volunteerscheduler.dal.interfaces;

//import src.main.java.io.github.xucsci260volunteerscheduler.domain.Event.java;
//import org.springframework.data.repository;
import io.github.xucsci260volunteerscheduler.domain.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Customer, String> {
    public Iterable<Event> findAll(){
      
    }
}
