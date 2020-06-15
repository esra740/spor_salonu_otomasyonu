-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 15 Haz 2020, 10:13:04
-- Sunucu sürümü: 10.4.11-MariaDB
-- PHP Sürümü: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `demoo`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uyeler`
--

CREATE TABLE `uyeler` (
  `Sıra` int(11) NOT NULL,
  `Ad` text COLLATE utf8_turkish_ci NOT NULL,
  `Soyad` text COLLATE utf8_turkish_ci NOT NULL,
  `Boy` text COLLATE utf8_turkish_ci NOT NULL,
  `Kilo` text COLLATE utf8_turkish_ci NOT NULL,
  `Yas` text COLLATE utf8_turkish_ci NOT NULL,
  `Paket` text COLLATE utf8_turkish_ci NOT NULL,
  `Fiyat` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `uyeler`
--

INSERT INTO `uyeler` (`Sıra`, `Ad`, `Soyad`, `Boy`, `Kilo`, `Yas`, `Paket`, `Fiyat`) VALUES
(1, 'Meryem', 'YILDIRIM', '160 cm', '70 kg', '22', '3 AYLIK', '200 TL'),
(2, 'Mehmet', 'YILDIZ', '175 cm', '80 kg', '34', '6 AYLIK', '350 TL'),
(3, 'Mücahit', 'ŞİMŞEK', '172 cm', '63 kg', '43', '3 AYLIK', '200 TL'),
(4, 'Ayşe', 'BULUT', '155 cm', '62 kg', '18', '1 YILLIK', '600 TL'),
(5, 'Şadiye ', 'İNALLI', '164 cm', '55 kg', '52', '3 AYLIK', '200 TL'),
(6, 'Burak', 'ÇELİK', '167 cm', '75 kg', '25', '6 AYLIK', '350 TL'),
(7, 'Şehriban', 'YILDIRIM', '175 cm', '69 kg', '21', '1 AYLIK', '100 TL'),
(8, 'Sueda', 'AKIN', '169 cm', '63 kg', '23 ', '1 YILLIK', '600 TL'),
(9, 'Buğra ', 'ÇETİNKAYA', '178 cm', '85 kg', '45', '1 YILLIK', '600 TL'),
(10, 'Kahraman', 'COŞKUN', '192 cm', '97 kg', '36', '6 AYLIK', '350 TL'),
(11, 'Harun', 'ÇİÇEK', '177 cm', '102 kg', '48', '1 AYLIK', '100 TL'),
(12, 'Kevser', 'DEMİR', '150 cm', '68 kg', '27', '3 AYLIK', '200 TL');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `uyeler`
--
ALTER TABLE `uyeler`
  ADD PRIMARY KEY (`Sıra`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `uyeler`
--
ALTER TABLE `uyeler`
  MODIFY `Sıra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
