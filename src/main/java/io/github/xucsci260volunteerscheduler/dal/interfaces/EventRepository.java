package io.github.xucsci260volunteerscheduler.dal.interfaces;

//import src.main.java.io.github.xucsci260volunteerscheduler.domain.Event.java;
//import org.springframework.data.repository;
        import io.github.xucsci260volunteerscheduler.domain.Event;
        import io.github.xucsci260volunteerscheduler.domain.User;
        import org.springframework.data.mongodb.repository.MongoRepository;
        import org.springframework.data.repository.CrudRepository;
        import java.util.List;
        import org.springframework.stereotype.Repository;

//public interface EventRepository extends CrudRepository {
//    public List<Event> findAll();
//}


public interface EventRepository extends MongoRepository<Event, String> {
        public List<Event> findAll();
}
