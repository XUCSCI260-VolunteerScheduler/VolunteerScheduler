package io.github.xucsci260volunteerscheduler.dal.implementations;

        import org.springframework.jdbc.core.BeanPropertyRowMapper;
        import org.springframework.jdbc.core.JdbcTemplate;
        import org.springframework.stereotype.Component;
        import io.github.xucsci260volunteerscheduler.domain.Event;
        import io.github.xucsci260volunteerscheduler.dal.interfaces.EventRepository;
        import java.util.List;


 public class EventRepositoryImpl implements EventRepository
 {
   private JdbcTemplate jdbcTemplate;

   public EventRepositoryImpl(JdbcTemplate jdbcTemplate){
     this.jdbcTemplate = jdbcTemplate;
   }

public Event saveEvent(Event e){

      String sql = "INSERT INTO USERTABLE (E_NAME, E_DESC, E_EMAIL, E_ADDRESS, E_CITY, E_STATE, E_ZIP, E_DATE, E_STIME, E_ETIME) VALUES (?,?,?,? ?, ?, ?, ?, ?, ?)";



      jdbcTemplate.update(sql,
              e.getName(),
              e.getDesc(),
              e.getEmail(),
              e.getAddress(),
              e.getCity(),
              e.getState(),
              e.getZip(),
              e.getDate(),
              e.getStartTime(),
              e.getEndTime());

      return e;

}

public Event getEvent(String name){
  Event e = getEventName(name);

  return e;
}

public Event getEventName(String name)
{
  String sql = " SELECT * FROM EVENTTABLE WHERE E_NAME = " + name;
  List<Event> events = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Event.class));
  Event e;

  if(events.size() == 0)
  {
    e = null;
  }
  else{
    e = events.get(0);
  }
  return e;

}

public List<Event> findAll()
{
  String sql = "SELECT ALL FROM EVENTTABLE";
  return jdbcTemplate.query(sql,
         (rs, rowNum) ->
         new User(rs.getString("E_NAME"),
         rs.getString("E_DESC"),
         rs.getString("E_EMAIL"),
         rs.getString("E_ADDRESS"),
         rs.getString("E_CITY"),
         rs.getString("E_STATE"),
         rs.getString("E_ZIP"),
         rs.getString("E_DATE"),
         rs.getString("E_STIME"),
         rs.getString("E_ETIME")));
}
}
