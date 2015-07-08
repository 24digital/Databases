import DAOService.AuthorDAOService;
import DAOService.IMPL.AuthorDAOIMPL;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Marion on 7/29/2014.
 */
@Configuration
public class AppConfig {


    @Bean
    public AuthorDAOService authorService() {
        return new AuthorDAOIMPL();
    }
}
