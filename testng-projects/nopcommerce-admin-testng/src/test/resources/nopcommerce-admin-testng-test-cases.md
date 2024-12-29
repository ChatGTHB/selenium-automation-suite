# NopCommerce Admin TestNG - Test Case Documentation

## Genel Bilgiler
1. POM (Page Object Model) kullanınız
2. Paralel testler koşturunuz (Chrome, Firefox)
3. Test case’lerinizi XML dosyası üzerinden çalıştırınız
4. URL: https://admin-demo.nopcommerce.com/login
5. username: admin@yourstore.com  
   password: admin

---

## Test Case 1: Login Test  
Amaç: Geçerli kullanıcı bilgileri ile başarılı bir şekilde giriş yapılması

Adımlar:
1. https://admin-demo.nopcommerce.com/login sitesine gidiniz
2. Geçerli username ve password giriniz
3. Login butonuna tıklayınız
4. Başarılı giriş yapıldığını doğrulayınız

---

## Test Case 2: Check LeftNav Menu  
Amaç: Dashboard altındaki menülerin kontrolü ve doğrulanması

Adımlar:
1. Dashboard altındaki menülerin her birine tıklayınız
2. Menülerin açılıp açılmadığını kontrol ediniz
3. Açılan menünün altındaki elemanların göründüğünü doğrulayınız

---

## Test Case 3: Create Customer  
Amaç: Yeni bir müşteri kaydının başarıyla oluşturulması

Adımlar:
1. Customers menüsüne tıklayınız
2. Alt menüden Customers seçeneğini seçiniz
3. Açılan sayfada Add New butonuna tıklayınız
4. Formu eksiksiz doldurup Save butonuna tıklayınız
5. Yeni bir müşteri kaydının başarıyla oluşturulduğunu doğrulayınız

---

## Test Case 4: Edit Customer  
Amaç: Oluşturulan müşteri bilgilerini düzenleme

Adımlar:
1. Customers menüsüne tıklayınız
2. Müşteriyi aramak için Search kutucuğuna e-mail, ad ve soyad bilgilerini giriniz
3. Search butonuna tıklayınız
4. Müşteri kaydının listede göründüğünü doğrulayınız
5. Edit butonuna tıklayınız
6. İlgili bilgiyi değiştirip Save butonuna tıklayınız
7. Güncellemenin başarıyla yapıldığını doğrulayınız

---

## Test Case 5: Delete Customer  
Amaç: Var olan bir müşteri kaydının silinmesi

Adımlar:
1. Customers menüsüne tıklayınız
2. Müşteriyi aramak için Search kutucuğuna e-mail, ad ve soyad bilgilerini giriniz
3. Search butonuna tıklayınız
4. Delete butonuna tıklayarak müşteri kaydını siliniz
5. Müşteri kaydının başarıyla silindiğini doğrulayınız

---

## Test Case 6: Search Test  
Amaç: Arama kutusu kullanarak belirli bir sayfanın bulunması

Adımlar:
1. Arama kutusuna Shipments kelimesini giriniz
2. Çıkan sonuçlardan Shipments seçeneğine tıklayınız
3. Shipments sayfasına başarıyla yönlendirildiğinizi doğrulayınız  
