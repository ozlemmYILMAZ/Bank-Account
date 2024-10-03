Proje Özeti: BankAccount
Amaç: Bir bankanın müşteri hesabını yönetmek.

Özellikler:

Private Değişken: balance (hesap bakiyesi) dışarıdan doğrudan erişime kapalıdır.
Getter ve Setter Metodları:
getBalance(): Bakiyeyi okuma.
setBalance(double balance): Bakiyeyi ayarlama (negatif olmaması kontrol edilir).
İşlem Metodları:
deposit(double amount): Pozitif bir miktar yatırarak bakiyeyi artırır.
withdraw(double amount): Yeterli bakiye varsa pozitif bir miktar çekerek bakiyeyi azaltır.
Kullanım: Ana sınıfta (Main), BankAccount nesnesi oluşturulur, bakiyeye değer atanır ve işlemler yapılır.
