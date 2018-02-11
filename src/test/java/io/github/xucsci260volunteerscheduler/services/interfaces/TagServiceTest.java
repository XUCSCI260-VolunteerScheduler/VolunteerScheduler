package io.github.xucsci260volunteerscheduler.services.interfaces;


import io.github.xucsci260volunteerscheduler.dal.interfaces.DatabaseDAO;
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

    private final Tag TESTINGTAG = new Tag("Testing tag");

    @Mock
    private TagDAO tagDAO;
    @Mock
    private DatabaseDAO databaseDAO;

    private List<Tag> tagList;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        tagList = new ArrayList<>();
        tagList.add(TESTINGTAG);
        when(databaseDAO.saveDatabase()).thenReturn(false);
    }

    @Test
    public void testMockCreation() {
        assertNotNull(tagDAO);
    }

    @Test
    public void getAllTagsTest() {
        when(tagDAO.getAllTags()).thenReturn(tagList);

        TagServiceImpl tagService = new TagServiceImpl(tagDAO, databaseDAO);

        List<Tag> tags = tagService.getAllTags();

        assertEquals(tagList.size(), tags.size());
        assertEquals(tagList.get(0).getText(), tags.get(0).getText());
    }

    @Test
    public void addTagTest() {
        String newTag = "New Tag";

        when(tagDAO.addTag(newTag)).thenReturn(tagList.add(new Tag(newTag)));

        TagServiceImpl tagService = new TagServiceImpl(tagDAO, databaseDAO);

        tagService.addTag(newTag);

        assertEquals(2, tagList.size());
        assertEquals(tagList.get(1).getText(), newTag);
    }

    @Test
    public void removeTagTest() {
        when(tagDAO.removeTag(TESTINGTAG.getText())).thenReturn(tagList.remove(TESTINGTAG));

        TagServiceImpl tagService = new TagServiceImpl(tagDAO, databaseDAO);

        tagService.removeTag(TESTINGTAG.getText());

        assertTrue(tagList.isEmpty());
    }
}
