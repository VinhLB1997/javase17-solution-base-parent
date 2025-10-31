# Tổng quan Pattern Matching trong Java 17
Pattern Matching giúp giảm boilerplate, tăng type safety, và viết code ngắn gọn, dễ đọc hơn

---

Ví dụ:

🔸 `instanceof` pattern:

```bash
if (obj instanceof String s) {
    System.out.println(s.length());
}

```

🔸 `record` + Deconstruction Pattern:

_// Tự động trích xuất field → không cần p.x(), p.y()_

```bash
record Point(int x, int y) {}

void print(Point p) {
    if (p instanceof Point(int x, int y)) {
        System.out.println("x = " + x + ", y = " + y);
    }
}
```