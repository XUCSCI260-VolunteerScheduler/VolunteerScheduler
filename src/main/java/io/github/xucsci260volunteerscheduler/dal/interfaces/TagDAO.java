package io.github.xucsci260volunteerscheduler.dal.interfaces;

import io.github.xucsci260volunteerscheduler.domain.Tag;

import java.util.List;

public interface TagDAO {

    List<Tag> getAllTags();

    boolean addTag(String text);

    boolean removeTag(String text);
}
