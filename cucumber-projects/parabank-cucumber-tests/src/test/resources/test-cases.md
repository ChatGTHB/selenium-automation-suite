# ParaBank Cucumber Project Test Cases  
Website: https://parabank.parasoft.com/parabank/index.htm

Not: Bu bir test sitesidir.

Proje Özeti:
- Cucumber-Maven kullanılarak oluşturulacaktır.
- Senaryo 2 ve Senaryo 3'te “Scenario Outline” yöntemi kullanılacaktır.
- Hesap açarken gerçek olmayan bilgiler kullanılacaktır.
- Projedeki her adım sıfırdan hazırlanacaktır. Kopyala-yapıştır yapılmayacaktır.

---

## Senaryo 1: Register Functionality  
Para Bank sitesinde bir hesap açma işlemi gerçekleştirilir.

Adımlar:
- Given: Para Bank sitesine gidiniz.
- When: Yeni bir hesap oluşturunuz.
- Then: "Your account was created successfully. You are now logged in." mesajı doğrulanır.

---

## Senaryo 2: Login Functionality

Case 1: Geçerli Kullanıcı Bilgileri ile Giriş
- Given: Para Bank sitesine gidiniz.
- When: Geçerli kullanıcı adı ve şifre giriniz.
- And: Login butonuna tıklayınız.
- Then: Kullanıcının başarılı bir şekilde giriş yaptığı doğrulanır.
- And: Kullanıcı sistemden logout olur.

---

Case 2: Geçersiz Kullanıcı Bilgileri ile Giriş
- Given: Para Bank sitesine gidiniz.
- When: Geçerli kullanıcı adı ve yanlış şifre giriniz.
- And: Login butonuna tıklayınız.
- Then: Login başarısız olduğuna dair mesaj doğrulanır.

- Given: Para Bank sitesine gidiniz.
- When: Yanlış kullanıcı adı ve geçerli şifre giriniz.
- And: Login butonuna tıklayınız.
- Then: Login başarısız olduğuna dair mesaj doğrulanır.

---

## Senaryo 3: Bill Pay Functionality

Farklı faturalar ödenerek test gerçekleştirilir.

Adımlar:
- Given: Para Bank sitesine gidiniz.
- When: Geçerli kullanıcı adı ve şifre ile giriş yapınız.
- And: Bill Pay sayfasına gidiniz.
- Then: 3 ayrı fatura için ödeme yapınız:

| Fatura Türü   | Tutar |  
|---------------|-------|  
| Elektrik      | $85   |  
| Su            | $45   |  
| Doğalgaz      | $120  |  

- And: Her ödeme sonrası, "Bill Payment Complete" mesajı doğrulanır.  
