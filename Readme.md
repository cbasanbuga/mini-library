# 📚 Spring Boot Book Management Project

Bu proje, Spring Boot ve Thymeleaf kullanarak geliştirilmiş basit bir **kitap yönetim uygulamasıdır**.  
Veritabanı kullanılmadan, sabit bir `List` içinde kitaplar yönetilmektedir.

---

## 🚀 Özellikler

- Kitap listeleme
- Yeni kitap ekleme
- Kitap silme
- 
## 📋 TODO Listesi

- [x] Kitap listeleme (book list) işlemleri tamamlandı.
- [x] Kitap silme işlemleri eklendi.
- [x] Temel sayfa yönlendirmeleri ve hata sayfası oluşturuldu.
- [ ] Kitap ekleme işlemleri eklencek.
- [ ] Manuel validasyon kontrolleri geliştirilecek.
- [ ] Özel validasyon sınıfları (`Custom Validator`) yazılacak.
- [ ] Geçersiz girişlerde kullanıcıya detaylı hata mesajları gösterilecek.
- [ ] Frontend tarafında (Thymeleaf) form validasyonları iyileştirilecek.


---

## 🛠️ Kullanılan Teknolojiler

- Java 21
- Spring Boot 3.4.5
- Thymeleaf
- Maven
- HTML5 / CSS3 (isteğe bağlı Bootstrap)

---

## 📂 Proje Yapısı

- src/main/java/com/example/bookapp
    - controller/BookController.java
    - model/Book.java
    - service/BookService.java
    - repository/BookRepository.java
    - BookAppApplication.java
- src/main/resources
    - templates/
        - index.html
        - book-add.html
        - error.html
    - application.properties
