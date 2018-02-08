package io.github.xucsci260volunteerscheduler.DAL.Interfaces;

import io.github.xucsci260volunteerscheduler.Domain.Tag;

import java.util.List;

public interface TagDAO {

    List<Tag> getAllTags();

    Tag addTag(String text);
}
