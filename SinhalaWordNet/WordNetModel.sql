-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 28, 2016 at 09:24 AM
-- Server version: 5.5.49-0ubuntu0.14.04.1
-- PHP Version: 5.5.9-1ubuntu4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `WordNetModel`
--

-- --------------------------------------------------------

--
-- Table structure for table `baseword`
--

CREATE TABLE IF NOT EXISTS `baseword` (
  `id` int(10) NOT NULL,
  `text` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `baseword`
--

INSERT INTO `baseword` (`id`, `text`) VALUES
(1, 'අම්මා'),
(2, 'අක්කා '),
(3, 'තාත්තා '),
(4, 'බසය '),
(5, 'කාරය '),
(6, 'යහපත් '),
(7, 'මිනිසා '),
(8, 'ගස'),
(9, 'මල '),
(10, 'පරිගණකය '),
(11, 'යනවා '),
(12, 'කනවා '),
(13, 'රඹුටන් '),
(14, 'රතු '),
(15, 'ලෝකය '),
(16, 'ලංකාව'),
(17, 'ගුරුවරයා'),
(18, 'අහස '),
(19, 'සාමය '),
(20, 'ජලය '),
(21, 'නිදහස '),
(22, 'ආහාර '),
(23, 'පිසිනවා '),
(24, 'උයනවා '),
(25, 'කතුර '),
(26, 'කපනවා '),
(27, 'පාට '),
(28, 'දිග '),
(29, 'පාර '),
(30, 'ගම '),
(31, 'නගරය '),
(32, 'සිනමාව'),
(33, 'ඉගෙනගන්නවා '),
(34, 'මල්ලි'),
(35, 'ටයරය'),
(36, 'යුතුකම'),
(37, 'ණය'),
(38, 'නහය'),
(39, 'පිදුරු'),
(40, 'ගොනා'),
(41, 'චාමර'),
(42, 'නිවහන'),
(43, 'තිබහ'),
(44, 'විදුලිය'),
(45, 'අකුණු'),
(46, 'ගොරවනවා'),
(47, 'සමාජය'),
(48, 'සොබාදහම'),
(49, 'චිත්‍රය'),
(50, 'බය');

-- --------------------------------------------------------

--
-- Table structure for table `Sentence`
--

CREATE TABLE IF NOT EXISTS `Sentence` (
  `id` int(10) NOT NULL,
  `text` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Sentence`
--

INSERT INTO `Sentence` (`id`, `text`) VALUES
(1, 'තාත්තා කාරය වේගයෙන් පදවයි'),
(2, 'අක්කා උදෑසන ආහාරය පිසිනවා'),
(3, 'ලංකාව ලෝකය තුළ බබලවමු'),
(4, 'රඹුටන් රතු පාටයි'),
(5, 'ගොනා තණ කයි'),
(6, 'ගසක් සිටුවා සොබාදහම සුරකිමු'),
(7, 'අම්මා බත් උයනවා'),
(8, 'චාමර යහපත් පුද්ගලයෙකි '),
(9, 'ජලය අපතේ නොහරින්න'),
(10, 'බසය නගරය පසු කරමින් ගමන් කරයි '),
(11, 'අකුණු ගහන වෙලාවට පරිගණකය ක්‍රියා විරහිත කරන්න '),
(12, 'ටයරය ගෙවී ගොස් ඇත '),
(13, 'මල්ලී ඉගෙනගන්නවාට වඩා සෙල්ලමට කැමතියි '),
(14, 'විදුලිය අපතේ නොයවන්න'),
(15, 'ගොනා පිදුරු ගොඩේ නිදා සිටියි'),
(16, 'ඇයගේ නහය දිගයි'),
(17, 'කුඩා ළමයා කතුර භාවිතා කිරීමට බය වෙයි'),
(18, 'සමන්පිච්ච මල ඉතා සුවඳයි'),
(19, 'ඔහු තිබහ නිසා ජලය පානය කළේය '),
(20, 'බල්ලා ඇයට ගොරවනවා'),
(21, 'තාත්තා වෙසක් කූඩුවට රතු පාට රැලි කපනවා '),
(22, 'සොබාදහම සුරැකීම අපගේ යුතුකම වෙයි'),
(23, 'ලෝකය තුළ සාමය උදා වේවා'),
(24, 'ඔහු කෙටි පාර තිබියදී දිග පාර තෝරා ගත්තේය'),
(25, 'අම්මා කඩයට ණය වීමට අකමැතියි'),
(26, 'ලංකාව තුළ සිනමාව දියුණු කිරීම ඉතාමත් අපහසු කරුණක් වේ'),
(27, 'ගුරුවරයා ඇයට අවවාද කරයි'),
(28, 'එම චිත්‍රය බය ඇති කරවයි'),
(29, 'මල්ලි යාලුවා සමඟ හොඳින් ඉගෙනගන්නවා'),
(30, 'ගම තුළ ඇති සුන්දරත්වය නගරය තුළ නොමැත');

-- --------------------------------------------------------

--
-- Table structure for table `word_sentence`
--

CREATE TABLE IF NOT EXISTS `word_sentence` (
  `id` int(10) NOT NULL,
  `word_id` int(10) NOT NULL,
  `sentence_id` int(10) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `word_id` (`word_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `word_sentence`
--

INSERT INTO `word_sentence` (`id`, `word_id`, `sentence_id`) VALUES
(1, 1, 7),
(2, 2, 2),
(3, 3, 1),
(4, 4, 10),
(5, 5, 0),
(6, 6, 8),
(7, 7, 7),
(8, 8, 6),
(9, 9, 18),
(10, 10, 11),
(11, 11, 11),
(12, 12, 12),
(13, 13, 4),
(14, 14, 4),
(15, 15, 3),
(16, 16, 3),
(17, 17, 27),
(18, 18, 18),
(19, 19, 23),
(20, 20, 19),
(21, 21, 21),
(22, 22, 2),
(23, 23, 2),
(24, 24, 7),
(25, 25, 17),
(26, 26, 21),
(27, 27, 4),
(28, 28, 24),
(29, 29, 24),
(30, 30, 30),
(31, 31, 30),
(32, 32, 26),
(33, 33, 29),
(34, 34, 13),
(35, 35, 12),
(36, 36, 22),
(37, 37, 37),
(38, 38, 16),
(39, 39, 15),
(40, 40, 5),
(41, 41, 8),
(42, 42, 42),
(43, 43, 19),
(44, 44, 14),
(45, 45, 11),
(46, 46, 20),
(47, 47, 47),
(48, 48, 6),
(49, 49, 28),
(50, 50, 28),
(51, 1, 25),
(52, 37, 25),
(53, 34, 29),
(54, 33, 29),
(56, 20, 9),
(57, 14, 21),
(58, 15, 23),
(59, 48, 22);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `word_sentence`
--
ALTER TABLE `word_sentence`
  ADD CONSTRAINT `word_sentence_ibfk_1` FOREIGN KEY (`word_id`) REFERENCES `baseword` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
