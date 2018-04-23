package io.github.xucsci260volunteerscheduler.services.interfaces;

import io.github.xucsci260volunteerscheduler.domain.Tag;

import java.util.List;

public interface TagService {

    List<Tag> getAllTags();

    Tag addTag(String text);

    Tag removeTag(String text);
}
