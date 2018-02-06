package io.github.xucsci260volunteerscheduler.services.interfaces;


import io.github.xucsci260volunteerscheduler.dal.interfaces.TagDAO;
import io.github.xucsci260volunteerscheduler.domain.Tag;
import io.github.xucsci260volunteerscheduler.services.implementation.TagServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class TagServiceTest {

    @Mock
    private TagDAO tagDAO;

    private List<Tag> tagList;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        tagList = new ArrayList<>();
        tagList.add(new Tag("Testing tag"));
    }

    @Test
    public void testMockCreation() {
        assertNotNull(tagDAO);
    }

    @Test
    public void getAllTagsTest() {
        when(tagDAO.getAllTags()).thenReturn(tagList);

        TagServiceImpl tagService = new TagServiceImpl(tagDAO);

        List<Tag> tags = tagService.getAllTags();

        assertEquals(tagList.size(), tags.size());
        assertEquals(tagList.get(0).getText(), tags.get(0).getText());
    }
}
