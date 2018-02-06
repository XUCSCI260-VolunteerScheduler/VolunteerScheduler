package io.github.xucsci260volunteerscheduler.Services.Implementation;

import io.github.xucsci260volunteerscheduler.DAL.Interfaces.TagDAO;
import io.github.xucsci260volunteerscheduler.Domain.Tag;
import io.github.xucsci260volunteerscheduler.Services.Interfaces.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TagServiceImpl implements TagService {

    @Autowired
    private TagDAO tagDAO;


    @Override
    public List<Tag> getAllTags() {
        return tagDAO.getAllTags();
    }
}
