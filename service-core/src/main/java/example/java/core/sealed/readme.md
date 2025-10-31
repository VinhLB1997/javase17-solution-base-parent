# Tổng quan Sealed Classes trong Java

Sealed Classes (lớp bị niêm phong) cho phép giới hạn những lớp con nào được phép kế thừa hoặc triển khai một lớp/interface

---

## Tính năng

`sealed` → class/interface chỉ cho phép các class con được liệt kê trong `permits`.

`permits <Class1, Class2, ...>` → danh sách các lớp con trực tiếp được phép.

**📌 Chú ý:** Nếu các lớp con được định nghĩa trong cùng file với lớp `sealed`, mệnh đề `permits` có thể được bỏ qua (Java sẽ tự suy ra).

Các class con phải trực tiếp extend sealed class gồm ba loại sau:
> 🔸 `final`: các class khác không thể extend thêm

> 🔸 `sealed`: tiếp tục hạn chế extend

> 🔸 `non-sealed`: các class khác có thể tự do extend class `non-sealed`

## Lợi ích

- **Kiểm soát kế thừa:** Ngăn chặn các class không mong muốn extend, giúp mô hình hóa domain tốt hơn.
- **Hỗ trợ pattern matching:** Trong switch expression, Java có thể kiểm tra tính toàn diện (exhaustiveness) mà không cần default case nếu sealed hierarchy bao quát tất cả trường hợp.
- **Runtime introspection:** Sử dụng `Class.isSealed()` để kiểm tra và `Class.getPermittedSubclasses()` để lấy danh sách permitted subclasses.
