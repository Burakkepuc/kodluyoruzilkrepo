Insertion sort dizideki elemanları tek tek alır ve soldaki ile karşılaştırıp, soldaki sıralı kısmın içine doğru yerleştirir. Kart dizer gibi çalışır.

[22,27,16,2,18,6] -> Burada 22'den başlar ilerler 27 22'den küçük değil kalır.
[16,22,27,2,18,6] -> 16 27 ve 22'den küçük, en başa geçer.
[2,16,22,27,18,6] -> 2 sayısı 27,22,16'den küçük en başlarına geçer. 16 sayısının soluna.
[2,16,18,22,27,6] -> 18 sayısı 27 ve 22'den küçük 16'dan büyük. 16'dan sonraya geçer
[2,6,16,18,22,27] -> 6 sayısı sola doğru 2 sayısının sağına geçer.

İçeride 2 adet loop var. Bir tanesi dizideki her bir elemanı geziyor dış loop. iç döngü ise elemanı doğru yere yerleştirmek için sola doğru karşılaştırma yapar.O(N^2)
18 sayısı average casedir.

[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımı(Ben fazlasını yaptım.)

-> [7,3,5,8,2,9,4,15,6] -> 2'yi bulur ve 7 ile yer değiştirir 
-> [2,3,5,8,7,9,4,15,6] ->3 aynı kalır. 5 ve 4'ün yerini değiştirir.
-> [2,3,4,8,7,9,5,15,6] ->8 ve 5'in yerini değiştirir.
-> [2,3,4,5,7,9,8,15,6]  -> 6 ve 7'nin yeri değişir. 
-> [2,3,4,5,6,9,8,15,7] ->9 ve 7'nin yeri değişir.
-> [2,3,4,5,6,7,8,15,9] -> 8 zaten yerinde. 15 ve 9'un yeri değişir.
-> [2,3,4,5,6,7,8,9,15] -> Son hali.

