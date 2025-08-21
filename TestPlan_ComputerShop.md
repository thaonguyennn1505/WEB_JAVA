# KẾ HOẠCH KIỂM THỬ WEBSITE BÁN MÁY TÍNH – COMPUTER SHOP

## 1. Mục đích và phạm vi kiểm tra
**Mục đích:**  
Đảm bảo rằng website Computer Shop hoạt động ổn định, các chức năng mua bán máy tính (laptop, PC, linh kiện, phụ kiện) chạy đúng logic, không lỗi nghiêm trọng, và có giao diện thân thiện với người dùng.

**Phạm vi kiểm tra:**  
- Trang chủ, danh mục sản phẩm.  
- Chức năng tìm kiếm và lọc sản phẩm.  
- Giỏ hàng, đặt hàng và thanh toán.  
- Quản lý tài khoản khách hàng.  
- Hệ thống quản trị (nếu có).  

---

## 2. Định hướng cho kế hoạch
- Kiểm thử chức năng (Functional Testing).  
- Kiểm thử giao diện (UI/UX Testing).  
- Kiểm thử hiệu năng cơ bản (Performance Testing).  
- Kiểm thử bảo mật cơ bản (Security Testing).  
- Kiểm thử đa nền tảng (Cross-platform Testing: Desktop, Mobile, Tablet).  

---

## 3. Các chức năng cần kiểm tra
- Đăng ký, đăng nhập, quên mật khẩu.  
- Tìm kiếm sản phẩm (theo tên, mã sản phẩm).  
- Lọc sản phẩm (theo thương hiệu, giá, cấu hình).  
- Xem chi tiết sản phẩm (hình ảnh, cấu hình, giá, khuyến mãi).  
- Thêm sản phẩm vào giỏ hàng.  
- Thanh toán: chọn phương thức (COD, chuyển khoản, ví điện tử).  
- Quản lý thông tin tài khoản, địa chỉ giao hàng.  
- Quản lý đơn hàng (theo dõi trạng thái).  
- Quản trị sản phẩm (thêm, sửa, xóa – nếu có quyền admin).  

---

## 4. Tài nguyên và công cụ
- **Nhân sự:** Nhóm kiểm thử 4 người.  
- **Công cụ:** Selenium (UI test), JMeter (hiệu năng), Postman (API).  
- **Thiết bị:** Máy tính Windows/MacOS, Laptop, Smartphone Android/iOS.  

---

## 5. Tiêu chí chấp nhận (Exit Criteria)
- 100% test case **High Priority** phải pass.  
- Không còn bug **Critical** hoặc **High Severity**.  
- Lỗi mức **Medium/Low** còn tồn tại < 5 lỗi.  
- Các chức năng chính (tìm kiếm, đặt hàng, thanh toán) chạy đúng.  

---

## 6. Rủi ro và biện pháp
**Rủi ro:**  
- Yêu cầu thay đổi liên tục trong quá trình test.  
- Dữ liệu test không đồng bộ với dữ liệu thật.  
- Hệ thống thanh toán bên thứ ba không ổn định.  

**Biện pháp:**  
- Cập nhật test case thường xuyên khi có thay đổi.  
- Tạo dữ liệu test độc lập, kiểm soát được.  
- Chuẩn bị kịch bản test dự phòng khi thanh toán lỗi.  

---

## 7. Kế hoạch thực hiện
| Giai đoạn | Công việc | Người phụ trách | Thời gian |
|-----------|-----------|-----------------|-----------|
| Chuẩn bị  | Viết Test Plan, chuẩn bị Test Case | Test Lead | 3 ngày |
| Thực thi  | Thực hiện kiểm thử chức năng | Nhóm Tester | 7 ngày |
| Hiệu năng | Chạy test tải với JMeter | Tester Performance | 2 ngày |
| Báo cáo   | Tổng hợp kết quả, viết báo cáo | Test Lead | 2 ngày |

---

## 8. Tài liệu tham khảo
- Yêu cầu nghiệp vụ hệ thống bán máy tính.  
- Tài liệu thiết kế giao diện website.  
- Best Practice kiểm thử thương mại điện tử.  
