# Final Project PBO A - _Ong Tetris_

### Anggota Kelompok 13
| Nama                         | NRP        |
| ---------------------------- | -----------|
| Rayhan Arvianta Bayuputra    | 5025211217 |
| Arif Nugraha Santosa         | 5025211048 |
| Laurivasya Gadhing Syahafidh | 5025211136 |



### Apa itu _Ong Tetris_?
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Typical_Tetris_Game.svg/220px-Typical_Tetris_Game.svg.png" width ="100"/>
<p align="justify"> Ong Tetris merupakan bentuk permainan Tetris yang di populerkan oleh Alexey Pajitnov pada tahun 1984. Pada permainan, berbagai macam tetromino yang terdiri dari empat balok akan jatuh. Tujuan dari permainan ini adalah dengan memanipulasi tetromino yang jatuh, dengan mengerakannya ke samping atau memutarnya, sehingga akan terbentuk garis horizontal tanpa celah, ketika sudah terbentuk, tetromino tersebut akan menghilang, sehingga tetromino diatasnya akan terjatuh. Ketika permainan berlanjut, tetromino tersebut akan jatuh lebih cepat. Permainan akan berakhir apabila tetromino berikutnya terhalang sehingga tidak bisa masuk. </p>

_**Source: Wikipedia (https://id.wikipedia.org/wiki/Tetris)**_

### Fitur-fitur dalam **_Ong Tetris_**
Dalam pengerjaan FP ini, kami mengikuti playlist tutorial dari [Playlist Tetris Clone](https://www.youtube.com/playlist?list=PLwsfVdfP_PPTMBJi_Jli6McfHr422URqO)
| Features                | Ong Tetris | Tetris Clone |
| ----------------------- | -- | -- |
| Pembuatan Bricks        | <p align="center"> ✓ </p> | <p align="center"> ✓ </p> |  
| Pergerakan Bricks       | <p align="center"> ✓ </p> | <p align="center"> ✓ </p> |  
| Pembuatan Tampilan Game | <p align="center"> ✓ </p> | <p align="center"> ✓ </p> |  
| Main Menu               | <p align="center"> ✓ </p> |   |  
| Info How to Play        | <p align="center"> ✓ </p> |   |  
| Loading Screen          | <p align="center"> ✓ </p> |   |  
| Creator Info            | <p align="center"> ✓ </p> |   |  
| In Game Music           | <p align="center"> ✓ </p> |   |  
| Better UI               | <p align="center"> ✓ </p> |   | 

Kami mengerjakan fitur-fitur tersebut dengan pembagian jobdesk sebagai berikut:
- Arif - 
- Rayhan - 
- Vasy - 

### Class dalam _Ong Tetris_


logic berisi class - class yang akan digunakan untuk mengimplementasikan logika gamenya seperti membuat layout bricknya, membuat bricknya bergerak kebawah, menampilkan informasi brick yang akan jatuh selanjutnya, membersihkan baris apabila baris sudah terpenuhi.

logic/bricks berisi class - class yang digunakan untuk membuat bricks dalam game. Terdapat beberapa bricks yang akan ditampilkan dalam game ini yaitu bentuk; I, J, L, O, S, T, dan Z. Dalam package ini juga terdapat class yang akan digunakan untuk men-generate brick tersebut secara random.

logic/event berisi class class yang akan digunakan untuk menggerakan brick brick tersebut.

resources berisi asset - asset yang digunakan dalam game ini seperti asset tampilan loading, menu, credit, informasi how to play game, dan game. Asset ini didesign lebih baik lagi dengan menggunakan aplikasi SceneBuilder.

resources/image berisi gambar gambar yang digunakan sebagai asset dalam game ini.

resources/music berisi lagu yang digunakan dalam game ini.

main berisi class - class yang digunakan untuk men-generate tampilan gamenya. Class yang ada dalam package ini meliputi controller pada file - file FXML resources yang digunakan, class untuk memainkan lagu pada game, menampilkan notifikasi penambahan poin apabila suatu baris sudah penuh. Class guiController dan gameController merupakan controller dari game yang dibuat dan mengimplementasikan package logic dalam game ini dan logika mengenai tampilan game ini.
