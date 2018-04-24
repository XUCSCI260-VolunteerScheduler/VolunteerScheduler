package io.github.xucsci260volunteerscheduler.dal.interfaces;

import org.springframework.data.repository.CrudRepository;
import src.main.java.io.github.xucsci260volunteerscheduler.domain.Event.java;

public interface EventRepository extends CrudRepository<Event, Long> {

}