[16,21,11,|8,12,22] -> İlk olarak bun diziyi ortadan böl.(Dizi lenght / 2 = 3)
↓
[16] [21,11] - [8] [12,22] -> Yanda yazan şekilde 1 diziye 2 dizi olacak şekilde ayır.
↓
[16] - [21]- [11] | [8]-[12]-[22] -> Tek tek böl ve bölme işlemini bitir. Birleştirme işlemine geç.
↓                               ↓
[16] + [11 - 21]   |   [8] + [12,22] - > Tek olanlar aynı kalır, diğerlerinden küçük başa geçer.Sıralamaya başlanır.
 ↓
[11,16,21] | [8,12,22] -> 16 mı 11 mi -> 11, 16 mı 21 mi -> 16 / 8 mi 12 mi ? 8, 12 mi 22 mi ? 12 en son 22.
↓
11 mi 8 mi -> 8
11 mi 12 mi -> 11
16 mı 12 mi -> 12
16 mı 22 mi -> 16
21 mi 22 mi -> 21
en son -> 22
[8,11,12,16,21,22]

n(nlogn). N kadar işlem yapıyor dizi içerisinde. sürekli diziyi n/2 şeklinde bölüyor.
