package Twitter.Controler;

import Twitter.Twitter.FrontTwitter;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GetControler {
    static Logger log = Logger.getLogger(GetControler.class.getName());

    public GetControler() {
    }

    @RequestMapping({"/"})
    public ModelAndView welcome() {
        log.info("Welcom Page");
        return (new ModelAndView("welcom")).addObject("name", "Welcom");
    }

    @RequestMapping(
            value = {"TwitterAplication/viewTwitter"},
            method = {RequestMethod.GET}
    )
    public ModelAndView addTwitterGet(@RequestParam("keyWord") String keyWord) {
        log.info("addTwitter controller keyWord " + keyWord);
        Object listArray = new ArrayList();

        try {
            listArray = FrontTwitter.frontTwitterListTwittersKeyWord(keyWord);
        } catch (ExecutionException e) {
            log.log(Level.SEVERE, e.getMessage());
        }

        return (new ModelAndView("TwitterAplication/viewTwitter")).addObject("keyWord", listArray);
    }

    @RequestMapping(
            value = {"TwitterAplication/userName"},
            method = {RequestMethod.GET}
    )
    public ModelAndView userName(@RequestParam("userName") String userName) {
        log.info("addTwitter controller userName " + userName);
        Object listArray = new ArrayList();

        try {
            listArray = FrontTwitter.frontTwitterListTwittersUserName(userName);
        } catch (ExecutionException e) {
            log.log(Level.SEVERE, e.getMessage());
        }

        return (new ModelAndView("TwitterAplication/userName")).addObject("userName", listArray);
    }
}