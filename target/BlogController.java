package vn.shopttcn.controller.shop;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/blog")
    public String blogList(Model model) {
        return "views/public/blog";
    }

    // url sample: /blog/chien-binh-gaming-1
//    @GetMapping("/blog/{slug}-{id}")
//    public String blogDetail(@PathVariable("id") int id, Model model) {
//        BlogPost post = DemoData.getPostById(id);
//        if (post == null) {
//            return "views/error/404"; // hoặc trang not found bạn có
//        }
//        model.addAttribute("post", post);
//        return "views/public/blog-detail"; // -> /WEB-INF/views/views/public/blog-detail.jsp
//    }
}
