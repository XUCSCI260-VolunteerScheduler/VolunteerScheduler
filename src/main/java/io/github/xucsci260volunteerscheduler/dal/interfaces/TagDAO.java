package io.github.xucsci260volunteerscheduler.dal.interfaces;

import io.github.xucsci260volunteerscheduler.domain.Tag;

import java.util.List;

public interface TagDAO {

    /**
     * queries database for all tags
     * @return all tags in database
     */
    List<Tag> getAllTags();

    /**
     * inserts new tag into the database
     * @param text for new tag
     * @return tag that was inserted
     */
    boolean addTag(String text);

    /**
     * removes tag from database
     * @param text of tag being removed
     * @return tag that was removed
     */
    boolean removeTag(String text);
}
