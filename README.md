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


### Panduan Untuk Visual Studio Code
> Apabila anda ingin menjalankan _Ong Tetris_ pada Visual Studio Code, buka folder `.vscode`, kemudian buka file `.vscode/launch.json` dan ubah path directory JavaFX sesuai dengan path directory JavaFX pada komputer anda `vmArgs": "--module-path [path JavaFX anda] --add-modules javafx.controls, javafx.fxml`

> Contoh : `"vmArgs": "--module-path \"D:/work/programming/javafx-sdk-19/lib\" --add-modules javafx.controls,javafx.fxml"` serta jangan lupa untuk import `.jar` filesnya ke Visual Studio Code anda. Untuk panduannya dapat dilihat [disini](https://youtu.be/H67COH9F718?t=542)


### Class dalam _Ong Tetris_

- `logic` berisi class - class yang akan digunakan untuk mengimplementasikan logika gamenya seperti membuat layout bricknya, membuat bricknya bergerak kebawah, menampilkan informasi brick yang akan jatuh selanjutnya, membersihkan baris apabila baris sudah terpenuhi.

- `logic/bricks` berisi class - class yang digunakan untuk membuat bricks dalam game. Terdapat beberapa bricks yang akan ditampilkan dalam game ini yaitu bentuk; I, J, L, O, S, T, dan Z. Dalam package ini juga terdapat class yang akan digunakan untuk men-generate brick tersebut secara random.

- `logic/event` berisi class class yang akan digunakan untuk menggerakan brick brick tersebut.

- `resources` berisi asset - asset yang digunakan dalam game ini seperti asset tampilan loading, menu, credit, informasi how to play game, dan game. Asset ini didesign lebih baik lagi dengan menggunakan aplikasi SceneBuilder.

- `resources/image` berisi gambar gambar yang digunakan sebagai asset dalam game ini.

- `resources/music` berisi lagu yang digunakan dalam game ini.

- `main` berisi class - class yang digunakan untuk men-generate tampilan gamenya. Class yang ada dalam package ini meliputi controller pada file - file FXML resources yang digunakan, class untuk memainkan lagu pada game, menampilkan notifikasi penambahan poin apabila suatu baris sudah penuh. Class guiController dan gameController merupakan controller dari game yang dibuat dan mengimplementasikan package logic dalam game ini dan logika mengenai tampilan game ini.

### Tools Yang Digunakan dalam pengerjaan _Ong Tetris_
- Java : `java 19.0.1`
- JavaFX : `javafx-sdk-19`
- IDE : `Visual Studio Code`
- SceneBuilder
- GitHub Desktop
- Canva
- Adobe Illustrator
- DAW - `Garage Band`

### Perbandingan Tampilan _Ong Tetris_ dengan Tutorial Referensi

| **Tampilan**           | **Ong Tetris**                       | **Tetris Clone**       |
|--------------------| ---------------------------- | -----------|
| <p align="center"> Loading Screen </p>   | <img src="https://user-images.githubusercontent.com/88714570/208303091-295f93fd-5387-4cd7-9dec-ce262ae075e4.png" width = "250"/>    | <p align="center"> Tidak ada tampilan </p> |
| <p align="center"> Main Menu </p>        | <img src="https://user-images.githubusercontent.com/88714570/208303335-7651836e-8033-4bcf-9b72-2afa29f52638.png" width = "250"/>    | <p align="center"> Tidak ada tampilan </p> |
| <p align="center"> Info How To Play </p> | <img src="https://user-images.githubusercontent.com/88714570/208303458-25bf4534-b454-4548-a6c4-47671e31d555.png" width = "250"/>    | <p align="center"> Tidak ada tampilan </p> |
| <p align="center"> Creator Info </p>     | <img src="https://user-images.githubusercontent.com/88714570/208303489-4f427f11-03aa-4f53-8838-4c20a4af24c4.png" width = "250"/>    | <p align="center"> Tidak ada tampilan </p> |
| <p align="center"> Gameplay </p>         | <img src="https://user-images.githubusercontent.com/88714570/208303537-3a23f2c8-867c-4920-8abf-624ff14ca033.png" width = "250"/>    | <img src="https://user-images.githubusercontent.com/88714570/208303547-286e3db2-4ea3-419d-9fc7-0f4b3c1060f7.jpeg" width = "250"/> |
| <p align="center"> Game Over </p>        | <img src="https://user-images.githubusercontent.com/88714570/208303588-456cf5b6-0b2c-403e-b3e4-ba3b1b5e434f.png" width = "250"/>    | <img src="https://user-images.githubusercontent.com/88714570/208303595-9c759101-46b3-44c5-9806-383400e3192b.jpeg" width = "250"/> |


### _Thanks!_
