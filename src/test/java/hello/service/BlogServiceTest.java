package hello.service;


import hello.DAO.BlogDao;
import hello.entity.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;


@ExtendWith(MockitoExtension.class)
public class BlogServiceTest {

    @Mock
    BlogDao blogDao;

    @InjectMocks
    BlogService blogService;

    @Test//这里的Test是Junit5的Test
    public void getBlogsFromDb(){
        blogService.getBlogs(1,10,null);

        Mockito.verify(blogDao).getBlogs(1,10,null);

    }

    @Test
    public void returnFailureWhenExceptionThrown(){
        Mockito.when(blogDao.getBlogs(anyInt(),anyInt(),any())).thenThrow(new RuntimeException());

       Result result =  blogService.getBlogs(1,10,null);

        Assertions.assertEquals("fail",result.getStatus());
        Assertions.assertEquals("系统异常",result.getMsg());

    }

}
