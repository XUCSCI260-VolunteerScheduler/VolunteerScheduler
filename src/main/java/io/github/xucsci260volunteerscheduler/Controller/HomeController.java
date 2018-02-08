package io.github.xucsci260volunteerscheduler.Controller;

import io.github.xucsci260volunteerscheduler.Domain.Tag;
import io.github.xucsci260volunteerscheduler.Services.Interfaces.TagService;
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

    @RequestMapping(value = "/tags")
    public @ResponseBody List<Tag> getAllTags() {

        return tagService.getAllTags();
    }

    @RequestMapping(value = "/tags/add/{text}")
    public @ResponseBody Tag addTag(@PathVariable("text") String text) {
        return tagService.addTag(text);
    }
}
