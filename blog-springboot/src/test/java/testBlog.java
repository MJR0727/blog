import com.MJR.blog.dto.ArticleDTO;
import com.MJR.blog.service.TalkService;
import com.MJR.blog.service.impl.ArticleServiceImpl;
import com.MJR.blog.vo.DeleteVO;
import com.MJR.blog.vo.TalkVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 22249
 * @version 1.0
 * @description:
 * @date 2022/12/26 20:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class testBlog {

    @Autowired
    private ArticleServiceImpl articleService;

    @Autowired
    private TalkService talkService;

    @Test
    public void test01(){
        ArticleDTO articleById = articleService.getArticleById(12);
        System.out.println(articleById);
    }

    @Test
    public void test02(){
        TalkVO talkVO = new TalkVO();
        talkVO.setContent("helloBolg");
        talkVO.setIsTop(0);
        talkVO.setStatus(2);
        //talkVO.setId();
        talkService.saveOrUpdateTalk(talkVO);
    }

    @Test
    public void test03(){
        DeleteVO deleteVO = new DeleteVO();
        deleteVO.setIsDelete(1);
        articleService.updateArticleDelete(deleteVO);
    }
}
