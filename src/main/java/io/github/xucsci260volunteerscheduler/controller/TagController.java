package io.github.xucsci260volunteerscheduler.controller;

import io.github.xucsci260volunteerscheduler.domain.Tag;
import io.github.xucsci260volunteerscheduler.services.interfaces.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TagController {

    private TagService tagService;

    @Autowired
    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    /**
     * calls service to get all tags
     * @return List of all tags
     */
    @RequestMapping(value = "/tags")
    public @ResponseBody List<Tag> getAllTags() {

        return tagService.getAllTags();
    }

    /**
     * creates new tag
     * @param text of new tag
     * @return new tag
     */
    @RequestMapping(value = "/tags/add/{text}")
    public @ResponseBody Tag addTag(@PathVariable("text") String text) {
        return tagService.addTag(text);
    }

    /**
     * removes tag
     * @param text text of tag to remove
     * @return removed tag
     */
    @RequestMapping(value = "/tags/remove/{text}")
    public @ResponseBody Tag removeTag(@PathVariable("text") String text) {
        return tagService.removeTag(text);
    }
}
