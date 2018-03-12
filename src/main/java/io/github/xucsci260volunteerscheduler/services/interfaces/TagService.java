package io.github.xucsci260volunteerscheduler.services.interfaces;

import io.github.xucsci260volunteerscheduler.domain.Tag;

import java.util.List;

public interface TagService {

    /**
     * calls DAL to return all tags in database
     * @return all tags in database
     */
    List<Tag> getAllTags();

    /**
     * calls DAL to add new tag to the database
     * @param text of new tag
     * @return new tag
     */
    Tag addTag(String text);

    /**
     * calls DAL to remove tag from the database
     * @param text of tag being removed
     * @return removed tag
     */
    Tag removeTag(String text);
}
