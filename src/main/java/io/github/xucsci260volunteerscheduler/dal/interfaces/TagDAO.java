package io.github.xucsci260volunteerscheduler.dal.interfaces;

import io.github.xucsci260volunteerscheduler.domain.Tag;

import java.util.List;

public interface TagDAO {

    List<Tag> getAllTags();

    Tag addTag(String text);
}
