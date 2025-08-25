package vn.shopttcn.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VoucherAdminController {

    // URL: /admin/vouchers
    @GetMapping("/admin/vouchers")
    public String voucherList(Model model) {

        return "views/admin/voucher-admin"; // tương ứng /WEB-INF/views/admin/voucher-admin.jsp
    }
}
