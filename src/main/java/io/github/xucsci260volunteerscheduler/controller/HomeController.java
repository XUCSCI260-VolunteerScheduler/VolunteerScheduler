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
public class HomeController {

    @Autowired
    private TagService tagService;

    @RequestMapping(value = "/allTags")
    public @ResponseBody List<Tag> getAllTags() {

        return tagService.getAllTags();
    }

    @RequestMapping(value = "/addTag/{text}")
    public @ResponseBody Tag addTag(@PathVariable("text") String text) {

        return tagService.addTag(text);
    }
}
